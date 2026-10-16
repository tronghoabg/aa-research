package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum absu implements defpackage.abpb {
    TRIGGER_TYPE_UNSPECIFIED(0),
    TRIGGER_TYPE_SESSION_END(1),
    TRIGGER_TYPE_LAPSE(2);

    private final int e;

    absu(int i) {
        this.e = i;
    }

    public static defpackage.absu b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
