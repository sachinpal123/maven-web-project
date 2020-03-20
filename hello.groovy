def gitUrl = 'git://github.com/test/test'
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
