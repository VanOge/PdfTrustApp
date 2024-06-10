package com.example.pdftrustapp;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class PdfActivity extends AppCompatActivity {

    String filepath= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.id.layout.activity_pdf);

        PDFView pdfView = findViewById(R.id.pdfView);
        filepath = getIntent().getStringExtra( "path");
        File file = new File(filepath);
        Uri path = Uri.fromFile(file);
        pdfView.fromUri(path).load();

    }
}