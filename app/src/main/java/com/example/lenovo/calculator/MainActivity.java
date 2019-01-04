package com.example.lenovo.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bClear,bAdd,bSubtract,bMultiply,bDivide,bEqual;
    TextView tEnter1,tEnter2,tResult;
    float x,y,z;
    boolean Add,Subtract,Multiply,Divide,abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design);
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        bEqual=(Button)findViewById(R.id.bEqual);
        bAdd=(Button)findViewById(R.id.bAdd);
        bSubtract=(Button)findViewById(R.id.bSubtract);
        bMultiply=(Button)findViewById(R.id.bMultiply);
        bDivide=(Button)findViewById(R.id.bDivide);
        bClear=(Button)findViewById(R.id.bClear);

        tEnter1=(TextView) findViewById(R.id.tEnter1);
        tResult=(TextView)findViewById(R.id.tResult);
        tEnter2=(TextView)findViewById(R.id.tEnter2);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"0");
                    abc=false;
                }
                else
                    tEnter1.setText(tEnter1.getText()+"0");

            }
                });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"1");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"2");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"3");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"4");
                   abc=false;
                }
                else
                    tEnter1.setText(tEnter1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"5");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"6");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"7");
                    abc=false;
                }
                else
                    tEnter1.setText(tEnter1.getText()+"7");
            }
        });                                                //how to enter values on specific fields??????????????????

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"8");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abc)
                {
                    tEnter2.setText("");
                    tResult.setText("");
                    tEnter1.setText(""+"9");
                    abc=false;
                }

                else
                    tEnter1.setText(tEnter1.getText()+"9");
            }
        });



        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "cleared all", Toast.LENGTH_SHORT).show();
                tEnter1.setText("");
                tEnter2.setText("");
                tResult.setText("");

            }
        });
        bSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you just clicked -", Toast.LENGTH_SHORT).show();
                try
                {
                    x = Float.parseFloat(tEnter1.getText().toString());
                    Subtract = true;
                    tEnter1.setText(null);
                    tEnter2.setText("First no.= " + x);
                }
                catch(Exception e)
                {
                    Toast.makeText(MainActivity.this, "Exception "+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you just clicked *", Toast.LENGTH_SHORT).show();
                try{
                x = Float.parseFloat(tEnter1.getText().toString());
                Multiply=true;
                tEnter1.setText(null);
                tEnter2.setText("First no.= "+x);
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Exception "+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you just clicked /", Toast.LENGTH_SHORT).show();
                try {
                    x = Float.parseFloat(tEnter1.getText().toString());
                    Divide = true;
                    tEnter1.setText(null);
                    tEnter2.setText("First no.= " + x);
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Exception "+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(MainActivity.this, "you just clicked +", Toast.LENGTH_SHORT).show();
                    x = Float.parseFloat(tEnter1.getText().toString());
                    Add = true;
                    tEnter1.setText("");
                    tEnter2.setText("First no.= " + x);
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Exception "+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you just clicked =", Toast.LENGTH_SHORT).show();
                try{
                y=Float.parseFloat(tEnter1.getText().toString());
                if(Add==true)
                {
                    tEnter1.setText(""+(x+y));
                    abc=true;
                    tEnter2.setText(tEnter2.getText()+"\n"+"Second no. = "+y);
                    tResult.setText("Result = "+(x+y));
                    Add=false;
                }

                if(Subtract==true)
                {
                    tEnter1.setText(""+(x-y));
                    abc=true;
                    tEnter2.setText(tEnter2.getText()+"\n"+"Second no. = "+y);
                    tResult.setText("Result = "+(x-y));
                    Subtract=false;
                }

                if(Multiply==true)
                {
                    tEnter1.setText(""+(x*y));
                    abc=true;
                    tEnter2.setText(tEnter2.getText()+"\n"+"Second no. = "+y);
                    tResult.setText("Result = "+(x*y));
                    Multiply=false;
                }

                if(Divide==true)
                {
                    tEnter1.setText(""+(x/y));
                    abc=true;
                    tEnter2.setText(tEnter2.getText()+"\n"+"Second no. = "+y);
                    tResult.setText("Result = "+(x/y));
                    Divide=false;
                }
                }catch(Exception e){
                    Toast.makeText(MainActivity.this, "Exception "+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi=new MenuInflater(this);
        mi.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.mm1)
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("are u sure ");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    MainActivity.this.finish();
                }
            });

            builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();

        }
        return super.onOptionsItemSelected(item);
    }
}


