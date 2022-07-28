package br.com.bike.mongodb.controller;

import br.com.bike.mongodb.model.BikeRequest;
import br.com.bike.mongodb.model.BikeResponse;
import br.com.bike.mongodb.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class BikeController {

    @Autowired
    private BikeService service;

    @PostMapping
    public ResponseEntity<BikeResponse> create(@RequestBody BikeRequest request){

        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping
    public ResponseEntity<List<BikeResponse>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
