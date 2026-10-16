package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaav implements java.lang.Comparable {
    public int a;
    public int b;

    public aaav(com.google.android.libraries.maps.model.LatLng latLng) {
        this(defpackage.wpv.ae(latLng.longitude), defpackage.wpv.ad(latLng.latitude));
    }

    public static defpackage.aaav b(double d, double d2) {
        return new defpackage.aaav(defpackage.wpv.ae(d2), defpackage.wpv.ad(d));
    }

    public static boolean e(defpackage.aaav aaavVar, defpackage.aaav aaavVar2, defpackage.aaav aaavVar3) {
        int i = aaavVar.a;
        int i2 = aaavVar.b;
        int i3 = aaavVar2.a;
        int i4 = aaavVar2.b;
        int i5 = aaavVar3.a;
        int i6 = aaavVar3.b;
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
        long j2 = ((long) (i5 - i)) * ((long) (i4 - i2));
        if (i3 >= i) {
            return j2 > j * ((long) (i3 - i));
        }
        return j2 < j * ((long) (i3 - i));
    }

    public static boolean f(defpackage.aaav aaavVar, defpackage.aaav aaavVar2, defpackage.aaav aaavVar3, defpackage.aaav aaavVar4) {
        int i = aaavVar2.a;
        int i2 = aaavVar.a;
        int i3 = i - i2;
        int i4 = aaavVar2.b;
        int i5 = aaavVar.b;
        int i6 = i4 - i5;
        int i7 = aaavVar4.a;
        int i8 = aaavVar3.a;
        int i9 = i7 - i8;
        int i10 = aaavVar4.b;
        int i11 = aaavVar3.b;
        int i12 = i10 - i11;
        int i13 = i8 - i2;
        int i14 = i11 - i5;
        long j = i12;
        long j2 = i3;
        long j3 = i9;
        long j4 = i6;
        long j5 = (j3 * j4) - (j * j2);
        if (j5 != 0) {
            long j6 = i14;
            double d = ((((long) (-i13)) * j4) + (j2 * j6)) / j5;
            if (d >= 0.0d && d <= 1.0d) {
                double d2 = ((((long) i13) * j) - (j6 * j3)) / (-j5);
                if (d2 >= 0.0d && d2 <= 1.0d) {
                    return true;
                }
            }
            return false;
        }
        if (i13 == 0) {
            if (i14 == 0) {
                return true;
            }
            i13 = 0;
        }
        if ((((long) i13) * j4) - (((long) i14) * j2) != 0) {
            return false;
        }
        if (i3 == 0 && i6 == 0) {
            return h(aaavVar3, aaavVar4, aaavVar);
        }
        if (i9 == 0 && i12 == 0) {
            return h(aaavVar, aaavVar2, aaavVar3);
        }
        return g(aaavVar, aaavVar2, aaavVar3) || g(aaavVar, aaavVar2, aaavVar4) || g(aaavVar3, aaavVar4, aaavVar) || g(aaavVar3, aaavVar4, aaavVar2);
    }

    private static boolean g(defpackage.aaav aaavVar, defpackage.aaav aaavVar2, defpackage.aaav aaavVar3) {
        int i = aaavVar2.a;
        int i2 = aaavVar.a;
        int i3 = aaavVar2.b;
        int i4 = aaavVar.b;
        int i5 = aaavVar3.a - i2;
        int i6 = aaavVar3.b - i4;
        long j = i3 - i4;
        long j2 = i - i2;
        long j3 = (((long) i5) * j2) + (((long) i6) * j);
        if (j3 >= 0) {
            return j3 <= (j2 * j2) + (j * j);
        }
        return false;
    }

    private static boolean h(defpackage.aaav aaavVar, defpackage.aaav aaavVar2, defpackage.aaav aaavVar3) {
        int i = aaavVar2.a;
        int i2 = aaavVar.a;
        int i3 = aaavVar2.b;
        int i4 = aaavVar.b;
        int i5 = aaavVar3.a - i2;
        int i6 = aaavVar3.b - i4;
        long j = i3 - i4;
        long j2 = i6;
        long j3 = i - i2;
        long j4 = i5;
        double dSqrt = java.lang.Math.sqrt((j3 * j3) + (j * j));
        double dSqrt2 = java.lang.Math.sqrt((j4 * j4) + (j2 * j2));
        if (dSqrt2 <= dSqrt) {
            return ((double) ((j3 * j4) + (j * j2))) == dSqrt * dSqrt2;
        }
        return false;
    }

    public final com.google.android.libraries.maps.model.LatLng a() {
        double dAtan = java.lang.Math.atan(java.lang.Math.exp(((double) this.b) * 5.8516723170686385E-9d)) - 0.7853981633974483d;
        double degrees = java.lang.Math.toDegrees(dAtan + dAtan);
        double degrees2 = java.lang.Math.toDegrees(((double) this.a) * 5.8516723170686385E-9d);
        while (degrees2 > 180.0d) {
            degrees2 -= 360.0d;
        }
        while (degrees2 < -180.0d) {
            degrees2 += 360.0d;
        }
        return new com.google.android.libraries.maps.model.LatLng(degrees, degrees2);
    }

    public final void c(defpackage.aaav aaavVar) {
        d(aaavVar.a, aaavVar.b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.aaav aaavVar = (defpackage.aaav) obj;
        int i = this.a;
        int i2 = aaavVar.a;
        return i == i2 ? this.b - aaavVar.b : i - i2;
    }

    public final void d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aaav)) {
            return false;
        }
        defpackage.aaav aaavVar = (defpackage.aaav) obj;
        return this.a == aaavVar.a && this.b == aaavVar.b;
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

    public final java.lang.String toString() {
        return "(" + this.a + "," + this.b + ")";
    }

    public aaav(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public aaav() {
        throw null;
    }
}
