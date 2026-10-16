package defpackage;

/* loaded from: classes.dex */
public enum xje implements abnz {
    DRIVER_POSITION_LEFT(0),
    DRIVER_POSITION_RIGHT(1),
    DRIVER_POSITION_CENTER(2),
    DRIVER_POSITION_UNKNOWN(3);

    public final int e;

    xje(int i) {
        this.e = i;
    }

    public static xje b(int i) {
        if (i == 0) {
            return DRIVER_POSITION_LEFT;
        }
        if (i == 1) {
            return DRIVER_POSITION_RIGHT;
        }
        if (i == 2) {
            return DRIVER_POSITION_CENTER;
        }
        if (i != 3) {
            return null;
        }
        return DRIVER_POSITION_UNKNOWN;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
