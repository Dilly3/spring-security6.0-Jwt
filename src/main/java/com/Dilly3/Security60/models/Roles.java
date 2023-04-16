package com.Dilly3.Security60.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="roles")
public class Roles implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "role_seq")
    @SequenceGenerator(name = "role_seq", sequenceName = "role_seq",allocationSize = 1,initialValue = 1)
    @Column(name = "role_id")
    private Integer roleId;
    @Enumerated(EnumType.STRING)
    @Column(name = "role_name")
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
