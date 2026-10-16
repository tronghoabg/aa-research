package xf;

import pf.AbstractC3794a;
import yf.C4595a;

/* renamed from: xf.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4516d {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC4513a f47897a;

    static {
        Integer num = AbstractC3794a.f43610a;
        f47897a = (num == null || num.intValue() >= 34) ? new C4595a() : new C4514b();
    }

    public abstract int a(int i5);

    public abstract int b();

    public int c() {
        int iB;
        int i5;
        do {
            iB = b() >>> 1;
            i5 = iB % 99999998;
        } while ((iB - i5) + 99999997 < 0);
        return 1 + i5;
    }

    public abstract long d();

    public long e(long j8) {
        return f(0L, j8);
    }

    public long f(long j8, long j10) {
        long jD;
        long j11;
        long jA;
        int iB;
        if (j10 <= j8) {
            throw new IllegalArgumentException(("Random range is empty: [" + Long.valueOf(j8) + ", " + Long.valueOf(j10) + ").").toString());
        }
        long j12 = j10 - j8;
        if (j12 > 0) {
            if (((-j12) & j12) == j12) {
                int i5 = (int) j12;
                int i10 = (int) (j12 >>> 32);
                if (i5 != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i5));
                } else if (i10 == 1) {
                    iB = b();
                } else {
                    jA = (a(31 - Integer.numberOfLeadingZeros(i10)) << 32) + (4294967295L & b());
                }
                jA = iB & 4294967295L;
            } else {
                do {
                    jD = d() >>> 1;
                    j11 = jD % j12;
                } while ((j12 - 1) + (jD - j11) < 0);
                jA = j11;
            }
            return j8 + jA;
        }
        while (true) {
            long jD2 = d();
            if (j8 <= jD2 && jD2 < j10) {
                return jD2;
            }
        }
    }
}
