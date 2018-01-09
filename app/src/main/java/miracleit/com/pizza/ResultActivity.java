package miracleit.com.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    private TextView txtResultName;
    private TextView txtResultAge;
    private TextView txtResultEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtResultName = findViewById(R.id.txt_result_name);
        txtResultAge = findViewById(R.id.txt_result_age);
        txtResultEmail = findViewById(R.id.txt_result_email);

        txtResultName.setText(getIntent().getStringExtra("name"));
        txtResultAge.setText(getIntent().getStringExtra("age"));
        txtResultEmail.setText(getIntent().getStringExtra("email"));
    }


}
