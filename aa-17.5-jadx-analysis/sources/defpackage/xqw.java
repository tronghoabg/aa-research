package defpackage;

import android.graphics.Color;

/* loaded from: classes3.dex */
public final class xqw {
    public final float a;
    public final float b;
    public final int c;
    public final float d;

    public /* synthetic */ xqw(byte[] bArr) {
        this(64.0f, 32.0f, Color.argb(255, 52, 8, 27), 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqw)) {
            return false;
        }
        xqw xqwVar = (xqw) obj;
        return Float.compare(this.a, xqwVar.a) == 0 && Float.compare(this.b, xqwVar.b) == 0 && this.c == xqwVar.c && Float.compare(this.d, xqwVar.d) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "PanelConfig(topBlurRadius=" + this.a + ", bottomBlurRadius=" + this.b + ", color=" + this.c + ", alpha=" + this.d + ")";
    }

    public xqw(float f, float f2, int i, float f3) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
    }

    public xqw() {
        this(null);
    }
}
