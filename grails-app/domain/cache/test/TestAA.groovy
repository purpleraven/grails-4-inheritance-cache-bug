package cache.test

class TestAA extends TestA{

    String dd

    static constraints = {
        dd nullable: true
    }

    static mapping = {
        cache 'nonstrict-read-write'
    }
}
