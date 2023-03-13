pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn clean && mvn install'
            }
        }
        stage('docker') {
            steps {
                sh 'docker build -t sci-calc . && docker tag sci-calc custardapple08/sci-calc && docker push custardapple08/sci-calc '
            }
        }
    }
}