package p17.android.androidisen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_login, et_password;
    Button btn_cnx;
    TextView tv_ins;
    String correct_username = "admin";
    String correct_password = "pass123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cnx = (Button) findViewById(R.id.btn_cnx);
        tv_ins = (TextView) findViewById(R.id.tv_ins);
        btn_cnx.setOnClickListener(this);
        tv_ins.setOnClickListener(this);
    }

    ButtonLogin = (Button)findViewById(R.id.buttonLogin);
    ButtonLogin.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View v){
        switch (v.getId()) {
            case R.id.btn_cnx:
                Toast.makeText(getApplicationContext(), "Vous avez cliquer sur le bouton connexion", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_ins:
                Intent i = new Intent(this, menuinscription.class);
                startActivity(i);
            }
        }
    }
}