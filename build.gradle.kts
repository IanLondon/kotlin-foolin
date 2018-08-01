import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.2.41"
    idea
}

application {
    mainClassName = "com.github.ianlondon.demo.NettyServer"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("org.jetbrains.kotlin:kotlin-reflect:1.2.41")

    compile("org.glassfish.jersey.core:jersey-client:2.27")
    compile("org.glassfish.jersey.inject:jersey-hk2:2.27")
    compile("org.glassfish.jersey.containers:jersey-container-netty-http:2.27")
    compile("org.glassfish.jersey.media:jersey-media-json-jackson:2.27")

    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.4")


    testCompile("junit", "junit", "4.12")
}


configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
