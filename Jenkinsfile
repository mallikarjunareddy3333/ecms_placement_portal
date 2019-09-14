node{
	stage('SCM Checkout'){
		git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
	}	
	stage('Compile-package'){
		// maven home path
		def mvnHome = tool name: 'maven-3', type: 'maven'
		sh "${mvnHome}/bin/mvn package"
	}
}