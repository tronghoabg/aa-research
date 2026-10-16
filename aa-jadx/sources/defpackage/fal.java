package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fal implements defpackage.fao, defpackage.ezd {
    public final defpackage.fch a;
    private final defpackage.affg b;
    private final java.util.concurrent.atomic.AtomicInteger c;
    private defpackage.ezq d;

    public fal(defpackage.affg affgVar, defpackage.fch fchVar) {
        fchVar.getClass();
        this.b = affgVar;
        this.a = fchVar;
        this.c = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [affc] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.ezd
    public final java.lang.Object a(java.lang.String str, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Exception {
        defpackage.fai faiVar;
        ?? r7;
        if (afdkVar instanceof defpackage.fai) {
            faiVar = (defpackage.fai) afdkVar;
            int i = faiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                faiVar.d = i - Integer.MIN_VALUE;
            } else {
                faiVar = new defpackage.fai(this, afdkVar);
            }
        } else {
            faiVar = new defpackage.fai(this, afdkVar);
        }
        java.lang.Object objE = faiVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = faiVar.d;
        if (i2 == 0) {
            defpackage.afga.cz(objE);
            faiVar.e = str;
            faiVar.a = affcVar;
            faiVar.d = 1;
            objE = e();
            if (objE != afdrVar) {
            }
            r7 = affcVar;
            return afdrVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objE);
            return objE;
        }
        java.lang.Object obj = faiVar.a;
        str = faiVar.e;
        defpackage.afga.cz(objE);
        r7 = obj;
        r7 = affcVar;
        if (!((java.lang.Boolean) objE).booleanValue()) {
            defpackage.fbr fbrVarA = this.a.a(str);
            try {
                java.lang.Object objInvoke = r7.invoke(fbrVarA);
                defpackage.afga.m(fbrVarA, null);
                return objInvoke;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.afga.m(fbrVarA, th);
                    throw th2;
                }
            }
        }
        defpackage.affg affgVar = this.b;
        defpackage.faj fajVar = new defpackage.faj(this, str, r7, null);
        faiVar.e = null;
        faiVar.a = null;
        faiVar.d = 2;
        java.lang.Object objInvoke2 = affgVar.invoke(fajVar, faiVar);
        if (objInvoke2 != afdrVar) {
            return objInvoke2;
        }
        r7 = affcVar;
        return afdrVar;
    }

    @Override // defpackage.fao
    public final defpackage.fch b() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[Catch: SQLException -> 0x00b0, TryCatch #2 {SQLException -> 0x00b0, blocks: (B:52:0x00a0, B:54:0x00a8, B:55:0x00aa), top: B:66:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.ezq ezqVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        defpackage.fah fahVar;
        java.lang.Throwable th;
        if (afdkVar instanceof defpackage.fah) {
            fahVar = (defpackage.fah) afdkVar;
            int i = fahVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fahVar.d = i - Integer.MIN_VALUE;
            } else {
                fahVar = new defpackage.fah(this, afdkVar);
            }
        } else {
            fahVar = new defpackage.fah(this, afdkVar);
        }
        java.lang.Object objInvoke = fahVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = fahVar.d;
        int i3 = 1;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(objInvoke);
                int iOrdinal = ezqVar.ordinal();
                if (iOrdinal == 0) {
                    defpackage.csc.k(this.a, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    defpackage.csc.k(this.a, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.afas();
                    }
                    defpackage.csc.k(this.a, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.c.incrementAndGet() > 0) {
                    this.d = ezqVar;
                }
                defpackage.fag fagVar = new defpackage.fag(this);
                fahVar.a = 1;
                fahVar.d = 1;
                objInvoke = affgVar.invoke(fagVar, fahVar);
                if (objInvoke == afdrVar) {
                    return afdrVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = fahVar.a;
                defpackage.afga.cz(objInvoke);
            }
            if (this.c.decrementAndGet() == 0) {
                this.d = null;
            }
            defpackage.fch fchVar = this.a;
            if (i3 != 0) {
                defpackage.csc.k(fchVar, "END TRANSACTION");
                return objInvoke;
            }
            defpackage.csc.k(fchVar, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                if (th instanceof defpackage.fac) {
                    defpackage.fac facVar = th;
                    throw null;
                }
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (this.c.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    defpackage.csc.k(this.a, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = null;
            }
            try {
                if (this.c.decrementAndGet() == 0) {
                    this.d = null;
                }
                defpackage.csc.k(this.a, "ROLLBACK TRANSACTION");
            } catch (android.database.SQLException e) {
                if (th == null) {
                    throw e;
                }
                defpackage.adrs.E(th, e);
            }
            throw th;
        }
    }

    public final java.lang.Object d(defpackage.ezq ezqVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return this.b.invoke(new defpackage.fak(this, ezqVar, affgVar, null), afdkVar);
    }

    public final java.lang.Object e() {
        boolean z = true;
        if (this.d == null && !this.a.a.g()) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
