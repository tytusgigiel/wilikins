organization := "pl.gigiel"
name := "wilikins"
version := "1.0.0.0-SNAPSHOT"
scalaVersion := "2.12.2"
//fork in run := true // Ensure we run outside of sbt. This is especially useful for setting JVM-level flags
javaOptions ++= Seq("-javaagent:/home/tomasz/.ivy2/cache/com.github.jbellis/jamm/jars/jamm-0.3.2.jar") // Set flags for java. Memory, GC settings, properties, etc.
mainClass in (Compile,run) := Some("pl.gigiel.wilikins.app.MyApp")

libraryDependencies := {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, scalaMajor)) if scalaMajor >= 12 =>
      libraryDependencies.value ++ Seq(
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
        "org.scalatest" %% "scalatest" % "3.2.0-SNAP8",
        "junit" % "junit" % "4.12",
        "org.specs2" %% "specs2-core" % "3.9.1",
        "com.typesafe.slick" %% "slick" % "3.2.0",
        "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
        "com.h2database" % "h2" % "1.4.193",
        "mysql" % "mysql-connector-java" % "6.0.5",
        "org.xerial" % "sqlite-jdbc" % "3.16.1",
        "org.slf4j" % "slf4j-nop" % "1.7.24",
        "org.scalikejdbc" %% "scalikejdbc" % "2.5.0",
        "org.typelevel" %% "cats" % "0.9.0",
        "com.github.pathikrit" %% "better-files" % "3.0.0",
        "com.google.cloud" % "google-cloud-translate" % "0.20.1-beta",
        "com.memetix" % "microsoft-translator-java-api" % "0.6.2",
        "com.typesafe.play" %% "play-json" % "2.6.2",
        "org.apache.commons" % "commons-lang3" % "3.6",
        "commons-io" % "commons-io" % "2.5",
        "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.21",
        "com.jsuereth" %% "scala-arm" % "2.0",
        "com.github.jbellis" % "jamm" % "0.3.2")
        

    case Some((2, scalaMajor)) if scalaMajor >= 11 =>
      libraryDependencies.value ++ Seq(
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
        "org.scalatest" %% "scalatest" % "3.2.0-SNAP8",
        "junit" % "junit" % "4.12",
        "org.specs2" %% "specs2-core" % "3.9.1",
        "com.typesafe.slick" %% "slick" % "3.2.0",
        "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
        "com.h2database" % "h2" % "1.4.193",
        "mysql" % "mysql-connector-java" % "6.0.5",
        "org.xerial" % "sqlite-jdbc" % "3.16.1",
        "org.slf4j" % "slf4j-nop" % "1.7.24",
        "org.scalikejdbc" %% "scalikejdbc" % "2.5.0",
        "org.typelevel" %% "cats" % "0.9.0",
        "com.github.pathikrit" %% "better-files" % "2.17.1",
        "com.google.cloud" % "google-cloud-translate" % "0.20.1-beta",
        "com.memetix" % "microsoft-translator-java-api" % "0.6.2",
        "com.typesafe.play" %% "play-json" % "2.6.2",
        "org.apache.commons" % "commons-lang3" % "3.6",
        "commons-io" % "commons-io" % "2.5",
        "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.21",
        "com.jsuereth" %% "scala-arm" % "2.0",
        "com.github.jbellis" % "jamm" % "0.3.2")

    case _ =>
      libraryDependencies.value ++ Seq(
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
        "org.scalatest" %% "scalatest" % "3.2.0-SNAP8",
        "junit" % "junit" % "4.12",
        "org.specs2" %% "specs2-core" % "3.9.1",
        "com.typesafe.slick" %% "slick" % "3.2.0",
        "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
        "com.h2database" % "h2" % "1.4.193",
        "mysql" % "mysql-connector-java" % "6.0.5",
        "org.xerial" % "sqlite-jdbc" % "3.16.1",
        "org.slf4j" % "slf4j-nop" % "1.7.24",
        "org.scalikejdbc" %% "scalikejdbc" % "2.5.0",
        "org.typelevel" %% "cats" % "0.9.0",
        "com.github.pathikrit" %% "better-files" % "2.17.0",
        "com.google.cloud" % "google-cloud-translate" % "0.20.1-beta",
        "com.memetix" % "microsoft-translator-java-api" % "0.6.2",
        "com.typesafe.play" %% "play-json" % "2.6.2",
        "org.apache.commons" % "commons-lang3" % "3.6",
        "commons-io" % "commons-io" % "2.5",
        "net.sourceforge.htmlcleaner" % "htmlcleaner" % "2.21",
        "com.jsuereth" %% "scala-arm" % "2.0",
        "com.github.jbellis" % "jamm" % "0.3.2")
  }
}
