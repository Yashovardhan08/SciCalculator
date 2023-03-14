pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'ls -al'
            }
        }
        stage('build 2') {
            steps {
                withMaven(
                    maven: 'mvn',
                ) {
                    sh 'mvn --version'
                }
            }
        }

    }
}