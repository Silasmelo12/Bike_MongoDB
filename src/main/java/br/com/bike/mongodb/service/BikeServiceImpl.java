package br.com.bike.mongodb.service;

import br.com.bike.mongodb.model.BikeRequest;
import br.com.bike.mongodb.model.BikeResponse;
import br.com.bike.mongodb.persistence.entity.Bike;
import br.com.bike.mongodb.persistence.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BikeServiceImpl implements BikeService{

    @Autowired
    BikeRepository bikeRepository;

    @Override
    public BikeResponse create(BikeRequest request) {
        Bike bike = new Bike();
        bike.setAno(request.getAno());
        bike.setCor(request.getCor());
        bike.setMarca(request.getMarca());
        bikeRepository.save(bike);
        return createResponse(bike);
    }

    @Override
    public List<BikeResponse> getAll() {
        List<BikeResponse> responses = new ArrayList<>();
        List<Bike> bikes = bikeRepository.findAll();
        if (!bikes.isEmpty()){
            bikes.forEach(bike -> responses.add(createResponse(bike)));
        }
        return responses;
    }

    private BikeResponse createResponse(Bike bike) {
        BikeResponse response = new BikeResponse();
        response.setAno(bike.getAno());
        response.setCor(bike.getCor());
        response.setMarca(bike.getMarca());
        response.setId(bike.getId());
        return response;
    }
}
