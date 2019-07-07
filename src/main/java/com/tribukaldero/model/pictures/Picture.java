package com.tribukaldero.model.pictures;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pictures")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "date_added")
    private LocalDateTime dateAdded;

    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    @Column(name = "picture_url")
    private String pictureUrl;

    @Column(name = "details")
    private String details;

    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "hot_spot_id")
    private Integer hotSpotId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDateAdded() {
        return this.dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public LocalDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getCityId() {
        return this.cityId;
    }

    public void setDetails(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getHotSpotId() {
        return this.hotSpotId;
    }

    public void setHotSpotId(Integer hotSpotId) {
        this.hotSpotId = hotSpotId;
    }



}
