package com.cursor.mainproject.service.impl;

import com.cursor.mainproject.domain.Role;
import com.cursor.mainproject.domain.model.User;
import com.cursor.mainproject.domain.model.dto.UserDTO;
import com.cursor.mainproject.domain.repository.UserRepository;
import com.cursor.mainproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void saveNewUser(UserDTO userDTO) {
        userRepository.save(User
                .builder()
                .firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .email(userDTO.getEmail())
                .password(bCryptPasswordEncoder.encode(userDTO.getPassword()))
                .mobileNumber(userDTO.getMobileNumber())
                .dateOfRegistration(userDTO.getDateOfRegistration())
                .roles(String.valueOf(Role.USER))
                .active(true)
                .build());
    }

    @Temporal(TemporalType.TIMESTAMP)
    private Date getCurrentDate() {
        return new Date();
    }

}
