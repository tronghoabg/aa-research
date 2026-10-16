package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dfd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final den g;

    public dfd(den denVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = denVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b() {
        return this.b - this.a;
    }

    public final int c(int i) {
        return i + this.a;
    }

    public final int d(int i) {
        return i + this.c;
    }

    public final int e(int i) {
        int i2 = this.a;
        return afpt.g(i, i2, this.b) - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfd)) {
            return false;
        }
        dfd dfdVar = (dfd) obj;
        return affa.f(this.g, dfdVar.g) && this.a == dfdVar.a && this.b == dfdVar.b && this.c == dfdVar.c && this.d == dfdVar.d && Float.compare(this.e, dfdVar.e) == 0 && Float.compare(this.f, dfdVar.f) == 0;
    }

    public final int f(int i) {
        return i - this.c;
    }

    public final long g(long j, boolean z) {
        if (z) {
            long j2 = dfv.a;
            if (j == j2) {
                return j2;
            }
        }
        long j3 = dfv.a;
        return czz.t(c((int) (j >> 32)), c((int) (j & 4294967295L)));
    }

    public final cjb h(cjb cjbVar) {
        return cjbVar.f((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(this.e) & 4294967295L));
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final cjb i(cjb cjbVar) {
        return cjbVar.f((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(-this.e) & 4294967295L));
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + ", bottom=" + this.f + ")";
    }
}
