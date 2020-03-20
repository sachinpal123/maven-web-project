def gitUrl = 'git://github.com/sachinpal123/maven-web-project'
job('DSL-test') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
