// Jenkinsfile for sanstrick-microservices

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Add commands to build your microservices and React application
                // For example:
                // sh 'npm install'
                 sh 'npm run build'
            }
        }

        stage('Test') {
            steps {
                // Add commands to run tests
                // For example:
                sh 'npm test'
            }
        }

        stage('Deploy to Development Environment') {
            when {
                branch 'development'
            }
            steps {
                // Add commands to deploy to your development environment
                // For example:
                 sh 'npm run deploy-dev'
            }
        }

        stage('Deploy to Testing Environment') {
            when {
                branch 'testing'
            }
            steps {
                // Add commands to deploy to your testing environment
                // For example:
                // sh 'npm run deploy-test'
            }
        }

        stage('Deploy to Staging Environment') {
            when {
                branch 'staging'
            }
            steps {
                // Add commands to deploy to your staging environment
                // For example:
                // sh 'npm run deploy-staging'
            }
        }

        stage('Deploy to Production Environment') {
            when {
                branch 'production'
            }
            steps {
                // Add commands to deploy to your production environment
                // For example:
                // sh 'npm run deploy-prod'
            }
        }
    }
}
