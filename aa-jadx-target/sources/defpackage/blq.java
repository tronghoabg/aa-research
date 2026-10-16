package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blq implements defpackage.beq {
    final /* synthetic */ defpackage.blw a;
    final /* synthetic */ boolean b;

    public blq(defpackage.blw blwVar, boolean z) {
        this.a = blwVar;
        this.b = z;
    }

    @Override // defpackage.beq
    public final void b(long j) {
        defpackage.blw blwVar = this.a;
        long jAh = defpackage.a.ah(blwVar.m, j);
        blwVar.m = jAh;
        blwVar.n(new defpackage.cji(defpackage.a.ah(blwVar.k, jAh)));
        defpackage.dkd dkdVarF = blwVar.f();
        defpackage.cji cjiVarD = blwVar.d();
        cjiVarD.getClass();
        blwVar.b(dkdVarF, cjiVarD.a, false, this.b, defpackage.bkr.d, true, new defpackage.cpr(9));
        blwVar.t(false);
    }

    @Override // defpackage.beq
    public final void d() {
        defpackage.blw blwVar = this.a;
        blwVar.p(null);
        blwVar.n(null);
        blwVar.t(true);
    }

    @Override // defpackage.beq
    public final void e() {
        defpackage.blw blwVar = this.a;
        blwVar.p(null);
        blwVar.n(null);
        blwVar.t(true);
    }

    @Override // defpackage.beq
    public final void f() {
        defpackage.bfi bfiVarE;
        boolean z = this.b;
        defpackage.bdy bdyVar = z ? defpackage.bdy.b : defpackage.bdy.c;
        defpackage.blw blwVar = this.a;
        blwVar.p(bdyVar);
        long jA = defpackage.ble.a(blwVar.a(z));
        defpackage.beg begVar = blwVar.d;
        if (begVar == null || (bfiVarE = begVar.e()) == null) {
            return;
        }
        long jC = bfiVarE.c(jA);
        blwVar.k = jC;
        blwVar.n(new defpackage.cji(jC));
        blwVar.m = 0L;
        blwVar.B = -1;
        defpackage.beg begVar2 = blwVar.d;
        if (begVar2 != null) {
            begVar2.j(true);
        }
        blwVar.t(false);
    }

    @Override // defpackage.beq
    public final void a() {
    }

    @Override // defpackage.beq
    public final void c(long j, defpackage.bks bksVar) {
    }
}
