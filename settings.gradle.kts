rootProject.name = "gradle-foundation"


dependencyResolutionManagement {
    repositories{
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    versionCatalogs {
        create("libs") {
            from(files("./catalog/libs.versions.toml"))
        }
    }
}
include("t3d-catalog")
include("test-plugin")
