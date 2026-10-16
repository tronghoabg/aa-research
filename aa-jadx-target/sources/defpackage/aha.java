package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aha implements defpackage.agy {
    private final defpackage.aeq a;
    private defpackage.aep b;
    private defpackage.aep c;
    private defpackage.aep d;

    public aha(defpackage.afe afeVar) {
        this(new defpackage.agz(afeVar));
    }

    @Override // defpackage.agu
    public final long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        int iB = aepVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = java.lang.Math.max(jMax, this.a.a(i).e(aepVar.a(i), aepVar2.a(i), aepVar3.a(i)));
        }
        return jMax;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.agu
    public final defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) throws afbj {
        defpackage.aep aepVar4;
        defpackage.aep aepVarC = this.d;
        if (aepVarC == null) {
            aepVarC = aepVar3.c();
            this.d = aepVarC;
        }
        if (aepVarC == null) {
            defpackage.afga.d("endVelocityVector");
            aepVarC = null;
        }
        int iB = aepVarC.b();
        int i = 0;
        while (true) {
            aepVar4 = this.d;
            if (i >= iB) {
                break;
            }
            if (aepVar4 == null) {
                defpackage.afga.d("endVelocityVector");
                aepVar4 = null;
            }
            aepVar4.e(i, this.a.a(i).b(aepVar.a(i), aepVar2.a(i), aepVar3.a(i)));
            i++;
        }
        if (aepVar4 != null) {
            return aepVar4;
        }
        defpackage.afga.d("endVelocityVector");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) throws afbj {
        defpackage.aep aepVar4;
        defpackage.aep aepVarC = this.b;
        if (aepVarC == null) {
            aepVarC = aepVar.c();
            this.b = aepVarC;
        }
        if (aepVarC == null) {
            defpackage.afga.d("valueVector");
            aepVarC = null;
        }
        int iB = aepVarC.b();
        int i = 0;
        while (true) {
            aepVar4 = this.b;
            if (i >= iB) {
                break;
            }
            if (aepVar4 == null) {
                defpackage.afga.d("valueVector");
                aepVar4 = null;
            }
            aepVar4.e(i, this.a.a(i).c(j, aepVar.a(i), aepVar2.a(i), aepVar3.a(i)));
            i++;
        }
        if (aepVar4 != null) {
            return aepVar4;
        }
        defpackage.afga.d("valueVector");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) throws afbj {
        defpackage.aep aepVar4;
        defpackage.aep aepVarC = this.c;
        if (aepVarC == null) {
            aepVarC = aepVar3.c();
            this.c = aepVarC;
        }
        if (aepVarC == null) {
            defpackage.afga.d("velocityVector");
            aepVarC = null;
        }
        int iB = aepVarC.b();
        int i = 0;
        while (true) {
            aepVar4 = this.c;
            if (i >= iB) {
                break;
            }
            if (aepVar4 == null) {
                defpackage.afga.d("velocityVector");
                aepVar4 = null;
            }
            aepVar4.e(i, this.a.a(i).d(j, aepVar.a(i), aepVar2.a(i), aepVar3.a(i)));
            i++;
        }
        if (aepVar4 != null) {
            return aepVar4;
        }
        defpackage.afga.d("velocityVector");
        return null;
    }

    @Override // defpackage.agu
    public final /* synthetic */ boolean e() {
        return false;
    }

    public aha(defpackage.aeq aeqVar) {
        this.a = aeqVar;
    }
}
