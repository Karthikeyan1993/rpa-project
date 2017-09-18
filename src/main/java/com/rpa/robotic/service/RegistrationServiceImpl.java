package com.rpa.robotic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rpa.robotic.entity.Registration;
import com.rpa.robotic.repository.RegistrationRepository;

@Service("rs")
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository rr;

	@Override
	public Registration SaveRegi(Registration r) {
		// TODO Auto-generated method stub
		return rr.save(r);
	}

}
