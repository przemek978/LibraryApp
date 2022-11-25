package com.example.libraryapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName="book")
public class Book {
    @PrimaryKey(autoGenerate=true)
    private int id;
    private String title;
    private String author;

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }

}
