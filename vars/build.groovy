def call (String ProjectName, String ImageTag, String dockerHubUser){
  echo "This is building the image"
  sh "sudo docker build -t flask-app:latest ."
}
