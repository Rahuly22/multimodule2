
plugins {
	kotlin("jvm")
	kotlin("plugin.spring")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar>{
	enabled = false
}

tasks.withType<Jar>{
	enabled = true
}


tasks.withType<Test> {
	useJUnitPlatform()
}
