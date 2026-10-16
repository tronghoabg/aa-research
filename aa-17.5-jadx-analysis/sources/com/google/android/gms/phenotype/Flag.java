package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.spu;
import defpackage.srf;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class Flag extends AbstractSafeParcelable implements Comparable<Flag> {
    public static final Parcelable.Creator<Flag> CREATOR = new srf(5);
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    final void a(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.e;
            spu.aw(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError(a.bA(i, str, "Invalid type: ", ", "));
            }
            sb.append("'");
            byte[] bArr = this.f;
            spu.aw(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Flag flag) {
        Flag flag2 = flag;
        int iCompareTo = this.a.compareTo(flag2.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.g;
        int iB = b(i, flag2.g);
        if (iB != 0) {
            return iB;
        }
        int i2 = 0;
        if (i == 1) {
            long j = this.b;
            long j2 = flag2.b;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.c;
            if (z == flag2.c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.d, flag2.d);
        }
        if (i == 4) {
            String str = this.e;
            String str2 = flag2.e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(a.bp(i, "Invalid enum value: "));
        }
        byte[] bArr = this.f;
        byte[] bArr2 = flag2.f;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i2 >= Math.min(length2, length)) {
                return b(length2, length);
            }
            int i3 = bArr[i2] - bArr2[i2];
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (a.C(this.a, flag.a) && (i = this.g) == flag.g && this.h == flag.h && this.i == flag.i) {
                if (i == 1) {
                    return this.b == flag.b;
                }
                if (i == 2) {
                    return this.c == flag.c;
                }
                if (i == 3) {
                    return this.d == flag.d;
                }
                if (i == 4) {
                    return a.C(this.e, flag.e);
                }
                if (i == 5) {
                    return Arrays.equals(this.f, flag.f);
                }
                throw new AssertionError(a.bp(i, "Invalid enum value: "));
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        String str = this.a;
        if (!srf.b(str)) {
            spu.F(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            spu.s(parcel, 3, j);
        }
        if (this.c) {
            spu.n(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            spu.p(parcel, 5, d);
        }
        String str2 = this.e;
        if (!srf.b(str2)) {
            spu.F(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!srf.b(bArr)) {
            spu.v(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!srf.a(i2)) {
            spu.r(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!srf.a(i3)) {
            spu.r(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!srf.a(i4)) {
            spu.r(parcel, 10, i4);
        }
        spu.m(parcel, iL);
    }
}
