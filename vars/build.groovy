def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable: 'dockerHubUser')]) {
  }
  sh "sudo docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
