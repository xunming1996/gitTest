package com.it.test;

import com.it.Utils.JedisPoolsUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import redis.clients.jedis.Jedis;

import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class jedisTest  {

    @Test
    public void test(){
        Jedis jedis  = new Jedis("localhost",6379);
        jedis.set("username","zhagnsan");

        Map<String,String> mhash =  jedis.hgetAll("mhash");
        Set<String> s = mhash.keySet();
        for (String a:s){
            String value  = mhash.get(a);
            System.out.println(a+":"+value);
        }
        jedis.close();fafewafwf
    }
    @Test
    public void test2(){

      Jedis jedis  =  JedisPoolsUtils.getJedis();
      jedis.set("hello","world");
      jedis.close();
    }
}
