package br.com.bike.mongodb.service;

import br.com.bike.mongodb.model.BikeRequest;
import br.com.bike.mongodb.model.BikeResponse;

import java.util.List;

public interface BikeService {
    BikeResponse create(BikeRequest bike);

    List<BikeResponse> getAll();
}
