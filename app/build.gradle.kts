plugins {
    id("com.android.application")
    id("org.sonarqube") version "3.3"
}

sonarqube {
    properties {
        property("sonar.projectKey", "KetanB82_SonarQubeDemo2")
        property("sonar.projectName", "SonarQubeDemo2")
        property("sonar.host.url", "http://35.209.5.196:9000")
        property("sonar.login", "7b315355c4c26663615bb39a9908fd1977e854b3")
    }
}

android {
    namespace = "com.example.sonarqubedemo2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sonarqubedemo2"
        minSdk = 24
        targetSdk = 33
        versionCode = 2
        versionName = "1.1"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.navigation:navigation-fragment:2.7.7")
    implementation("androidx.navigation:navigation-ui:2.7.7")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}