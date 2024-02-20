package Personal.Algorhythm.controller;

import Personal.Algorhythm.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("list")
public class ListController {

    @GetMapping("/monaco")
    public String monacoList(Model model) {
        List<Category> list = new ArrayList<>();
        list.add(new Category(0L, "UnionFind"));
        model.addAttribute("list", list);
        return "list";
    }
}
