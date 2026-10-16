package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
final class jjc {
    public final Rect a;
    public final float b;

    public jjc(Rect rect, float f) {
        this.a = rect;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjc)) {
            return false;
        }
        jjc jjcVar = (jjc) obj;
        return affa.f(this.a, jjcVar.a) && Float.compare(this.b, jjcVar.b) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "CustomRenderBounds(cropBounds=" + this.a + ", cornerRadiusPx=" + this.b + ")";
    }
}
