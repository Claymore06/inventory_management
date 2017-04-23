name := """inventory_management"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJdbc,
  evolutions,
  cache
)

// mysql-connector
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

// PlayEbean Compile Settings
playEbeanModels in Compile := Seq("models.*")
playEbeanDebugLevel := 4
inConfig(Test)(PlayEbean.scopedSettings)
playEbeanModels in Test := Seq("models.*")

// node.js
JsEngineKeys.engineType := JsEngineKeys.EngineType.Node