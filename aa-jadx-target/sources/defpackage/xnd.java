package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
            case defpackage.abnt.b /* 0 */:
                return UNKNOWN;
            case 1:
                return IN_CALL;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ON_HOLD;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return INACTIVE;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return INCOMING;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return CONFERENCED;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
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
