def call(String projectName, String imageTag, String dockerHubCreds) {
    withCredentials([usernamePassword(credentialsId: dockerHubCreds, usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
        sh "sudo -S docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
    }
}
