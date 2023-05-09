package com.testeldap.ldap.data.service;

import com.testeldap.ldap.data.repository.User;
import com.testeldap.ldap.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> search(final String username) {
        List<User> userList = userRepository.findByUsernameLikeIgnoreCase(username);
        if (userList == null) {
            return Collections.emptyList();
        }

//        return userList.stream()
//                .map(User::getUsername)
//                .collect(Collectors.toList());
        return userList;
    }

}
