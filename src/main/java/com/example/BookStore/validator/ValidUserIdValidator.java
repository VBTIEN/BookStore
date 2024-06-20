package com.example.BookStore.validator;

import com.example.BookStore.entity.User;
import com.example.BookStore.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
  @Override
  public boolean isValid(User user, ConstraintValidatorContext context) {
    if (user == null) {
      return true;
    }
    return user.getId() != null;
  }
}
