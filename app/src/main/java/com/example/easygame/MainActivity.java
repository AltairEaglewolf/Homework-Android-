package com.example.easygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static Character victim;
    public static Story story;

    TextView text;
    Button but,but2,but3,but4,but5;
    EditText etext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.txt);
        but = (Button) findViewById(R.id.btn);
        but2 = (Button) findViewById(R.id.btn2);
        but3 = (Button) findViewById(R.id.btn3);
        but4 = (Button) findViewById(R.id.btn4);
        but5 = (Button) findViewById(R.id.btn5);
        etext = (EditText) findViewById(R.id.etxt1);

        text.setText("Введите своё имя и нажмите Enter");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn4:
                        victim = new Character(etext.getText().toString());
                        text.setText("Спасибо, " + victim.name +
                                ". Нажмите на continue ещё раз, чтоб продолжить игру.");
                }
            }
        };
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn5:
                        text.setText("Ваш день ничем не отличался от обычного. Разве что тем что с момента выхода из дома вас " +
                                "преследовало ощущение, что кто-то наблюдает за вами.\n" + "Однако вы старались не обращать вминания, наслаждаясь" +
                                " привычным ходом жизни,который вдруг резко оборвался в тот момент, когда прямо на удице вас усыпили.\n "
                                + "Вы очнулись в пустой комнате, в которой единственной примечательной вещью оказался ноутбук с включенным экраном.");
                }
            }
        };
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn5:
                        victim.Health += story.current_situation.dHealth;
                        victim.Fatigue += story.current_situation.dFatigue;
                        victim.Panic += story.current_situation.dPanic;
                        System.out.println("=====\nЗдоровье:" + victim.Health + "\tУсталость"
                                + victim.Fatigue + "\tПаника:" + victim.Panic + "\n=====");
                        System.out.println("============="
                                + story.current_situation.subject + "==============");
                        System.out.println(story.current_situation.text);
                        if (story.isEnd()) {
                            System.out.println("====================the end!===================");
                            return;
                        }

                        View.OnClickListener listener3 = new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                switch (v.getId()) {
                                    case R.id.btn:
                                        story.go(1);
                                    case R.id.btn2:
                                        story.go(2);
                                    case R.id.btn3:
                                        story.go(3);
                                }


                            }
                        };
                }
            }
        };
    }
}