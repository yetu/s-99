import scalariform.formatter.preferences._

val specs2Version = "2.4.2"

scalaVersion := "2.11.4"

name := "S-99"

organization := "com.tecnoguru"

version := "1.0"

resolvers ++= Seq(Resolver.mavenLocal,
                  Resolver.typesafeRepo("releases"),
                  Resolver.sonatypeRepo("snapshots"))

// Test dependencies
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % specs2Version % "test",
                            "org.specs2" %% "specs2-matcher" % specs2Version % "test",
                            "org.specs2" %% "specs2-matcher-extra" % specs2Version % "test",
                            "org.specs2" %% "specs2-scalacheck" % specs2Version % "test",
                            "org.scalacheck" %% "scalacheck" % "1.11.5" % "test")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Yinline-warnings", "-Xlint")

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentClassDeclaration, true)
    .setPreference(PreserveDanglingCloseParenthesis, true)
    .setPreference(PreserveSpaceBeforeArguments, true)
    .setPreference(RewriteArrowSymbols, true)

org.scalastyle.sbt.ScalastylePlugin.Settings

showCurrentGitBranch

