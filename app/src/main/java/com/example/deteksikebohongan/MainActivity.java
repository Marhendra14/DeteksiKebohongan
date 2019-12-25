package com.example.deteksikebohongan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.Frame1, new Fragment1()); //Menempelkan class fragment 1 ke id Fragment 1
        ft.add(R.id.Frame2, new Fragment2()); //Menempelkan class fragment 2 ke id Fragment 2
        ft.commit();
    }
}
