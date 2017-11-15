name := "scalatest-example"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.1",
  "org.pegdown" % "pegdown" % "1.6.0" % "test"
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports/html-report")
