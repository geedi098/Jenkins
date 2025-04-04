pipeline {
    agent any

    environment {
        SONAR_SCANNER_HOME = 'C:\\sonar-scanner-5.0.1.3006-windows\\bin'
        SONAR_HOST_URL = 'http://localhost:9000'
        SONAR_PROJECT_KEY = 'MOHAMED'
        SONAR_LOGIN = 'sqp_9dd8ec10cc06c1cfa20aef9c7aa80fecf2b4388b'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/geedi098/Jenkins.git'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('MySonarQube') {
                   bat bat 'C:\Users\hp\Documents\sonar-scanner-5.0.1.3006-windows\bin\sonar-scanner -Dsonar.projectKey=MOHAMED -Dsonar.sources=src -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqa_0386504208aea515d3b9db5a3239c53b5e41030f'

                }
            }
        }
    }
}
