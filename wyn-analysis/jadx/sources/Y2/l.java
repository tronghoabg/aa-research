package Y2;

import s2.C;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f16481l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final B f16482a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.o f16483b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f16484c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final k f16485d;

    /* renamed from: e, reason: collision with root package name */
    public final T5.s f16486e;

    /* renamed from: f, reason: collision with root package name */
    public T5.j f16487f;

    /* renamed from: g, reason: collision with root package name */
    public long f16488g;

    /* renamed from: h, reason: collision with root package name */
    public String f16489h;

    /* renamed from: i, reason: collision with root package name */
    public C f16490i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16491j;
    public long k;

    public l(B b5) {
        this.f16482a = b5;
        k kVar = new k();
        kVar.f16480e = new byte[128];
        this.f16485d = kVar;
        this.k = -9223372036854775807L;
        this.f16486e = new T5.s(178, 1);
        this.f16483b = new Q1.o();
    }

    @Override // Y2.h
    public final void a() {
        R1.n.a(this.f16484c);
        k kVar = this.f16485d;
        kVar.f16476a = false;
        kVar.f16478c = 0;
        kVar.f16477b = 0;
        T5.j jVar = this.f16487f;
        if (jVar != null) {
            jVar.f11562b = false;
            jVar.f11563c = false;
            jVar.f11564d = false;
            jVar.f11565e = -1;
        }
        T5.s sVar = this.f16486e;
        if (sVar != null) {
            sVar.d();
        }
        this.f16488g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // Y2.h
    public final void d(int i5, long j8) {
        this.k = j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243  */
    @Override // Y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Q1.o r22) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.l.e(Q1.o):void");
    }

    @Override // Y2.h
    public final void f(s2.o oVar, T5.B b5) {
        b5.a();
        b5.b();
        this.f16489h = b5.f11474f;
        b5.b();
        C cMo0m = oVar.mo0m(b5.f11473e, 2);
        this.f16490i = cMo0m;
        this.f16487f = new T5.j(cMo0m, 1);
        this.f16482a.n(oVar, b5);
    }

    @Override // Y2.h
    public final void h(boolean z2) {
        Q1.k.h(this.f16487f);
        if (z2) {
            this.f16487f.b(this.f16488g, 0, this.f16491j);
            T5.j jVar = this.f16487f;
            jVar.f11562b = false;
            jVar.f11563c = false;
            jVar.f11564d = false;
            jVar.f11565e = -1;
        }
    }
}
