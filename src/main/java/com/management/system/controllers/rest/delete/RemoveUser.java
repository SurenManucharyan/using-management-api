package com.management.system.controllers.rest.delete;

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

@RestController
public class RemoveUser extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = Constants.USER_PATH + "remove", method = RequestMethod.DELETE, produces = Constants.APPLICATION_JSON)
    public String removeUser(@RequestHeader("authorization") String authorization,
                           @RequestHeader("language") String lang) {

        Response<Object> response = new Response<>();
        Language language = LanguageManager.getLanguageInstance(lang);

        User user = userService.getUserByAuthorization(authorization);

        if(user!=null){
            userService.delete(user);
            response.setMessage(language.getSuccessfullyDeleted(), LanguageManager.getMessageKey().getSuccess());
        }else {
            response.setError(language.getSessionExpired(), LanguageManager.getMessageKey().getSessionExpired());
        }

        return super.createGson(response);
    }
}
