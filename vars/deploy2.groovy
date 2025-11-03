def call(){
  sh " docker-compose down"
  sh" docker-compose up -d --build"
  echo "Deployment successful"
}
