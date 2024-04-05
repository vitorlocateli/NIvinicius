package com.gustavo.ni_vinicus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonPepperoni, buttonMargherita, buttonFrangoCatupiry;
    private EditText editTextTamanho, editTextObservacoes;
    private RadioGroup radioGroupBorda;
    private RadioButton radioButtonNormal, radioButtonRecheada;
    private ImageView imageViewPizza;
    private Switch switchEntrega;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPepperoni = findViewById(R.id.buttonPepperoni);
        buttonMargherita = findViewById(R.id.buttonMargherita);
        buttonFrangoCatupiry = findViewById(R.id.buttonFrangoCatupiry);
        editTextTamanho = findViewById(R.id.editTextTamanho);
        editTextObservacoes = findViewById(R.id.editTextObservacoes);
        radioGroupBorda = findViewById(R.id.radioGroupBorda);
        radioButtonNormal = findViewById(R.id.radioButtonNormal);
        radioButtonRecheada = findViewById(R.id.radioButtonRecheada);
        imageViewPizza = findViewById(R.id.imageViewPizza);
        switchEntrega = findViewById(R.id.switchEntrega);

        buttonPepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewPizza.setImageResource(R.drawable.pizza_pepperoni);
            }
        });

        buttonMargherita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewPizza.setImageResource(R.drawable.pizza_margherita);
            }
        });

        buttonFrangoCatupiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewPizza.setImageResource(R.drawable.pizza_frango_catupiry);
            }
        });

        switchEntrega.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Entrega em domicílio habilitada", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Entrega em domicílio desabilitada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

