package i.b.q;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ad implements eg {
    UNKNOWN(0),
    USER_GENERATED(1),
    CALENDAR_DRIVE(2),
    FACEBOOK_DRIVE(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f49239f;

    ad(int i2) {
        this.f49239f = i2;
    }

    public static ad a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return USER_GENERATED;
        }
        if (i2 == 2) {
            return CALENDAR_DRIVE;
        }
        if (i2 != 3) {
            return null;
        }
        return FACEBOOK_DRIVE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49239f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49239f);
    }
}
