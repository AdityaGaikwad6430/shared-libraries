def call(String projectName, String imageTag, String dockerHubcreds) {
    withCredentials([usernamePassword(credentialsId: dockerHubcreds, usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
        sh "sudo docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
    }
}
