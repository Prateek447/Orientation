package com.example.orientation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    //to not destroy data on orientation of device use this
    // android:configChanges="orientation|screenSize|keyboardHidden
    // to use screen only in portrait mode
    // <activity android:name=".MainActivity" android:screenOrientation="portrait"/>


    int i=0;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =  findViewById(R.id.edit_Text);
         textView = findViewById(R.id.text);
    }



    //called before onStop()....

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data",editText.getText().toString());
    }

    // called after onStart() method of lyfcycle
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString("data"));
    }
}
