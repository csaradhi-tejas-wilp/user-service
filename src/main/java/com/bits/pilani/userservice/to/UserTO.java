package com.bits.pilani.userservice.to;

import com.bits.pilani.userservice.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class UserTO extends UserEntity {

}
