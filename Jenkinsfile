pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo "Cloning echo..."
                git branch: 'main', url: 'https://github.com/Akshaya-125/CICDexam.git'
            }
        }
        stage('Compile') {
            steps {
                echo "Compile"
                bat 'javac factorial.java Testfactorial.java'
            }
        }
        stage('Test') {
            steps {
                echo "Test "
                bat 'java -cp . Testfactorial'
            }
        }
        stage('Run') {
            steps {
                echo "Run"
                bat 'java -cp . factorial'
            }
        }
        stage('Package JAR'){
    steps{
        echo "Build"
        bat '"D:\\Java\\bin\\jar.exe" cfm factorial.jar manifest.txt factorial.class'
    }
}
        stage('Archive JAR') {
            steps {
                echo "Deploy"
                archiveArtifacts artifacts: 'factorial.jar'
            }
        }
    }
    post {
        success {

            echo "Build,test,run and JAR creation successful and artifact is ready!"

        }

        failure {

            echo "Build or test failed!"

        }

    }

}