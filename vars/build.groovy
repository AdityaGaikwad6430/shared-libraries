def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
  }
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
