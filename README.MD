Repro for [sbt-codacy-coverage issue 20](https://github.com/codacy/sbt-codacy-coverage/issues/20)

    sbt clean coverage test
    CODACY_PROJECT_TOKEN=dummy sbt codacyCoverage
    # build fails with
    # FileNotFoundException: .../sbt-codacy-coverage-issue-20/target/scala-2.11/coverage-report/codacy-coverage.json (No such file or directory)

    mkdir -p target/scala-2.11/coverage-report/
    # build fails with
    # Failed to upload data. Reason: not found