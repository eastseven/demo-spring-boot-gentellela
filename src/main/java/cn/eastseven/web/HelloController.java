package cn.eastseven.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 */
@Controller
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String index() {
        log.debug("index");
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        log.debug("model {}", model);
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        log.debug("hello");
        return "hello";
    }

    @GetMapping("/login")
    public String login() {
        log.debug("login");
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        log.debug("logout");
        SecurityContextHolder.clearContext();
        return "login";
    }
}