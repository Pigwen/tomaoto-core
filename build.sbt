name := "tomaoto-core"

version := "1.0"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true

resolvers ++= Seq(
	"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
	"spray" at "http://repo.spray.io/",
	"spray repo Nightly" at "http://nightlies.spray.io"
	)

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.2.1",
	"com.typesafe.akka" %% "akka-kernel" % "2.2.1",
	"com.typesafe.akka" %% "akka-slf4j" % "2.2.1",
	"io.spray"          %% "spray-json"       % "1.2.5",
	"io.spray"          %  "spray-routing"       % "1.2-20131011",
	"io.spray"          %  "spray-http"       % "1.2-20131011",
	"io.spray"          %  "spray-can"       % "1.2-20131011")

