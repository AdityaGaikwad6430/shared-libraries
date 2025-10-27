def call(){
  sh"docker rmi $(docker images -aq)"
}
