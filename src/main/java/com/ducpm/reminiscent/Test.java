package com.ducpm.reminiscent;

import com.ducpm.reminiscent.model.DataUnit;
import com.ducpm.reminiscent.service.Storage;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try{
            String connectionString = System.getProperty("mongodb.uri");
            Storage storage = new Storage();
//            try (MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"))) {
//
//                MongoDatabase sampleTrainingDB = mongoClient.getDatabase("sample_training");
//                MongoCollection<Document> gradesCollection = sampleTrainingDB.getCollection("grades");
//
////            FindIterable<Document> doc = gradesCollection.insertOne(Document.));
//            }
            DataUnit dataUnit = new DataUnit();
            dataUnit.setKeywords("java,spring");
            dataUnit.setContent("java 8, spring boot");
            dataUnit.setInode(1234L);
            dataUnit.setConnectomeId("Ducpm");
            storage.saveDataUnit(dataUnit);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
