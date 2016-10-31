package dado.meusapps.tiboy.dado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mjogar;
    private String[] opcoes ={"face1","face2","face3","face4","face5","face6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mjogar = (ImageView) findViewById(R.id.imageView_main_jogar);
        mjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int valorAleatorio = random.nextInt(6);
                Intent intent = new Intent(getApplicationContext(),JogoActivity.class);
                intent.putExtra("opcoes",opcoes[valorAleatorio]);
                startActivity(intent);

            }
        });
    }
}
