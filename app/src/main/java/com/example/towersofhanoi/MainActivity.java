package com.example.towersofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView disk0TV, disk1TV, disk2TV;
    private ViewGroup tower0VG, tower1VG, tower2VG, placeholderVG;
    private Stack towerStack0;
    private Stack towerStack1;
    private Stack towerStack2;
    private int placeholderValue = 0;
    private boolean isPlaceholderFull = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.disk0TV = this.findViewById(R.id.disk0);
        this.disk1TV = this.findViewById(R.id.disk1);
        this.disk2TV = this.findViewById(R.id.disk2);

        this.placeholderVG = this.findViewById(R.id.placeHolderVG);
        this.tower0VG = this.findViewById(R.id.tower0VG);
        this.tower1VG = this.findViewById(R.id.tower1VG);
        this.tower2VG = this.findViewById(R.id.tower2VG);

        towerStack0 = new Stack();
        towerStack0.push(3);
        towerStack0.push(2);
        towerStack0.push(1);

        towerStack1 = new Stack();
        towerStack2 = new Stack();

    }

    public void tower0ButtonPressed(View v)
    {

        if(isPlaceholderFull == true)
        {
            if(towerStack0.getCount() != 0)
            {
                if(towerStack0.peek() > placeholderValue)
                {
                    // 3 move from placeholder to tower
                    towerStack0.push(placeholderValue);
                    placeholderValue = 0;
                    isPlaceholderFull = false;

                    View temp = placeholderVG.getChildAt(0);
                    placeholderVG.removeViewAt(0);
                    tower0VG.addView(temp, 0);

                }
                else
                {
                    //3 do nothing
                }
            }
            else
            {
                //4 move from placeholder to tower
                towerStack0.push(placeholderValue);
                placeholderValue = 0;
                isPlaceholderFull = false;

                View temp = placeholderVG.getChildAt(0);
                placeholderVG.removeViewAt(0);
                tower0VG.addView(temp, 0);

            }
        }
        else
        {
            if(towerStack0.getCount() == 0)
            {
                //case 2 do nothing
            }
            else
            {
                //case 1 move disc from tower to palce holder
                placeholderValue = towerStack0.pop();
                isPlaceholderFull = true;

                View temp = this.tower0VG.getChildAt(0);
                this.tower0VG.removeViewAt(0);
                this.placeholderVG.addView(temp);
            }
        }
    }

    public void tower1ButtonPressed(View v)
    {
        if(isPlaceholderFull == true)
        {
            if(towerStack1.getCount() != 0)
            {
                if(towerStack1.peek() > placeholderValue)
                {
                    // 3 move from placeholder to tower
                    towerStack1.push(placeholderValue);
                    placeholderValue = 0;
                    isPlaceholderFull = false;

                    View temp = placeholderVG.getChildAt(0);
                    placeholderVG.removeViewAt(0);
                    tower1VG.addView(temp, 0);

                }
                else
                {
                    //3 do nothing
                }
            }
            else
            {
                //4 move from placeholder to tower
                towerStack1.push(placeholderValue);
                placeholderValue = 0;
                isPlaceholderFull = false;

                View temp = placeholderVG.getChildAt(0);
                placeholderVG.removeViewAt(0);
                tower1VG.addView(temp, 0);

            }
        }
        else
        {
            if(towerStack1.getCount() == 0)
            {
                //case 2 do nothing
            }
            else
            {
                //case 1 move disc from tower to palce holder
                placeholderValue = towerStack1.pop();
                isPlaceholderFull = true;

                View temp = this.tower1VG.getChildAt(0);
                this.tower1VG.removeViewAt(0);
                this.placeholderVG.addView(temp);
            }
        }
    }


    public void tower2ButtonPressed(View v)
    {
        if(isPlaceholderFull == true)
        {
            if(towerStack2.getCount() != 0)
            {
                if(towerStack2.peek() > placeholderValue)
                {
                    // 3 move from placeholder to tower
                    towerStack2.push(placeholderValue);
                    placeholderValue = 0;
                    isPlaceholderFull = false;

                    View temp = placeholderVG.getChildAt(0);
                    placeholderVG.removeViewAt(0);
                    tower2VG.addView(temp, 0);

                }
                else
                {
                    //3 do nothing
                }
            }
            else
            {
                //4 move from placeholder to tower
                towerStack2.push(placeholderValue);
                placeholderValue = 0;
                isPlaceholderFull = false;

                View temp = placeholderVG.getChildAt(0);
                placeholderVG.removeViewAt(0);
                tower2VG.addView(temp, 0);

            }
        }
        else
        {
            if(towerStack2.getCount() == 0)
            {
                //case 2 do nothing
            }
            else
            {
                //case 1 move disc from tower to palce holder
                placeholderValue = towerStack2.pop();
                isPlaceholderFull = true;

                View temp = this.tower2VG.getChildAt(0);
                this.tower2VG.removeViewAt(0);
                this.placeholderVG.addView(temp);
            }
        }
    }
}

