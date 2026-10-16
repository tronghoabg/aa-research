package N1;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final K f8072a = new K();

    static {
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(2);
    }

    public int a(boolean z2) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z2) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i5, L l10, M m10, int i10, boolean z2) {
        int i11 = f(i5, l10, false).f8050c;
        if (m(i11, m10, 0L).f8070o != i5) {
            return i5 + 1;
        }
        int iE = e(i11, i10, z2);
        if (iE == -1) {
            return -1;
        }
        return m(iE, m10, 0L).f8069n;
    }

    public int e(int i5, int i10, boolean z2) {
        if (i10 == 0) {
            if (i5 == c(z2)) {
                return -1;
            }
            return i5 + 1;
        }
        if (i10 == 1) {
            return i5;
        }
        if (i10 == 2) {
            return i5 == c(z2) ? a(z2) : i5 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof N) {
                N n10 = (N) obj;
                if (n10.o() == o() && n10.h() == h()) {
                    M m10 = new M();
                    L l10 = new L();
                    M m11 = new M();
                    L l11 = new L();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= o()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= h()) {
                                    int iA = a(true);
                                    if (iA == n10.a(true) && (iC = c(true)) == n10.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == n10.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i10, l10, true).equals(n10.f(i10, l11, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!m(i5, m10, 0L).equals(n10.m(i5, m11, 0L))) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract L f(int i5, L l10, boolean z2);

    public L g(Object obj, L l10) {
        return f(b(obj), l10, true);
    }

    public abstract int h();

    public final int hashCode() {
        M m10 = new M();
        L l10 = new L();
        int iO = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i5 = 0; i5 < o(); i5++) {
            iO = (iO * 31) + m(i5, m10, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            iH = (iH * 31) + f(i10, l10, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(M m10, L l10, int i5, long j8) {
        Pair pairJ = j(m10, l10, i5, j8, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(M m10, L l10, int i5, long j8, long j10) {
        Q1.k.e(i5, o());
        m(i5, m10, j10);
        if (j8 == -9223372036854775807L) {
            j8 = m10.f8067l;
            if (j8 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = m10.f8069n;
        f(i10, l10, false);
        while (i10 < m10.f8070o && l10.f8052e != j8) {
            int i11 = i10 + 1;
            if (f(i11, l10, false).f8052e > j8) {
                break;
            }
            i10 = i11;
        }
        f(i10, l10, true);
        long jMin = j8 - l10.f8052e;
        long j11 = l10.f8051d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = l10.f8049b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i5, int i10, boolean z2) {
        if (i10 == 0) {
            if (i5 == a(z2)) {
                return -1;
            }
            return i5 - 1;
        }
        if (i10 == 1) {
            return i5;
        }
        if (i10 == 2) {
            return i5 == a(z2) ? c(z2) : i5 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i5);

    public abstract M m(int i5, M m10, long j8);

    public final void n(int i5, M m10) {
        m(i5, m10, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
