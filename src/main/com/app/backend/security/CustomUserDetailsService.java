package com.app.backend.security;

import com.app.backend.model.User;
import com.app.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.userDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Collection;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws
    User user = userRepository.findByUsername(username);
        .orElseThrow(() -> new UsernameNotFoundException("Usuario no en contrado"+  username));

        return new org.springframework.security.core.userdetails.User(
            user.getUsername(),
            user.getPassword(),
            user.getActive(),
            accountNonExpired: true, credentialsNonExpired: true,
            acc... true, getAuthorities(user));
}
    private Collection<? extends GrantedAuthority> getAuthorities
    (User user){
        return Collection.singletonList(new SimpleGrantedAuthority
        ("ROLE_ "+ user.getRole().name()));
    }
}