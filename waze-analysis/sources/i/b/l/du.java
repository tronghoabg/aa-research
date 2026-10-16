package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum du implements com.google.v.eg {
    INTERNAL_ISSUE_UNSPECIFIED(0),
    MISSING_MANDATORY_PROPERTY(1),
    LOGIN_EXCEPTION(2),
    REDIRECT_TIMEOUT(3),
    REDIRECT_MAX_ATTEMPTS_FAILED(4),
    REDIRECT_ERROR(5),
    RATE_LIMIT_FAILURE(6),
    INVALID_USER_RECORD(7),
    USER_RECORD_EXCEPTION(8),
    TOKEN_AUTHENTICATION_NULL_RESPONSE(9),
    TOKEN_AUTHENTICATION_USERS_SERVER_ERROR(10),
    TOKEN_AUTHENTICATION_UNKNOWN_FAILURE(11);

    private final int n;

    du(int i2) {
        this.n = i2;
    }

    public static du a(int i2) {
        switch (i2) {
            case 0:
                return INTERNAL_ISSUE_UNSPECIFIED;
            case 1:
                return MISSING_MANDATORY_PROPERTY;
            case 2:
                return LOGIN_EXCEPTION;
            case 3:
                return REDIRECT_TIMEOUT;
            case 4:
                return REDIRECT_MAX_ATTEMPTS_FAILED;
            case 5:
                return REDIRECT_ERROR;
            case 6:
                return RATE_LIMIT_FAILURE;
            case 7:
                return INVALID_USER_RECORD;
            case 8:
                return USER_RECORD_EXCEPTION;
            case 9:
                return TOKEN_AUTHENTICATION_NULL_RESPONSE;
            case 10:
                return TOKEN_AUTHENTICATION_USERS_SERVER_ERROR;
            case 11:
                return TOKEN_AUTHENTICATION_UNKNOWN_FAILURE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
