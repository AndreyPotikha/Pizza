package miracleit.com.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Андрей on 06.01.2018.
 */

public class UserActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtAge;
    private EditText txtEmail;
    private Button btnSave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);

        txtName = findViewById(R.id.txt_name);
        txtAge = findViewById(R.id.txt_age);
        txtEmail = findViewById(R.id.txt_email);
        btnSave = findViewById(R.id.btn_save);
    }

    public void start(View view) {
        System.out.println(txtName.getText());
        System.out.println(txtAge.getText());
        System.out.println(txtEmail.getText());
    }

    public void go(View view) {
        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        intent.putExtra("name", txtName.getText().toString());
        intent.putExtra("age", txtAge.getText().toString());
        intent.putExtra("email", txtEmail.getText().toString());
        startActivity(intent);
    }

}
