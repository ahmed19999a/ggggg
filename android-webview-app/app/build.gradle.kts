plugins {
    id("com.android.application")
}

android {
    namespace = "site.csahati.almunjaz"
    compileSdk = 35

    defaultConfig {
        applicationId = "site.csahati.almunjaz"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = false
        }
    }
}
