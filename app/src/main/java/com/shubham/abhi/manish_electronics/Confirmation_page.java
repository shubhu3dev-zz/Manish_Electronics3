package com.shubham.abhi.manish_electronics;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Confirmation_page extends AppCompatActivity {
    private TextView region, location, vendors, product1, product2, product3, product4,price_p1,price_p2,price_p3,price_p4,quant1,quant2,quant3,quant4;
    private Button proceed;
    private ImageButton del_product1, del_product2, del_product3, del_product4;
    private SharedPreferences pref;
    private String region_1,location_2,vendors_sp1,products_sp2,quantity_product1,products_sp3,quantity_product2,products_sp4,quantity_product3,products_sp5,quantity_product4;
    private DatabaseReference myRef;
    private FirebaseDatabase database;
    private String userId;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Write a message to the database
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("users");

        region = (TextView) findViewById(R.id.region);
        location = (TextView) findViewById(R.id.location);
        vendors = (TextView) findViewById(R.id.vendors);
        product1 = (TextView) findViewById(R.id.product1);
        product2 = (TextView) findViewById(R.id.product2);
        product3 = (TextView) findViewById(R.id.product3);
        product4 = (TextView) findViewById(R.id.product4);

        price_p1 = (TextView) findViewById(R.id.price_p1);
        quant1 = (TextView) findViewById(R.id.quant1);

        price_p2 = (TextView) findViewById(R.id.price_p2);
        quant2 = (TextView) findViewById(R.id.quant2);

        price_p3 = (TextView) findViewById(R.id.price_p3);
        quant3 = (TextView) findViewById(R.id.quant3);

        price_p4 = (TextView) findViewById(R.id.price_p4);
        quant4 = (TextView) findViewById(R.id.quant4);


        del_product1 = (ImageButton) findViewById(R.id.del_product1);
        del_product2 = (ImageButton) findViewById(R.id.del_product2);
        del_product3 = (ImageButton) findViewById(R.id.del_product3);
        del_product4 = (ImageButton) findViewById(R.id.del_product4);

        proceed=(Button) findViewById(R.id.proceed);

        pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        region_1 = pref.getString("region_sp1", null);// getting String

        location_2 = pref.getString("location_sp2", null);// getting String

        vendors_sp1 = pref.getString("vendors_sp1", null);

        products_sp2 = pref.getString("products_sp2", null);

        quantity_product1=pref.getString("quantity_product1",null);

        products_sp3 = pref.getString("products_sp3", null);

        quantity_product2=pref.getString("quantity_product2",null);

        products_sp4 = pref.getString("products_sp4", null);

        quantity_product3=pref.getString("quantity_product3",null);

        products_sp5 = pref.getString("products_sp5", null);

        quantity_product4=pref.getString("quantity_product4",null);

        region.setText("Region : "+region_1);
        location.setText("Location : "+location_2);
        vendors.setText("Vendors : "+vendors_sp1);

        product1.setText(products_sp2);
        quant1.setText("Quantity : "+quantity_product1);

        product2.setText(products_sp3);
        quant2.setText("Quantity : "+quantity_product2);

        product3.setText(products_sp4);
        quant3.setText("Quantity : "+quantity_product3);

        product4.setText(products_sp5);
        quant4.setText("Quantity : "+quantity_product4);


        del_product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.remove("region_sp1");
               // product1.setText("");
                product1.setVisibility(View.GONE);
                quant1.setVisibility(View.GONE);
                price_p1.setVisibility(View.GONE);
                del_product1.setVisibility(View.GONE);
                editor.commit(); // commit changes

            }
        });

        del_product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.remove("region_sp1");
                //product2.setText("");
                product2.setVisibility(View.GONE);
                quant2.setVisibility(View.GONE);
                price_p2.setVisibility(View.GONE);
                del_product2.setVisibility(View.GONE);
                editor.commit(); // commit changes

            }
        });

        del_product3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.remove("region_sp1");
               //product3.setText("");
                product3.setVisibility(View.GONE);
                quant3.setVisibility(View.GONE);
                price_p3.setVisibility(View.GONE);
                del_product3.setVisibility(View.GONE);
                editor.commit(); // commit changes

            }
        });

        del_product4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.remove("region_sp1");
                //product4.setText("");
                product4.setVisibility(View.GONE);
                quant4.setVisibility(View.GONE);
                price_p4.setVisibility(View.GONE);
                del_product4.setVisibility(View.GONE);
                editor.commit(); // commit changes

            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                myRef.setValue(region_1);
                myRef.setValue(location_2);


                Intent i=new Intent(getApplicationContext(),Paymentpage.class);
                startActivity(i);
            }
        });
    }

}
