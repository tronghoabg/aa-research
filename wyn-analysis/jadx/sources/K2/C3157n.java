package k2;

import java.util.List;
import l8.AbstractC3409K;
import l8.C3406H;

/* renamed from: k2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3157n implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final l8.e0 f39125a;

    /* renamed from: b, reason: collision with root package name */
    public long f39126b;

    public C3157n(List list, List list2) {
        C3406H c3406hI = AbstractC3409K.i();
        Q1.k.c(list.size() == list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            c3406hI.a(new C3156m((f0) list.get(i5), (List) list2.get(i5)));
        }
        this.f39125a = c3406hI.g();
        this.f39126b = -9223372036854775807L;
    }

    @Override // k2.f0
    public final long c() {
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            l8.e0 e0Var = this.f39125a;
            if (i5 >= e0Var.f40103d) {
                break;
            }
            long jC = ((C3156m) e0Var.get(i5)).f39120a.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
            i5++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // k2.f0
    public final boolean e() {
        int i5 = 0;
        while (true) {
            l8.e0 e0Var = this.f39125a;
            if (i5 >= e0Var.f40103d) {
                return false;
            }
            if (((C3156m) e0Var.get(i5)).f39120a.e()) {
                return true;
            }
            i5++;
        }
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        boolean zK;
        boolean z2 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                return z2;
            }
            int i5 = 0;
            zK = false;
            while (true) {
                l8.e0 e0Var = this.f39125a;
                if (i5 >= e0Var.f40103d) {
                    break;
                }
                long jC2 = ((C3156m) e0Var.get(i5)).f39120a.c();
                boolean z10 = jC2 != Long.MIN_VALUE && jC2 <= c10.f11907a;
                if (jC2 == jC || z10) {
                    zK |= ((C3156m) e0Var.get(i5)).f39120a.k(c10);
                }
                i5++;
            }
            z2 |= zK;
        } while (zK);
        return z2;
    }

    @Override // k2.f0
    public final long n() {
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            l8.e0 e0Var = this.f39125a;
            if (i5 >= e0Var.f40103d) {
                break;
            }
            C3156m c3156m = (C3156m) e0Var.get(i5);
            long jN = c3156m.f39120a.n();
            AbstractC3409K abstractC3409K = c3156m.f39121b;
            if ((abstractC3409K.contains(1) || abstractC3409K.contains(2) || abstractC3409K.contains(4)) && jN != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jN);
            }
            if (jN != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jN);
            }
            i5++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f39126b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j8 = this.f39126b;
        return j8 != -9223372036854775807L ? j8 : jMin2;
    }

    @Override // k2.f0
    public final void o(long j8) {
        int i5 = 0;
        while (true) {
            l8.e0 e0Var = this.f39125a;
            if (i5 >= e0Var.f40103d) {
                return;
            }
            ((C3156m) e0Var.get(i5)).o(j8);
            i5++;
        }
    }
}
