package com.poc.multimodule.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service


@Service
@EnableConfigurationProperties(ServiceProperties::class)
class Service1Application{

    @Autowired
    lateinit var serviceProperties: ServiceProperties;

    fun message() : String { return serviceProperties.message }

}


