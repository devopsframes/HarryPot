name := "Spark_word_count"

version := "0.0.0"

scalaVersion := "2.11.6"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.4.1",
  "org.apache.spark" %% "spark-hive" % "1.4.1",
  "org.apache.spark" %% "spark-mllib" % "1.4.1"
)


How to create a .jar using IntelliJ IDEA 14.1.5:

File > Save All.
Run driver or class with main method.
File > Project Structure.
Select Tab "Artifacts".
Click green plus button near top of window.
Select JAR from Add drop down menu. Select "From modules with dependencies"
Select main class.
The radio button should be selecting "extract to the target JAR." Press OK.
Check the box "Build on make"
Press apply and OK.
From the main menu, select the build dropdown.
Select the option build artifacts.

