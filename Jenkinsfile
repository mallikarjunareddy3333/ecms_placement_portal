pipeline {
	agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
	stages {
		stage('SCM Checkout'){
			git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
		}	
		stage ('Build') {
			// maven home path
			'mvn -Dmaven.test.failure.ignore=true install'
		}
	}
}