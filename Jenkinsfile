pipeline {
  agent any
  stages {
    stage('Clean and Clone') {
      steps {
        sh 'rm -rf simplequantumrepo'
        sh 'git clone https://github.com/rajeshm85/simplequantumrepo.git'
        sh '''
/Applications/apache-maven-3.2.2/bin/mvn clean -f simplequantumrepo'''
      }
    }
    stage('Test') {
      steps {
        sh '/Applications/apache-maven-3.2.2/bin/mvn test -f simplequantumrepo -DtestngXmlDir=src/main/resources/config -DtestngXmlFile=testng_web_desktop.xml -Dreportium-job-name=${JOB_NAME} -Dreportium-job-number=${BUILD_NUMBER}'
      }
    }
    stage('Post Build Script') {
      steps {
        sh '''jobName = manager.build.getProject().getName()
buildNumber = manager.build.getNumber()
summary = manager.createSummary("graph.gif")
summary.appendText("<a href=\\"https://ps.reporting.perfectomobile.com/library?jobName[0]=${jobName}&jobNumber[0]=${buildNumber}\\">Perfecto Test Report</a>", false)'''
      }
    }
  }
}