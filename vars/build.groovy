def call(String ProjectName, String ImageTag){
  withCredentials([usernamePassword(credentialsId: 'dockerHubcreds', usernameVariable: 'dockerHubUser')]) {
  }
  sh "sudo docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
