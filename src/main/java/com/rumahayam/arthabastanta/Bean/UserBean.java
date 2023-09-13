package com.rumahayam.arthabastanta.Bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserBean
{
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}