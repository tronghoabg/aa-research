package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class akj extends defpackage.cge implements defpackage.cza, defpackage.czj {
    public defpackage.ask a;
    private defpackage.asf b;

    public akj(defpackage.ask askVar) {
        this.a = askVar;
    }

    @Override // defpackage.cza
    public final /* synthetic */ boolean C() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.akh akhVar;
        defpackage.asf asfVar;
        if (afdkVar instanceof defpackage.akh) {
            akhVar = (defpackage.akh) afdkVar;
            int i = akhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akhVar.c = i - Integer.MIN_VALUE;
            } else {
                akhVar = new defpackage.akh(this, afdkVar);
            }
        } else {
            akhVar = new defpackage.akh(this, afdkVar);
        }
        java.lang.Object obj = akhVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = akhVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            if (this.b == null) {
                defpackage.asf asfVar2 = new defpackage.asf();
                defpackage.ask askVar = this.a;
                akhVar.d = asfVar2;
                akhVar.c = 1;
                if (askVar.b(asfVar2, akhVar) == afdrVar) {
                    return afdrVar;
                }
                asfVar = asfVar2;
            }
            return defpackage.afbk.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        asfVar = akhVar.d;
        defpackage.afga.cz(obj);
        this.b = asfVar;
        return defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aki akiVar;
        if (afdkVar instanceof defpackage.aki) {
            akiVar = (defpackage.aki) afdkVar;
            int i = akiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                akiVar.c = i - Integer.MIN_VALUE;
            } else {
                akiVar = new defpackage.aki(this, afdkVar);
            }
        } else {
            akiVar = new defpackage.aki(this, afdkVar);
        }
        java.lang.Object obj = akiVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = akiVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            defpackage.asf asfVar = this.b;
            if (asfVar != null) {
                defpackage.asg asgVar = new defpackage.asg(asfVar);
                defpackage.ask askVar = this.a;
                akiVar.c = 1;
                if (askVar.b(asgVar, akiVar) == afdrVar) {
                    return afdrVar;
                }
            }
            return defpackage.afbk.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.afga.cz(obj);
        this.b = null;
        return defpackage.afbk.a;
    }

    @Override // defpackage.czj
    public final void dv() {
        p();
    }

    @Override // defpackage.cza
    public final /* synthetic */ long dy() {
        return defpackage.ud.b(0, 0, 0, 0);
    }

    @Override // defpackage.cza
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void t() {
        defpackage.asf asfVar = this.b;
        if (asfVar != null) {
            this.a.c(new defpackage.asg(asfVar));
            this.b = null;
        }
    }

    @Override // defpackage.cza
    public final void o() {
        p();
    }

    @Override // defpackage.cge
    public final void q() {
        p();
    }

    @Override // defpackage.cza
    public final void s(defpackage.cqu cquVar, defpackage.cqv cqvVar, long j) {
        if (cqvVar == defpackage.cqv.b) {
            int i = cquVar.e;
            if (i == 4) {
                ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.adh(this, (defpackage.afdk) null, 6), 3);
            } else if (i == 5) {
                ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.adh(this, (defpackage.afdk) null, 7, (byte[]) null), 3);
            }
        }
    }

    @Override // defpackage.cza
    public final /* synthetic */ void E() {
    }
}
