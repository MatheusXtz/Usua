name := "user"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
   "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "mysql" % "mysql-connector-java" % "5.1.26",
   
  cache
)     

play.Project.playJavaSettings
