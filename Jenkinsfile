pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
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