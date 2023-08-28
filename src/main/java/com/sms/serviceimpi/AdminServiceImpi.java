package com.sms.serviceimpi;

import org.springframework.stereotype.Service;

import com.sms.entity.Admin;
import com.sms.service.AdminService;

@Service //denotes what role this class will play
public class AdminServiceImpi implements AdminService{

	@Override
	public String createAdmin(Admin admin) {
		
		return null;
	}

	@Override
	public Admin saveAdmin(Admin admin) {
		
		return null;
	}
}