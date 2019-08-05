package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller
public class IndexController {

    @GET()
    @Produces(MediaType.TEXT_HTML)
    public String index() {
        return "index";
    }
}
