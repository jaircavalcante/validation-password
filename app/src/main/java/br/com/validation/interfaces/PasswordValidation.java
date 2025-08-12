package br.com.validation.interfaces;

import br.com.validation.exception.BusinessException;

public interface PasswordValidation {

    void validate(String password) throws BusinessException;

}
