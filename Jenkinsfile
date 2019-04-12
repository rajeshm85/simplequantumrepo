pipeline {
  agent any
  stages {
    stage('Clean and Clone') {
      steps {
        sh 'mvn clone https://github.com/rajeshm85/simplequantumrepo.git'
        sh 'mvnHome = tool \'M3\''
        sh '''
\'${mvnHome}/bin/mvn\' clean -f simplequantumrepo'''
      }
    }
    stage('Test') {
      steps {
        sh '\'${mvnHome}/bin/mvn\' test -f simplequantumrepo'
      }
    }
    stage('Deploy') {
      steps {
        sh '\'${mvnHome}/bin/mvn\' package -f simplequantumrepo'
      }
    }
  }
}