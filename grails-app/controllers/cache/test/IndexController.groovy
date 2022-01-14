package cache.test

class IndexController {

    def index() {
        Test.get(1l)
        TestAA.get(1l)

        render "ok"
    }

    def index1(){
        TestA.get(1l)
        render "ok"
    }
}
