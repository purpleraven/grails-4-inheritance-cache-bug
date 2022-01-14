package cache.test

class IndexController {

    def index() {
        log.error "Request start"
        Test.get(1l)
        TestAA.get(1l)
        log.error " == done == "
        render "ok"
    }

    def index1(){
        TestA.get(1l)
        render "ok"
    }
}
