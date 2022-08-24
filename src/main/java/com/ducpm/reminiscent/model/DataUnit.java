package com.ducpm.reminiscent.model;

import lombok.Data;
import org.bson.Document;

import java.time.Instant;

@Data
public class DataUnit extends Document {
    private Long inode;
    private String keywords;
    private String content;
    private String connectomeId;
}
