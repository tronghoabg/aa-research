package com.google.android.gms.l;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.camera.video.AudioStats;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.bb;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.a.a implements Comparable<f> {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final String f5613a;

    /* renamed from: b, reason: collision with root package name */
    final long f5614b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f5615c;

    /* renamed from: d, reason: collision with root package name */
    final double f5616d;

    /* renamed from: e, reason: collision with root package name */
    final String f5617e;

    /* renamed from: f, reason: collision with root package name */
    final byte[] f5618f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5619g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5620h;

    /* renamed from: i, reason: collision with root package name */
    private final int f5621i;

    f(String str, long j2, boolean z, double d2, String str2, byte[] bArr, int i2, int i3, int i4) {
        this.f5613a = str;
        this.f5614b = j2;
        this.f5615c = z;
        this.f5616d = d2;
        this.f5617e = str2;
        this.f5618f = bArr;
        this.f5619g = i2;
        this.f5620h = i3;
        this.f5621i = i4;
    }

    private static int g(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 != i3 ? 1 : 0;
    }

    public final double a() {
        if (this.f5619g == 3) {
            return this.f5616d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.f5619g == 1) {
            return this.f5614b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        if (this.f5619g != 4) {
            throw new IllegalArgumentException("Not a String type");
        }
        String str = this.f5617e;
        av.m(str);
        return str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(f fVar) {
        f fVar2 = fVar;
        int iCompareTo = this.f5613a.compareTo(fVar2.f5613a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = this.f5619g;
        int iG = g(i2, fVar2.f5619g);
        if (iG != 0) {
            return iG;
        }
        int i3 = 0;
        if (i2 == 1) {
            long j2 = this.f5614b;
            long j3 = fVar2.f5614b;
            if (j2 < j3) {
                return -1;
            }
            return j2 == j3 ? 0 : 1;
        }
        if (i2 == 2) {
            boolean z = this.f5615c;
            if (z == fVar2.f5615c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i2 == 3) {
            return Double.compare(this.f5616d, fVar2.f5616d);
        }
        if (i2 == 4) {
            String str = this.f5617e;
            String str2 = fVar2.f5617e;
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
        if (i2 != 5) {
            throw new AssertionError("Invalid enum value: " + i2);
        }
        byte[] bArr = this.f5618f;
        byte[] bArr2 = fVar2.f5618f;
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
            if (i3 >= Math.min(length2, length)) {
                return g(length2, length);
            }
            int i4 = bArr[i3] - bArr2[i3];
            if (i4 != 0) {
                return i4;
            }
            i3++;
        }
    }

    final void d(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f5613a;
        sb.append(str);
        sb.append(", ");
        int i2 = this.f5619g;
        if (i2 == 1) {
            sb.append(this.f5614b);
        } else if (i2 == 2) {
            sb.append(this.f5615c);
        } else if (i2 == 3) {
            sb.append(this.f5616d);
        } else if (i2 == 4) {
            sb.append("'");
            String str2 = this.f5617e;
            av.m(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i2 != 5) {
                throw new AssertionError("Invalid type: " + str + ", " + i2);
            }
            sb.append("'");
            byte[] bArr = this.f5618f;
            av.m(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(this.f5620h);
        sb.append(", ");
        sb.append(this.f5621i);
        sb.append(")");
    }

    public final boolean e() {
        if (this.f5619g == 2) {
            return this.f5615c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(Object obj) {
        int i2;
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (com.waze.c.c.e.b(this.f5613a, fVar.f5613a) && (i2 = this.f5619g) == fVar.f5619g && this.f5620h == fVar.f5620h && this.f5621i == fVar.f5621i) {
                if (i2 == 1) {
                    return this.f5614b == fVar.f5614b;
                }
                if (i2 == 2) {
                    return this.f5615c == fVar.f5615c;
                }
                if (i2 == 3) {
                    return this.f5616d == fVar.f5616d;
                }
                if (i2 == 4) {
                    return com.waze.c.c.e.b(this.f5617e, fVar.f5617e);
                }
                if (i2 == 5) {
                    return Arrays.equals(this.f5618f, fVar.f5618f);
                }
                throw new AssertionError("Invalid enum value: " + i2);
            }
        }
        return false;
    }

    public final byte[] f() {
        if (this.f5619g != 5) {
            throw new IllegalArgumentException("Not a bytes type");
        }
        byte[] bArr = this.f5618f;
        av.m(bArr);
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.f5613a;
        boolean zB = g.b(str);
        int iD = bb.d(parcel);
        if (!zB) {
            bb.u(parcel, 2, str);
        }
        long j2 = this.f5614b;
        if (j2 != 0) {
            bb.h(parcel, 3, j2);
        }
        if (this.f5615c) {
            bb.f(parcel, 4, true);
        }
        double d2 = this.f5616d;
        if (d2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
            bb.n(parcel, d2);
        }
        String str2 = this.f5617e;
        if (!g.b(str2)) {
            bb.u(parcel, 6, str2);
        }
        byte[] bArr = this.f5618f;
        if (!g.b(bArr)) {
            bb.l(parcel, 7, bArr);
        }
        int i3 = this.f5619g;
        if (!g.a(i3)) {
            bb.g(parcel, 8, i3);
        }
        int i4 = this.f5620h;
        if (!g.a(i4)) {
            bb.g(parcel, 9, i4);
        }
        int i5 = this.f5621i;
        if (!g.a(i5)) {
            bb.g(parcel, 10, i5);
        }
        bb.e(parcel, iD);
    }
}
