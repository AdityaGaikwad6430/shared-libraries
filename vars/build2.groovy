def call(String projectName, String imageTag) {
    sh "sudo docker build -t ${projectName}:${imageTag} ."
}
