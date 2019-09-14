node {
		stage('SCM Checkout'){
			git 'https://github.com/mallikarjunareddy3333/ecms_placement_portal'
		}
		stage ('Build') {
			// maven home path
			sh 'mvn package'
		}
}