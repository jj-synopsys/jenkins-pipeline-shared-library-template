def getgit(repository) {
  git url: "${repository}"
  sh 'ls -alh'
}
