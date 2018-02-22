package com.testkiev.newsapp.Model;

import java.util.List;


class Source {
    private String id;
    private String name;
    private String description;
    private String author;
    private String url;
    private String category;
    private String language;
    private String country;
    private List<String> sortAvialable;

    public Source() {
    }

    public Source(String id, String name, String description, String author, String url, String category, String language, String country, List<String> sortAvialable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.url = url;
        this.category = category;
        this.language = language;
        this.country = country;
        this.sortAvialable = sortAvialable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getSortAvialable() {
        return sortAvialable;
    }

    public void setSortAvialable(List<String> sortAvialable) {
        this.sortAvialable = sortAvialable;
    }
}
