plugins {
    id("com.kotlinmonorepo.kotlin-common-conventions")
}

group = "com.kotlinmonorepo"
version = "0.0.1"

dependencies {
    implementation("org.apache.camel:camel-bom:2.1.1")
    implementation("io.dropwizard:dropwizard-client:2.1.1")
    implementation("io.dropwizard:dropwizard-testing:2.1.1")
    implementation("org.glassfish.jersey.inject:jersey-hk2:2.26")
    testImplementation("org.assertj:assertj-core:3.23.1")
}
