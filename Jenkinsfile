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
        sh 'docker build -t dilan1988/bank-alpine:latest .'
      }
    }
    stage('Login') {
      steps {
        sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-Ronaldo119'
      }
    }
    stage('Push') {
      steps {
        sh 'docker push dilan1988/bank-alpine:latest'
      }
    }
  }
  post {
    always {
      sh 'docker logout'
    }
  }
}