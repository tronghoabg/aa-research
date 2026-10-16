package defpackage;

import android.graphics.Color;

/* loaded from: classes3.dex */
public final class xqx {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final int e;

    public /* synthetic */ xqx(byte[] bArr) {
        this(59.3f, 1, 0.34f, Color.argb(255, 241, 97, 240), Color.argb(255, 52, 8, 27));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqx)) {
            return false;
        }
        xqx xqxVar = (xqx) obj;
        return Float.compare(this.a, xqxVar.a) == 0 && this.b == xqxVar.b && Float.compare(this.c, xqxVar.c) == 0 && this.d == xqxVar.d && this.e == xqxVar.e;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "RadialGradientConfig(radius=" + this.a + ", direction=" + this.b + ", ratio=" + this.c + ", innerColor=" + this.d + ", outerColor=" + this.e + ")";
    }

    public xqx(float f, int i, float f2, int i2, int i3) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = i3;
    }

    public xqx() {
        this(null);
    }
}
