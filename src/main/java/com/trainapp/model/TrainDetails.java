package com.trainapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="train_details")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TrainDetails {
@Id
private String id;
private String trainName;
private String type;
private String urlImage;
}
