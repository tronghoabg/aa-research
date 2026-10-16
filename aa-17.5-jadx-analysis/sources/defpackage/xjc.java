package defpackage;

/* loaded from: classes.dex */
public enum xjc implements abnz {
    DISPLAY_TYPE_MAIN(0),
    DISPLAY_TYPE_CLUSTER(1),
    DISPLAY_TYPE_AUXILIARY(2);

    public final int d;

    xjc(int i) {
        this.d = i;
    }

    public static xjc b(int i) {
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
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
