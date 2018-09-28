package com.mycoolweather.admin.mycoolweather.util;

import android.text.TextUtils;

import com.mycoolweather.admin.mycoolweather.db.City;
import com.mycoolweather.admin.mycoolweather.db.County;
import com.mycoolweather.admin.mycoolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Response;

/**
 * Created by admin on 2018/9/25.
 * 解析和处理服务器返回的JSON数据
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     * */
       public static boolean handleProvinceResponse(String response){
            if(!TextUtils.isEmpty(response)){
                try {
                    JSONArray allprovinces = new JSONArray(response);
                    for(int i = 0; i<allprovinces.length(); i++){
                        JSONObject provinceObject = allprovinces .getJSONObject(i);

                        Province province = new Province();
                        province.setProvinceName(provinceObject.getString("name"));
                        province.setProvinceCode(provinceObject.getInt("id"));
                        province.save();
                    } //for结束
                    return true;
                     } catch (JSONException e) { e.printStackTrace();}

     }
     return false;
     } //handleProvinceResponse方法结束

     /**
     * 解析和处理服务器返回的市级数据
     * */
     public static boolean handleCityResponse(String response,int provinceId){
         if(!TextUtils.isEmpty(response)){
             try {
                 JSONArray allCities = new JSONArray(response);
                 for(int i = 0; i<allCities.length(); i++){
                     JSONObject cityObject = allCities .getJSONObject(i);

                     City city = new City();
                     city.setCityName(cityObject.getString("name"));
                     city.setCityCode(cityObject.getInt("id"));
                     city.setProvinceId(provinceId);
                     city.save();
                 }//for结束
                return true;
             } catch (JSONException e) { e.printStackTrace();}

         }
         return false;
     } //handleCityResponse方法结束


/**
 * 解析和处理服务器返回的县级数据
 * */
public static boolean handleCountyResponse(String response,int cityId){
    if(!TextUtils.isEmpty(response)){
        try {
            JSONArray allcounties = new JSONArray(response);
            for(int i = 0; i<allcounties.length(); i++){
                JSONObject countyObject = allcounties .getJSONObject(i);

                County county = new  County();
                county.setCountyName(countyObject.getString("name"));
                county.setWeatherId(countyObject.getString("weather_id"));
                county.setCityId(cityId);
                county.save();
            }//for结束
            return true;
        } catch (JSONException e) { e.printStackTrace();}

    }
    return false;
} //handleCountyResponse方法结束

}
