package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 3)
    private String name;

    private Date posteddate;

    private String datePosted;

    private String description;

    private String headshot;

    private String petFound;

    private String postImg;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Pet() {
    }

    public Pet(long id, String name, Date posteddate, String datePosted, String description, String headshot, String petFound, String postImg, User user) {
        this.id = id;
        this.name = name;
        this.posteddate = posteddate;
        this.datePosted = datePosted;
        this.description = description;
        this.headshot = headshot;
        this.petFound = petFound;
        this.postImg = postImg;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPosteddate() {
        return posteddate;
    }

    public void setPosteddate() {
        posteddate = new Date();
        this.posteddate = posteddate;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public String getPetFound() {
        return petFound;
    }

    public void setPetFound(String petFound) {
        this.petFound = petFound;
    }

    public String getPostImg() {
        return postImg;
    }

    public void setPostImg(String postImg) {
        this.postImg = postImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }
}





