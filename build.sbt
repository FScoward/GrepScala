scalaVersion := "2.10.2"

resolvers += Classpaths.typesafeResolver

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.3.0")

libraryDependencies ++= Seq(
	"org.scalatest" % "scalatest_2.10" % "2.0.M6" % "test",
	"org.specs2" %% "specs2" % "2.2" % "test"
)