def call(String project, String imageTag, String credsId) {
    withCredentials([usernamePassword(credentialsId: credsId, passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${project}:${imageTag}"
    }
}
