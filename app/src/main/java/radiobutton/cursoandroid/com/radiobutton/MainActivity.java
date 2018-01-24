package radiobutton.cursoandroid.com.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolher;
    private TextView resultadoApresentado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        botaoEscolher = findViewById(R.id.button_id);
        resultadoApresentado = findViewById(R.id.resutadoId);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();

                if (idRadioButtonEscolhido > 0) {
                    radioButtonEscolhido = (RadioButton) findViewById(idRadioButtonEscolhido);
                    resultadoApresentado.setText("Você torce para o "+radioButtonEscolhido.getText()+"!");
                }
            }
        });
    }
}
