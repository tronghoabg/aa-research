package k2;

import N1.C0773w;

/* renamed from: k2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3142D extends o0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f38895l;

    /* renamed from: m, reason: collision with root package name */
    public final N1.M f38896m;

    /* renamed from: n, reason: collision with root package name */
    public final N1.L f38897n;

    /* renamed from: o, reason: collision with root package name */
    public C3140B f38898o;

    /* renamed from: p, reason: collision with root package name */
    public C3139A f38899p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38900q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38901r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f38902s;

    public C3142D(AbstractC3144a abstractC3144a, boolean z2) {
        super(abstractC3144a);
        this.f38895l = z2 && abstractC3144a.i();
        this.f38896m = new N1.M();
        this.f38897n = new N1.L();
        N1.N nG = abstractC3144a.g();
        if (nG == null) {
            this.f38898o = new C3140B(new C3141C(abstractC3144a.h()), N1.M.f8055q, C3140B.f38891e);
        } else {
            this.f38898o = new C3140B(nG, null, null);
            this.f38902s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // k2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(N1.N r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3142D.B(N1.N):void");
    }

    @Override // k2.o0
    public final void C() {
        if (this.f38895l) {
            return;
        }
        this.f38900q = true;
        y(null, this.k);
    }

    @Override // k2.AbstractC3144a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C3139A b(H h10, o2.e eVar, long j8) {
        C3139A c3139a = new C3139A(h10, eVar, j8);
        Q1.k.g(c3139a.f38887d == null);
        AbstractC3144a abstractC3144a = this.k;
        c3139a.f38887d = abstractC3144a;
        if (!this.f38901r) {
            this.f38899p = c3139a;
            if (!this.f38900q) {
                this.f38900q = true;
                y(null, abstractC3144a);
            }
            return c3139a;
        }
        Object obj = this.f38898o.f38893d;
        Object obj2 = h10.f38903a;
        if (obj != null && obj2.equals(C3140B.f38891e)) {
            obj2 = this.f38898o.f38893d;
        }
        c3139a.g(h10.a(obj2));
        return c3139a;
    }

    public final boolean F(long j8) {
        C3139A c3139a = this.f38899p;
        int iB = this.f38898o.b(c3139a.f38884a.f38903a);
        if (iB == -1) {
            return false;
        }
        C3140B c3140b = this.f38898o;
        N1.L l10 = this.f38897n;
        c3140b.f(iB, l10, false);
        long j10 = l10.f8051d;
        if (j10 != -9223372036854775807L && j8 >= j10) {
            j8 = Math.max(0L, j10 - 1);
        }
        c3139a.f38890g = j8;
        return true;
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        C3139A c3139a = (C3139A) f10;
        if (c3139a.f38888e != null) {
            AbstractC3144a abstractC3144a = c3139a.f38887d;
            abstractC3144a.getClass();
            abstractC3144a.n(c3139a.f38888e);
        }
        if (f10 == this.f38899p) {
            this.f38899p = null;
        }
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void p() {
        this.f38901r = false;
        this.f38900q = false;
        super.p();
    }

    @Override // k2.o0, k2.AbstractC3144a
    public final void s(C0773w c0773w) {
        if (this.f38902s) {
            C3140B c3140b = this.f38898o;
            this.f38898o = new C3140B(new U1.U(this.f38898o.f39170b, c0773w), c3140b.f38892c, c3140b.f38893d);
        } else {
            this.f38898o = new C3140B(new C3141C(c0773w), N1.M.f8055q, C3140B.f38891e);
        }
        this.k.s(c0773w);
    }

    @Override // k2.o0
    public final H z(H h10) {
        Object obj = h10.f38903a;
        Object obj2 = this.f38898o.f38893d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C3140B.f38891e;
        }
        return h10.a(obj);
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void j() {
    }
}
