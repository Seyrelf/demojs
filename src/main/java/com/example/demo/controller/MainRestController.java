package com.example.demo.controller;

import com.example.demo.Repository.DataFromRestRepository;
import com.example.demo.model.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MainRestController {

    DataFromRestRepository dataFromRestRepository = new DataFromRestRepository("http://localhost:8081/cost");
    DataFromRestRepository dataFromRestRepository2 = new DataFromRestRepository("http://localhost:8081/cost2");


    @GetMapping(value = "/info")
    public List<ResponseDto> index() {
        return dataFromRestRepository.getTovar();
    }

    @GetMapping(value = "/info2")
    public List<ResponseDto> index2() {
        return dataFromRestRepository2.getTovar();
    }

    @GetMapping(value = "/info30")
    public List<ResponseDto> index30() {
        List<ResponseDto> res = dataFromRestRepository.getTovar().stream().filter(s -> s.getId()>5955).collect(Collectors.toList());
        return res;
    }

    @GetMapping(value = "/info230")
    public List<ResponseDto> index230() {
        List <ResponseDto> res = dataFromRestRepository2.getTovar();

        return res.stream().filter(s -> s.getId()>7000).collect(Collectors.toList());
    }


}
