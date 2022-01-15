package cache.test

class TestA {
    String pp

    static constraints = {
        pp nullable: true
    }

    static mapping = {
        cache 'nonstrict-read-write'
    }
}
