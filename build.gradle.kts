plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    java
}

group = "org.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
//    spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

//    test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.0-M2")
    testImplementation("org.junit.platform:junit-platform-suite:1.11.0-M2")
    testImplementation("org.mockito:mockito-core:5.12.0")

//    DB
    implementation("org.liquibase:liquibase-core:4.28.0")
    implementation("org.postgresql:postgresql:42.7.3")

    compileOnly("org.projectlombok:lombok:1.18.32")
    implementation("org.slf4j:slf4j-api:2.0.13")
}

tasks.test {
    useJUnitPlatform()
}
