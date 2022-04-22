package com.example.starter;

public class Biodata {
    private String name;
    private String nim;
    private String born_date;
    private String jurusan;

    public  Biodata() {}
    public Biodata(String name, String nim, String born_date, String jurusan) {
        this.name = name;
        this.nim = nim;
        this.born_date = born_date;
        this.jurusan = jurusan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getBorn_date() {
        return born_date;
    }

    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
