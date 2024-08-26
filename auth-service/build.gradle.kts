plugins {
    `java-library`
    id("my-plugin")
}
dependencies {
    api(project(":commons"))
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}