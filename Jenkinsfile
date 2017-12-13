pipeline {
  agent any
  stages {
    stage('Sonar') {
      parallel {
        stage('Sonar') {
          steps {
            echo 'Sonar...'
          }
        }
        stage('Unit Test') {
          steps {
            echo 'Unit Testing'
          }
        }
      }
    }
    stage('SIT') {
      steps {
        echo 'SIT...'
      }
    }
    stage('UAT') {
      steps {
        echo 'UAT...'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploy'
      }
    }
    stage('Manual') {
      steps {
        echo 'Manul...'
      }
    }
  }
}