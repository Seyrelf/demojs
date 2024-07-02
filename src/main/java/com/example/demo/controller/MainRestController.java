package com.example.demo.controller;

import com.example.demo.Repository.DataFromRestRepository;
import com.example.demo.model.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainRestController {

    DataFromRestRepository dataFromRestRepository = new DataFromRestRepository("http://localhost:8081/cost");

    @GetMapping(value = "/info")
    public List<ResponseDto> index() {
        return dataFromRestRepository.getTovar();
    }
}
