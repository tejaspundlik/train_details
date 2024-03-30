package com.trainapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "train_details")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TrainDetails {
    @Id
    private String trainNumber;
    private String trainName;
    private String trainType;
    private String trainImage;
    private int trainCapacity;
}
