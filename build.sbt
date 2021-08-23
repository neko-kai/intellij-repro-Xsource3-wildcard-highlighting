scalaVersion := "2.13.6"
addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.0" cross CrossVersion.full)

scalacOptions ++= Seq(
  "-Xsource:3",
  "-P:kind-projector:underscore-placeholders"
)
