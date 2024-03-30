package com.trainapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainResponse {
    private String trainNumber;
    private String trainName;
    private String trainType;
    private String trainImage;
    private int trainCapacity;

    public String getTrainNumber() {
        return this.trainNumber;
    }

    public String getTrainName() {
        return this.trainName;
    }

    public String getTrainType() {
        return this.trainType;
    }

    public String getTrainImage() {
        return this.trainImage;
    }

    public int getTrainCapacity() {
        return this.trainCapacity;
    }
}