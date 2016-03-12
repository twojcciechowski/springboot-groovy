package pl.twojcciechowski

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

import javax.annotation.PostConstruct

@Controller
@Slf4j
class HelloWorldController {

    @RequestMapping(value = "/")
    def @ResponseBody String index(){
        log.info("Executing hello request")
         "hello"
    }

    @PostConstruct
    def postConstruct(){
        println("postConstruct")
    }
}
