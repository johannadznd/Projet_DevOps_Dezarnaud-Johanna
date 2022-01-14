#!groovy
println('------------------------------------------------------------------Import Job CaC/ansible')
def pipelineScript = new File('/var/jenkins_config/jobs/ansible-pipeline.groovy').getText("UTF-8")

pipelineJob('CaC/ansible') {
    description("Run ansible")
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}