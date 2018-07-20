package com.djinnidemo.charlesso.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mycompany.helloworld.HelloWorld;

public class MainActivity extends AppCompatActivity {
    private HelloWorld cppApi;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("helloworld-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cppApi = HelloWorld.create();
    }

    public void buttonWasPressed(View view) {
        String myString = cppApi.getHelloWorld() + "\n";
        TextView t = (TextView) findViewById(R.id.helloWorldText);
        t.setText(myString + t.getText());
    }
}
