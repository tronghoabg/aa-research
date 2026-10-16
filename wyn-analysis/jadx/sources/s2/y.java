package s2;

import N1.C0764m;
import Va.M6;
import com.applovin.shadow.okio.Segment;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class y implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f44940a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44941b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44942c;

    /* renamed from: d, reason: collision with root package name */
    public int f44943d;

    /* renamed from: e, reason: collision with root package name */
    public int f44944e;

    /* renamed from: f, reason: collision with root package name */
    public o f44945f;

    /* renamed from: g, reason: collision with root package name */
    public C f44946g;

    public y(int i5, int i10, String str) {
        this.f44940a = i5;
        this.f44941b = i10;
        this.f44942c = str;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        if (j8 == 0 || this.f44944e == 1) {
            this.f44944e = 1;
            this.f44943d = 0;
        }
    }

    @Override // s2.m
    public final void g(o oVar) {
        this.f44945f = oVar;
        C cMo0m = oVar.mo0m(Segment.SHARE_MINIMUM, 4);
        this.f44946g = cMo0m;
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m(this.f44942c);
        M6.y(c0764m, cMo0m);
        this.f44945f.l();
        this.f44945f.s(new z());
        this.f44944e = 1;
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        int i5 = this.f44941b;
        int i10 = this.f44940a;
        Q1.k.g((i10 == -1 || i5 == -1) ? false : true);
        Q1.o oVar = new Q1.o(i5);
        ((j) nVar).c(oVar.f9702a, 0, i5, false);
        return oVar.A() == i10;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    @Override // s2.m
    public final int k(n nVar, J5.n nVar2) {
        int i5 = this.f44944e;
        if (i5 != 1) {
            if (i5 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        C c10 = this.f44946g;
        c10.getClass();
        int iD = c10.d(nVar, Segment.SHARE_MINIMUM, true);
        if (iD != -1) {
            this.f44943d += iD;
            return 0;
        }
        this.f44944e = 2;
        this.f44946g.a(0L, 1, this.f44943d, 0, null);
        this.f44943d = 0;
        return 0;
    }

    @Override // s2.m
    public final void release() {
    }
}
