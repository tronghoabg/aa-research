package i.b.u;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum t implements eg {
    INVALID_USER_NAME(0),
    FORBIDDEN_USER_NAME(1),
    USER_NAME_ALREADY_EXISTS(2),
    INVALID_PASSWORD(3),
    INVALID_EMAIL(4),
    EMAIL_ALREADY_EXISTS(5),
    EXCEEDED_RENAME_LIMIT(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f49328i;

    t(int i2) {
        this.f49328i = i2;
    }

    public static t a(int i2) {
        switch (i2) {
            case 0:
                return INVALID_USER_NAME;
            case 1:
                return FORBIDDEN_USER_NAME;
            case 2:
                return USER_NAME_ALREADY_EXISTS;
            case 3:
                return INVALID_PASSWORD;
            case 4:
                return INVALID_EMAIL;
            case 5:
                return EMAIL_ALREADY_EXISTS;
            case 6:
                return EXCEEDED_RENAME_LIMIT;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49328i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49328i);
    }
}
