package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class amv<T> extends defpackage.aoj {
    public defpackage.ana a;
    public defpackage.aor b;
    public defpackage.aor c;
    private defpackage.dlo i;

    public amv(defpackage.ana anaVar, defpackage.apn apnVar, boolean z, defpackage.aor aorVar) {
        super(defpackage.amr.a, z, null, apnVar);
        this.a = anaVar;
        this.b = aorVar;
    }

    @Override // defpackage.aoj
    public final java.lang.Object dm(defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objE = this.a.e(defpackage.akv.a, new defpackage.ams(affgVar, this, null), afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }

    @Override // defpackage.aoj
    public final void dn(defpackage.anw anwVar) {
        if (this.A) {
            ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.ais(this, anwVar, (defpackage.afdk) null, 9), 3);
        }
    }

    @Override // defpackage.cge
    public final void dz() {
        i(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(float f, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.amt amtVar;
        afgs afgsVar;
        if (afdkVar instanceof defpackage.amt) {
            amtVar = (defpackage.amt) afdkVar;
            int i = amtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                amtVar.c = i - Integer.MIN_VALUE;
            } else {
                amtVar = new defpackage.amt(this, afdkVar);
            }
        } else {
            amtVar = new defpackage.amt(this, afdkVar);
        }
        java.lang.Object obj = amtVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = amtVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            afgs afgsVar2 = new afgs();
            afgsVar2.a = f;
            defpackage.ana anaVar = this.a;
            defpackage.amu amuVar = new defpackage.amu(this, afgsVar2, f, null);
            amtVar.d = afgsVar2;
            amtVar.c = 2;
            if (anaVar.e(defpackage.akv.a, amuVar, amtVar) == afdrVar) {
                return afdrVar;
            }
            afgsVar = afgsVar2;
        } else {
            if (i2 == 1) {
                defpackage.afga.cz(obj);
                return obj;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afgsVar = amtVar.d;
            defpackage.afga.cz(obj);
        }
        return new java.lang.Float(afgsVar.a);
    }

    public final void i(defpackage.aor aorVar) {
        if (aorVar == null) {
            defpackage.aej aejVar = defpackage.amj.a;
            defpackage.aej aejVar2 = defpackage.amj.a;
            defpackage.affc affcVar = defpackage.amj.b;
            defpackage.dlo dloVar = defpackage.cjv.r(this).r;
            this.i = dloVar;
            defpackage.ana anaVar = this.a;
            aorVar = new defpackage.ars(new defpackage.aml(anaVar, affcVar, new defpackage.aln(dloVar, 2)), defpackage.amr.c, aejVar2);
        }
        this.c = aorVar;
    }

    @Override // defpackage.aoj
    public final boolean k() {
        return this.a.h() != null;
    }

    public final boolean l() {
        return defpackage.cjv.r(this).s == defpackage.dlz.b && this.d == defpackage.apn.b;
    }

    @Override // defpackage.aoj, defpackage.cge
    /* JADX INFO: renamed from: p */
    public final void t() {
        o();
        if (this.A) {
            defpackage.dlo dloVar = defpackage.cjv.r(this).r;
            defpackage.dlo dloVar2 = this.i;
            if (dloVar2 == null || !defpackage.afga.f(dloVar2, dloVar)) {
                this.i = dloVar;
                i(this.b);
            }
        }
    }

    @Override // defpackage.aoj
    public final void j(long j) {
    }
}
