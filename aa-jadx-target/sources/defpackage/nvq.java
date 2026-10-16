package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nvq extends defpackage.lhm {
    public static final defpackage.nvo a = new defpackage.nvo();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.NDirector");
    public static final defpackage.afhl c = new defpackage.nfw(defpackage.mkp.b, 5);
    public final defpackage.nwy d;
    public final defpackage.eqp e;
    public final defpackage.eqp f;
    public ajnd g;
    private final defpackage.eqp h;
    private final defpackage.nvs i;
    private final defpackage.nuy k;

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public /* synthetic */ nvq(byte[] bArr) throws wfo {
        defpackage.eqp eqsVar;
        defpackage.yqm yqmVar = defpackage.mpj.a;
        defpackage.mpi mpiVar = ((defpackage.mpj) defpackage.mkp.a.i(defpackage.mpj.class)).h;
        defpackage.nvx nvxVar = new defpackage.nvx();
        android.content.ComponentName componentName = defpackage.nye.a;
        defpackage.eqs eqsVar2 = ((defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class)).b;
        defpackage.eqp eqpVarE = defpackage.mps.e();
        defpackage.nwy nwyVarA = defpackage.nwy.a();
        if (defpackage.leh.a.a().f()) {
            eqsVar = defpackage.muj.h.a().c();
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            defpackage.afdo afdoVar = defpackage.tcu.a;
            eqsVar = new defpackage.eqs(bool);
        }
        eqsVar.getClass();
        this.h = eqpVarE;
        this.d = nwyVarA;
        defpackage.yqm yqmVar2 = defpackage.nvv.a;
        eqpVarE.getClass();
        defpackage.eqp eqpVarG = defpackage.tcu.g(mpiVar, nvxVar, eqsVar2, eqpVarE, eqsVar, new defpackage.nvu());
        this.e = eqpVarG;
        int i = defpackage.nuz.b;
        defpackage.wfp.c();
        defpackage.nvs nvsVar = new defpackage.nvs(((defpackage.nuz) defpackage.mkp.a.i(defpackage.nuz.class)).a(), defpackage.ogm.a.a().d, eqpVarG);
        this.i = nvsVar;
        this.f = defpackage.ebo.f(nvsVar, new defpackage.nkn(14));
        nvsVar.eM(this, new defpackage.kku(new defpackage.nnp(this, 8), 8));
        this.k = new defpackage.nvp(this);
    }

    public static final defpackage.nvq a() {
        return a.a();
    }

    public final boolean b() {
        java.lang.Boolean bool = (java.lang.Boolean) this.h.e();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        defpackage.nuz.b().k(this.k);
    }

    public final void e(ajnd ajndVar) {
        b.l().y("setMediaHunListener l=%s", ajndVar);
        if (ajndVar == null) {
            ajndVar = null;
        } else {
            ajnd ajndVar2 = this.g;
            if (ajndVar2 != null) {
                defpackage.rox.n("GH.NDirector", "Tried to register a MediaHunListener when one was already set, current=%s new=%s", ajndVar2, ajndVar);
                throw new defpackage.afap();
            }
        }
        this.g = ajndVar;
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        defpackage.nuz.b().f(this.k);
    }

    public nvq() {
        this(null);
    }
}
