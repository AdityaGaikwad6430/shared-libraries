def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', usernameVariable: 'dockerHubUser')]) {
  }
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
