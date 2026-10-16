package defpackage;

/* loaded from: classes3.dex */
public enum xgf implements abnz {
    WHEEL_UNKNOWN(0),
    WHEEL_LEFT_FRONT(1),
    WHEEL_RIGHT_FRONT(2),
    WHEEL_LEFT_REAR(4),
    WHEEL_RIGHT_REAR(8),
    UNRECOGNIZED(-1);

    private final int h;

    xgf(int i) {
        this.h = i;
    }

    public static xgf b(int i) {
        if (i == 0) {
            return WHEEL_UNKNOWN;
        }
        if (i == 1) {
            return WHEEL_LEFT_FRONT;
        }
        if (i == 2) {
            return WHEEL_RIGHT_FRONT;
        }
        if (i == 4) {
            return WHEEL_LEFT_REAR;
        }
        if (i != 8) {
            return null;
        }
        return WHEEL_RIGHT_REAR;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
