package cache.test.example1

class TestBB extends TestB{

    static constraints = {
    }

    static mapping = {
        cache 'nonstrict-read-write'
    }
}
