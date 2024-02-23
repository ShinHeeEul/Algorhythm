package Personal.Algorhythm.controller;

import Personal.Algorhythm.model.Category;
import Personal.Algorhythm.util.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("list")
public class ListController {

    @GetMapping("/monaco")
    public String monacoList(Model model) {
        HashMap<Long, String> map = IOUtils.getFileList();
        List<Category> list = new ArrayList<>();
        for(long key : map.keySet()) {
            list.add(new Category(key, map.get(key)));
        }
        model.addAttribute("list", list);
        return "list";
    }
}
