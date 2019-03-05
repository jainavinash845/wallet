package com.example.avinash.wallet;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Selection;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


//    Button mbutton500, mbutton1000,mbutton1500 ,mAddCash;
//    EditText mAmount;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.resturant_menu);
//        mAmount = (EditText) findViewById(R.id.ed_enter_amount);
//        mAddCash =(Button) findViewById(R.id.button_add);
//        mbutton500=(Button) findViewById(R.id.button_rs500);
//        mbutton1000=(Button) findViewById(R.id.button_rs1000);
//        mbutton1500 =(Button) findViewById(R.id.button_rs1500);
//
//        mbutton500.setOnClickListener(this);
//        mbutton1000.setOnClickListener(this);
//        mbutton1500.setOnClickListener(this);

        /*StringBuilder amount= new StringBuilder();
        int totalamount=0;

       if(mbutton500.isEnabled())
       {
           totalamount+=500;

       }
       if(mbutton1500.isEnabled())
       {
           totalamount+=1500;
       }

       if(mbutton1000.isEnabled())
       {
           totalamount+=1000;
       }


       String value= amount.append(totalamount).toString();
        mAmount.setText(value);*/
        /*mbutton1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAmount.setText(mbutton1000.getText());
            }
        });
        mbutton500.setOnClickListener(this);*/


    }
//
//    @Override
//    public void onClick(View v) {
//
//        if(v==mbutton500)
//        {
//
//            mAmount.setText(mbutton500.getText());
//            mAmount.setSelection(mAmount.getText().toString().length());
//
//        }
//        else if(v==mbutton1000)
//        {
//            mAmount.setText(mbutton1000.getText());
//            mAmount.setSelection(mAmount.getText().toString().length());
//        }
//        if(v==mbutton1500)
//        {
//            mAmount.setText(mbutton1500.getText());
//            mAmount.setSelection(mAmount.getText().toString().length());
//
//        }
//
//
//    }
}
