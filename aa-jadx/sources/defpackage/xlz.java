package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xlz implements defpackage.abpb {
    NAV_FOCUS_NATIVE(1),
    NAV_FOCUS_PROJECTED(2);

    public final int c;

    xlz(int i) {
        this.c = i;
    }

    public static defpackage.xlz b(int i) {
        if (i == 1) {
            return NAV_FOCUS_NATIVE;
        }
        if (i != 2) {
            return null;
        }
        return NAV_FOCUS_PROJECTED;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
