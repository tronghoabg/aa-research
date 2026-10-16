package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ncx implements defpackage.lhn {
    public final defpackage.eqp e;
    private final defpackage.eqp f;
    private final defpackage.eqp g;
    private final defpackage.eqp h;
    private final defpackage.eqp i;
    private final defpackage.eqp j;
    private final defpackage.afhl k;
    static final /* synthetic */ defpackage.afja[] b = {new defpackage.afgn(defpackage.ncx.class, "stateMachine", "getStateMachine()Lcom/google/android/apps/auto/components/system/dashboard/navsuggestions/NavigationSuggestionsStateMachine;", 0)};
    public static final defpackage.ncw a = new defpackage.ncw();
    public static final defpackage.yqm c = defpackage.yqm.c("GH.NavSugManager");
    public static final defpackage.afhl d = new defpackage.lco(defpackage.mkp.b, 17);

    public ncx() {
        defpackage.eqp eqpVarA = defpackage.lhe.b().a(defpackage.mqg.NAVIGATION);
        eqpVarA.getClass();
        this.f = eqpVarA;
        defpackage.eqp eqpVarA2 = defpackage.luq.a().a();
        defpackage.eqp eqpVarB = defpackage.luq.a().b();
        eqpVarB.getClass();
        defpackage.eqp eqpVarD = defpackage.tcu.d(eqpVarA2, eqpVarB, new defpackage.ncv(1));
        this.g = eqpVarD;
        defpackage.eqp eqpVarD2 = defpackage.tcu.d(eqpVarA, defpackage.moj.a().a, new defpackage.ncv(0));
        this.h = eqpVarD2;
        defpackage.eqp eqpVarV = defpackage.tcu.v(eqpVarD2, new defpackage.nck(2));
        this.i = eqpVarV;
        defpackage.eqp eqpVarV2 = defpackage.tcu.v(eqpVarA, new defpackage.nck(3));
        this.j = eqpVarV2;
        this.e = defpackage.tcu.s(eqpVarV2, eqpVarV, eqpVarD);
        this.k = new defpackage.lib(new defpackage.nck(4), new defpackage.lhu(true));
    }

    public final defpackage.ndd a() {
        return (defpackage.ndd) this.k.getValue(this, b[0]);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.ndd nddVarA = a();
        defpackage.nck nckVar = new defpackage.nck(5);
        defpackage.eqp eqpVar = this.f;
        defpackage.eqp eqpVarB = defpackage.tcu.B(eqpVar, nckVar);
        nddVarA.b(new defpackage.ndk(null), "starting");
        java.lang.Object obj = nddVarA.b;
        defpackage.eqp eqpVar2 = this.e;
        defpackage.eqr eqrVar = (defpackage.eqr) obj;
        eqrVar.r(eqpVar, new defpackage.mel(new ncy(eqpVar, eqpVar2, eqpVarB, nddVarA, 0), 17));
        eqrVar.r(eqpVar2, new defpackage.mel(new ncy(eqpVar, eqpVar2, eqpVarB, nddVarA, 2), 17));
        eqrVar.r(eqpVarB, new defpackage.mel(new ncy(eqpVar, eqpVar2, eqpVarB, nddVarA, 3), 17));
    }

    @Override // defpackage.lhn
    public final void d() {
    }
}
