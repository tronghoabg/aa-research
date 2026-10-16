package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xhg implements defpackage.abpb {
    WHEEL_UNKNOWN(0),
    WHEEL_LEFT_FRONT(1),
    WHEEL_RIGHT_FRONT(2),
    WHEEL_LEFT_REAR(4),
    WHEEL_RIGHT_REAR(8),
    UNRECOGNIZED(-1);

    private final int h;

    xhg(int i) {
        this.h = i;
    }

    public static defpackage.xhg b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
