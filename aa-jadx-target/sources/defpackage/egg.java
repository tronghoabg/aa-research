package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class egg extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(defpackage.dwz dwzVar, android.telecom.Call call, defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.d = dwzVar;
        this.b = call;
        this.c = affcVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.f;
        if (i == 0) {
            defpackage.egg eggVar = new defpackage.egg((defpackage.egk) this.b, (defpackage.affg) this.c, (defpackage.fdm) this.d, afdkVar, 0);
            eggVar.e = obj;
            return eggVar;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.d;
            defpackage.dwz dwzVar = (defpackage.dwz) obj2;
            defpackage.egg eggVar2 = new defpackage.egg(dwzVar, (android.telecom.Call) this.b, (defpackage.affc) this.c, afdkVar, 1);
            eggVar2.e = obj;
            return eggVar2;
        }
        if (i == 2) {
            java.lang.Object obj3 = this.d;
            defpackage.epy epyVar = (defpackage.epy) obj3;
            defpackage.egg eggVar3 = new defpackage.egg(epyVar, (defpackage.epx) this.b, (aizj) this.c, afdkVar, 2);
            eggVar3.e = obj;
            return eggVar3;
        }
        java.lang.Object obj4 = this.d;
        if (i != 3) {
            defpackage.epy epyVar2 = (defpackage.epy) obj4;
            defpackage.egg eggVar4 = new defpackage.egg(epyVar2, (defpackage.epx) this.b, this.c, afdkVar, 4, null);
            eggVar4.e = obj;
            return eggVar4;
        }
        defpackage.epy epyVar3 = (defpackage.epy) obj4;
        defpackage.egg eggVar5 = new defpackage.egg(epyVar3, (defpackage.epx) this.b, (defpackage.affg) this.c, afdkVar, 3);
        eggVar5.e = obj;
        return eggVar5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aiyr */
    /* JADX WARN: Type inference failed for: r0v11, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        aiyu aiyuVar;
        java.lang.Throwable th;
        defpackage.eqa eqaVar;
        int i = this.f;
        if (i == 0) {
            aiuw aiuwVar = (aiuw) this.e;
            defpackage.afdr afdrVar = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
                return obj;
            }
            defpackage.afga.cz(obj);
            aium aiumVar = new aium();
            java.lang.Object obj2 = this.b;
            ?? r7 = this.c;
            java.lang.Object obj3 = this.d;
            defpackage.egk egkVar = (defpackage.egk) obj2;
            defpackage.ehp ehpVarA = egkVar.g.A();
            defpackage.wde wdeVar = new defpackage.wde((defpackage.affg) r7, aiumVar, ehpVarA instanceof defpackage.eez ? new defpackage.ehc(((defpackage.eez) ehpVarA).c) : ehpVarA, aiuwVar.c(), (defpackage.fdm) obj3);
            defpackage.mku mkuVar = egkVar.h;
            java.lang.Object objJ = mkuVar.d.j(wdeVar);
            if (objJ instanceof aiym) {
                java.lang.Throwable thB = aiyo.b(objJ);
                if (thB == null) {
                    throw new aiyr("Channel was closed normally");
                }
                throw thB;
            }
            if (!aiyo.c(objJ)) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (((java.util.concurrent.atomic.AtomicInteger) ((defpackage.ldx) mkuVar.c).a).getAndIncrement() == 0) {
                ahoc.d((aiuw) mkuVar.a, (defpackage.afdo) null, 0, new defpackage.ehl(mkuVar, null), 3);
            }
            this.e = null;
            this.a = 1;
            java.lang.Object objGX = aiumVar.gX(this);
            return objGX == afdrVar ? afdrVar : objGX;
        }
        if (i == 1) {
            defpackage.afdr afdrVar2 = defpackage.afdr.a;
            if (this.a != 0) {
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                aiuw aiuwVar2 = (aiuw) this.e;
                android.content.Context applicationContext = ((defpackage.dwz) this.d).getApplicationContext();
                applicationContext.getClass();
                aack aackVar = new aack(applicationContext, aiuwVar2, (android.telecom.Call) this.b);
                java.lang.String str = defpackage.dwz.a;
                android.util.Log.v(str, "connectExtensions: calling init");
                this.c.invoke(aackVar);
                android.util.Log.v(str, "connectExtensions: connecting extensions");
                this.a = 1;
                if (aackVar.h(this) == afdrVar2) {
                    return afdrVar2;
                }
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.afdr afdrVar3 = defpackage.afdr.a;
            if (this.a != 0) {
                aiyuVar = (aiyu) this.e;
                defpackage.afga.cz(obj);
            } else {
                defpackage.afga.cz(obj);
                aiyu aiyuVar2 = (aiyu) this.e;
                java.lang.Object obj4 = this.d;
                java.lang.Object obj5 = this.b;
                defpackage.ehz ehzVar = new defpackage.ehz((aizj) this.c, aiyuVar2, (defpackage.afdk) null, 2);
                this.e = aiyuVar2;
                this.a = 1;
                if (defpackage.ebj.e((defpackage.epy) obj4, (defpackage.epx) obj5, ehzVar, this) == afdrVar3) {
                    return afdrVar3;
                }
                aiyuVar = aiyuVar2;
            }
            aiyuVar.u((java.lang.Throwable) null);
            return defpackage.afbk.a;
        }
        if (i != 3) {
            defpackage.afdr afdrVar4 = defpackage.afdr.a;
            int i2 = this.a;
            defpackage.afga.cz(obj);
            if (i2 == 0) {
                aiuw aiuwVar3 = (aiuw) this.e;
                aiut aiutVar = aivl.a;
                aiwq aiwqVarI = ajdt.a.i();
                defpackage.erd erdVar = new defpackage.erd((defpackage.epy) this.d, (defpackage.epx) this.b, aiuwVar3, this.c, null);
                this.a = 1;
                if (ahoc.a(aiwqVarI, erdVar, this) == afdrVar4) {
                    return afdrVar4;
                }
            }
            return defpackage.afbk.a;
        }
        defpackage.afdr afdrVar5 = defpackage.afdr.a;
        if (this.a != 0) {
            eqaVar = (defpackage.eqa) this.e;
            try {
                defpackage.afga.cz(obj);
                eqaVar.a();
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                eqaVar.a();
                throw th;
            }
        }
        defpackage.afga.cz(obj);
        aiwg aiwgVar = ((aiuw) this.e).c().get(aiwg.d);
        if (aiwgVar == null) {
            throw new java.lang.IllegalStateException("when[State] methods should have a parent job");
        }
        eqv eqvVar = new eqv();
        defpackage.eqa eqaVar2 = new defpackage.eqa((defpackage.epy) this.d, (defpackage.epx) this.b, eqvVar.a, aiwgVar);
        try {
            ?? r13 = this.c;
            this.e = eqaVar2;
            this.a = 1;
            obj = ahoc.a(eqvVar, (defpackage.affg) r13, this);
            if (obj == afdrVar5) {
                return afdrVar5;
            }
            eqaVar = eqaVar2;
            eqaVar.a();
            return obj;
        } catch (java.lang.Throwable th3) {
            th = th3;
            eqaVar = eqaVar2;
            eqaVar.a();
            throw th;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((defpackage.egg) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return ((defpackage.egg) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 2) {
            return ((defpackage.egg) b((aiyu) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 3) {
            return ((defpackage.egg) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.egg) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(defpackage.egk egkVar, defpackage.affg affgVar, defpackage.fdm fdmVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = egkVar;
        this.c = affgVar;
        this.d = fdmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(defpackage.epy epyVar, defpackage.epx epxVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.d = epyVar;
        this.b = epxVar;
        this.c = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(defpackage.epy epyVar, defpackage.epx epxVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.f = i;
        this.d = epyVar;
        this.b = epxVar;
        this.c = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egg(defpackage.epy epyVar, defpackage.epx epxVar, aizj aizjVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.d = epyVar;
        this.b = epxVar;
        this.c = aizjVar;
    }
}
