package com.zzw.example.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	
	@RequestMapping(value = "/emmm", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		String hostAddress = null;
		InetAddress address = null;
		try {
			address = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return new ResponseEntity<String>("获取服务器ip失败", HttpStatus.valueOf(200));
		}
		hostAddress = address.getHostAddress();
		return new ResponseEntity<String>("你的没过!\r\n准备二辩\r\n本服务器ip:" + hostAddress, HttpStatus.valueOf(200));
	}
}
