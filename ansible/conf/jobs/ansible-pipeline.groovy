#!groovy
pipeline {
    agent any
    stages {
        stage('mv ansible folder') {
            steps {
                sh 'cp -r /ansible-files/* .'
            }
        }
        stage('run ansible') {
            steps {
                sh 'ansible-playbook -i hosts --user deploy playbook_install_apache.yml'
            }
        }
    }
}