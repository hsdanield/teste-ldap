package com.testeldap.ldap.data.repository;

import javax.naming.Name;

import lombok.*;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import java.util.Optional;

@Entry(base = "ou=users,ou=system", objectClasses = { "inetOrgPerson" })
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    private Name id;

    private @Attribute(name = "cn") String username;
    private @Attribute(name = "sn") String surname;

    private @Attribute(name = "userPassword") String password;

}