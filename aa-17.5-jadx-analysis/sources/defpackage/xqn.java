package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xqn {
    public static volatile int n;
    public final String a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final xqs m;
    private final boolean o;

    static {
        int i = xqs.a;
        n = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xqn() {
        int i = xqs.a;
        if (n == 0) {
            throw null;
        }
        this("return blurredSdfMask;", 1.0f, i, BitmapDescriptorFactory.HUE_RED, 0.02f, 3.0f, 10.0f, 59.0f, 59.0f, 3.5f, 0.12f, -0.07f, xqs.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqn)) {
            return false;
        }
        xqn xqnVar = (xqn) obj;
        if (!affa.f(this.a, xqnVar.a) || Float.compare(this.b, xqnVar.b) != 0 || this.c != xqnVar.c || Float.compare(this.d, xqnVar.d) != 0 || Float.compare(this.e, xqnVar.e) != 0 || Float.compare(this.f, xqnVar.f) != 0 || Float.compare(this.g, xqnVar.g) != 0 || Float.compare(this.h, xqnVar.h) != 0 || Float.compare(this.i, xqnVar.i) != 0 || Float.compare(this.j, xqnVar.j) != 0 || Float.compare(this.k, xqnVar.k) != 0 || Float.compare(this.l, xqnVar.l) != 0) {
            return false;
        }
        boolean z = xqnVar.o;
        return affa.f(this.m, xqnVar.m);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + 1237) * 31) + this.m.hashCode();
    }

    public final String toString() {
        return "DotsConfig(mask=" + xqo.a(this.a) + ", alpha=" + this.b + ", color=" + this.c + ", yFractGradientWeight=" + this.d + ", waveFrequency=" + this.e + ", waveAmplitude=" + this.f + ", waveSpeed=" + this.g + ", maskInnerStrokeWidth=" + this.h + ", maskOuterStrokeWidth=" + this.i + ", gridSize=" + this.j + ", maxRadius=" + this.k + ", minRadius=" + this.l + ", showMaskOnly=false, internalDotsConfig=" + this.m + ")";
    }

    public xqn(String str, float f, int i, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, xqs xqsVar) {
        xqsVar.getClass();
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
        this.l = f10;
        this.o = false;
        this.m = xqsVar;
    }
}
