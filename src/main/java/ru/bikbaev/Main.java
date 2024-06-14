package ru.bikbaev;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {

        Person person = new Person("Name","LastName","30");

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try (FileWriter fileWriter = new FileWriter("json.json");){
            fileWriter.write(gson.toJson(person));
        }

        try(FileReader fileReader = new FileReader("json.json")) {
            System.out.println(Optional.ofNullable(gson.fromJson(fileReader, Person.class)).get());
        }
        







    }
}