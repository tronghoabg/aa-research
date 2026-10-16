package Y2;

import s2.C;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f16459q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f16460a;

    /* renamed from: b, reason: collision with root package name */
    public C f16461b;

    /* renamed from: c, reason: collision with root package name */
    public final B f16462c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.o f16463d;

    /* renamed from: e, reason: collision with root package name */
    public final T5.s f16464e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16465f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final i f16466g;

    /* renamed from: h, reason: collision with root package name */
    public long f16467h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16468i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16469j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f16470l;

    /* renamed from: m, reason: collision with root package name */
    public long f16471m;

    /* renamed from: n, reason: collision with root package name */
    public long f16472n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16473o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16474p;

    public j(B b5) {
        this.f16462c = b5;
        i iVar = new i();
        iVar.f16458d = new byte[128];
        this.f16466g = iVar;
        if (b5 != null) {
            this.f16464e = new T5.s(178, 1);
            this.f16463d = new Q1.o();
        } else {
            this.f16464e = null;
            this.f16463d = null;
        }
        this.f16470l = -9223372036854775807L;
        this.f16472n = -9223372036854775807L;
    }

    @Override // Y2.h
    public final void a() {
        R1.n.a(this.f16465f);
        i iVar = this.f16466g;
        iVar.f16455a = false;
        iVar.f16456b = 0;
        iVar.f16457c = 0;
        T5.s sVar = this.f16464e;
        if (sVar != null) {
            sVar.d();
        }
        this.f16467h = 0L;
        this.f16468i = false;
        this.f16470l = -9223372036854775807L;
        this.f16472n = -9223372036854775807L;
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.f16470l = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    @Override // Y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Q1.o r29) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.j.e(Q1.o):void");
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16460a = b5.f11474f;
        b5.b();
        this.f16461b = oVar.mo0m(b5.f11473e, 2);
        B b10 = this.f16462c;
        if (b10 != null) {
            b10.n(oVar, b5);
        }
    }

    @Override // Y2.h
    public final void h(boolean z2) {
        Q1.k.h(this.f16461b);
        if (z2) {
            boolean z10 = this.f16473o;
            this.f16461b.a(this.f16472n, z10 ? 1 : 0, (int) (this.f16467h - this.f16471m), 0, null);
        }
    }
}
