package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xkd implements defpackage.abpb {
    DISPLAY_TYPE_MAIN(0),
    DISPLAY_TYPE_CLUSTER(1),
    DISPLAY_TYPE_AUXILIARY(2);

    public final int d;

    xkd(int i) {
        this.d = i;
    }

    public static defpackage.xkd b(int i) {
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
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
