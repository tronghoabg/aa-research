package i.c.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum g implements eg {
    UNSPECIFIED(0),
    CAR_COMPASS(1),
    PHONE_COMPASS(2),
    PREV_SESSION(3),
    GPS(4),
    DISPLAYED(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f49604h;

    g(int i2) {
        this.f49604h = i2;
    }

    public static g a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return CAR_COMPASS;
        }
        if (i2 == 2) {
            return PHONE_COMPASS;
        }
        if (i2 == 3) {
            return PREV_SESSION;
        }
        if (i2 == 4) {
            return GPS;
        }
        if (i2 != 5) {
            return null;
        }
        return DISPLAYED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49604h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49604h);
    }
}
