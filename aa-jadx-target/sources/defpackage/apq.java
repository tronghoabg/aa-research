package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class apq implements defpackage.dlo {
    private final /* synthetic */ defpackage.dlo a;
    private boolean b;
    private boolean c;
    private final ajey d = new ajey();

    public apq(defpackage.dlo dloVar) {
        this.a = dloVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return defpackage.dln.n(this.a, j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return (f / this.a.a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return this.a.dG(i);
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return defpackage.dln.p(this.a, j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return f * this.a.a();
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return defpackage.dln.q(this.a, f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return defpackage.dln.r(this.a, j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return defpackage.dln.s(this.a, j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return defpackage.dln.o(this.a, f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        return this.a.dR(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.apo apoVar;
        if (afdkVar instanceof defpackage.apo) {
            apoVar = (defpackage.apo) afdkVar;
            int i = apoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apoVar.c = i - Integer.MIN_VALUE;
            } else {
                apoVar = new defpackage.apo(this, afdkVar);
            }
        } else {
            apoVar = new defpackage.apo(this, afdkVar);
        }
        java.lang.Object obj = apoVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = apoVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            ajey ajeyVar = this.d;
            apoVar.c = 1;
            if (ajeyVar.b(apoVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        this.b = false;
        this.c = false;
        return defpackage.afbk.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.app appVar;
        if (afdkVar instanceof defpackage.app) {
            appVar = (defpackage.app) afdkVar;
            int i = appVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                appVar.c = i - Integer.MIN_VALUE;
            } else {
                appVar = new defpackage.app(this, afdkVar);
            }
        } else {
            appVar = new defpackage.app(this, afdkVar);
        }
        java.lang.Object obj = appVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = appVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            if (!this.b && !this.c) {
                ajey ajeyVar = this.d;
                appVar.c = 1;
                if (ajeyVar.b(appVar) == afdrVar) {
                    return afdrVar;
                }
            }
            return java.lang.Boolean.valueOf(this.b);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.afga.cz(obj);
        this.d.d();
        return java.lang.Boolean.valueOf(this.b);
    }

    public final void p() {
        this.c = true;
        ajey ajeyVar = this.d;
        if (ajeyVar.a()) {
            ajeyVar.d();
        }
    }

    public final void q() {
        this.b = true;
        ajey ajeyVar = this.d;
        if (ajeyVar.a()) {
            ajeyVar.d();
        }
    }
}
