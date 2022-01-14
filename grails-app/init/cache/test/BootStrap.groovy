package cache.test

class BootStrap {

    def init = { servletContext ->
        new Test().save(failOnError:true)
        new TestAA().save(failOnError:true)
    }
    def destroy = {
    }
}
