plugins {
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.12")
}

// tag::zinc-dependency[]
scala {
    zincVersion = "1.10.4"
}
// end::zinc-dependency[]
