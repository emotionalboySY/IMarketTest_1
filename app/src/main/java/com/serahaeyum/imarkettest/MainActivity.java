package com.serahaeyum.imarkettest;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        startActivity(new Intent(this, SplashActivity.class));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void onClick_login(View v) {

        EditText text_id = (EditText) findViewById(R.id.login_id);
        EditText text_pw = (EditText) findViewById(R.id.login_pw);

        String id = text_id.getText().toString();
        String pw = text_pw.getText().toString();

        Intent intent_main = new Intent(getApplicationContext(), MainDetailActivity.class);

        intent_main.putExtra("id", id);
        intent_main.putExtra("password", pw);

        startActivity(intent_main);
    }

    public void onClick_register(View v) {
        Intent intent_signup = new Intent(getApplicationContext(), Login_SignUp.class);
        startActivity(intent_signup);
    }
}
