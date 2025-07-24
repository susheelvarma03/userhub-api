package com.example.userapp.service;

import com.example.userapp.dto.UserDTO;
import com.example.userapp.entity.UserEntity;
import com.example.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(UserDTO dto){
        if(userRepository.existsByEmail(dto.getEmail())){
            return "Email already registered!";
        }
        UserEntity user =new UserEntity();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        userRepository.save(user);
        return "User registered successfully!!";
    }

    public UserDTO  getUserById(Long id){
        UserEntity user= userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found"));

        UserDTO dto=new UserDTO();
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());

        return dto;
    }

    public List<UserDTO> getAllUsers(){

        List<UserEntity> users= userRepository.findAll();

        List<UserDTO> userDTOS = new ArrayList<>();
        for(UserEntity user: users){
            UserDTO dto= new UserDTO();
            dto.setName(user.getName());
            dto.setEmail(user.getEmail());
            userDTOS.add(dto);
        }

        return userDTOS;
    }
    public String deleteUser(Long id) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        userRepository.delete(user);
        return "User deleted successfully!";
    }

}
