# lambda-template-gradle-autobuild
Java 8 AWS Lambda Template which has "deploy" task to AWS. When appropriate role, function name and credentials given, you can invoke "gradle deploy" and it will deploy the JAR. 

You can copy the build.gradle and Main.java as the starting point for all the boilerplate needed to work with AWS Lambda and Java 8.

With this gradle build file, we get these tasks:

- deploy
- invoke

"deploy" task has "shadowJar" as prerequisite meaning we build a jar with all dependencies first and upload it to Lambda. The credentials are taken from usual locations (search for AWS credential chain if you want to know more)

"invoke" task again uses usual AWS credential chain to invoke the Lambda and show the result locally
