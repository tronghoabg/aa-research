package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xkf implements defpackage.abpb {
    DRIVER_POSITION_LEFT(0),
    DRIVER_POSITION_RIGHT(1),
    DRIVER_POSITION_CENTER(2),
    DRIVER_POSITION_UNKNOWN(3);

    public final int e;

    xkf(int i) {
        this.e = i;
    }

    public static defpackage.xkf b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
