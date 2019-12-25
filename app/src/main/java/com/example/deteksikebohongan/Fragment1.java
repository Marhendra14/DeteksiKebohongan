package com.example.deteksikebohongan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;

public class Fragment1 extends Fragment
{
    EditText edit;
    TextView view;
    Button button;
    View M;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) //Ctrl + O untuk melihat method yang bisa diambil secara instan
    {
        M = inflater.inflate(R.layout.activity_fragment1,container, false); //memanggil tampilan fragment
        edit = M.findViewById(R.id.edit1);
        view = M.findViewById(R.id.view1);
        button = M.findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String input = edit.getText().toString();
                input.toLowerCase();
                String[] arrayInput = input.split(" ");
                String Hasil = "";

                for(int i = arrayInput.length-1;i>0;i--)
                {
                    System.out.println(arrayInput[i]);
                    if(arrayInput[i].equals(("bohong")))
                    {
                        arrayInput[i-1] = inverse(arrayInput[i-1]);
                    }
                    Hasil = arrayInput[0];
                }

                view.setText(Hasil);
            }
        });
        return M;
    }

    public String inverse(String Inputan)
    {
        String result;
        if(Inputan.equals("bohong"))
        {
            result = "jujur";
        }
        else
        {
            result = "bohong";
        }

        return result;
    }

}
