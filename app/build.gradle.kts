plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
}

dependencies {

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