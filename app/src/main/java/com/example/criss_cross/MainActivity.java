package com.example.criss_cross;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b11,b12,b13,b21,b22,b23,b31,b32,b33,reset;
    int mat[][] = new int[3][3];
    int c=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b11 = (Button) findViewById(R.id.button);
        b12 = (Button) findViewById(R.id.button2);
        b13 = (Button) findViewById(R.id.button3);
        b21 = (Button) findViewById(R.id.button4);
        b22 = (Button) findViewById(R.id.button5);
        b23 = (Button) findViewById(R.id.button6);
        b31 = (Button) findViewById(R.id.button7);
        b32 = (Button) findViewById(R.id.button8);
        b33 = (Button) findViewById(R.id.button9);
        reset = (Button) findViewById(R.id.button10);
    }

    public void setButtonText(View v,int n)
    {
        String r="";
        if(n==1)
            r="X";
        if(n==2)
            r="O";

        if(v.equals(b11))
            b11.setText(r);

        if(v.equals(b12))
            b12.setText(r);

        if(v.equals(b13))
            b13.setText(r);

        if(v.equals(b21))
            b21.setText(r);

        if(v.equals(b22))
            b22.setText(r);

        if(v.equals(b23))
            b23.setText(r);

        if(v.equals(b31))
            b31.setText(r);

        if(v.equals(b32))
            b32.setText(r);

        if(v.equals(b33))
            b33.setText(r);
    }

    public void gameOver(View v)
    {
        if(v.equals(reset))
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    mat[i][j]=0;
                }
            }
            setButtonText(b11,0);
            setButtonText(b12,0);
            setButtonText(b13,0);
            setButtonText(b21,0);
            setButtonText(b22,0);
            setButtonText(b23,0);
            setButtonText(b31,0);
            setButtonText(b32,0);
            setButtonText(b33,0);

            c=1;
            Toast.makeText(getApplicationContext(),"Board Reset",Toast.LENGTH_SHORT).show();
        }
    }

    public void checkWinner()
    {
        if((mat[0][0] ==1 && mat[0][1] ==1 && mat[0][2] == 1)||
           (mat[1][0] ==1 && mat[1][1] ==1 && mat[1][2] == 1)||
           (mat[2][0] ==1 && mat[2][1] ==1 && mat[2][2] == 1)||
           (mat[1][1] ==1 && mat[2][2] ==1 && mat[0][0] == 1)||
           (mat[0][0] ==1 && mat[1][0] ==1 && mat[2][0] == 1)||
           (mat[0][1] ==1 && mat[1][1] ==1 && mat[2][1] == 1)||
           (mat[0][2] ==1 && mat[1][2] ==1 && mat[2][2] == 1)||
           (mat[0][2] ==1 && mat[1][1] ==1 && mat[2][0] == 1))
        {
            Toast.makeText(getApplicationContext(),"Player 1 Wins!",Toast.LENGTH_SHORT).show();
        }
        else if((mat[0][0] ==2 && mat[0][1] ==2 && mat[0][2] == 2)||
                (mat[1][0] ==2 && mat[1][1] ==2 && mat[1][2] == 2)||
                (mat[2][0] ==2 && mat[2][1] ==2 && mat[2][2] == 2)||
                (mat[1][1] ==2 && mat[2][2] ==2 && mat[0][0] == 2)||
                (mat[0][0] ==2 && mat[1][0] ==2 && mat[2][0] == 2)||
                (mat[0][1] ==2 && mat[1][1] ==2 && mat[2][1] == 2)||
                (mat[0][2] ==2 && mat[1][2] ==2 && mat[2][2] == 2)||
                (mat[0][2] ==2 && mat[1][1] ==2 && mat[2][0] == 2))
        {
            Toast.makeText(getApplicationContext(),"Player 2 Wins!",Toast.LENGTH_SHORT).show();
        }
    }

    public void setMatEle(View v,int n)
    {
        if(v.equals(b11))
            mat[0][0]=n;

        else if(v.equals(b12))
            mat[0][1]=n;

        else if(v.equals(b13))
            mat[0][2]=n;

        else if(v.equals(b21))
            mat[1][0]=n;

        else if(v.equals(b22))
            mat[1][1]=n;

        else if(v.equals(b23))
            mat[1][2]=n;

        else if(v.equals(b31))
            mat[2][0]=n;

        else if(v.equals(b32))
            mat[2][1]=n;

        else if(v.equals(b33))
            mat[2][2]=n;
    }

    public void gameOn(View v)
    {
        String r=c==1?"X":"O";
        int n=c;
        if(v.equals(b11)) {
            b11.setText(r);
            setMatEle(b11,n);
        }
        if(v.equals(b12)) {
            b12.setText(r);
            setMatEle(b12,n);
        }
        if(v.equals(b13)) {
            b13.setText(r);
            setMatEle(b13,n);
        }
        if(v.equals(b21)) {
            b21.setText(r);
            setMatEle(b21,n);
        }
        if(v.equals(b22)) {
            b22.setText(r);
            setMatEle(b22,n);
        }
        if(v.equals(b23)) {
            b23.setText(r);
            setMatEle(b23,n);
        }
        if(v.equals(b31)) {
            b31.setText(r);
            setMatEle(b31,n);
        }
        if(v.equals(b32)) {
            b32.setText(r);
            setMatEle(b32,n);
        }
        if(v.equals(b33)) {
            b33.setText(r);
            setMatEle(b33,n);
        }
        c=(c==1)?2:1;
        if(c==1)
            Toast.makeText(getApplicationContext(),"Player 1's Move",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"Player 2's Move",Toast.LENGTH_SHORT).show();
        checkWinner();

    }

}
