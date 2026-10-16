package defpackage;

/* loaded from: classes.dex */
public enum abrr implements abnz {
    TRIGGER_TYPE_UNSPECIFIED(0),
    TRIGGER_TYPE_SESSION_END(1),
    TRIGGER_TYPE_LAPSE(2);

    private final int e;

    abrr(int i) {
        this.e = i;
    }

    public static abrr b(int i) {
        if (i == 0) {
            return TRIGGER_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return TRIGGER_TYPE_SESSION_END;
        }
        if (i != 2) {
            return null;
        }
        return TRIGGER_TYPE_LAPSE;
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
