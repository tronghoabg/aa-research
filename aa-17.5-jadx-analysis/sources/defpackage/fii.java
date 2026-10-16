package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class fii {
    private final fih a;
    private final float b;

    public fii(Rect rect, float f) {
        this(new fih(rect), f);
    }

    public final Rect a() {
        fih fihVar = this.a;
        return new Rect(fihVar.a, fihVar.b, fihVar.c, fihVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fii fiiVar = (fii) obj;
        return affa.f(this.a, fiiVar.a) && this.b == fiiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ")";
    }

    public fii(fih fihVar, float f) {
        this.a = fihVar;
        this.b = f;
    }
}
