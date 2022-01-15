package cache.test

import cache.test.example1.TestB
import cache.test.example1.TestBB

class IndexController {

    def index() {
        log.error "Request start"
        Test.get(1l)
        log.error "TestA: "+TestA.get(1l)
        log.error "TestAA: "+TestAA.get(2l)
        log.error " == Test A done == "

        log.error "TestB: "+ TestB.get(1l)
        log.error "TestBB: "+ TestBB.get(2l)
        log.error " == Test B done == "
        render "ok"
    }

    def index1(){
        TestA.get(1l)
        render "ok"
    }
}
