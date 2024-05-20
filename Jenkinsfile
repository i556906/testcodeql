pipeline {
    agent any
    
    stages {
        stage('Clone Repository') {
            steps {
                // Clone the repository
                git 'https://github.tools.sap/Devops-security/devrepo.git'
            }
        }
        stage('Compile Project') {
            steps {
                // Compile the Java project
                sh 'mvn clean install'
            }
        }
    }
}
