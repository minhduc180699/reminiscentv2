package com.ducpm.reminiscent.controller;

import com.ducpm.reminiscent.model.DataUnit;
import com.ducpm.reminiscent.service.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/unit")
public class DataRestController {
    @Autowired
    private Storage storage;
    @GetMapping("/find")
    private ResponseEntity<?> findUnitsByKeywords(@RequestParam("connectomeId") String connectomeId,
                                                  @RequestParam("keywords") String keywords){

    }
    @PostMapping("/add")
    private ResponseEntity<?> addUnit(@RequestBody DataUnit dataUnit){
        return ResponseEntity.ok(storage.saveDataUnit(dataUnit));
    }
}
