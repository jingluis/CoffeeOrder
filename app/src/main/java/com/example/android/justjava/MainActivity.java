package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.lang.String;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        displayMessage(NumberFormat.getCurrencyInstance().format(c*1.5) + " Thank you!");
    }

    public void increment(View view){
        ++c;
        display(c);
    }
    public void decrement(View view){
        --c;
        display(c);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitat);
        quantityTextView.setText("" + number);
    }

    private void displayprice(int number){
        TextView preiceTextView = (TextView) findViewById(R.id.preu);
        preiceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.preu);
        priceTextView.setText(message);
    }
}