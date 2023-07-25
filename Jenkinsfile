pipeline {
    agent any

    environment {
        // Set MAVEN_OPTS to enable warning for illegal reflective access
        MAVEN_OPTS = "--illegal-access=warn"
    }
	stages {
        stage('Initialize') {
            steps {
                echo 'Initializing the pipeline...'
                // You can perform any required initialization tasks here
            }
        }

        //stage('Checkout') {
        //    steps {
        //        echo 'Checking out the source code...'
        //        // Replace 'https://github.com/sample/repo.git' with the actual URL of your Git repository
        //        git branch: 'main', url: 'https://github.com/sandeepmadathiparambil/sanstrick_microservice.git'
        //    }
        //}

        stage('Build') {
            steps {
                echo 'Building the Spring Boot application...'
                // Replace 'mvn' with the actual Maven binary name if required
                sh 'mvn clean package'
            }
        }

        stage('Unit Tests') {
            steps {
                echo 'Running unit tests...'
                // Replace 'mvn' with the actual Maven binary name if required
                sh 'mvn test'
            }
        }

        stage('Deployment') {
            steps {
                echo 'Deploying the microservice...'
                // For this example, let's assume the microservice is deployed to a test environment
                // Replace 'http://test-env.example.com' with the actual URL of your test environment
                sh 'curl -X POST http://18.119.157.80/deploy'
            }
        }
    }
}
