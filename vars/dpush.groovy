def call(String project, String imageTag, String dockerHubCreds) {
    withCredentials([usernamePassword(credentialsId: dockerHubCreds, passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${project}:${imageTag}"
    }
}
