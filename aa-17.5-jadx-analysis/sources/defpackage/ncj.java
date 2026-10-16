package defpackage;

/* loaded from: classes.dex */
public final class ncj implements lhg {
    public final eqj e;
    private final eqj f;
    private final eqj g;
    private final eqj h;
    private final eqj i;
    private final eqj j;
    private final afgl k;
    static final /* synthetic */ afia[] b = {new affn(ncj.class, "stateMachine", "getStateMachine()Lcom/google/android/apps/auto/components/system/dashboard/navsuggestions/NavigationSuggestionsStateMachine;", 0)};
    public static final nci a = new nci();
    public static final yph c = yph.c("GH.NavSugManager");
    public static final afgl d = new lcj(mki.b, 18);

    public ncj() {
        eqj eqjVarA = lgx.b().a(mpz.b);
        eqjVarA.getClass();
        this.f = eqjVarA;
        eqj eqjVarA2 = luk.a().a();
        eqj eqjVarB = luk.a().b();
        eqjVarB.getClass();
        eqj eqjVarD = tby.d(eqjVarA2, eqjVarB, new mqe(18));
        this.g = eqjVarD;
        int i = 19;
        eqj eqjVarD2 = tby.d(eqjVarA, mod.a().a, new mqe(i));
        this.h = eqjVarD2;
        eqj eqjVarV = tby.v(eqjVarD2, new nag(i));
        this.i = eqjVarV;
        eqj eqjVarV2 = tby.v(eqjVarA, new nag(20));
        this.j = eqjVarV2;
        this.e = tby.s(eqjVarV2, eqjVarV, eqjVarD);
        this.k = new lhu(new nch(1), new lhn(true));
    }

    public final ncp a() {
        return (ncp) this.k.getValue(this, b[0]);
    }

    @Override // defpackage.lhg
    public final void c() {
        ncp ncpVarA = a();
        nch nchVar = new nch(0);
        eqj eqjVar = this.f;
        eqj eqjVarB = tby.B(eqjVar, nchVar);
        ncpVarA.b(new ncw(null), "starting");
        Object obj = ncpVarA.b;
        eqj eqjVar2 = this.e;
        eql eqlVar = (eql) obj;
        eqlVar.r(eqjVar, new med(new nck(eqjVar, eqjVar2, eqjVarB, ncpVarA, 0), 17));
        eqlVar.r(eqjVar2, new med(new nck(eqjVar, eqjVar2, eqjVarB, ncpVarA, 2), 17));
        eqlVar.r(eqjVarB, new med(new nck(eqjVar, eqjVar2, eqjVarB, ncpVarA, 3), 17));
    }

    @Override // defpackage.lhg
    public final void d() {
    }
}
