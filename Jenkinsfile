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
                sh 'docker build -t custardapple08/sci-calc .  '
            }
        }
        stage('Push image') {
            steps{
                withDockerRegistry([ credentialsId: "jenkinsID", url: "" ]) {
                    sh 'docker push custardapple08/sci-calc'
                }
             }
        }
    }
}