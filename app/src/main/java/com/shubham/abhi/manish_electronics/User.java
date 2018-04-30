package com.shubham.abhi.manish_electronics;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Shubham Singh on 28/03/18.
 */

@IgnoreExtraProperties
public class User {

    public String latitude;
    public String longitude;
    public String date;
    public String region;
    public String location;
    public String vendors_name;
    public String product1;
    public String quantity1;
    public String cost1;
    public String product2;
    public String quantity2;
    public String cost2;
    public String product3;
    public String quantity3;
    public String cost3;
    public String product4;
    public String quantity4;
    public String cost4;
    public String total;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String latitude, String longitude,String date,String region,String location, String vendors_name,String product1,String quantity1,String cost1,String product2,String quantity2,String cost2,String product3,String quantity3,String cost3,String product4,String quantity4,String cost4,String total  ) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.region = region;
        this.location = location;
        this.vendors_name = vendors_name;
        this.product1 = product1;
        this.quantity1 = quantity1;
        this.cost1 = cost1;
        this.product2 = product2;
        this.quantity2 = quantity2;
        this.cost2 = cost2;
        this.product3 = product3;
        this.quantity3 = quantity3;
        this.cost3 = cost3;
        this.product4 = product4;
        this.quantity4 = quantity4;
        this.cost4 = cost4;
        this.total = total;
    }
}