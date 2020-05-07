package com.atgugui.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Protocol;

public class JedisPoolCodeTest {
    public static void main(String[] args) {
        //1.准备连接信息
        String ipAdress = "192.168.1.105";
        int port= Protocol.DEFAULT_PORT;
        JedisPool jedisPool = new JedisPool(ipAdress, port);
        Jedis resource = jedisPool.getResource();
        String ping = resource.ping();
        System.out.println(ping);
        resource.close();
        //整个项目停了再关闭
        jedisPool.close();

    }
}
