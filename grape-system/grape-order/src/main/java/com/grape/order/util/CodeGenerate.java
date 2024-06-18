package com.grape.order.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 编号生成器
 *
 * @author : luoyiwei
 * @date : 2024-06-18 11:31
 */
public class CodeGenerate {

    public static String generateOrderNumber(String customerId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = sdf.format(new Date());
        Random random = new Random();
        // 生成 1000 到 9999 的随机数
        int serialNumber = random.nextInt(9000) + 1000;
        return date + "-" + serialNumber + "-" + customerId;
    }


}
