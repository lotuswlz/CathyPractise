package cathywu.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lzwu
 * @since 5/23/15
 */
@Controller
@RequestMapping("/index")
public class MainController {

    @RequestMapping(method = RequestMethod.GET)
    public String displayMainPage() {
        return "index.html";
    }
}
