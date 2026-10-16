package defpackage;

/* loaded from: classes3.dex */
public enum xgd implements abnz {
    MIRROR_UNKNOWN(0),
    MIRROR_DRIVER_LEFT(1),
    MIRROR_DRIVER_RIGHT(2),
    MIRROR_DRIVER_CENTER(4),
    UNRECOGNIZED(-1);

    private final int g;

    xgd(int i) {
        this.g = i;
    }

    public static xgd b(int i) {
        if (i == 0) {
            return MIRROR_UNKNOWN;
        }
        if (i == 1) {
            return MIRROR_DRIVER_LEFT;
        }
        if (i == 2) {
            return MIRROR_DRIVER_RIGHT;
        }
        if (i != 4) {
            return null;
        }
        return MIRROR_DRIVER_CENTER;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
