package com.schoology.app;

import com.schoology.app.exceptions.ExecutorException;
import com.schoology.app.implementations.ExecutorImplementation;
import com.schoology.app.implementations.LongTask;
import com.schoology.app.implementations.NumberValidator;

import java.util.List;

/**
 * Created by User on 31.07.2016.
 */
public class Runner {
    public static void main(String[] args) throws ExecutorException {

        ExecutorImplementation executorImplementation = new ExecutorImplementation();
        NumberValidator validator = new NumberValidator();

        LongTask longTask1 = new LongTask(5L);
        LongTask longTask2 = new LongTask(10L);
        LongTask longTask3 = new LongTask(-10L);
        LongTask longTask4 = new LongTask(-40L);

        longTask1.execute();
        longTask2.execute();
        longTask3.execute();
        longTask4.execute();

        executorImplementation.addTask(longTask1);
        executorImplementation.addTask(longTask2, validator);
        executorImplementation.addTask(longTask3);
        executorImplementation.addTask(longTask4, validator);

        executorImplementation.execute();

        List<Long> actualValidList = executorImplementation.getValidResults();
        List<Long> actualInvalidList = executorImplementation.getInvalidResults();

        System.out.println("Valid values are:");
        actualValidList.forEach(System.out::println);

        System.out.println("Invalid values are:");
        actualInvalidList.forEach(System.out::println);
    }
}
