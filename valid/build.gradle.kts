plugins {
    id("com.kotlinmonorepo.kotlin-common-conventions")
}

group = "com.kotlinmonorepo.valid"
version = "0.0.1"

dependencies {
    implementation("org.hibernate.validator:hibernate-validator:8.0.1.Final")
    implementation("org.glassfish.expressly:expressly:5.0.0")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.kotlinmonorepo.valid.App"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}
