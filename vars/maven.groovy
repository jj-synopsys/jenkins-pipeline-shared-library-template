def () {
  sh "mvn clean package"
  //sh 'ls -alh'            
  stash includes: '**/**', name: 'Artifacts'
}
