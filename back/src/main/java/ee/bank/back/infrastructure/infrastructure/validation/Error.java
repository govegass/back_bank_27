package ee.bank.back.infrastructure.infrastructure.validation;

import lombok.Getter;

@Getter
public enum Error {
    INCORRECT_CREDENTIALS ( "Vale kasutajanimi või parool", 111);

    private final String message;
    private final int errorCode;

    Error(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
