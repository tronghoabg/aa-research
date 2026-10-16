package defpackage;

/* loaded from: classes2.dex */
public final class noy implements npl {
    public final kjz a;
    public final kjz b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    private final eqj g;
    private final eqj h;
    private final eqj i;
    private final eqj j;
    private final eqj k;
    private final eqj l;
    private final eqj m;
    private final eqj n;

    public noy(kjz kjzVar, kjz kjzVar2) {
        this.a = kjzVar;
        this.b = kjzVar2;
        kjo kjoVar = kjq.a;
        kjz kjzVar3 = (kjz) woy.bH(jul.e(kjoVar.a().i(), 557940737));
        eqj eqmVar = (kjzVar3 == null || (eqmVar = jul.f(kjzVar3)) == null) ? new eqm(kke.a) : eqmVar;
        this.g = eqmVar;
        eqj eqjVarW = tby.w(jun.e(eqmVar), new nle(17));
        this.h = eqjVarW;
        kjz kjzVar4 = (kjz) woy.bH(jul.e(kjoVar.a().i(), 289408270));
        eqj eqmVar2 = (kjzVar4 == null || (eqmVar2 = jul.f(kjzVar4)) == null) ? new eqm(kke.a) : eqmVar2;
        this.i = eqmVar2;
        eqj eqjVarD = jun.d(eqmVar2, new nle(18));
        this.j = eqjVarD;
        this.c = kjoVar.a().g().c(kjzVar.a);
        this.d = kjoVar.a().g().c(kjzVar2.a);
        this.e = tby.v(eqjVarW, new noo(this, 2));
        this.f = tby.v(eqjVarW, new noo(this, 3));
        eqj eqjVarB = tby.B(jun.e(eqjVarD), new noo(this, 4));
        this.k = eqjVarB;
        this.l = tby.B(eqjVarB, new nle(19));
        this.m = tby.B(eqjVarB, new nle(20));
        this.n = tby.B(eqjVarB, new nox(1));
    }

    @Override // defpackage.npa
    public final eqj a() {
        return tby.B(this.k, new nox(0));
    }

    @Override // defpackage.npl
    public final eqj b() {
        return this.n;
    }

    @Override // defpackage.npl
    public final eqj c() {
        return this.m;
    }

    @Override // defpackage.npl
    public final eqj d() {
        return this.j;
    }

    @Override // defpackage.npl
    public final eqj e() {
        return this.l;
    }

    @Override // defpackage.npl
    public final Object f(afck afckVar) {
        eqj eqjVar = this.k;
        if (!eqjVar.o()) {
            throw new IllegalStateException("`currentState` must be initialized to call decrement()");
        }
        ugn ugnVar = (ugn) eqjVar.e();
        return ugnVar != null ? ugnVar.b(afckVar) : afak.a;
    }

    @Override // defpackage.npl
    public final Object g(afck afckVar) {
        eqj eqjVar = this.k;
        if (!eqjVar.o()) {
            throw new IllegalStateException("`currentState` must be initialized to call increment()");
        }
        ugn ugnVar = (ugn) eqjVar.e();
        return ugnVar != null ? ugnVar.c(afckVar) : afak.a;
    }
}
