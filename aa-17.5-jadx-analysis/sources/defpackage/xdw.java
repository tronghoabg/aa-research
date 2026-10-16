package defpackage;

import android.R;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class xdw {
    private static final int[] g = {R.attr.state_selected, R.attr.state_enabled};
    private static final int[] h = {R.attr.state_selected};
    private static final int[] i = {R.attr.state_enabled};
    private static final int[] j = new int[0];
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public xdx f;

    public xdw(String str, Drawable drawable, boolean z, int i2, int i3) {
        if (!TextUtils.isEmpty(str) && drawable != null) {
            throw new IllegalArgumentException(a.bA(i2, str, "RotaryKey can only have a label or an icon. Exception on Label=", " Code="));
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
        return (z && z2) ? g : z ? h : z2 ? i : j;
    }

    public xdx a() {
        return null;
    }

    public final boolean b() {
        Drawable drawable = this.e;
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
        Drawable drawable = this.e;
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

    public xdw(char c) {
        this.b = c;
        this.a = String.valueOf(c);
        this.e = null;
        this.d = false;
        this.c = 0;
    }
}
