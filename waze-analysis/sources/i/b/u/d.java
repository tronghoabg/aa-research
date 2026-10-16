package i.b.u;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum d implements eg {
    INVALID_TOKEN(0),
    EMAIL_ALREADY_VERIFIED(1),
    EXCEEDED_RATE_LIMIT(2),
    WRONG_PIN_CODE(3),
    INTERNAL_ERROR(4),
    TOKEN_ALREADY_CONFIRMED(5),
    UNAUTHORIZED_USER(6),
    INVALID_UUID(7),
    PIN_CODE_EXPIRED(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f49309k;

    d(int i2) {
        this.f49309k = i2;
    }

    public static d a(int i2) {
        switch (i2) {
            case 0:
                return INVALID_TOKEN;
            case 1:
                return EMAIL_ALREADY_VERIFIED;
            case 2:
                return EXCEEDED_RATE_LIMIT;
            case 3:
                return WRONG_PIN_CODE;
            case 4:
                return INTERNAL_ERROR;
            case 5:
                return TOKEN_ALREADY_CONFIRMED;
            case 6:
                return UNAUTHORIZED_USER;
            case 7:
                return INVALID_UUID;
            case 8:
                return PIN_CODE_EXPIRED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49309k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49309k);
    }
}
