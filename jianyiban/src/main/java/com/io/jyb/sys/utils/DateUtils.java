package com.io.jyb.sys.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /***
     * 将时间戳转成日期格式
     * @param seconds
     * @param format
     * @return
     */
    public String timeStamp2Date(String seconds,String format){
        if (seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        if (format == null || format.isEmpty()){
            format ="yyyy/MM/dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds+"000")));

    }

}
