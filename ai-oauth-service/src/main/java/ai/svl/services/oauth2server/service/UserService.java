package ai.svl.services.oauth2server.service;

import ai.svl.services.oauth2server.repositories.OrgRepository;
import ai.svl.services.oauth2server.repositories.RoleRepository;
import ai.svl.services.oauth2server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ai.svl.services.oauth2server.models.TcOrg;
import ai.svl.services.oauth2server.models.TcRole;
import ai.svl.services.oauth2server.models.TcUser;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrgRepository orgRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public void save(TcUser user){
        user.setUserPw(passwordEncoder().encode(user.getUserPw()));
        userRepository.save(user);
    }

    public void saveOrg(TcOrg org){
        orgRepository.save(org);
    }
    public void saveRole(TcRole role){
        roleRepository.save(role);
    }

   /* public List<TcUser> getAllRoles() {
        return userRepository.findAll();
    }*/

    public TcUser getUser(String username){
        return userRepository.findByUsername(username);
    }

    /*public List<TcUser> getAllUsers() {
        return userRepository.findAll();
    }*/

}
