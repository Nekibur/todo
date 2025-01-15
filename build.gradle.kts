// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.devtools.ksp") version "2.0.21-1.0.27" apply false

}

buildscript {
    val hilt_version by extra("2.38.1")  // Use the latest version

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hilt_version")
        classpath("com.google.devtools.ksp:symbol-processing-api:1.5.31-1.0.0") // For KSP if used
    }
}