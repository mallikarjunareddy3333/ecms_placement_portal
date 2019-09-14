node{
	stage('SCM Checkout'){
		git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
	}	
	stage('Compile-Package'){
		// maven home path
		sh 'mvn package'
	}
}