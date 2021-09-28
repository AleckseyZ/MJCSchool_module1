version = "1.3.5"

plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    implementation("org.apache.commons:commons-lang3:3.10")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest{
         attributes(mapOf("Implementation-Title" to project.name,
                         "Implementation-Version" to project.version))
    }
}