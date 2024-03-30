package com.trainapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.trainapp.dto.TrainRequest;
import com.trainapp.dto.TrainResponse;
import com.trainapp.service.TrainService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/train")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @PostMapping("/add_train")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createTrain(@RequestBody TrainRequest trainRequest) {
        trainService.createTrain(trainRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TrainResponse> getAllTrains() {
        return trainService.getAllTrains();
    }

    @GetMapping("/{Id}")
    public TrainResponse getSpecificTrain(@PathVariable String Id) {
        return trainService.getSpecificTrain(Id);
    }

}
