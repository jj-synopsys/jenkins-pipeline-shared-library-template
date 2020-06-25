def mvnpkg() {
  sh 'mvn clean package'            
  stash includes: '**/**', name: 'Artifacts'
}
