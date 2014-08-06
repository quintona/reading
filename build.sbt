name := "learn"

version := "1.0"

resolvers ++= Seq(
  "Sonatype OSS Releases"  at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "com.chuusai" 	% "shapeless" 			% "2.0.0" cross CrossVersion.full,
  "org.scalaz" 		%% "scalaz-core" 		% "7.1.0-M6",
  "org.scalaz"      %% "scalaz-concurrent" 	% "7.1.0-M6"
)
