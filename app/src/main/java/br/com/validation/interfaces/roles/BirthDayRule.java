package br.com.validation.interfaces.roles;

import br.com.validation.exception.BusinessException;
import br.com.validation.interfaces.PasswordValidation;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class BirthDayRule implements PasswordValidation {
    @Override
    public void validate(String password) throws BusinessException {
        System.out.println("[INFO] Execute BirthDayRule");
        if(password.isEmpty()){
            throw new BusinessException("Password is invalid because it contains a birthday.");
        }
    }
}