package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum xpw implements defpackage.abpb {
    UI_THEME_AUTOMATIC(0),
    UI_THEME_LIGHT(1),
    UI_THEME_DARK(2);

    private final int e;

    xpw(int i) {
        this.e = i;
    }

    public static defpackage.xpw b(int i) {
        if (i == 0) {
            return UI_THEME_AUTOMATIC;
        }
        if (i == 1) {
            return UI_THEME_LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return UI_THEME_DARK;
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
