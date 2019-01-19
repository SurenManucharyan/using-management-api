package com.management.system.controllers.rest.post;

import com.management.system.beans.request.LoginRequest;
import com.management.system.beans.response.LoginResponse;
import com.management.system.beans.responseBase.Response;
import com.management.system.beans.tableBeans.User;
import com.management.system.language.Language;
import com.management.system.language.LanguageManager;
import com.management.system.service.interfaces.UserService;
import com.management.system.utils.BaseController;
import com.management.system.utils.Constants;
import com.management.system.utils.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class LoginUser extends BaseController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = Constants.USER_PATH + "login", method = RequestMethod.POST, produces = Constants.APPLICATION_JSON)
    public String login(@Valid @RequestBody LoginRequest request,
                           @RequestHeader("language") String lang) {

        Response<Object> response = new Response<>();
        Language language = LanguageManager.getLanguageInstance(lang);

        User user = userService.getUser(request.getUserName(), Generator.stringToSha256(request.getPassword()));

        if(user!=null){
            response.setData(new LoginResponse(user.getAuthorization()));
        }else {
            response.setError(language.getWrongLoginOrPassword(), LanguageManager.getMessageKey().getWrongLoginOrPassword());
        }

        return super.createGson(response);
    }

}
