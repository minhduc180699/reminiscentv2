package com.ducpm.reminiscent.mongodb;

import com.ducpm.reminiscent.utils.ModuleProperties;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Data;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
public class MongodbConnection {
    private static MongodbConnection instance;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> dataCollection;
    public static synchronized MongodbConnection getInstance(){
        if (instance == null){
            instance = new MongodbConnection();
        }
        return instance;
    }

    public MongodbConnection() {
        System.out.println("mongoURI: " + ModuleProperties.getInstance().getMongodbURI());
        mongoClient = MongoClients.create(ModuleProperties.getInstance().getMongodbURI());
        database = mongoClient.getDatabase(ModuleProperties.getInstance().getMongodbDatabase());
        dataCollection = database.getCollection(ModuleProperties.getInstance().getMongodbCollection());
    }
}
