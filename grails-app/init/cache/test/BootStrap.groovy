package cache.test

import cache.test.example1.TestB
import cache.test.example1.TestBB

class BootStrap {

  def init = { servletContext ->
    Test.withTransaction {
      new Test().save(failOnError: true)
      new TestA().save(failOnError: true, flush: true)
      new TestAA().save(failOnError: true, flush: true)
      new TestB().save(failOnError: true, flush: true)
      new TestBB().save(failOnError: true, flush: true)
    }
  }
  def destroy = {
  }
}
