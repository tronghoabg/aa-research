package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class erd extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.epy d;
    final /* synthetic */ defpackage.epx e;
    final /* synthetic */ aiuw f;
    final /* synthetic */ defpackage.affg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erd(defpackage.epy epyVar, defpackage.epx epxVar, aiuw aiuwVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = epyVar;
        this.e = epxVar;
        this.f = aiuwVar;
        this.g = affgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.erd(this.d, this.e, this.f, this.g, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Object obj2;
        defpackage.epw epwVar;
        defpackage.epw epwVar2;
        java.lang.Object obj3;
        aiwg aiwgVar;
        defpackage.eqe eqeVar;
        java.lang.Object obj4;
        aiwg aiwgVar2;
        defpackage.eqe eqeVar2;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (this.c != 0) {
            java.lang.Object obj5 = this.b;
            obj2 = this.a;
            try {
                defpackage.afga.cz(obj);
                obj4 = obj5;
                aiwgVar2 = (aiwg) ((defpackage.afgv) obj2).a;
                if (aiwgVar2 != null) {
                    aiwgVar2.s((java.util.concurrent.CancellationException) null);
                }
                eqeVar2 = (defpackage.eqe) ((defpackage.afgv) obj4).a;
                if (eqeVar2 != null) {
                    this.d.d(eqeVar2);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                obj3 = obj5;
                aiwgVar = (aiwg) ((defpackage.afgv) obj2).a;
                if (aiwgVar != null) {
                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                }
                eqeVar = (defpackage.eqe) ((defpackage.afgv) obj3).a;
                if (eqeVar != null) {
                    throw th;
                }
                this.d.d(eqeVar);
                throw th;
            }
        } else {
            defpackage.afga.cz(obj);
            defpackage.epy epyVar = this.d;
            if (epyVar.a() != defpackage.epx.a) {
                defpackage.afgv afgvVar = new defpackage.afgv();
                defpackage.afgv afgvVar2 = new defpackage.afgv();
                try {
                    defpackage.epx epxVar = this.e;
                    aiuw aiuwVar = this.f;
                    defpackage.affg affgVar = this.g;
                    this.a = afgvVar;
                    this.b = afgvVar2;
                    this.c = 1;
                    aiug aiugVar = new aiug(defpackage.afga.s(this), 1);
                    aiugVar.z();
                    defpackage.epv epvVar = defpackage.epw.Companion;
                    int iOrdinal = epxVar.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        epwVar = null;
                    } else {
                        if (iOrdinal == 2) {
                            epwVar2 = defpackage.epw.ON_CREATE;
                        } else if (iOrdinal == 3) {
                            epwVar2 = defpackage.epw.ON_START;
                        } else {
                            if (iOrdinal != 4) {
                                throw new defpackage.afas();
                            }
                            epwVar2 = defpackage.epw.ON_RESUME;
                        }
                        epwVar = epwVar2;
                    }
                    afgvVar2.a = new defpackage.erc(epwVar, afgvVar, aiuwVar, defpackage.epv.a(epxVar), aiugVar, new ajey(), affgVar);
                    java.lang.Object obj6 = afgvVar2.a;
                    obj6.getClass();
                    epyVar.c((defpackage.eqe) obj6);
                    if (aiugVar.k() == afdrVar) {
                        return afdrVar;
                    }
                    obj2 = afgvVar;
                    obj4 = afgvVar2;
                    aiwgVar2 = (aiwg) ((defpackage.afgv) obj2).a;
                    if (aiwgVar2 != null) {
                        aiwgVar2.s((java.util.concurrent.CancellationException) null);
                    }
                    eqeVar2 = (defpackage.eqe) ((defpackage.afgv) obj4).a;
                    if (eqeVar2 != null) {
                        this.d.d(eqeVar2);
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    obj2 = afgvVar;
                    obj3 = afgvVar2;
                    aiwgVar = (aiwg) ((defpackage.afgv) obj2).a;
                    if (aiwgVar != null) {
                        aiwgVar.s((java.util.concurrent.CancellationException) null);
                    }
                    eqeVar = (defpackage.eqe) ((defpackage.afgv) obj3).a;
                    if (eqeVar != null) {
                        throw th;
                    }
                    this.d.d(eqeVar);
                    throw th;
                }
            }
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.erd) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
