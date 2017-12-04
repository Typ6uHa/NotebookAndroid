package com.example.aizat.rxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workWithRx();
    }

    private void workWithRx(){
        Observable
//                .from(helloWorlds)
//                .flatMap(new Func1<List<String>, Observable<String>>() {
//                    @Override
//                    public Observable<String> call(List<String> strings) {
//                        return Observable.from(strings);
//                    }
//                })
//                .map(new Func1<String, String>() {
//                    @Override
//                    public String call(String s) {
//                        return s.toUpperCase();
//                    }
//                }).subscribeOn(Schedulers.io())
//                  .observeOn(AndroidSchedulers.mainThread())
//                  .subscribe(new Action1<String>() {
//                   @Override
//                    public void call(String s) {
//                        Log.d("Main", s);
//                    }
//        });
                 .range(0,5000)
                 .map(new Func1<Integer, Integer>() {
                     @Override
                     public Integer call(Integer integer) {
                         return integer*(int)(Math.random()*5);
                     }
                 })
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return (integer % 2) != 0 || (integer % 3) != 0 || (integer % 5) != 0;
                    }
                }).map(new Func1<Integer, String>() {
                     @Override
                     public String call(Integer integer) {
                         return ""+integer;
                     }
        }).toList().toString().subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                
            }
        }) {
            @Override
            public void call(String s) {
                Log.d("",s);
                }
        }
    }
}
