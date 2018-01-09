package miracleit.com.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Анкета user

    private Button btnClick;
    private TextView txtHello;
    private EditText txtOwn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btn_click);
        txtHello = findViewById(R.id.txt_hello);
        txtOwn = findViewById(R.id.txt_some_text);
    }

    public void hello(View view) {
        txtHello.setText(txtOwn.getText());
    }
}
