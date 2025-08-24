def call(String projectName, String imageTag, String dockerHubCreds) {
    withCredentials([usernamePassword(credentialsId: dockerHubcreds, usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
        sh "sudo docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
    }
}
