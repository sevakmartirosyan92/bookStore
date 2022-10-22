package am.itspace.bookstore.controller;

import am.itspace.bookstore.entity.Book;
import am.itspace.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final BookService bookService;

    @GetMapping("/")
    public String mainPage(ModelMap modelMap){
        List<Book> last20Books = bookService.findLast20Books();
        modelMap.addAttribute("books", last20Books);
        return "index";
    }
}
