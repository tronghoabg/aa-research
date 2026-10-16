package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class blp implements defpackage.beq {
    final /* synthetic */ defpackage.blw a;

    public blp(defpackage.blw blwVar) {
        this.a = blwVar;
    }

    @Override // defpackage.beq
    public final void b(long j) {
        defpackage.bfi bfiVarE;
        defpackage.kwv kwvVar;
        defpackage.blw blwVar = this.a;
        blwVar.m = defpackage.a.ah(blwVar.m, j);
        defpackage.beg begVar = blwVar.d;
        if (begVar == null || (bfiVarE = begVar.e()) == null) {
            return;
        }
        blwVar.n(new defpackage.cji(defpackage.a.ah(blwVar.k, blwVar.m)));
        defpackage.djv djvVar = blwVar.b;
        defpackage.cji cjiVarD = blwVar.d();
        cjiVarD.getClass();
        int iB = djvVar.b(bfiVarE.a(cjiVarD.a, true));
        long jG = defpackage.dax.g(iB, iB);
        long j2 = defpackage.dgc.a;
        if (defpackage.a.i(jG, blwVar.f().b)) {
            return;
        }
        defpackage.beg begVar2 = blwVar.d;
        if ((begVar2 == null || begVar2.u()) && (kwvVar = blwVar.y) != null) {
            kwvVar.N(9);
        }
        blwVar.c.invoke(new defpackage.dkd(blwVar.f().a, jG, (defpackage.dgc) null));
        blwVar.o = new defpackage.dgc(jG);
    }

    @Override // defpackage.beq
    public final void c(long j, defpackage.bks bksVar) {
        defpackage.bfi bfiVarE;
        defpackage.blw blwVar = this.a;
        long jA = defpackage.ble.a(blwVar.a(true));
        defpackage.beg begVar = blwVar.d;
        if (begVar == null || (bfiVarE = begVar.e()) == null) {
            return;
        }
        long jC = bfiVarE.c(jA);
        blwVar.k = jC;
        blwVar.n(new defpackage.cji(jC));
        blwVar.m = 0L;
        blwVar.p(defpackage.bdy.a);
        blwVar.t(false);
    }

    @Override // defpackage.beq
    public final void d() {
        defpackage.blw blwVar = this.a;
        blwVar.p(null);
        blwVar.n(null);
    }

    @Override // defpackage.beq
    public final void e() {
        defpackage.blw blwVar = this.a;
        blwVar.p(null);
        blwVar.n(null);
    }

    @Override // defpackage.beq
    public final void a() {
    }

    @Override // defpackage.beq
    public final void f() {
    }
}
