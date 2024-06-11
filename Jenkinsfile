pipeline {
    agent any

    stages {
        stage('prod-devops-checkout') {
            steps {
                echo 'checkout the project in the github'
            }
        }
        stage('prod-devops-build') {
            steps {
                echo 'build the project and generate the jar file '
            }
        }
        stage('prod-devops-image') {
            steps {
                echo 'creating the image'
            }
        }
        stage('prod-devops-push-image') {
            steps {
                echo 'push the image'
            }
        }
        stage('prod-devops-pull-image') {
            steps {
                echo 'Pull the image'
            }
        }
    }
}
