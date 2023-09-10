package com.omidrezabagheriyan.nestrecyclerviewtutorial.ui.utils

import android.os.Looper
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ActivityViewBindingDelegate<T : ViewBinding>(
    private val bindingClass: (LayoutInflater) -> T,
    private val activity: AppCompatActivity
) : ReadOnlyProperty<AppCompatActivity, T>, LifecycleObserver {

    private var binding: T? = null

    init {
        activity.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        if (binding != null) binding = bindingClass(activity.layoutInflater)
        activity.setContentView(binding?.root!!)
        activity.lifecycle.removeObserver(this)
    }

    override fun getValue(thisRef: AppCompatActivity, property: KProperty<*>): T {
        if (binding == null) {
            if (Looper.myLooper() != Looper.getMainLooper())
                throw IllegalStateException("You must call this method on the main thread")
            binding = bindingClass(activity.layoutInflater)
        }
        return binding!!
    }
}

inline fun <reified T : ViewBinding> AppCompatActivity.viewBinding(noinline bindingClass: (LayoutInflater) -> T) =
    ActivityViewBindingDelegate(bindingClass, this)