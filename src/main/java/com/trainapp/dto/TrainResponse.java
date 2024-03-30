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
    private String id;
    private String trainName;
    private String type;
    private String urlImage;
}
