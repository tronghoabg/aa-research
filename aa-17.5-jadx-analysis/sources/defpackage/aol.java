package defpackage;

/* loaded from: classes.dex */
public final class aol extends aoe {
    public boolean a;
    public afeh b;
    public afeh c;
    public boolean i;
    public bqj j;

    public aol(bqj bqjVar, afec afecVar, api apiVar, boolean z, asf asfVar, boolean z2, afeh afehVar, afeh afehVar2, boolean z3) {
        super(afecVar, z, asfVar, apiVar);
        this.j = bqjVar;
        this.a = z2;
        this.b = afehVar;
        this.c = afehVar2;
        this.i = z3;
    }

    @Override // defpackage.aoe
    public final Object ee(afeg afegVar, afck afckVar) {
        api apiVar = this.d;
        if (apiVar != null) {
            Object objA = ahni.a(new bqi(this.j, akq.b, new bhz(afegVar, this, apiVar, (afck) null, 1), (afck) null, 0), afckVar);
            afcr afcrVar = afcr.a;
            if (objA != afcrVar) {
                objA = afak.a;
            }
            if (objA == afcrVar) {
                return objA;
            }
        }
        return afak.a;
    }

    @Override // defpackage.aoe
    public final void ef(anr anrVar) {
        api apiVar;
        if (!this.A || affa.f(this.c, aoi.b) || (apiVar = this.d) == null) {
            return;
        }
        ahnc.d(N(), null, 4, new aok(this, anrVar, apiVar, null), 1);
    }

    @Override // defpackage.aoe
    public final void j(long j) {
        if (!this.A || affa.f(this.b, aoi.a)) {
            return;
        }
        ahnc.d(N(), null, 4, new aoj(this, j, null), 1);
    }

    @Override // defpackage.aoe
    public final boolean k() {
        return this.a;
    }
}
