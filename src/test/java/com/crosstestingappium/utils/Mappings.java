package com.crosstestingappium.utils;

import com.crosstestingappium.elements.models.GenericElements;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import lombok.Getter;
import lombok.Setter;

import java.io.*;

@Getter @Setter
public class Mappings<T extends GenericElements> {
    private String platform;
    private String screen;

    public Mappings(String screen) {
        this.platform = Utils.getPlatform().toLowerCase();
        this.screen = screen;
    }

    public String getPlatform() {
        return platform;
    }

    public String getScreen() {
        return screen;
    }

    public GenericElements getJson() {
        StringBuilder fileName = new StringBuilder();
        fileName.append(System.getProperty("user.dir"));
        fileName.append("/src/test/java/com/crosstestingappium/elements/");
        fileName.append(this.getPlatform());
        fileName.append("/");
        fileName.append(this.getScreen());
        fileName.append(".json");

        GenericElements json = null;


        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName.toString()), "UTF-8"))) {
            Gson gson = new Gson();
            JsonElement element = gson.fromJson(bufferedReader, JsonElement.class);
            element = element.getAsJsonObject();
            json = gson.fromJson(element, GenericElements.class);
        }catch(IOException e) {
            e.printStackTrace();
        }

        return json;
    }
}
