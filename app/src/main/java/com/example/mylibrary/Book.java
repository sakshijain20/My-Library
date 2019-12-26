package com.example.mylibrary;

public class Book {
    String Title;
    String Description;
    String Category;
   Integer bookImage;

    public Book(String title, String description, String category, Integer bookImage) {
        Title = title;
        Description = description;
        Category = category;
        this.bookImage = bookImage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getBookImage() {
        return bookImage;
    }

    public void setBookImage(Integer bookImage) {
        this.bookImage = bookImage;
    }
}

