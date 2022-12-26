pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'I want to build'
      }
    }

    stage('Test') {
      steps {
        echo 'print'
      }
    }

    stage('depoly') {
      parallel {
        stage('depoly') {
          steps {
            echo 'reply'
          }
        }

        stage('depoly2') {
          steps {
            echo 'succes'
          }
        }

      }
    }

  }
}