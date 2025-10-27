def call(){
  sh"sudo docker-compose up -d --build"
  echo "Deployment successful"
}
