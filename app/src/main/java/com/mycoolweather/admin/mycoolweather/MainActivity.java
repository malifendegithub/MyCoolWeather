package com.mycoolweather.admin.mycoolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**先从SharedPreferences文件中读取缓存数据*/
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        /***
         * 如果不是null，就说明已经请求过天气数据了，
         * 就没必要再次让用户选择城市直接跳转到WeatherAcivity中查看即可***/
        if(prefs.getString("weather",null) != null){
            Intent intent = new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }


}
