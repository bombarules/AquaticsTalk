plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.poolplant.app"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.poolplant.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 35
        versionName = "35.0"
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
