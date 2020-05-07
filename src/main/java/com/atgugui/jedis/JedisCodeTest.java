package com.atgugui.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Protocol;

import java.util.List;

public class JedisCodeTest {
    public static void main(String[] args) {
        //1.准备连接信息
        String ipAdress = "192.168.1.105";
        int port=Protocol.DEFAULT_PORT;
        //2.创建连接对象
        Jedis jedis = new Jedis(ipAdress, port);
        //3.调用jedis对象的方法操作redis服务器
        String ping = jedis.ping();
        System.out.println(ping);
        Long lpush = jedis.lpush("anmials", "pig", "cat");
        List<String> anmials = jedis.lrange("anmials", 0, -1);
        for (String anmial : anmials) {
            System.out.println(anmial);
        }


        jedis.close();
    }
}
