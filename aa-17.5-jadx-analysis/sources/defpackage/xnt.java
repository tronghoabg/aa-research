package defpackage;

/* loaded from: classes3.dex */
public enum xnt implements abnz {
    SENSOR_OK(1),
    SENSOR_ERROR_TRANSIENT(2),
    SENSOR_ERROR_PERMANENT(3);

    private final int e;

    xnt(int i) {
        this.e = i;
    }

    public static xnt b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
