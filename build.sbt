name := "sbt-package-test"
version := "0.1"
organization := "com.cordinc"
githubOwner := "cordinc"
githubRepository := "sbt-package-test"

ThisBuild / versionScheme := Some("early-semver")

scalaVersion := "3.2.0"

resolvers += Resolver.githubPackages("jarrahtech")

libraryDependencies += "com.jarrahtechnology" %% "logic" % "0.2"