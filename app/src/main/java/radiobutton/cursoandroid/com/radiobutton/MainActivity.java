package radiobutton.cursoandroid.com.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton1 = findViewById(R.id.radio1);
        radioButton2 = findViewById(R.id.radio2);
        radioButton3 = findViewById(R.id.radio3);

        button = findViewById(R.id.button_id);
        textView = findViewById(R.id.resutadoId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButton1.isChecked()){
                    textView.setText("Você torce para o "+radioButton1.getText()+"!");

                } else if(radioButton2.isChecked()){
                    textView.setText("Você torce para o "+radioButton2.getText()+"!");

                } else if(radioButton3.isChecked()){
                    textView.setText("Você torce para o "+radioButton3.getText()+"!");
                }
            }
        });
    }
}
