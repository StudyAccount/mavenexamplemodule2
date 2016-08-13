package com.schoology.app.implementations;

import com.schoology.app.interfaces.Task;

/**
 * Created by User on 18.06.2016.
 */
public class LongTask implements Task<Long> {

    private Long input;
    private Long output;
    private final static Long SOME_EXTRA_LONG_NUMBER = 10L;

    public LongTask(Long input) {
        this.input = input;
    }


    @Override
    public void execute() {

        output = input + SOME_EXTRA_LONG_NUMBER;
    }

    @Override
    public Long getResult() {

        return output;
    }
}
