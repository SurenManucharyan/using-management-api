package com.management.system.controllers.rest.post;

import com.management.system.beans.request.EditUserRequest;
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
public class EditUser extends BaseController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = Constants.USER_PATH + "edit", method = RequestMethod.POST, produces = Constants.APPLICATION_JSON)
    public String editUser(@Valid @RequestBody EditUserRequest request,
                           @RequestHeader("authorization") String authorization,
                           @RequestHeader("language") String lang) {

        Response<Object> response = new Response<>();
        Language language = LanguageManager.getLanguageInstance(lang);

        User user = userService.getUserByAuthorization(authorization);

        if(user!=null){
            userService.saveUser(request.updateUser(user));
            response.setMessage(language.getSuccessfullyEdited(), LanguageManager.getMessageKey().getSuccess());
        }else {
            response.setError(language.getSessionExpired(), LanguageManager.getMessageKey().getSessionExpired());
        }

        return super.createGson(response);
    }

}
