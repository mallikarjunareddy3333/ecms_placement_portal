node{
	stage('SCM Checkout'){
		steps {
			git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
		}
	}
	
	stage('Compile-package'){
		steps {
			sh 'mvn package'
		}
	}
}