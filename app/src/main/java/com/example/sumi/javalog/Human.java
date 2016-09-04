package com.example.sumi.javalog;

/**
 * Created by sumi on 2016/09/04.
 */

import android.util.Log;

 class Human extends Animal implements Thinkable {

     //コンストラクタ
     public Human(String name, int age, String hobby) {
         this.name = name;
         this.age = age;
         this.hobby = hobby;
     }

     //メンバ関数
     public void say() {
     }

     @Override
     public void think(){
     }

}
