plugins {
    java
}

repositories {
    mavenCentral()

    flatDir {
        dirs("../lib")
    }
}

dependencies {
    implementation(":utils-1.3.5")
    implementation("org.apache.commons:commons-lang3:3.10")
}

tasks.test {
    useJUnitPlatform()
}