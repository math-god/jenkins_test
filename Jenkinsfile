
pipeline {
    agent {
        node {
            label 'java_spring_template'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                docker build
                '''
            }
        }
        stage('Save') {
            steps {
                echo "Testing.."
                sh '''
                echo "doing test stuff.."
                '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}
