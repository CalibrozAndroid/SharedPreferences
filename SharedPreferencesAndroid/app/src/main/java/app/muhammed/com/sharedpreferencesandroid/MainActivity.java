package app.muhammed.com.sharedpreferencesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import app.muhammed.com.sharedpreferencesandroid.storage.StorageHandler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;

    private CheckBox mRememberCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if(StorageHandler.isChecked(this)){

            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }

        setContentView(R.layout.activity_main);


        mUsernameEditText = (EditText) findViewById(R.id.usernameEditText);
        mPasswordEditText = (EditText) findViewById(R.id.passwordEditText);

        mLoginButton = (Button) findViewById(R.id.loginButton);


        mRememberCheckBox = (CheckBox) findViewById(R.id.rememberCheckBox);


        mLoginButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        StorageHandler.insertUsername(this, mUsernameEditText.getText().toString());
        StorageHandler.insertPassword(this, mPasswordEditText.getText().toString());
        StorageHandler.setChecked(this, mRememberCheckBox.isChecked());


        startActivity(new Intent(this, HomeActivity.class));
        finish();


    }
}
