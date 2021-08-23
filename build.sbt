scalaVersion := "2.13.6"
addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.0" cross CrossVersion.full)

scalacOptions ++= Seq(
  "-P:kind-projector:underscore-placeholders"
)
