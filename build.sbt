val ScalatraVersion = "3.1.1"

ThisBuild / scalaVersion := "3.3.5"
ThisBuild / organization := "net.junction.lab"

lazy val wealthPocket = (project in file("."))
  .settings(
    name := "wealthpocket-server",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.5.6" % Runtime,
      "com.typesafe" % "config" % "1.4.3",

      "org.json4s"   %% "json4s-jackson" % "4.0.7",
      "org.scalatra" %% "scalatra-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-json-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest-jakarta" % ScalatraVersion % Test,

      "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0" % Provided,
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(SbtWar)

Test / fork := true

warForkOptions :=
  ForkOptions()
    .withRunJVMOptions(
      Vector(
        "--add-opens=java.base/java.time=ALL-UNNAMED",
        "--add-opens=java.base/java.util=ALL-UNNAMED",
      )
    )

warStart / warPort := 8081