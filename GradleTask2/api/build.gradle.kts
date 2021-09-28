plugins {
    application
    id("multi-project.shared")
}

application {
    mainClass.set("by.mjcschool.zotov.gradle.task2.App")
}

dependencies {
    implementation(project(":core"))
}