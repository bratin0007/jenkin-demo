pipeline {
    agent any

    stages {
        stage('devops-checkout') {
            steps {
                echo 'checkout the project in the github'
            }
        }
        stage('devops-build') {
            steps {
                echo 'build the project and generate the jar file '
            }
        }
        stage('devops-image') {
            steps {
                echo 'creating the image'
            }
        }
        stage('devops-push-image') {
            steps {
                echo 'push the image'
            }
        }
        stage('devops-pull-image') {
            steps {
                echo 'Pull the image'
            }
        }
    }
}