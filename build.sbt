name := "Test"

version := "0.1"

scalaVersion := "2.10.0"

resolvers ++= Seq(
	"Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
	"Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
)

libraryDependencies ++= Seq(
	"com.typesafe.akka" % "akka-actor" % "2.0.5",
	"play" % "play_2.10" % "2.1.1"
)
