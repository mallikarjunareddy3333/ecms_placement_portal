node{
	stage('SCM Checkout'){
		git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
	}
	
	stage('Compile-package'){
		sh 'mvn clean package'
	}
}