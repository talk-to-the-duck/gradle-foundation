plugins {
    `version-catalog`
    `maven-publish`
    id("java")
}


repositories {
    mavenLocal()
    mavenCentral()
}

catalog {
    // declare the aliases, bundles and versions in this block
    versionCatalog {
        from(files("./libs.versions.toml"))
    }
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}