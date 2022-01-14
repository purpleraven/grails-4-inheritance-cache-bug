package cache.test

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'index', action: 'index')
        "/index1"(controller: 'index', action: 'index1')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
