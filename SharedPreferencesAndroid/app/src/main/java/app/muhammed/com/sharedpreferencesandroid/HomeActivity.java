package app.muhammed.com.sharedpreferencesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.muhammed.com.sharedpreferencesandroid.storage.StorageHandler;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mLogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mLogoutButton = (Button) findViewById(R.id.logoutButton);


        mLogoutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        StorageHandler.setChecked(this, false);

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
