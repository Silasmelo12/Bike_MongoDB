package br.com.bike.mongodb.persistence.repository;

import br.com.bike.mongodb.persistence.entity.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends MongoRepository<Bike,String> {

}