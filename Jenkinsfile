pipeline {
    agent any
    tools {
            maven 'maven'
    }
    stages {
        stage('Build JAR file') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Create Container') {
           steps {
                dockerImage = docker.build("custardapple08/sci-calc:latest")
            }
        }
        stage('Push image') {
            steps{
                withDockerRegistry([ credentialsId: "jenkinsID", url: "" ]) {
                    dockerImage.push()
                }
             }
        }
    }
}