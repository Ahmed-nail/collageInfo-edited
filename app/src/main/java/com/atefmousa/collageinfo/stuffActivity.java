package com.atefmousa.collageinfo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.atefmousa.collageinfo.databinding.ActivityDetaliedBinding;

public class stuffActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalied);
        Stuff_Info [] stuff_info = {new Stuff_Info("ahmed","ahmed@gmail.com","0100246"),
                new Stuff_Info("mahmoud","mahomud@gmail.com","0100246"),
                new Stuff_Info("ayman","ayamn@gmail.com","0100246"),
                new Stuff_Info("ali","ali@gmail.com","0100246"),
                new Stuff_Info("mosad","mosad@gmail.com","0100246"),};

        ArrayAdapter<StudentInfo> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,stuff_info);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

}