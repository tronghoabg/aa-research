package defpackage;

/* loaded from: classes3.dex */
public enum xky implements abnz {
    NAV_FOCUS_NATIVE(1),
    NAV_FOCUS_PROJECTED(2);

    public final int c;

    xky(int i) {
        this.c = i;
    }

    public static xky b(int i) {
        if (i == 1) {
            return NAV_FOCUS_NATIVE;
        }
        if (i != 2) {
            return null;
        }
        return NAV_FOCUS_PROJECTED;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
