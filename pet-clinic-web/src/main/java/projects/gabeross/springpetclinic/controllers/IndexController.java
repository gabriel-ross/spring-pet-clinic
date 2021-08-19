package projects.gabeross.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        // this tells Thymeleaf to go look for an html template named "index"
        return "index";
    }
}
