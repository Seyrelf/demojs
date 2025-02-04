package com.example.demo.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseDto {
    private int id;
    private double cost;
    private LocalDateTime date;
}
