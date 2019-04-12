pipeline {
  agent any
  stages {
    stage('Clean and Clone') {
      steps {
        sh 'mvn clone https://github.com/rajeshm85/simplequantumrepo.git'
        sh '''
mvn clean -f simplequantumrepo'''
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test -f simplequantumrepo'
      }
    }
    stage('Deploy') {
      steps {
        sh 'mvn package -f simplequantumrepo'
      }
    }
  }
}