package com.management.system.controllers.rest.get;

import com.management.system.beans.responseBase.Response;
import com.management.system.beans.tableBeans.User;
import com.management.system.language.Language;
import com.management.system.language.LanguageManager;
import com.management.system.service.interfaces.UserService;
import com.management.system.utils.BaseController;
import com.management.system.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetUsers extends BaseController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = Constants.USER_PATH + "getAll", method = RequestMethod.GET, produces = Constants.APPLICATION_JSON)
    public String getAll(@RequestHeader("authorization") String authorization,
                           @RequestHeader("language") String lang) {

        Response<List<User>> response = new Response<>();
        Language language = LanguageManager.getLanguageInstance(lang);

        User user = userService.getUserByAuthorization(authorization);

        if(user!=null){
            List<User> users = userService.getAll(user.getPosition());

            for (int i = 0; i < users.size(); i++) {
                users.get(i).setAuthorization(null);
                users.get(i).setPassword(null);
            }

            response.setData(users);
        }else {
            response.setError(language.getSessionExpired(), LanguageManager.getMessageKey().getSessionExpired());
        }

        return super.createGson(response);
    }

}
