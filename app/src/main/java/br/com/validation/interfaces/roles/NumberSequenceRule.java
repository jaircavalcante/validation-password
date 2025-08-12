package br.com.validation.interfaces.roles;

import br.com.validation.exception.BusinessException;
import br.com.validation.interfaces.PasswordValidation;
import org.springframework.stereotype.Component;

@Component
public class NumberSequenceRule implements PasswordValidation {

    @Override
    public void validate(String password) throws BusinessException {
        System.out.println("[INFO] Execute NumberSequenceRule");
        if(password.isEmpty()){
            throw new BusinessException("Password is invalid because it contains a number sequence.");
        }
    }
}