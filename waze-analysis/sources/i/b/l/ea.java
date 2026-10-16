package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ea implements com.google.v.eg {
    UNKNOWN_ERROR(0),
    WRONG_USER_PASSWORD(1),
    INTERNAL_ISSUES(2),
    NOT_AUTHORIZED(3),
    REFRESH_TOKEN(4),
    ANOTHER_DEVICE_LOGGED_IN(5),
    INVALID_TOKEN(6),
    UNAUTHENTICATED_TOKEN(7),
    TOKEN_QUOTA_EXCEEDED(8),
    APP_VERSION_NOT_SUPPORTED(9);


    /* renamed from: l, reason: collision with root package name */
    private final int f48677l;

    ea(int i2) {
        this.f48677l = i2;
    }

    public static ea a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_ERROR;
            case 1:
                return WRONG_USER_PASSWORD;
            case 2:
                return INTERNAL_ISSUES;
            case 3:
                return NOT_AUTHORIZED;
            case 4:
                return REFRESH_TOKEN;
            case 5:
                return ANOTHER_DEVICE_LOGGED_IN;
            case 6:
                return INVALID_TOKEN;
            case 7:
                return UNAUTHENTICATED_TOKEN;
            case 8:
                return TOKEN_QUOTA_EXCEEDED;
            case 9:
                return APP_VERSION_NOT_SUPPORTED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48677l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48677l);
    }
}
