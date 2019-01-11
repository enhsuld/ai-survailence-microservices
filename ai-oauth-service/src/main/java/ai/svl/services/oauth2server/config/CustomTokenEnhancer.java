package ai.svl.services.oauth2server.config;

import java.util.HashMap;
import java.util.Map;

import ai.svl.services.oauth2server.models.TcUser;
import ai.svl.services.oauth2server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

public class CustomTokenEnhancer implements TokenEnhancer {

    @Autowired
    private UserService userService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        final Map<String, Object> additionalInfo = new HashMap<>();
        TcUser usr=userService.getUser(authentication.getName());
        additionalInfo.put("username", authentication.getName());
        if(usr!=null){
            additionalInfo.put("organization", usr.getTcOrg().getOrgNm());
        }

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
        return accessToken;
    }

}