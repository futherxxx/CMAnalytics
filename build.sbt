name := """CMAnalytics"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  cache,
  javaWs,
  javaJpa
)
libraryDependencies += "junit" % "junit" % "4.11" % "test"

//the sql dependency
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10"

libraryDependencies += evolutions

libraryDependencies += "org.avaje.ebeanorm" % "avaje-ebeanorm" % "${version}"

fork in run := true
// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
offline:=true