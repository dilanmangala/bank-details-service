pipeline {
  agent any
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  environment {
    DOCKERHUB_CREDENTIALS = credentials('dilan1988-dockerhub')
  }
  stages {

    stage('Build') {
      steps {
        bat 'docker build -t dilan1988/bank-alpine:latest .'
      }
    }
    stage('Login') {
      steps {
        bat 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-Ronaldo119'
      }
    }
    stage('Push') {
      steps {
        bat 'docker push dilan1988/bank-alpine:latest'
      }
    }
  }
  post {
    always {
      bat 'docker logout'
    }
  }
}