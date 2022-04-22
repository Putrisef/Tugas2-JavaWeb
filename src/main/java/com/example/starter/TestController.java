package com.example.starter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TestController {

    @GetMapping("")
    public String getBiodata(Model model) {
        Biodata biodata = new Biodata("Seftiaputri damayana", "1912510250", "29/09/1999", "sistem informasi");
        model.addAttribute("biodata", biodata);
        return "biodata";
    }
}