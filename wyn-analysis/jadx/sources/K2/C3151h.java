package k2;

import java.util.ArrayList;

/* renamed from: k2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3151h extends o0 {

    /* renamed from: l, reason: collision with root package name */
    public final long f39075l;

    /* renamed from: m, reason: collision with root package name */
    public final long f39076m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39077n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f39078o;

    /* renamed from: p, reason: collision with root package name */
    public final N1.M f39079p;

    /* renamed from: q, reason: collision with root package name */
    public C3149f f39080q;

    /* renamed from: r, reason: collision with root package name */
    public C3150g f39081r;

    /* renamed from: s, reason: collision with root package name */
    public long f39082s;

    /* renamed from: t, reason: collision with root package name */
    public long f39083t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3151h(AbstractC3144a abstractC3144a, long j8, long j10, boolean z2) {
        super(abstractC3144a);
        abstractC3144a.getClass();
        Q1.k.c(j8 >= 0);
        this.f39075l = j8;
        this.f39076m = j10;
        this.f39077n = z2;
        this.f39078o = new ArrayList();
        this.f39079p = new N1.M();
    }

    @Override // k2.o0
    public final void B(N1.N n10) {
        if (this.f39081r != null) {
            return;
        }
        D(n10);
    }

    public final void D(N1.N n10) {
        long j8;
        N1.M m10 = this.f39079p;
        n10.n(0, m10);
        long j10 = m10.f8071p;
        C3149f c3149f = this.f39080q;
        ArrayList arrayList = this.f39078o;
        long j11 = this.f39076m;
        if (c3149f == null || arrayList.isEmpty()) {
            j8 = this.f39075l;
            this.f39082s = j10 + j8;
            this.f39083t = j11 != Long.MIN_VALUE ? j10 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                C3148e c3148e = (C3148e) arrayList.get(i5);
                long j12 = this.f39082s;
                long j13 = this.f39083t;
                c3148e.f39065e = j12;
                c3148e.f39066f = j13;
            }
        } else {
            j8 = this.f39082s - j10;
            j11 = j11 == Long.MIN_VALUE ? Long.MIN_VALUE : this.f39083t - j10;
        }
        try {
            C3149f c3149f2 = new C3149f(n10, j8, j11);
            this.f39080q = c3149f2;
            m(c3149f2);
        } catch (C3150g e7) {
            this.f39081r = e7;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C3148e) arrayList.get(i10)).f39067g = this.f39081r;
            }
        }
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        C3148e c3148e = new C3148e(this.k.b(h10, eVar, j8), this.f39077n, this.f39082s, this.f39083t);
        this.f39078o.add(c3148e);
        return c3148e;
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void j() throws C3150g {
        C3150g c3150g = this.f39081r;
        if (c3150g != null) {
            throw c3150g;
        }
        super.j();
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        ArrayList arrayList = this.f39078o;
        Q1.k.g(arrayList.remove(f10));
        this.k.n(((C3148e) f10).f39061a);
        if (arrayList.isEmpty()) {
            C3149f c3149f = this.f39080q;
            c3149f.getClass();
            D(c3149f.f39170b);
        }
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void p() {
        super.p();
        this.f39081r = null;
        this.f39080q = null;
    }
}
