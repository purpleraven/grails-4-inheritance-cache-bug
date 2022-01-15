package cache.test.example1

class TestB {

    static constraints = {
    }

    static mapping = {
        tablePerHierarchy false
        cache 'nonstrict-read-write'
    }
}
