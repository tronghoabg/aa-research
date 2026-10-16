package com.waze.location;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    private float f25363a;

    /* renamed from: b, reason: collision with root package name */
    private float f25364b;

    /* renamed from: c, reason: collision with root package name */
    private float f25365c;

    /* renamed from: d, reason: collision with root package name */
    private float f25366d;

    public bk(float f2, float f3, float f4, float f5) {
        this.f25363a = f2;
        this.f25364b = f3;
        this.f25365c = f4;
        this.f25366d = f5;
    }

    public static /* synthetic */ bk h(bk bkVar) {
        return new bk(bkVar.f25363a, bkVar.f25364b, bkVar.f25365c, bkVar.f25366d);
    }

    public final float a() {
        return this.f25366d;
    }

    public final float b() {
        return this.f25363a;
    }

    public final float c() {
        return this.f25364b;
    }

    public final float d() {
        return this.f25365c;
    }

    public final void e(bk bkVar) {
        h.g.b.x.f(bkVar, "rhs");
        float f2 = this.f25366d;
        float f3 = bkVar.f25363a;
        float f4 = this.f25363a;
        float f5 = bkVar.f25366d;
        float f6 = this.f25364b;
        float f7 = bkVar.f25365c;
        float f8 = f6 * f7;
        float f9 = this.f25365c;
        float f10 = bkVar.f25364b;
        float f11 = f9 * f10;
        float f12 = f6 * f5;
        float f13 = f9 * f3;
        float f14 = f6 * f3;
        float f15 = f9 * f5;
        this.f25363a = (((f2 * f3) + (f4 * f5)) + f8) - f11;
        this.f25364b = ((f2 * f10) - (f4 * f7)) + f12 + f13;
        this.f25365c = (((f2 * f7) + (f4 * f10)) - f14) + f15;
        this.f25366d = (((f2 * f5) - (f4 * f3)) - (f6 * f10)) - (f9 * f7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return Float.compare(this.f25363a, bkVar.f25363a) == 0 && Float.compare(this.f25364b, bkVar.f25364b) == 0 && Float.compare(this.f25365c, bkVar.f25365c) == 0 && Float.compare(this.f25366d, bkVar.f25366d) == 0;
    }

    public final void f() {
        float f2 = this.f25363a;
        float f3 = this.f25364b;
        float f4 = this.f25365c;
        float f5 = this.f25366d;
        float f6 = (f2 * f2) + (f3 * f3) + (f4 * f4) + (f5 * f5);
        float fSqrt = Math.abs(1.0f - f6) < 2.0E-4f ? (f6 + 1.0f) / 2.0f : (float) Math.sqrt(f6);
        if (fSqrt == 0.0f) {
            i();
            return;
        }
        float f7 = 1.0f / fSqrt;
        this.f25363a *= f7;
        this.f25364b *= f7;
        this.f25365c *= f7;
        this.f25366d *= f7;
    }

    public final void g(float[] fArr, float f2) {
        h.g.b.x.f(fArr, "rot");
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4) + (f5 * f5));
        double d2 = f2 * fSqrt;
        float fSin = ((double) fSqrt) > 1.0E-10d ? ((float) Math.sin(d2 / 2.0d)) / fSqrt : 0.0f;
        this.f25363a = f3 * fSin;
        this.f25364b = f4 * fSin;
        this.f25365c = f5 * fSin;
        this.f25366d = (float) Math.cos(d2 / 2.0d);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.f25363a) * 31) + Float.floatToIntBits(this.f25364b)) * 31) + Float.floatToIntBits(this.f25365c)) * 31) + Float.floatToIntBits(this.f25366d);
    }

    public final void i() {
        this.f25363a = 0.0f;
        this.f25364b = 0.0f;
        this.f25365c = 0.0f;
        this.f25366d = 1.0f;
    }

    public final String toString() {
        return "Quaternion(x=" + this.f25363a + ", y=" + this.f25364b + ", z=" + this.f25365c + ", w=" + this.f25366d + ")";
    }

    public bk() {
        this(null);
    }

    public /* synthetic */ bk(byte[] bArr) {
        this(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
