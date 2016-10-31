package dado.meusapps.tiboy.dado;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JogoActivity extends AppCompatActivity {
    private ImageView mimagem;
    private ImageView mvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        mimagem = (ImageView) findViewById(R.id.imageView_jogo_imagem);
        mvoltar = (ImageView) findViewById(R.id.imageView_jogo_voltar);

        Bundle extras = getIntent().getExtras();

        if (extras!=null){
            String opcaoEscolhida = extras.getString("opcoes");
            if (opcaoEscolhida.equals("face1")){
                mimagem.setImageDrawable(ContextCompat.getDrawable(JogoActivity.this,R.drawable.face1));
            }
            if (opcaoEscolhida.equals("face2")){
                mimagem.setImageDrawable(ContextCompat.getDrawable(JogoActivity.this,R.drawable.face2));
            }
            if (opcaoEscolhida.equals("face3")){
                mimagem.setImageDrawable(ContextCompat.getDrawable(JogoActivity.this,R.drawable.face3));
            }

            if (opcaoEscolhida.equals("face4")){
                mimagem.setImageDrawable(ContextCompat.getDrawable(JogoActivity.this,R.drawable.face4));
            }

            if (opcaoEscolhida.equals("face5")){
                mimagem.setImageDrawable(ContextCompat.getDrawable(JogoActivity.this,R.drawable.face5));
            }

            if (opcaoEscolhida.equals("face6")){
                mimagem.setImageDrawable(ContextCompat.getDrawable(JogoActivity.this,R.drawable.face6));
            }

            else{
             //operação invalida
            }

        }
        mvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
