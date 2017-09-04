package dogsage.com.cursoandroid.mrissi.dogsage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAge;
    private EditText editTxtAge;
    private TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtAge = (EditText) findViewById(R.id.editTxt_age_id);
        btnAge = (Button) findViewById(R.id.button_find_out_id);
        resultTxt = (TextView) findViewById(R.id.txt_age_result_id);

        btnAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textAge = editTxtAge.getText().toString();

                if (!textAge.isEmpty()){
                    int age = Integer.parseInt(textAge);
                    resultTxt.setText(age*7 + " anos");
                }
                else resultTxt.setText("No number entered.");
            }
        });
    }
}
