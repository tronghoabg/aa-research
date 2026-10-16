package defpackage;

import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class zzq implements Comparable {
    public int a;
    public int b;

    public zzq(LatLng latLng) {
        this(ysi.B(latLng.longitude), ysi.A(latLng.latitude));
    }

    public static zzq b(double d, double d2) {
        return new zzq(ysi.B(d2), ysi.A(d));
    }

    public static boolean e(zzq zzqVar, zzq zzqVar2, zzq zzqVar3) {
        int i = zzqVar.a;
        int i2 = zzqVar.b;
        int i3 = zzqVar2.a;
        int i4 = zzqVar2.b;
        int i5 = zzqVar3.a;
        int i6 = zzqVar3.b;
        if (i2 <= i6 && i4 <= i6) {
            return false;
        }
        if (i5 >= i && i5 >= i3) {
            return false;
        }
        if (i5 < i && i5 < i3) {
            return false;
        }
        long j = i6 - i2;
        long j2 = (i5 - i) * (i4 - i2);
        return i3 >= i ? j2 > j * ((long) (i3 - i)) : j2 < j * ((long) (i3 - i));
    }

    public static boolean f(zzq zzqVar, zzq zzqVar2, zzq zzqVar3, zzq zzqVar4) {
        int i = zzqVar2.a;
        int i2 = zzqVar.a;
        int i3 = i - i2;
        int i4 = zzqVar2.b;
        int i5 = zzqVar.b;
        int i6 = i4 - i5;
        int i7 = zzqVar4.a;
        int i8 = zzqVar3.a;
        int i9 = i7 - i8;
        int i10 = zzqVar4.b;
        int i11 = zzqVar3.b;
        int i12 = i10 - i11;
        int i13 = i8 - i2;
        int i14 = i11 - i5;
        long j = i3;
        long j2 = i9;
        long j3 = i6;
        long j4 = (j2 * j3) - (i12 * j);
        if (j4 == 0) {
            if (i13 == 0) {
                if (i14 == 0) {
                    return true;
                }
                i13 = 0;
            }
            if ((i13 * j3) - (i14 * j) != 0) {
                return false;
            }
            return (i3 == 0 && i6 == 0) ? h(zzqVar3, zzqVar4, zzqVar) : (i9 == 0 && i12 == 0) ? h(zzqVar, zzqVar2, zzqVar3) : g(zzqVar, zzqVar2, zzqVar3) || g(zzqVar, zzqVar2, zzqVar4) || g(zzqVar3, zzqVar4, zzqVar) || g(zzqVar3, zzqVar4, zzqVar2);
        }
        long j5 = i14;
        double d = (((-i13) * j3) + (j * j5)) / j4;
        if (d >= 0.0d && d <= 1.0d) {
            double d2 = ((i13 * r12) - (j5 * j2)) / (-j4);
            if (d2 >= 0.0d && d2 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(zzq zzqVar, zzq zzqVar2, zzq zzqVar3) {
        int i = zzqVar2.a;
        int i2 = zzqVar.a;
        int i3 = zzqVar2.b;
        int i4 = zzqVar.b;
        int i5 = zzqVar3.a - i2;
        int i6 = zzqVar3.b - i4;
        long j = i3 - i4;
        long j2 = i - i2;
        long j3 = (i5 * j2) + (i6 * j);
        if (j3 >= 0) {
            return j3 <= (j2 * j2) + (j * j);
        }
        return false;
    }

    private static boolean h(zzq zzqVar, zzq zzqVar2, zzq zzqVar3) {
        int i = zzqVar2.a;
        int i2 = zzqVar.a;
        int i3 = zzqVar2.b;
        int i4 = zzqVar.b;
        int i5 = zzqVar3.a - i2;
        int i6 = zzqVar3.b - i4;
        long j = i3 - i4;
        long j2 = i6;
        long j3 = i - i2;
        long j4 = i5;
        double dSqrt = Math.sqrt((j3 * j3) + (j * j));
        double dSqrt2 = Math.sqrt((j4 * j4) + (j2 * j2));
        if (dSqrt2 <= dSqrt) {
            return ((double) ((j3 * j4) + (j * j2))) == dSqrt * dSqrt2;
        }
        return false;
    }

    public final LatLng a() {
        double dAtan = Math.atan(Math.exp(this.b * 5.8516723170686385E-9d)) - 0.7853981633974483d;
        double degrees = Math.toDegrees(dAtan + dAtan);
        double degrees2 = Math.toDegrees(this.a * 5.8516723170686385E-9d);
        while (degrees2 > 180.0d) {
            degrees2 -= 360.0d;
        }
        while (degrees2 < -180.0d) {
            degrees2 += 360.0d;
        }
        return new LatLng(degrees, degrees2);
    }

    public final void c(zzq zzqVar) {
        d(zzqVar.a, zzqVar.b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzq zzqVar = (zzq) obj;
        int i = this.a;
        int i2 = zzqVar.a;
        return i == i2 ? this.b - zzqVar.b : i - i2;
    }

    public final void d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.a == zzqVar.a && this.b == zzqVar.b;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        int i3 = i - i2;
        int i4 = (i2 - i3) ^ (i3 << 8);
        int i5 = i4 >> 13;
        int i6 = i5 ^ ((-i3) - i4);
        int i7 = ((i3 - i4) - i6) ^ (i6 >> 12);
        int i8 = ((i4 - i6) - i7) ^ (i7 << 16);
        int i9 = ((i6 - i7) - i8) ^ (i8 >> 5);
        int i10 = ((i7 - i8) - i9) ^ (i9 >> 3);
        int i11 = ((i8 - i9) - i10) ^ (i10 << 10);
        return (i11 >> 15) ^ ((i9 - i10) - i11);
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + ")";
    }

    public zzq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public zzq() {
        throw null;
    }
}
