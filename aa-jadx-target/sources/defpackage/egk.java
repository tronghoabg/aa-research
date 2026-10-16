package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class egk implements defpackage.efh {
    public final defpackage.ehq a;
    public final defpackage.eey b;
    public final aiuw c;
    public final defpackage.afar d;
    public final defpackage.afar e;
    public final defpackage.ehg f;
    public final defpackage.kwv g;
    public final defpackage.mku h;
    private final aizj i;
    private int j;
    private aiwg k;
    private final ajey l;

    public egk(defpackage.ehq ehqVar, java.util.List list, defpackage.eey eeyVar, defpackage.afdo afdoVar) {
        eeyVar.getClass();
        this.a = ehqVar;
        this.b = eeyVar;
        aiwg aiwgVar = afdoVar.get(aiwg.d);
        if (aiwgVar == null) {
            java.util.Objects.toString(afdoVar);
            throw new java.lang.IllegalStateException("Missing Job on Coroutine context: ".concat(afdoVar.toString()));
        }
        ajcw ajcwVarB = ahoi.b(afdoVar.plus(aiwgVar));
        this.c = ajcwVarB;
        this.i = new aiza(new defpackage.efp(this, (defpackage.afdk) null, 0));
        this.l = new ajey();
        this.g = new defpackage.kwv((byte[]) null, (byte[]) null);
        this.f = new defpackage.ehg(this, list, ajcwVarB.a);
        this.d = defpackage.afga.cA(new defpackage.djm(this, 4));
        this.e = defpackage.afga.cA(new defpackage.djm(this, 5));
        this.h = new defpackage.mku((aiuw) ajcwVarB, (defpackage.affc) new defpackage.dbj(this, 9), (defpackage.affg) new defpackage.dee(16), (defpackage.affg) new defpackage.btv(this, (defpackage.afdk) null, 2));
    }

    @Override // defpackage.efh
    public final java.lang.Object a(defpackage.affg affgVar, defpackage.afdk afdkVar) {
        defpackage.afgz.s(this.c.a);
        return dtg.j(new defpackage.bgj(this, affgVar, (defpackage.afdk) null, 4), afdkVar);
    }

    @Override // defpackage.efh
    public final aizj b() {
        return this.i;
    }

    public final defpackage.egw c() {
        return (defpackage.egw) this.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.afdk afdkVar) throws java.lang.Throwable {
        efm efmVar;
        defpackage.ehp ehpVar;
        if (afdkVar instanceof efm) {
            efmVar = (efm) afdkVar;
            int i = efmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                efmVar.c = i - Integer.MIN_VALUE;
            } else {
                efmVar = new efm(this, afdkVar);
            }
        } else {
            efmVar = new efm(this, afdkVar);
        }
        java.lang.Object objN = efmVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = efmVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.afga.cz(objN);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(objN);
            }
            ehpVar = (defpackage.ehp) objN;
            if (ehpVar instanceof defpackage.eez) {
                return ((defpackage.eez) ehpVar).a;
            }
            if (!(ehpVar instanceof defpackage.ehs)) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (!(ehpVar instanceof defpackage.ehe)) {
                throw ((defpackage.ehe) ehpVar).a;
            }
            if (!(ehpVar instanceof defpackage.egv)) {
                throw ((defpackage.egv) ehpVar).a;
            }
            if (ehpVar instanceof defpackage.ehc) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            throw new defpackage.afas();
        }
        defpackage.afga.cz(objN);
        defpackage.afgz.s(this.c.a);
        efmVar.c = 1;
        objN = null;
        efmVar.c = 2;
        objN = n(efmVar);
        if (objN == afdrVar) {
            return afdrVar;
        }
        ehpVar = (defpackage.ehp) objN;
        if (ehpVar instanceof defpackage.eez) {
            return ((defpackage.eez) ehpVar).a;
        }
        if (!(ehpVar instanceof defpackage.ehs)) {
            throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (!(ehpVar instanceof defpackage.ehe)) {
            throw ((defpackage.ehe) ehpVar).a;
        }
        if (!(ehpVar instanceof defpackage.egv)) {
            throw ((defpackage.egv) ehpVar).a;
        }
        if (ehpVar instanceof defpackage.ehc) {
            throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        throw new defpackage.afas();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.afdk afdkVar) throws java.lang.Throwable {
        efq efqVar;
        ajey ajeyVar;
        if (afdkVar instanceof efq) {
            efqVar = (efq) afdkVar;
            int i = efqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                efqVar.c = i - Integer.MIN_VALUE;
            } else {
                efqVar = new efq(this, afdkVar);
            }
        } else {
            efqVar = new efq(this, afdkVar);
        }
        java.lang.Object obj = efqVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = efqVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            ajey ajeyVar2 = this.l;
            efqVar.d = ajeyVar2;
            efqVar.c = 1;
            if (ajeyVar2.b(efqVar) == afdrVar) {
                return afdrVar;
            }
            ajeyVar = ajeyVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ajeyVar = efqVar.d;
            defpackage.afga.cz(obj);
        }
        try {
            int i3 = this.j - 1;
            this.j = i3;
            if (i3 == 0) {
                aiwg aiwgVar = this.k;
                if (aiwgVar != null) {
                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                }
                this.k = null;
            }
            return defpackage.afbk.a;
        } finally {
            ajeyVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.efs efsVar;
        ajey ajeyVar;
        if (afdkVar instanceof defpackage.efs) {
            efsVar = (defpackage.efs) afdkVar;
            int i = efsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                efsVar.c = i - Integer.MIN_VALUE;
            } else {
                efsVar = new defpackage.efs(this, afdkVar);
            }
        } else {
            efsVar = new defpackage.efs(this, afdkVar);
        }
        java.lang.Object obj = efsVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = efsVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            ajey ajeyVar2 = this.l;
            efsVar.d = ajeyVar2;
            efsVar.c = 1;
            if (ajeyVar2.b(efsVar) == afdrVar) {
                return afdrVar;
            }
            ajeyVar = ajeyVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ajeyVar = efsVar.d;
            defpackage.afga.cz(obj);
        }
        try {
            int i3 = this.j + 1;
            this.j = i3;
            if (i3 == 1) {
                this.k = ahoc.d(this.c, (defpackage.afdo) null, 0, new defpackage.ber(this, (defpackage.afdk) null, 10, (byte[]) null), 3);
            }
            return defpackage.afbk.a;
        } finally {
            ajeyVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r10 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        if (r10 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r9, defpackage.afdk r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egk.g(boolean, afdk):java.lang.Object");
    }

    public final java.lang.Object h(defpackage.afdk afdkVar) {
        return dtg.j(new efd(this, (defpackage.afdk) null, 4, (byte[]) null), afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [affg] */
    public final java.lang.Object i(boolean z, defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.efy efyVar;
        java.lang.Object obj;
        if (afdkVar instanceof defpackage.efy) {
            efyVar = (defpackage.efy) afdkVar;
            int i = efyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                efyVar.e = i - Integer.MIN_VALUE;
            } else {
                efyVar = new defpackage.efy(this, afdkVar);
            }
        } else {
            efyVar = new defpackage.efy(this, afdkVar);
        }
        java.lang.Object obj2 = efyVar.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = efyVar.e;
        if (i2 == 0) {
            defpackage.afga.cz(obj2);
            efyVar.b = affgVar;
            efyVar.a = z;
            efyVar.e = 1;
            obj2 = null;
            obj = affgVar;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj2);
                return obj2;
            }
            z = efyVar.a;
            java.lang.Object obj3 = efyVar.b;
            defpackage.afga.cz(obj2);
            obj = obj3;
        }
        boolean z2 = z;
        ajcw ajcwVar = this.c;
        gbz gbzVar = new gbz(this, (defpackage.fdm) obj2, z2, obj, (defpackage.afdk) null, 1);
        efyVar.b = null;
        efyVar.a = z2;
        efyVar.e = 2;
        java.lang.Object objA = ahoc.a(ajcwVar.a, gbzVar, efyVar);
        return objA == afdrVar ? afdrVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.Object obj, boolean z, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.egh eghVar;
        defpackage.afgt afgtVar;
        if (afdkVar instanceof defpackage.egh) {
            eghVar = (defpackage.egh) afdkVar;
            int i = eghVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eghVar.c = i - Integer.MIN_VALUE;
            } else {
                eghVar = new defpackage.egh(this, afdkVar);
            }
        } else {
            eghVar = new defpackage.egh(this, afdkVar);
        }
        java.lang.Object obj2 = eghVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = eghVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj2);
            defpackage.afgt afgtVar2 = new defpackage.afgt();
            defpackage.egs egsVarK = k();
            defpackage.egj egjVar = new defpackage.egj(this, afgtVar2, obj, z, null);
            eghVar.d = afgtVar2;
            eghVar.c = 1;
            if (egsVarK.c(egjVar, eghVar) == afdrVar) {
                return afdrVar;
            }
            afgtVar = afgtVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgtVar = eghVar.d;
            defpackage.afga.cz(obj2);
        }
        return new java.lang.Integer(afgtVar.a);
    }

    public final defpackage.egs k() {
        return (defpackage.egs) this.d.a();
    }

    public final java.lang.Object l(defpackage.affg affgVar, defpackage.afdo afdoVar, defpackage.fdm fdmVar, defpackage.afdk afdkVar) {
        return c().c(new defpackage.egf(this, fdmVar, afdoVar, affgVar, null), afdkVar);
    }

    public final java.lang.Object m(defpackage.afdk afdkVar) {
        java.lang.Object objJ = dtg.j(new eft(this, (defpackage.afdk) null), afdkVar);
        return objJ == defpackage.afdr.a ? objJ : defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(defpackage.afdk afdkVar) throws java.lang.Throwable {
        egc egcVar;
        if (afdkVar instanceof egc) {
            egcVar = (egc) afdkVar;
            int i = egcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                egcVar.c = i - Integer.MIN_VALUE;
            } else {
                egcVar = new egc(this, afdkVar);
            }
        } else {
            egcVar = new egc(this, afdkVar);
        }
        java.lang.Object obj = egcVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = egcVar.c;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                if (this.g.A() instanceof defpackage.egv) {
                    return this.g.A();
                }
                egcVar.c = 1;
                if (m(egcVar) != afdrVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj);
                return obj;
            }
            defpackage.afga.cz(obj);
            egcVar.c = 2;
            java.lang.Object objG = g(false, egcVar);
            return objG == afdrVar ? afdrVar : objG;
        } catch (java.lang.Throwable th) {
            return new defpackage.ehe(th, -1);
        }
    }
}
