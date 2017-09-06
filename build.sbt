lazy val root = (project in file("."))
    .settings(Seq(
        libraryDependencies ++= Seq(
            "org.scalatest" %% "scalatest" % "2.2.6" % "test"
        ),
        name                := "sbt-codacy-coverage-issue-20",
        scalaVersion        := "2.11.7"
    ))