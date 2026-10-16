package com.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    private volatile com.b.b.d.v f2604a;

    /* renamed from: b, reason: collision with root package name */
    private k f2605b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f2606c;

    /* renamed from: d, reason: collision with root package name */
    private final com.b.b.b f2607d;

    /* renamed from: e, reason: collision with root package name */
    private final aa f2608e;

    public q(aa aaVar, aa aaVar2) {
        p pVar = new p(this);
        this.f2607d = pVar;
        this.f2608e = aaVar;
        this.f2606c = aaVar2;
        aaVar.l(pVar);
    }

    static /* bridge */ /* synthetic */ com.b.b.a.a.a j(com.b.b.c.c cVar, String str) {
        String strB;
        try {
            strB = cVar.b();
        } catch (com.b.b.c.b e2) {
            strB = String.format("Could not parse error details: %s", e2.getMessage());
        }
        return new com.b.b.a.a.a(strB, str);
    }

    @Override // com.b.b.a.n
    public final b a(String str, Class cls) {
        y yVarB = this.f2606c.b(cls);
        try {
            this.f2608e.n(yVarB.f2615a.a(), str);
        } catch (com.b.b.b.a e2) {
            yVarB.f2616b.e(e2);
        }
        return yVarB.f2616b;
    }

    @Override // com.b.b.a.n
    public final b b(String str, Object obj, Class cls) {
        y yVarB = this.f2606c.b(cls);
        try {
            this.f2608e.o(yVarB.f2615a.a(), str, obj);
        } catch (com.b.b.b.a e2) {
            yVarB.f2616b.e(e2);
        }
        return yVarB.f2616b;
    }

    @Override // com.b.b.a.n
    public final x c(String str, Class cls) {
        z zVarI = this.f2606c.i(cls);
        try {
            this.f2608e.p(zVarI.f2618a.a(), str);
        } catch (com.b.b.b.a e2) {
            zVarI.f2619b.e(e2);
        }
        return zVarI.f2619b;
    }

    public final b d(Class cls) {
        y yVarB = this.f2606c.b(cls);
        this.f2604a = yVarB.f2615a;
        try {
            this.f2608e.k();
        } catch (com.b.b.b.a e2) {
            this.f2606c.g(this.f2604a);
            yVarB.f2616b.e(e2);
        }
        return yVarB.f2616b;
    }

    @Override // com.b.b.a.n
    public final void e() {
        try {
            this.f2608e.j();
        } catch (com.b.b.b.a unused) {
        }
    }

    public final void i(k kVar) {
        this.f2605b = kVar;
    }
}
