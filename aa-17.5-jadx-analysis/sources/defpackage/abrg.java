package defpackage;

/* loaded from: classes3.dex */
public enum abrg implements abnz {
    DISPLAY_TYPE_MAIN(0),
    DISPLAY_TYPE_CLUSTER(1),
    DISPLAY_TYPE_AUXILIARY(2),
    UNRECOGNIZED(-1);

    private final int f;

    abrg(int i) {
        this.f = i;
    }

    public static abrg b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this == UNRECOGNIZED ? aboi.b() : this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
