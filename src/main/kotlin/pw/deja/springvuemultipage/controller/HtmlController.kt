package pw.deja.springvuemultipage.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun index(model: Model): String {
        return "layout"
    }

    @GetMapping("/first")
    fun first(model: Model): String {
        return "first_page"
    }

    @GetMapping("/second")
    fun second(model: Model): String {
        return "second_page"
    }

}