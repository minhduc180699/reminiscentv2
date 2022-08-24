package com.ducpm.reminiscent.utils;

import lombok.Getter;
import lombok.Setter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Getter
@Setter
public class ModuleProperties extends Properties {
    private static ModuleProperties instance;
    private String configPath = "./conf/configuration.conf";
    private String isUseProxy;
    private String proxyHost;
    private Integer proxyPort;
    private String mongodbURI;
    private String mongodbDatabase;
    private String mongodbCollection;
    public static synchronized ModuleProperties getInstance(){
        if(instance == null){
            instance = new ModuleProperties();
        }
        return instance;
    }
    public ModuleProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(configPath);
            this.load(new FileReader(configPath));
            this.loadValue();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadValue(){
        try {
            isUseProxy = this.getProperty("isUseProxy");
            proxyHost = this.getProperty("proxyHost");
            mongodbURI = this.getProperty("mongodbURI");
            mongodbDatabase = this.getProperty("mongodbDatabase");
            mongodbCollection = this.getProperty("mongodbCollection");
            proxyPort = Integer.parseInt(this.getProperty("proxyPort"));
        }catch (Exception e){

        }
    }
}
