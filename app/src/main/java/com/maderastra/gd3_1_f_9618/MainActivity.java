package com.maderastra.gd3_1_f_9618;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.maderastra.gd3_1_f_9618.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mahasiswa> ListMahasiswa;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ListMahasiswa = new DaftarMahasiswa().MAHASISWA;
        binding.setMhs(ListMahasiswa.get(0));
    }
}