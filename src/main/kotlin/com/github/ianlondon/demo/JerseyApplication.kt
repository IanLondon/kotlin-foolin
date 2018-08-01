package com.github.ianlondon.demo

import javax.ws.rs.core.Application

class JerseyApplication: Application() {
    override fun getSingletons(): MutableSet<Any> {
        return mutableSetOf(UserResource())
    }
}