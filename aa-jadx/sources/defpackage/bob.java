package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bob {
    public float a = 6.0f;
    public float b = 6.0f;
    public float c = 8.0f;
    public float d = 6.0f;
    public final defpackage.aeb e = new defpackage.aeb(new defpackage.dlr(6.0f), defpackage.agt.c, null, "Animatable");
    private defpackage.asi f;
    private defpackage.asi g;

    private final float c(defpackage.asi asiVar) {
        if (asiVar instanceof defpackage.asn) {
            return this.b;
        }
        if (asiVar instanceof defpackage.asf) {
            return this.c;
        }
        return asiVar instanceof defpackage.asd ? this.d : this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [afbk, java.lang.Object] */
    public final java.lang.Object a(defpackage.asi asiVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.bnz bnzVar;
        if (afdkVar instanceof defpackage.bnz) {
            bnzVar = (defpackage.bnz) afdkVar;
            int i = bnzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bnzVar.d = i - Integer.MIN_VALUE;
            } else {
                bnzVar = new defpackage.bnz(this, afdkVar);
            }
        } else {
            bnzVar = new defpackage.bnz(this, afdkVar);
        }
        java.lang.Object obj = bnzVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = bnzVar.d;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                float fC = c(asiVar);
                this.g = asiVar;
                defpackage.aeb aebVar = this.e;
                asiVar = asiVar;
                if (!defpackage.dlr.c(((defpackage.dlr) aebVar.c()).a, fC)) {
                    defpackage.asi asiVar2 = this.f;
                    bnzVar.a = asiVar;
                    bnzVar.d = 1;
                    if (defpackage.btc.a(aebVar, fC, asiVar2, asiVar, bnzVar) == afdrVar) {
                        asiVar = asiVar;
                        return afdrVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = bnzVar.a;
                defpackage.afga.cz(obj);
                asiVar = obj2;
            }
            asiVar = asiVar;
            this.f = asiVar;
            this = defpackage.afbk.a;
            return this;
        } catch (java.lang.Throwable th) {
            this.f = asiVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.boa boaVar;
        if (afdkVar instanceof defpackage.boa) {
            boaVar = (defpackage.boa) afdkVar;
            int i = boaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                boaVar.c = i - Integer.MIN_VALUE;
            } else {
                boaVar = new defpackage.boa(this, afdkVar);
            }
        } else {
            boaVar = new defpackage.boa(this, afdkVar);
        }
        java.lang.Object obj = boaVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = boaVar.c;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                float fC = c(this.g);
                defpackage.aeb aebVar = this.e;
                if (!defpackage.dlr.c(((defpackage.dlr) aebVar.c()).a, fC)) {
                    defpackage.dlr dlrVar = new defpackage.dlr(fC);
                    boaVar.c = 1;
                    if (aebVar.e(dlrVar, boaVar) == afdrVar) {
                        return afdrVar;
                    }
                }
                return defpackage.afbk.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
            this.f = this.g;
            return defpackage.afbk.a;
        } catch (java.lang.Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
