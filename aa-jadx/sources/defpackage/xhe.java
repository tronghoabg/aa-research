package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xhe implements defpackage.abpb {
    MIRROR_UNKNOWN(0),
    MIRROR_DRIVER_LEFT(1),
    MIRROR_DRIVER_RIGHT(2),
    MIRROR_DRIVER_CENTER(4),
    UNRECOGNIZED(-1);

    private final int g;

    xhe(int i) {
        this.g = i;
    }

    public static defpackage.xhe b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
