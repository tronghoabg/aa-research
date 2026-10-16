package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aoq extends defpackage.aoj {
    public boolean a;
    public defpackage.affh b;
    public defpackage.affh c;
    public boolean i;
    public bqp j;

    public aoq(bqp bqpVar, defpackage.affc affcVar, defpackage.apn apnVar, boolean z, defpackage.ask askVar, boolean z2, defpackage.affh affhVar, defpackage.affh affhVar2, boolean z3) {
        super(affcVar, z, askVar, apnVar);
        this.j = bqpVar;
        this.a = z2;
        this.b = affhVar;
        this.c = affhVar2;
        this.i = z3;
    }

    @Override // defpackage.aoj
    public final java.lang.Object dm(defpackage.affg affgVar, defpackage.afdk afdkVar) {
        defpackage.apn apnVar = this.d;
        if (apnVar != null) {
            java.lang.Object objA = ahoi.a(new defpackage.bqo(this.j, defpackage.akv.b, new defpackage.bid(affgVar, this, apnVar, (defpackage.afdk) null, 1), (defpackage.afdk) null, 0), afdkVar);
            defpackage.afdr afdrVar = defpackage.afdr.a;
            if (objA != afdrVar) {
                objA = defpackage.afbk.a;
            }
            if (objA == afdrVar) {
                return objA;
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.aoj
    public final void dn(defpackage.anw anwVar) {
        defpackage.apn apnVar;
        if (!this.A || defpackage.afga.f(this.c, defpackage.aon.b) || (apnVar = this.d) == null) {
            return;
        }
        ahoc.d(N(), (defpackage.afdo) null, 4, new defpackage.aop(this, anwVar, apnVar, null), 1);
    }

    @Override // defpackage.aoj
    public final void j(long j) {
        if (!this.A || defpackage.afga.f(this.b, defpackage.aon.a)) {
            return;
        }
        ahoc.d(N(), (defpackage.afdo) null, 4, new defpackage.aoo(this, j, null), 1);
    }

    @Override // defpackage.aoj
    public final boolean k() {
        return this.a;
    }
}
