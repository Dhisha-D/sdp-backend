
package com.rechargezone.rechargezone.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {
    private String token;
    private String role;
    private long id;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String serviceProvider;
    private String city;

    
}
