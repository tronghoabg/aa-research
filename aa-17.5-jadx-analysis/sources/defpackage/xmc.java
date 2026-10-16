package defpackage;

/* loaded from: classes.dex */
public enum xmc implements abnz {
    UNKNOWN(0),
    IN_CALL(1),
    ON_HOLD(2),
    INACTIVE(3),
    INCOMING(4),
    CONFERENCED(5),
    MUTED(6);

    public final int h;

    xmc(int i2) {
        this.h = i2;
    }

    public static xmc b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return IN_CALL;
            case 2:
                return ON_HOLD;
            case 3:
                return INACTIVE;
            case 4:
                return INCOMING;
            case 5:
                return CONFERENCED;
            case 6:
                return MUTED;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
