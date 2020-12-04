package br.unigran.prova2sub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class cadastroAluno  extends AppCompatActivity{
    private TextView nome;
    private EditText idade;
    private TextView Turma;
    private EditText dataNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_aluno);

        nome = findViewById(R.id.nome);
        idade = findViewById(R.id.idade);
        Turma = findViewById(R.id.turma);
        dataNasc = findViewById(R.id.data_nasc);
    }

}