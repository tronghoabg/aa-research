package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum absj implements defpackage.abpb {
    DISPLAY_TYPE_MAIN(0),
    DISPLAY_TYPE_CLUSTER(1),
    DISPLAY_TYPE_AUXILIARY(2),
    UNRECOGNIZED(-1);

    private final int f;

    absj(int i) {
        this.f = i;
    }

    public static defpackage.absj b(int i) {
        if (i == 0) {
            return DISPLAY_TYPE_MAIN;
        }
        if (i == 1) {
            return DISPLAY_TYPE_CLUSTER;
        }
        if (i != 2) {
            return null;
        }
        return DISPLAY_TYPE_AUXILIARY;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.abpk.b() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
