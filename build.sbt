
val scala3Version = "3.6.4"

ThisBuild / organization := "dev.junction-lab"

lazy val root = project
  .in(file("."))
  .settings(
    idePackagePrefix := Some("dev.junction.lab"),
    name := "wealthpocket-server",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "dev.zio" %% "zio-http" % "3.2.0",
      "dev.zio" %% "zio-json" % "0.7.39",

      "io.getquill" %% "quill-jdbc-zio" % "4.8.6",
      "org.mariadb.jdbc" % "mariadb-java-client" % "3.5.3",

      "dev.zio" %% "zio-config" % "4.0.4",

      "com.auth0" % "java-jwt" % "4.5.0",

      "org.scalameta" %% "munit" % "1.1.0" % Test,
      "com.h2database" % "h2" % "2.3.232" % Test,
      "org.slf4j" % "slf4j-simple" % "2.0.17" % Test,
    )
  )
