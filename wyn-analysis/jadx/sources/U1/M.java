package U1;

import E5.n0;
import android.util.Pair;
import java.io.IOException;
import k2.C3168z;

/* loaded from: classes.dex */
public final class M implements k2.M, Z1.e {

    /* renamed from: a, reason: collision with root package name */
    public final O f11966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f11967b;

    public M(n0 n0Var, O o7) {
        this.f11967b = n0Var;
        this.f11966a = o7;
    }

    @Override // k2.M
    public final void B(int i5, k2.H h10, h2.g gVar) {
        Pair pairA = a(i5, h10);
        if (pairA != null) {
            ((Q1.s) this.f11967b.k).c(new J(this, pairA, gVar, 0));
        }
    }

    @Override // k2.M
    public final void D(int i5, k2.H h10, C3168z c3168z, h2.g gVar) {
        Pair pairA = a(i5, h10);
        if (pairA != null) {
            ((Q1.s) this.f11967b.k).c(new K(this, pairA, c3168z, gVar, 1));
        }
    }

    public final Pair a(int i5, k2.H h10) {
        k2.H hA;
        O o7 = this.f11966a;
        k2.H h11 = null;
        if (h10 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= o7.f11973c.size()) {
                    hA = null;
                    break;
                }
                if (((k2.H) o7.f11973c.get(i10)).f38906d == h10.f38906d) {
                    Object obj = o7.f11972b;
                    int i11 = AbstractC0831a.f12016d;
                    hA = h10.a(Pair.create(obj, h10.f38903a));
                    break;
                }
                i10++;
            }
            if (hA == null) {
                return null;
            }
            h11 = hA;
        }
        return Pair.create(Integer.valueOf(i5 + o7.f11974d), h11);
    }

    @Override // k2.M
    public final void q(int i5, k2.H h10, h2.g gVar) {
        Pair pairA = a(i5, h10);
        if (pairA != null) {
            ((Q1.s) this.f11967b.k).c(new J(this, pairA, gVar, 1));
        }
    }

    @Override // k2.M
    public final void r(int i5, k2.H h10, C3168z c3168z, h2.g gVar) {
        Pair pairA = a(i5, h10);
        if (pairA != null) {
            ((Q1.s) this.f11967b.k).c(new K(this, pairA, c3168z, gVar, 2));
        }
    }

    @Override // k2.M
    public final void s(int i5, k2.H h10, C3168z c3168z, h2.g gVar, IOException iOException, boolean z2) {
        Pair pairA = a(i5, h10);
        if (pairA != null) {
            ((Q1.s) this.f11967b.k).c(new L(this, pairA, c3168z, gVar, iOException, z2, 0));
        }
    }

    @Override // k2.M
    public final void y(int i5, k2.H h10, C3168z c3168z, h2.g gVar) {
        Pair pairA = a(i5, h10);
        if (pairA != null) {
            ((Q1.s) this.f11967b.k).c(new K(this, pairA, c3168z, gVar, 0));
        }
    }
}
