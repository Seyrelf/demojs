package com.example.demo.controller;

import com.example.demo.Repository.DataFromRestRepository;
import com.example.demo.model.ResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    DataFromRestRepository dataFromRestRepository = new DataFromRestRepository("http://localhost:8081/cost");

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("info",dataFromRestRepository.getTovar());
        return "index";
    }


}
