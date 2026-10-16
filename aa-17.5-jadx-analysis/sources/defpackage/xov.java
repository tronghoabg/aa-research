package defpackage;

/* loaded from: classes.dex */
public enum xov implements abnz {
    UI_THEME_AUTOMATIC(0),
    UI_THEME_LIGHT(1),
    UI_THEME_DARK(2);

    private final int e;

    xov(int i) {
        this.e = i;
    }

    public static xov b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
