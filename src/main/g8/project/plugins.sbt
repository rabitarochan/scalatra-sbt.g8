addSbtPlugin("org.scalatra.sbt" % "scalatra-sbt" % "0.3.0")

addSbtPlugin("io.spray" % "sbt-twirl" % "0.6.1")

// scalikejdbc
libraryDependencies += "com.h2database" % "h2" % "[1,)"

addSbtPlugin("com.github.seratch" %% "scalikejdbc-mapper-generator" % "[1.6,)")