package com.google.d.d;

import androidx.media3.muxer.MuxerUtil;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ep {

    /* renamed from: a, reason: collision with root package name */
    transient Object[] f7571a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f7572b;

    /* renamed from: c, reason: collision with root package name */
    transient int f7573c;

    /* renamed from: d, reason: collision with root package name */
    transient int f7574d;

    /* renamed from: e, reason: collision with root package name */
    transient long[] f7575e;

    /* renamed from: f, reason: collision with root package name */
    private transient int[] f7576f;

    /* renamed from: g, reason: collision with root package name */
    private transient float f7577g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f7578h;

    ep(ep epVar) {
        i(epVar.f7573c);
        int iA = epVar.a();
        while (iA != -1) {
            j(epVar.f(iA), epVar.c(iA));
            iA = epVar.e(iA);
        }
    }

    private static int k(long j2) {
        return (int) (j2 >>> 32);
    }

    private final int l() {
        return this.f7576f.length - 1;
    }

    private final void m(int i2) {
        if (this.f7576f.length >= 1073741824) {
            this.f7578h = Integer.MAX_VALUE;
            return;
        }
        float f2 = i2 * this.f7577g;
        int[] iArrN = n(i2);
        long[] jArr = this.f7575e;
        int length = iArrN.length;
        for (int i3 = 0; i3 < this.f7573c; i3++) {
            int iK = k(jArr[i3]);
            int i4 = (length - 1) & iK;
            int i5 = iArrN[i4];
            iArrN[i4] = i3;
            jArr[i3] = (iK << 32) | (i5 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        this.f7578h = ((int) f2) + 1;
        this.f7576f = iArrN;
    }

    private static int[] n(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    final int a() {
        return this.f7573c == 0 ? -1 : 0;
    }

    public final int b(Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return 0;
        }
        return this.f7572b[iD];
    }

    final int c(int i2) {
        com.google.d.b.an.A(i2, this.f7573c);
        return this.f7572b[i2];
    }

    final int d(Object obj) {
        int iW = fo.W(obj);
        int i2 = this.f7576f[l() & iW];
        while (i2 != -1) {
            long j2 = this.f7575e[i2];
            if (k(j2) == iW && Objects.equals(obj, this.f7571a[i2])) {
                return i2;
            }
            i2 = (int) j2;
        }
        return -1;
    }

    final int e(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f7573c) {
            return i3;
        }
        return -1;
    }

    final Object f(int i2) {
        com.google.d.b.an.A(i2, this.f7573c);
        return this.f7571a[i2];
    }

    final void g(int i2) {
        if (i2 > this.f7575e.length) {
            h(i2);
        }
        if (i2 >= this.f7578h) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            m(Math.max(2, iHighestOneBit + iHighestOneBit));
        }
    }

    final void h(int i2) {
        this.f7571a = Arrays.copyOf(this.f7571a, i2);
        this.f7572b = Arrays.copyOf(this.f7572b, i2);
        long[] jArr = this.f7575e;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.f7575e = jArrCopyOf;
    }

    final void i(int i2) {
        com.google.d.b.an.m(i2 >= 0, "Initial capacity must be non-negative");
        com.google.d.b.an.m(true, "Illegal load factor");
        int iX = fo.X(i2);
        this.f7576f = n(iX);
        this.f7577g = 1.0f;
        this.f7571a = new Object[i2];
        this.f7572b = new int[i2];
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        this.f7575e = jArr;
        this.f7578h = Math.max(1, iX);
    }

    public final void j(Object obj, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("count must be positive but was: " + i2);
        }
        long[] jArr = this.f7575e;
        Object[] objArr = this.f7571a;
        int[] iArr = this.f7572b;
        int iW = fo.W(obj);
        int iL = l() & iW;
        int i3 = this.f7573c;
        int[] iArr2 = this.f7576f;
        int i4 = iArr2[iL];
        if (i4 == -1) {
            iArr2[iL] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (k(j2) == iW && Objects.equals(obj, objArr[i4])) {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return;
                } else {
                    int i6 = (int) j2;
                    if (i6 == -1) {
                        jArr[i4] = ((-4294967296L) & j2) | (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
                        break;
                    }
                    i4 = i6;
                }
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i3 + 1;
        int length = this.f7575e.length;
        if (i7 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            int i8 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i8 != length) {
                h(i8);
            }
        }
        this.f7575e[i3] = (iW << 32) | MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        this.f7571a[i3] = obj;
        this.f7572b[i3] = i2;
        this.f7573c = i7;
        if (i3 >= this.f7578h) {
            int length2 = this.f7576f.length;
            m(length2 + length2);
        }
        this.f7574d++;
    }

    ep(int i2) {
        i(i2);
    }

    ep() {
        i(3);
    }
}
