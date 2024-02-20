package Personal.Algorhythm.controller;

import Personal.Algorhythm.service.MonacoService;
import Personal.Algorhythm.util.IOUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Controller
@RequestMapping("/monaco")
@Slf4j
public class MonacoController {

    @Autowired
    MonacoService monacoService;

    @GetMapping("/{id}")
    public String monaco(@PathVariable("id") Long id, Model model) {
        if(id == 0L) {
            String url = "src\\main\\resources\\static\\algorithm\\union_find\\UnionFind";
            model.addAttribute("title", "Union-Find");
            model.addAttribute("content", "../static/algorithm/union_find/UnionFind.md");
            model.addAttribute("value", IOUtils.getFile(url + ".java"));
            model.addAttribute("language", "java");
        }

        return "monaco";
    }


    @ResponseBody
    @PostMapping("/receive")
    public boolean receive(@RequestParam("code") String code) {
        //todo: 데이터 받은 후 처리
        log.error(code);

        return true;
    }


}
