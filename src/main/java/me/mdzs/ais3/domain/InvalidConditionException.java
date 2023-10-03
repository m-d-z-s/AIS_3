package me.mdzs.ais3.domain;

public class InvalidConditionException extends Throwable {

    private static final String STANDARD_ERROR_MESSAGE = "Invalid conditions set";

    public InvalidConditionException() {
        super(STANDARD_ERROR_MESSAGE);
    }
}
