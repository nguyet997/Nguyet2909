package com.example.baitapbc;

public class Comic {
    private String name;
    private String urlImage;
    private String desc;
    private String url;

    public Comic(String name, String urlImage, String desc, String url) {
        this.name = name;
        this.urlImage = urlImage;
        this.desc = desc;
        this.url = url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getDesc() {
        return desc;
    }
}
