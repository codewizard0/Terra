pluginManagement {
    repositories {
        maven(url = "https://kotlin.bintray.com/kotlinx") { name = "kotlinx" }
        maven(url = "http://maven.modmuss50.me/") { name = "modmuss50" }
        maven(url = "https://jitpack.io") { name = "jitpack" }
        gradlePluginPortal()
    }
}

rootProject.name = "Terra"
