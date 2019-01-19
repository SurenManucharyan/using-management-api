package com.management.system.controllers.rest.put;

import com.management.system.beans.request.AddUserRequest;
import com.management.system.beans.responseBase.Response;
import com.management.system.beans.tableBeans.User;
import com.management.system.language.Language;
import com.management.system.language.LanguageManager;
import com.management.system.service.interfaces.UserService;
import com.management.system.utils.BaseController;
import com.management.system.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class AddUser extends BaseController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = Constants.USER_PATH + "add", method = RequestMethod.PUT, produces = Constants.APPLICATION_JSON)
    public String addUser(@Valid @RequestBody AddUserRequest request,
                          @RequestHeader("authorization") String authorization,
                          @RequestHeader("language") String lang) {

        Response<Object> response = new Response<>();
        Language language = LanguageManager.getLanguageInstance(lang);

        User user = userService.getUserByAuthorization(authorization);

        if(user!=null){
            if(user.getPosition()<=request.getPosition()) {
                userService.saveUser(request.getUser());
                response.setMessage(language.getSuccessfullyAdded(), LanguageManager.getMessageKey().getSuccess());
            }else {
                response.setError(language.getPermissionDenied(),LanguageManager.getMessageKey().getPermissionDenied());
            }
        }else {
            response.setError(language.getSessionExpired(), LanguageManager.getMessageKey().getSessionExpired());
        }

        return super.createGson(response);
    }

}
