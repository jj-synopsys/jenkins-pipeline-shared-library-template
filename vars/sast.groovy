def spotbugs() {
    sh "mvn com.github.spotbugs:spotbugs-maven-plugin:4.0.4:spotbugs"
    archiveArtifacts 'target/spotbugsXml.xml'
}