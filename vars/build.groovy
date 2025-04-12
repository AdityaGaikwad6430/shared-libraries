def call (){
  echo "This is building the image"
  sh "sudo docker build -t flask-app:latest ."
}
