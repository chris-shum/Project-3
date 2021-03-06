package com.example.android.lately.Foursquare.FoursquarePhotos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wasabi on 3/10/2016.
 */
public class Photos {


    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("dupesRemoved")
    @Expose
    private Integer dupesRemoved;

    /**
     *
     * @return
     * The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     *
     * @return
     * The dupesRemoved
     */
    public Integer getDupesRemoved() {
        return dupesRemoved;
    }

    /**
     *
     * @param dupesRemoved
     * The dupesRemoved
     */
    public void setDupesRemoved(Integer dupesRemoved) {
        this.dupesRemoved = dupesRemoved;
    }
}
