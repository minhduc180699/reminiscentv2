package com.ducpm.reminiscent.service;

import com.ducpm.reminiscent.model.DataUnit;
import com.ducpm.reminiscent.model.response.DataResponse;
import com.ducpm.reminiscent.mongodb.MongodbConnection;
import com.mongodb.client.MongoCollection;
import lombok.Data;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class Storage {
    MongoCollection dataCollection = MongodbConnection.getInstance().getDataCollection();
    public void saveDataUnits(List<DataUnit> dataUnits){

    }
    public DataResponse saveDataUnit(DataUnit dataUnit){
        DataResponse response = new DataResponse(0);
        dataCollection.insertOne(dataUnit);
        return response;
    }
    public void findDataUnitsByKeyword(List<String> keywords){
        Document document = new Document("keyword","");
//        List<DataUnit> dataUnits = dataCollection.find
    }
    public void deleteDataUnits(List<Long> inodes){

    }
}
