package com.trainapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainapp.dto.TrainRequest;
import com.trainapp.dto.TrainResponse;
import com.trainapp.model.TrainDetails;
import com.trainapp.repository.TrainRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TrainService {

    @Autowired
    private TrainRepository repository;

    @SuppressWarnings("null")
    public void createTrain(TrainRequest train) {
        TrainDetails train_save = TrainDetails.builder()
                .urlImage(train.getUrlImage())
                .type(train.getType())
                .trainName(train.getTrainName()).build();

        repository.save(train_save);
        log.info("Train Details for: " + train_save.getId() + " -> saved");

    }

    @SuppressWarnings("null")
    public TrainResponse getSpecificTrain(String id) {
        TrainDetails train = repository.findById(id).get();
        return mapToTrainResponse(train);
    }

    public List<TrainResponse> getAllTrains() {
        List<TrainDetails> trains = repository.findAll();
        return trains.stream().map(this::mapToTrainResponse).toList();

    }

    private TrainResponse mapToTrainResponse(TrainDetails train) {
        return TrainResponse.builder()
                .id(train.getId()).urlImage(train.getUrlImage())
                .type(train.getType())
                .trainName(train.getTrainName())
                .build();
    }
}
