package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xou implements defpackage.abpb {
    SENSOR_OK(1),
    SENSOR_ERROR_TRANSIENT(2),
    SENSOR_ERROR_PERMANENT(3);

    private final int e;

    xou(int i) {
        this.e = i;
    }

    public static defpackage.xou b(int i) {
        if (i == 1) {
            return SENSOR_OK;
        }
        if (i == 2) {
            return SENSOR_ERROR_TRANSIENT;
        }
        if (i != 3) {
            return null;
        }
        return SENSOR_ERROR_PERMANENT;
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
