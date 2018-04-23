package com.demo.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisJava {
   /* public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        
        
        
        JedisPoolConfig config = new JedisPoolConfig(); 
        
        String host="localhost";
        
        int port=6379;
        
        JedisPool pool = new JedisPool( host, port); 
        int i=0;
        while(true){
        Jedis jedis=pool.getResource();
        System.out.println(i++);
        }
        
        jedis.set("ss", "abc");
        
        String s=jedis.get("ss");
        
        System.out.println(s);
        
        
        
        
    }*/
    
    
    
    @Test
    public void r(){
    	
    	
    	JedisPoolConfig config = new JedisPoolConfig();
        //配置最大jedis实例数
        config.setMaxTotal(1);
        //配置资源池最大闲置数
        config.setMaxIdle(200);
        //等待可用连接的最大时间
        config.setMaxWaitMillis(1000);
        //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的
        config.setTestOnBorrow(true);
    	
    	
         
         String host="localhost";
         
         int port=6379;
         
         JedisPool pool = new JedisPool( config,host, port); 

         
         
         try{
         int i=0;
         while(true){
         Jedis jedis=pool.getResource();
         System.out.println(i++);
         }
         
         }catch(Exception e){
        	 e.printStackTrace();
         }
    	
    }
    
    
}










