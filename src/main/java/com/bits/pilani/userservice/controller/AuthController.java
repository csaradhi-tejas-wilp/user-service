package com.bits.pilani.userservice.controller;

import static com.bits.pilani.userservice.exception.CustomException.handleException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.pilani.userservice.exception.CustomException;
import com.bits.pilani.userservice.to.ResponseTO;
import com.bits.pilani.userservice.to.SuccessResponseTO;
import com.bits.pilani.userservice.service.AuthService;
import com.bits.pilani.userservice.to.UsernamePasswordTO;

@RequestMapping("/user/auth")
@RestController
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@PostMapping
	public ResponseEntity<ResponseTO> authenticateUser(@RequestBody UsernamePasswordTO usernamePasswordTO) {
		try  {
			authService.validateUsernamePasswordTO(usernamePasswordTO);
			String token = authService.authenticateAndGetToken(usernamePasswordTO);
			return SuccessResponseTO.create("Bearer " + token);
		} catch(CustomException e) {
			return handleException(e);
		}
	}
}
