name := "user"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
    "mysql" % "mysql-connector-java" % "5.1.26",
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  cache
)     

play.Project.playJavaSettings
