package com.schoology.app.interfaces;

/**
 * Created by User on 10.06.2016.
 */
public interface Validator<T> {

    // Валидирует переданое значение
    boolean isValid(T result);

}
