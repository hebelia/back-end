
package com.hebelia.portfolio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;



@Entity

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    review validator dependency
//    @NotNull
//    @Size(min=1, max=50, message="Debe contar con una longitud minima de 1 y maxima de 100 caracteres")
    private String fullname;
    private String  title;
    @Lob
    private String  pfp;
    @Lob
    private String  about;
    @Lob
    private String  banner;
    private String  license;

    public Person() {
    }

    public Person(String fullname, String title, String pfp, String about, String banner, String license) {
        this.fullname = fullname;
        this.title = title;
        this.pfp = pfp;
        this.about = about;
        this.banner = banner;
        this.license = license;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPfp() {
        return pfp;
    }

    public void setPfp(String pfp) {
        this.pfp = pfp;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
    
    
}
