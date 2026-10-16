package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cjb {
    public static final cjb a = new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public cjb(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public static /* synthetic */ cjb j(cjb cjbVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = cjbVar.b;
        }
        float f4 = (i & 2) != 0 ? cjbVar.c : BitmapDescriptorFactory.HUE_RED;
        if ((i & 4) != 0) {
            f2 = cjbVar.d;
        }
        if ((i & 8) != 0) {
            f3 = cjbVar.e;
        }
        return new cjb(f, f4, f2, f3);
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f)) & 4294967295L);
    }

    public final long b() {
        return (Float.floatToRawIntBits(this.d - this.b) << 32) | (Float.floatToRawIntBits(this.e - this.c) & 4294967295L);
    }

    public final long c() {
        return (Float.floatToRawIntBits(this.b) << 32) | (Float.floatToRawIntBits(this.c) & 4294967295L);
    }

    public final cjb d(cjb cjbVar) {
        return new cjb(Math.max(this.b, cjbVar.b), Math.max(this.c, cjbVar.c), Math.min(this.d, cjbVar.d), Math.min(this.e, cjbVar.e));
    }

    public final cjb e(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new cjb(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjb)) {
            return false;
        }
        cjb cjbVar = (cjb) obj;
        return Float.compare(this.b, cjbVar.b) == 0 && Float.compare(this.c, cjbVar.c) == 0 && Float.compare(this.d, cjbVar.d) == 0 && Float.compare(this.e, cjbVar.e) == 0;
    }

    public final cjb f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new cjb(this.b + Float.intBitsToFloat(i), this.c + Float.intBitsToFloat(i2), this.d + Float.intBitsToFloat(i), this.e + Float.intBitsToFloat(i2));
    }

    public final boolean g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat < this.d) & (fIntBitsToFloat >= f) & (fIntBitsToFloat2 >= this.c) & (fIntBitsToFloat2 < this.e);
    }

    public final boolean h() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final boolean i(cjb cjbVar) {
        return (this.b < cjbVar.d) & (cjbVar.b < this.d) & (this.c < cjbVar.e) & (cjbVar.c < this.e);
    }

    public final String toString() {
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        return "Rect.fromLTRB(" + byx.G(this.b) + ", " + byx.G(f3) + ", " + byx.G(f2) + ", " + byx.G(f) + ")";
    }
}
