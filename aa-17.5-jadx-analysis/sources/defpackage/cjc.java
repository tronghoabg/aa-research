package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cjc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        byx.C(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L);
    }

    public cjc(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjc)) {
            return false;
        }
        cjc cjcVar = (cjc) obj;
        return Float.compare(this.a, cjcVar.a) == 0 && Float.compare(this.b, cjcVar.b) == 0 && Float.compare(this.c, cjcVar.c) == 0 && Float.compare(this.d, cjcVar.d) == 0 && this.e == cjcVar.e && this.f == cjcVar.f && this.g == cjcVar.g && this.h == cjcVar.h;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        long j4 = this.e;
        return (((((((iFloatToIntBits * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = byx.G(this.a) + ", " + byx.G(this.b) + ", " + byx.G(this.c) + ", " + byx.G(this.d);
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        if (j != j2 || j2 != j3 || j3 != j4) {
            return "RoundRect(rect=" + str + ", topLeft=" + ciy.a(j) + ", topRight=" + ciy.a(j2) + ", bottomRight=" + ciy.a(j3) + ", bottomLeft=" + ciy.a(j4) + ")";
        }
        long j5 = j >> 32;
        int i = (int) (j & 4294967295L);
        int i2 = (int) j5;
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "RoundRect(rect=" + str + ", radius=" + byx.G(Float.intBitsToFloat(i2)) + ")";
        }
        return "RoundRect(rect=" + str + ", x=" + byx.G(Float.intBitsToFloat(i2)) + ", y=" + byx.G(Float.intBitsToFloat(i)) + ")";
    }
}
