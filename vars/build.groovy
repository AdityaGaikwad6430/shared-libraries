def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubcreds', usernameVariable: 'dockerHubUser')]) {
  }
  sh "sudo docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
