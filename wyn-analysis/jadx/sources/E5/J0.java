package E5;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public abstract class J0 implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public static final G0 f3127a = new G0();

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

    public final int d(int i5, H0 h02, I0 i02, int i10, boolean z2) {
        int i11 = f(i5, h02, false).f3041c;
        if (m(i11, i02, 0L).f3123o != i5) {
            return i5 + 1;
        }
        int iE = e(i11, i10, z2);
        if (iE == -1) {
            return -1;
        }
        return m(iE, i02, 0L).f3122n;
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
            if (obj instanceof J0) {
                J0 j02 = (J0) obj;
                if (j02.o() == o() && j02.h() == h()) {
                    I0 i02 = new I0();
                    H0 h02 = new H0();
                    I0 i03 = new I0();
                    H0 h03 = new H0();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= o()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= h()) {
                                    int iA = a(true);
                                    if (iA == j02.a(true) && (iC = c(true)) == j02.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == j02.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i10, h02, true).equals(j02.f(i10, h03, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!m(i5, i02, 0L).equals(j02.m(i5, i03, 0L))) {
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

    public abstract H0 f(int i5, H0 h02, boolean z2);

    public H0 g(Object obj, H0 h02) {
        return f(b(obj), h02, true);
    }

    public abstract int h();

    public final int hashCode() {
        I0 i02 = new I0();
        H0 h02 = new H0();
        int iO = o() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i5 = 0; i5 < o(); i5++) {
            iO = (iO * 31) + m(i5, i02, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            iH = (iH * 31) + f(i10, h02, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(I0 i02, H0 h02, int i5, long j8) {
        Pair pairJ = j(i02, h02, i5, j8, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(I0 i02, H0 h02, int i5, long j8, long j10) {
        AbstractC4256a.h(i5, o());
        m(i5, i02, j10);
        if (j8 == -9223372036854775807L) {
            j8 = i02.f3120l;
            if (j8 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = i02.f3122n;
        f(i10, h02, false);
        while (i10 < i02.f3123o && h02.f3043e != j8) {
            int i11 = i10 + 1;
            if (f(i11, h02, false).f3043e > j8) {
                break;
            }
            i10 = i11;
        }
        f(i10, h02, true);
        long jMin = j8 - h02.f3043e;
        long j11 = h02.f3042d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = h02.f3040b;
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

    public abstract I0 m(int i5, I0 i02, long j8);

    public final void n(int i5, I0 i02) {
        m(i5, i02, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
