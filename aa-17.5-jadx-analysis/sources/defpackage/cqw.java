package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cqw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public cqw(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqw)) {
            return false;
        }
        cqw cqwVar = (cqw) obj;
        return this.a == cqwVar.a && this.b == cqwVar.b && this.c == cqwVar.c && this.d == cqwVar.d && this.e == cqwVar.e && Float.compare(this.f, cqwVar.f) == 0 && this.g == cqwVar.g && this.h == cqwVar.h && affa.f(this.i, cqwVar.i) && this.j == cqwVar.j && Float.compare(this.k, cqwVar.k) == 0 && this.l == cqwVar.l && this.m == cqwVar.m;
    }

    public final int hashCode() {
        boolean z = this.e;
        int iFloatToIntBits = Float.floatToIntBits(this.f);
        int i = true != z ? 1237 : 1231;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        int i2 = (((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + i) * 31) + iFloatToIntBits;
        List list = this.i;
        int iHashCode = (((((i2 * 31) + this.g) * 31) + (true == this.h ? 1231 : 1237)) * 31) + list.hashCode();
        float f = this.k;
        long j5 = this.j;
        int iFloatToIntBits2 = (((iHashCode * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + Float.floatToIntBits(f);
        long j6 = this.m;
        long j7 = this.l;
        return (((iFloatToIntBits2 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        long j = this.m;
        long j2 = this.l;
        long j3 = this.j;
        long j4 = this.d;
        long j5 = this.c;
        return "PointerInputEventData(id=" + cqt.a(this.a) + ", uptime=" + this.b + ", positionOnScreen=" + cja.d(j5) + ", position=" + cja.d(j4) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + crc.a(this.g) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + cja.d(j3) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + cja.d(j2) + ", originalEventPosition=" + cja.d(j) + ")";
    }
}
