job('DSL-test') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/sachinpal123/maven-web-project.git')
            }
            extensions {
                mergeOptions {
                    remote('origin')
                    branch('master')
                }
            }
        }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package','maven-web-project/pom.xml')
    }
}
}
