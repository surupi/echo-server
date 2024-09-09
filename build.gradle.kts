plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application{
    mainClass.set("org.example.Main")
}

dependencies {
    // JUnit
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")
    // Slf4j
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation("org.slf4j:slf4j-simple:2.0.9")
    // JCommander
    implementation("org.jcommander:jcommander:2.0")
    // Mockito
    testImplementation("org.mockito:mockito-core:5.13.0")
}

tasks.jar{
    manifest{
        attributes["Main-Class"] = "org.example.Main"
    }
}

tasks.test {
    useJUnitPlatform()
}