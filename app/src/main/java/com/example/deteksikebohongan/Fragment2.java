package com.example.deteksikebohongan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment
{
    View M;  @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) //Ctrl + O untuk melihat method yang bisa diambil secara instan
    {
        M = inflater.inflate(R.layout.activity_fragment2,container, false); //memanggil tampilan fragment, container untuk membungkus
        return M;
    }
}
