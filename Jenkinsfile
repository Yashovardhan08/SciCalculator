pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'ls -al'
            }
        }
        stage('build 2') {
            withMaven {
                sh 'mvn --version'
            }
        }

    }
}