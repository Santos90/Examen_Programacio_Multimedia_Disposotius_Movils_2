plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")

	id("com.google.devtools.ksp")
}

android {
	namespace = "com.simarro.examen_programacio_multimedia_disposotius_movils_2"
	compileSdk = 34

	defaultConfig {
		applicationId = "com.simarro.examen_programacio_multimedia_disposotius_movils_2"
		minSdk = 31
		targetSdk = 33
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

	implementation("androidx.core:core-ktx:1.9.0")

	implementation("androidx.appcompat:appcompat:1.6.1")
	implementation("com.google.android.material:material:1.11.0")

	implementation("androidx.constraintlayout:constraintlayout:2.1.4")
	testImplementation("junit:junit:4.13.2")

	//Test
	androidTestImplementation("androidx.test.ext:junit:1.1.5")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


	val picasso_version = "2.71828"
	implementation ("com.squareup.picasso:picasso:$picasso_version")
	val retrofit_version = "2.9.0"
	implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
	implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")//Convertir JSON a objetos Kotlin
	implementation("com.squareup.retrofit2:adapter-rxjava2:$retrofit_version")


	var roomVersion = "2.6.1"
	implementation("androidx.room:room-runtime:$roomVersion")
	ksp("androidx.room:room-compiler:$roomVersion")
}