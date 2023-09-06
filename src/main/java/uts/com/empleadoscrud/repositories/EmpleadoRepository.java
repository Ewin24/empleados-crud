package uts.com.empleadoscrud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import uts.com.empleadoscrud.repositories.documents.EmpleadoDocument;

public interface EmpleadoRepository extends MongoRepository<EmpleadoDocument, String> {

}
