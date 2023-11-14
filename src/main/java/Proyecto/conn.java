package Proyecto;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class conn {
    static MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    static MongoDatabase database = mongoClient.getDatabase("proyecto1tbd2");
    static MongoCollection profesores = database.getCollection("Profesores");
    static MongoCollection estudiantes = database.getCollection("Estudiantes");
    static MongoCollection administradores = database.getCollection("Administradores");
    static MongoCollection vehiculos = database.getCollection("Vehiculos");
    static MongoCollection practicas = database.getCollection("Practicas");
    static MongoCollection pagos = database.getCollection("Pagos");
    static MongoCollection calificaciones = database.getCollection("Calificaciones");
}
