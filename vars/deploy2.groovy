def call(){
  sh "sudo docker-compose down"
  sh"sudo docker-compose up -d --build"
  echo "Deployment successful"
}
