def call(){
  sh"sudo docker run -d -p 5000:5000 notes-app:latest"
}
