package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum xnd implements defpackage.abpb {
    UNKNOWN(0),
    IN_CALL(1),
    ON_HOLD(2),
    INACTIVE(3),
    INCOMING(4),
    CONFERENCED(5),
    MUTED(6);

    public final int h;

    xnd(int i2) {
        this.h = i2;
    }

    public static defpackage.xnd b(int i2) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
