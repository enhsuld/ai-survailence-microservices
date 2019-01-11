package ai.svl.services.oauth2server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import ai.svl.services.oauth2server.config.CustomUserDetails;
import ai.svl.services.oauth2server.models.TcOrg;
import ai.svl.services.oauth2server.models.TcRole;
import ai.svl.services.oauth2server.models.TcUser;
import ai.svl.services.oauth2server.repositories.OrgRepository;
import ai.svl.services.oauth2server.repositories.UserRepository;
import ai.svl.services.oauth2server.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthorizationServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder auth, UserRepository repository, OrgRepository orep, UserService userService) throws Exception {
        if (repository.count()==0 && orep.count()==0) {

            TcOrg org = new TcOrg();
            org.setOrgNm("gcomm");
            org.setTelNo("99203116");
            userService.saveOrg(org);

            TcRole rl= new TcRole();
            rl.setRoleNmEng("ADMIN");
            userService.saveRole(rl);

            List<TcRole> roles= new ArrayList<>();
            roles.add(rl);
            userService.save(new TcUser("admin", "adminPassword", org));



        }
        auth.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
    }

    private UserDetailsService userDetailsService(final UserRepository repository) {
        return username -> new CustomUserDetails(repository.findByUsername(username));
    }
}