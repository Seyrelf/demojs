package com.example.demo.Repository;

import com.example.demo.model.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class DataFromRestRepository {

    private RestTemplate rest = new RestTemplate();
    private final String url;

    public DataFromRestRepository(String url){
        this.url = url;
    }

    public List<ResponseDto> getTovar(){
        ResponseEntity<ResponseDto[]> response = rest.getForEntity(url,ResponseDto[].class);
        ResponseDto[] dtos = response.getBody();
        return List.of(dtos);
    }
}