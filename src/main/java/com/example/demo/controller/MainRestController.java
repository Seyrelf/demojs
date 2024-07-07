package com.example.demo.controller;

import com.example.demo.Repository.DataFromRestRepository;
import com.example.demo.model.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
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
        return dataFromRestRepository.getTovar().stream().filter(s -> s.getDate().isAfter(LocalDateTime.now().minusMinutes(5))).collect(Collectors.toList());
    }

    @GetMapping(value = "/info230")
    public List<ResponseDto> index230() {
        return dataFromRestRepository2.getTovar().stream().filter(s -> s.getDate().isAfter(LocalDateTime.now().minusMinutes(5))).collect(Collectors.toList());
    }


}
