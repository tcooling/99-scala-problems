name := "99-scala-problems"
organization := "com.github.tcooling"
version := "0.0.1"
scalaVersion := "2.12.1"

lazy val ninetyNineScalaProblems = (project in file("."))
  .settings(
    name := "99-scala-problems",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.4" % "test"
    )
  )
