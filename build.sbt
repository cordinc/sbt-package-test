name := "sbt-package-test"
version := "0.2"
organization := "com.cordinc"
githubOwner := "cordinc"
githubRepository := "sbt-package-test"
ThisBuild / versionScheme := Some("early-semver")

scalaVersion := "3.1.3"

resolvers += Resolver.githubPackages("jarrahtech", "logic")

libraryDependencies += "com.jarrahtechnology" %% "logic" % "0.2"