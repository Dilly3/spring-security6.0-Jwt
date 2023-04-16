package com.Dilly3.Security60.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Getter
@Setter
@Table(name="roles")
public class Roles implements GrantedAuthority {
    private Integer roleId;
    @Enumerated(EnumType.STRING)
    private Role role ;

    public Roles(Integer roleId, Role role){
        this.role = role;
        this.roleId = roleId;
    }
    @Override
    public String getAuthority() {
        return role.getName();
    }


}
