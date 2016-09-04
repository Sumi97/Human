package com.example.sumi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;            //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("田中", 20, "あなた");

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "私の歳は" + human.age + "歳です。");
        Log.d("javatest", "「私は" + human.hobby + "について考える」");


    }
}
