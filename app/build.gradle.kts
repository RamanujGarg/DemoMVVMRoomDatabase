plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = APP.compileSdk

    defaultConfig {
        applicationId = APP.applicationId
        minSdk = APP.minSdk
        targetSdk = APP.targetSdk
        versionCode = APP.versionCode
        versionName = APP.versionName

        testInstrumentationRunner = APP.androidJUnitRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(APP.proguardFile), APP.proguardRule)
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = Version.java
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(Dependency.coreKtx)
    implementation(Dependency.appcompat)
    implementation(Dependency.material)
    implementation(Dependency.constraintlayout)
    implementation(Dependency.room)
    kapt(Dependency.roomCompiler)
    implementation(Dependency.koinAndroid)
    testImplementation(Dependency.junit)
    androidTestImplementation(Dependency.extJuint)
    androidTestImplementation(Dependency.espressoCore)
}