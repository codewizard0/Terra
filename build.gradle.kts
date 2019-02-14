import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("voodoo") version "0.4.6-SNAPSHOT"
}

voodoo {
    addTask(name = "buildPack", parameters = listOf("build"))
    addTask(name = "packServer", parameters = listOf("pack server"))
    addTask(name = "testMMC", parameters = listOf("test mmc"))
    addTask(name = "testMMCClean", parameters = listOf("test mmc --clean"))
    addTask(name = "packCurse", parameters = listOf("pack curse"))
    addTask(name = "packSk", parameters = listOf("pack sk"))
    addTask(name = "packMMC", parameters = listOf("pack mmc"))
    addTask(name = "packAll", parameters = listOf("pack sk", "pack server", "pack mmc", "pack curse"))
    addTask(name = "buildAndPackAll", parameters = listOf("build", "pack sk", "pack server", "pack mmc", "pack curse"))
    addTask(name = "buildAndTestMMC", parameters = listOf("build", "test mmc"))
    addTask(name = "buildAndTestMMCClean", parameters = listOf("build", "test mmc --clean"))
}
repositories {
    maven(url = "http://maven.modmuss50.me/") {
        name = "modmuss50"
    }
    maven(url = "https://kotlin.bintray.com/kotlinx") {
        name = "kotlinx"
    }
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(group = "moe.nikky.voodoo", name = "dsl", version = "0.4.6+")
    implementation(group = "moe.nikky.voodoo", name = "voodoo", version = "0.4.6+")
}

tasks.named<KotlinCompile>("compileKotlin") {
    kotlinOptions {
        jvmTarget = "1.8"
        javaParameters = true
    }
}