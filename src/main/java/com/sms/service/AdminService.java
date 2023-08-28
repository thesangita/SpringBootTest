package com.sms.service;

import com.sms.entity.Admin;

public interface AdminService {

	String createAdmin(Admin admin);
	
	Admin saveAdmin(Admin admin);
}