package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xeu {
    private static final int[] g = {android.R.attr.state_selected, android.R.attr.state_enabled};
    private static final int[] h = {android.R.attr.state_selected};
    private static final int[] i = {android.R.attr.state_enabled};
    private static final int[] j = new int[0];
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final boolean d;
    public android.graphics.drawable.Drawable e;
    public defpackage.xev f;

    public xeu(java.lang.String str, android.graphics.drawable.Drawable drawable, boolean z, int i2, int i3) {
        if (!android.text.TextUtils.isEmpty(str) && drawable != null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.by(i2, str, "RotaryKey can only have a label or an icon. Exception on Label=", " Code="));
        }
        if (i2 == 92) {
            this.a = "\\";
        } else {
            this.a = str;
        }
        this.b = i2;
        this.e = drawable;
        this.d = z;
        this.c = i3;
    }

    private static final int[] g(boolean z, boolean z2) {
        if (z && z2) {
            return g;
        }
        if (z) {
            return h;
        }
        return z2 ? i : j;
    }

    public defpackage.xev a() {
        return null;
    }

    public final boolean b() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        for (int i2 : drawable.getState()) {
            if (i2 == 16842910) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        for (int i2 : drawable.getState()) {
            if (i2 == 16842913) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.d;
    }

    public final boolean e(boolean z) {
        if (this.e == null || z == b()) {
            return false;
        }
        this.e.setState(g(c(), z));
        return true;
    }

    public final boolean f(boolean z) {
        if (this.e == null || z == c()) {
            return false;
        }
        this.e.setState(g(z, b()));
        return true;
    }

    public xeu(char c) {
        this.b = c;
        this.a = java.lang.String.valueOf(c);
        this.e = null;
        this.d = false;
        this.c = 0;
    }
}
