pipeline {
    agent any

    environment {
        // Set MAVEN_OPTS to enable warning for illegal reflective access
        MAVEN_OPTS = "--illegal-access=warn"
		
		// Define the path to your Spring Boot JAR file after building
        JAR_FILE_PATH = 'target/sanstrick-0.0.1-SNAPSHOT.jar'
        // Define the SSH server details
        SSH_HOST = '3.144.94.164'
        SSH_PORT = 22
        SSH_USER = 'centos'
    }
	stages {
        stage('Initialize') {
            steps {
                echo 'Initializing the pipeline...'
                // You can perform any required initialization tasks here
            }
        }

        stage('Checkout') {
          steps {
                echo 'Checking out the source code...'
                // Replace 'https://github.com/sample/repo.git' with the actual URL of your Git repository
                git branch: 'development', url: 'https://github.com/sandeepmadathiparambil/sanstrick_microservice.git'
            }
        }

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

        stage('Deployment to development server') {
            steps {
                echo 'Deploying the microservice to the development server...using the updated jenkinsfile'
                // For this example, let's assume the microservice is deployed to a test environment
                // Replace 'http://test-env.example.com' with the actual URL of your test environment
                //sh 'curl -X POST http://18.119.157.80:8080/deploy' 
				
				// Use SSH to copy the JAR file to the development server
                // Make sure you have added the correct path to the JAR_FILE_PATH environment variable
                script {
                    sshagent(['jenkins_key_dev']) {
                        // Use the SSH agent to perform the SSH operations securely with the credentials
						echo "Going to perform the copy command"
                        sh "scp -P ${SSH_PORT} ${JAR_FILE_PATH} ${SSH_USER}@${SSH_HOST}:~/"
                        // The above command will copy the JAR file to the home directory of the SSH user on the server
                        // Modify the destination path if needed
						echo 'Completed the copy process'
                    }
                }
            }
        }
    }
}
