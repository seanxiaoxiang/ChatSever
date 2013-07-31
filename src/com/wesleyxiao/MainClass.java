package com.wesleyxiao;

import java.io.IOException;

import com.wesleyxiao.server.UDPServer;

/**
 * UDP 服务器
 * @author Wesleyxiao
 * @date  2013-7-31 下午9:31:09
 */
public class MainClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		UDPServer server=new UDPServer();
		try
		{
			server.start();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error"+e);
		}
	}

}
