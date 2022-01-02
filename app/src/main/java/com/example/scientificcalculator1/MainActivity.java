package com.example.scientificcalculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    double Value1,Value2,ans,a ;
    char c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.resultbtn);
    }
    public void squarebtn(View view){
        a = Math.pow(Double.parseDouble(result.getText().toString()),2);
        result.setText("");
        result.setText(result.getText().toString() +a+"");
    }
    public void logbtn(View view){
        a = Math.log(Double.parseDouble(result.getText().toString()));
        result.setText("");
        result.setText(result.getText().toString() +a);
    }
    public void cubebtn(View view){
        a = Math.pow(Double.parseDouble(result.getText().toString()),2);
        result.setText("");
        result.setText(result.getText().toString() +a);
    }
    public void cuberootbtn(View view){
        a = Math.cbrt(Double.parseDouble(result.getText().toString()));
        result.setText("");
        result.setText(result.getText().toString() +a);
    }
    public void rootbtn(View view){
        a = Math.sqrt(Double.parseDouble(result.getText().toString()));
        result.setText("");
        result.setText(result.getText().toString() +a);
    }
    public void pointbtn(View view){
        result.setText(result.getText()+".");
    }
    public void factorialbtn(View view){
        a =Double.parseDouble(result.getText().toString());
        int sr = 0; double i,s =1;
        if (a<0){
            sr =20;
        }
        else{
            for (i=2;i<=a; i+=1.0)
                s*= i;
        }
        result.setText("");
        result.setText(result.getText().toString()+s);

    }
    public void piebtn(View view){
        result.setText(Math.PI+"");
    }
    public void onebtn(View view){
        result.setText(result.getText()+"1");

    }
    public void twobtn(View view){
        result.setText(result.getText()+"2");

    }
    public void threebtn(View view){
        result.setText(result.getText()+"3");

    }
    public void fourbtn(View view){
        result.setText(result.getText()+"4");

    }
    public void fivebtn(View view){
        result.setText(result.getText()+"5");

    }
    public void sixbtn(View view){
        result.setText(result.getText()+"6");

    }
    public void sevenbtn(View view){
        result.setText(result.getText()+"7");

    }
    public void eightbtn(View view){
        result.setText(result.getText()+"8");

    }
    public void ninebtn(View view){
        result.setText(result.getText()+"9");

    }
    public void zerobtn(View view){
        result.setText(result.getText()+"0");
    }
    public void acbtn(View view){
        result.setText("");
    }
    public void backbtn(View view){
        String sr;
        sr = result.getText().toString();
        if (sr.length()!=0){
            sr=sr.substring(0,sr.length()-1);
            result.setText(sr);
        }

    }
    public void plusbtn(View view){
       String s =result.getText().toString();
       Value1=Double.parseDouble(s);
       result.setText("");
       c ='+';
    }
    public void minusbtn(View view){
        String s =result.getText().toString();
        Value1=Double.parseDouble(s);
        result.setText("");
        c ='-';
    }
    public void multiplybtn(View view){
        String s =result.getText().toString();
        Value1=Double.parseDouble(s);
        result.setText("");
        c ='*';
    }
    public void dividebtn(View view){
        String s =result.getText().toString();
        Value1=Double.parseDouble(s);
        result.setText("");
        c ='/';
    }
    public void equalbtn(View view){
        String s =result.getText().toString();
        Value2=Double.parseDouble(s);
        if (c=='+'){
            ans = Value1 + Value2;
            s =String.valueOf(ans);
            result.setText(s);
            c='0';
        }
        if (c=='-'){
            ans = Value1 - Value2;
            s =String.valueOf(ans);
            result.setText(s);
            c='0';
        }
        if (c=='*'){
            ans = Value1 * Value2;
            s =String.valueOf(ans);
            result.setText(s);
            c='0';
        }
        if (c=='/'){
            ans = Value1 / Value2;
            s =String.valueOf(ans);
            result.setText(s);
            c='0';
        }
    }

}