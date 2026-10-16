package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adw extends defpackage.cge implements defpackage.cwu {
    public defpackage.agi a;
    public defpackage.acw b;
    public defpackage.acx c;
    public defpackage.adi d;

    public adw(defpackage.agi agiVar, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.adi adiVar) {
        this.a = agiVar;
        this.b = acwVar;
        this.c = acxVar;
        this.d = adiVar;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        cxnVar.q();
        defpackage.agi agiVar = this.a;
        defpackage.act actVar = new defpackage.act(this, 3);
        defpackage.adi adiVar = this.d;
        defpackage.bys bysVarB = agiVar.b(actVar, adiVar.h() ? new defpackage.ckd(adiVar.b) : null, null, new defpackage.adv(this, 0));
        defpackage.adi adiVar2 = this.d;
        long jD = ((defpackage.ckd) bysVarB.a()).a;
        adiVar2.j = jD;
        if (adiVar2.i()) {
            defpackage.cyx cyxVar = adiVar2.r;
            if (cyxVar.i()) {
                defpackage.add addVarA = adiVar2.a();
                defpackage.add addVar = defpackage.add.c;
                if (addVarA == addVar && adiVar2.e().j()) {
                    jD = ((defpackage.ckd) adiVar2.e().d()).a;
                } else if (adiVar2.a() == addVar || adiVar2.a() == defpackage.add.d) {
                    jD = cyxVar.d();
                }
            }
        }
        long j = jD;
        if (adiVar2.i()) {
            adiVar2.b = j;
        }
        if (defpackage.ckd.a(j) == 0.0f) {
            return;
        }
        defpackage.ack ackVar = this.b.b;
        defpackage.adt adtVar = this.c.b.e;
        defpackage.dai.U(cxnVar, j, 0L, 0L, 0.0f, null, 126);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
