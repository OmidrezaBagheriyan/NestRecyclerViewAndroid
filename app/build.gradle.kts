plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "com.omidrezabagheriyan.nestrecyclerviewtutorial"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.omidrezabagheriyan.nestrecyclerviewtutorial"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Navigation-component dependencies
    val navVersion = "2.7.2"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$navVersion")
    implementation("androidx.navigation:navigation-runtime-ktx:$navVersion")

    //Activity dependencies + Fragment dependencies
    val activityVersion = "1.7.2"
    implementation("androidx.activity:activity-ktx:$activityVersion")
    val fragmentVersion = "1.6.1"
    implementation("androidx.fragment:fragment-ktx:$fragmentVersion")
    val legacyVersion = "1.0.0"
    implementation("androidx.legacy:legacy-support-v4:$legacyVersion")
    val recyclerviewVersion = "1.3.1"
    implementation("androidx.recyclerview:recyclerview:$recyclerviewVersion")

    // Lifecycle dependencies
    val lifecycleVersion = "2.6.2"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")

    // Networking dependencies
    val gsonVersion = "2.8.9"
    implementation("com.google.code.gson:gson:$gsonVersion")
    val converterGsonVersion = "2.9.0"
    implementation("com.squareup.retrofit2:converter-gson:$converterGsonVersion")
    val retrofitVersion = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    val okHttpVersion = "4.7.2"
    implementation("com.squareup.okhttp3:okhttp:$okHttpVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okHttpVersion")
    val coroutinesVersion = "1.6.4"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    //Glide dependencies
    val glideVersion = "4.11.0"
    implementation("com.github.bumptech.glide:glide:$glideVersion")
    kapt("com.github.bumptech.glide:compiler:$glideVersion")

    //Hilt components
    val hiltVersion = "2.44"
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    kapt("com.google.dagger:hilt-compiler:$hiltVersion")
    val hiltNavigationVersion = "1.0.0"
    implementation("androidx.hilt:hilt-navigation-fragment:$hiltNavigationVersion")
    val hiltCompilerVersion = "1.0.0"
    kapt("androidx.hilt:hilt-compiler:$hiltCompilerVersion")

    //Base dependencies
    val coreVersion = "1.12.0"
    implementation("androidx.core:core-ktx:$coreVersion")
    val appCompatVersion = "1.6.1"
    implementation("androidx.appcompat:appcompat:$appCompatVersion")
    val materialVersion = "1.9.0"
    implementation("com.google.android.material:material:$materialVersion")
    val constraintLayoutVersion = "2.1.4"
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")
    val junitVersion = "4.13.2"
    testImplementation("junit:junit:$junitVersion")
    val extJUnitVersion = "1.1.5"
    androidTestImplementation("androidx.test.ext:junit:$extJUnitVersion")
    val espressoVersion = "3.5.1"
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")
}