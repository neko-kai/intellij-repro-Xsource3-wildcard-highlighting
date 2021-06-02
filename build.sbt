scalaVersion := "2.13.6"
addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.0" cross CrossVersion.full)

libraryDependencies ++= Seq(
  "io.7mind.izumi" %% "distage-testkit-scalatest" % "1.0.7",
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked"
)
