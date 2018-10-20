name := "reproducer"

val mySettings = Seq(
    organization := "com.reproducer",
    scalaVersion := "2.12.7")

val moduleUtil = (project in file("module") / "util")
    .settings(mySettings)

val javaModule = (project in file("java") / "a")
    .settings(mySettings)
    .dependsOn(moduleUtil)
