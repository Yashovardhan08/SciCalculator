pipeline {
    agent any
    environment {
        PATH = "/opt/homebrew/bin/mvn:$PATH"
    }
    stages {
        stage('build') {
            steps {
                sh 'java --version'
            }
        }
        stage('build2') {
        steps {
                 sh 'mvn --version'
            }
        }
    }
}