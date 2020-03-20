job('DSL-test') {
    scm {
        git('git@github.com/sachinpal123/maven-web-project',master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package','maven-web-project/pom.xml')
    }
}
