plugins {
    id("org.jetbrains.kotlin.jvm")
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.okio:okio:2.10.0")
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.bouncycastle:bcpkix-jdk15on:1.68")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("com.google.truth:truth:1.0.1")
}
