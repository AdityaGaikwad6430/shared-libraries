def call(String ProjectName, String ImageTag){
  sh "sudo docker build -t adityagaikwad6430/${ProjectName}:${ImageTag} ."
}
