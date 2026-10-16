package defpackage;

import android.graphics.Rect;
import android.view.SurfaceControlViewHost;

/* loaded from: classes2.dex */
public final class jjl {
    public final int a;
    public final String b;
    public final Rect c;
    public final int d;
    public final float e;
    public final Rect f;
    public final Rect g;
    public final float h;
    public final SurfaceControlViewHost.SurfacePackage i;
    private final int j = 1;

    public jjl(int i, String str, Rect rect, int i2, float f, Rect rect2, Rect rect3, float f2, SurfaceControlViewHost.SurfacePackage surfacePackage) {
        this.a = i;
        this.b = str;
        this.c = rect;
        this.d = i2;
        this.e = f;
        this.f = rect2;
        this.g = rect3;
        this.h = f2;
        this.i = surfacePackage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjl)) {
            return false;
        }
        jjl jjlVar = (jjl) obj;
        if (this.a != jjlVar.a || !affa.f(this.b, jjlVar.b) || !affa.f(this.c, jjlVar.c) || this.d != jjlVar.d || Float.compare(this.e, jjlVar.e) != 0 || !affa.f(this.f, jjlVar.f) || !affa.f(this.g, jjlVar.g) || Float.compare(this.h, jjlVar.h) != 0) {
            return false;
        }
        int i = jjlVar.j;
        return affa.f(this.i, jjlVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Float.floatToIntBits(this.h);
        SurfaceControlViewHost.SurfacePackage surfacePackage = this.i;
        return (((iHashCode * 31) + 1) * 31) + (surfacePackage == null ? 0 : surfacePackage.hashCode());
    }

    public final String toString() {
        return "WindowData(id=" + this.a + ", name=" + this.b + ", bounds=" + this.c + ", zOrder=" + this.d + ", alpha=" + this.e + ", cropBounds=" + this.f + ", insets=" + this.g + ", cornerRadiusPx=" + this.h + ", animationType=NONE, surfacePackage=" + this.i + ")";
    }
}
