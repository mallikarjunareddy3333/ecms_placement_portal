node {
		stage('SCM Checkout'){
			git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
		}
		stage ('Build') {
			// maven home path
			def mvnHome = tool name: 'maven-3', type: 'maven'
			bat "${mvnHome}/bin/mvn package"
		}
}