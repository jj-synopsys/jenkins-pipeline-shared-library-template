def pkg() {
  sh 'mvn clean package'            
  stash includes: '**/**', name: 'Artifacts'
}
