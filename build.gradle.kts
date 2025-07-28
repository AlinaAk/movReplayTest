plugins {
  id("org.jetbrains.kotlin.jvm") version "1.9.0"
}

repositories {
  mavenCentral()
  maven { url = uri("https://jitpack.io") }
  maven { url = uri("https://maven.repository.redhat.com/ga") }
}

dependencies {
  // RePlay dependencies:
  implementation("io.github.replay-framework:framework:2.5.0")
  implementation("io.github.replay-framework:fastergt:2.5.0")
  implementation("io.github.replay-framework:javanet:2.5.0")
}

sourceSets {
  main {
    java.srcDirs("app")
    resources.srcDir("app")
    resources {
      srcDir("conf")
      include("**/*")
    }
  }
}