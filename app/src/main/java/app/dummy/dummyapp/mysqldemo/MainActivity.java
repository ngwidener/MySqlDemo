package app.dummy.dummyapp.mysqldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, PasswordEt, EmailEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameEt = (EditText) this.findViewById(R.id.etUserName);
        PasswordEt = (EditText) this.findViewById(R.id.etPassword);
        EmailEt = (EditText) this.findViewById(R.id.email);

    }

    public void OnLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String email = EmailEt.getText().toString();
        String type = "Login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password, email);
    }
}
