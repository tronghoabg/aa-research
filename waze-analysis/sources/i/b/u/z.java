package i.b.u;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum z implements eg {
    INVALID_LOCALE(0),
    INVALID_EMAIL(1),
    EMAIL_EXISTS(2),
    MISSING_EMAIL(3),
    EXCEEDED_RATE_LIMIT(4),
    INTERNAL_ERROR(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f49336h;

    z(int i2) {
        this.f49336h = i2;
    }

    public static z a(int i2) {
        if (i2 == 0) {
            return INVALID_LOCALE;
        }
        if (i2 == 1) {
            return INVALID_EMAIL;
        }
        if (i2 == 2) {
            return EMAIL_EXISTS;
        }
        if (i2 == 3) {
            return MISSING_EMAIL;
        }
        if (i2 == 4) {
            return EXCEEDED_RATE_LIMIT;
        }
        if (i2 != 5) {
            return null;
        }
        return INTERNAL_ERROR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49336h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49336h);
    }
}
