val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "AlgoScala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    //ibraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % "test"
  )
