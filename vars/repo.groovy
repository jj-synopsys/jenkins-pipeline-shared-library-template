def getgit(repository) {
  git url: "${repository}"
  sh 'ls -alh'
}

def checkOutFrom(branch,repo) {    
  git branch: "${branch}", url: "https://github.com/jj-synopsys/${repo}"   
}