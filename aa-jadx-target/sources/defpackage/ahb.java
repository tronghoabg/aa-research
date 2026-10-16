package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ahb {
    public final defpackage.aff a;
    public defpackage.aep b;
    public defpackage.aep c;
    public final float d;
    private defpackage.aep e;

    public ahb(defpackage.aff affVar) {
        this.a = affVar;
        this.d = affVar.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final defpackage.aep a(defpackage.aep aepVar, defpackage.aep aepVar2) throws afbj {
        defpackage.aep aepVar3;
        defpackage.aep aepVarC = this.e;
        if (aepVarC == null) {
            aepVarC = aepVar.c();
            this.e = aepVarC;
        }
        if (aepVarC == null) {
            defpackage.afga.d("targetVector");
            aepVarC = null;
        }
        int iB = aepVarC.b();
        int i = 0;
        while (true) {
            aepVar3 = this.e;
            if (i >= iB) {
                break;
            }
            if (aepVar3 == null) {
                defpackage.afga.d("targetVector");
                aepVar3 = null;
            }
            aepVar3.e(i, this.a.b(aepVar.a(i), aepVar2.a(i)));
            i++;
        }
        if (aepVar3 != null) {
            return aepVar3;
        }
        defpackage.afga.d("targetVector");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public final defpackage.aep b(long j, defpackage.aep aepVar, defpackage.aep aepVar2) throws afbj {
        defpackage.aep aepVar3;
        defpackage.aep aepVarC = this.c;
        if (aepVarC == null) {
            aepVarC = aepVar.c();
            this.c = aepVarC;
        }
        if (aepVarC == null) {
            defpackage.afga.d("velocityVector");
            aepVarC = null;
        }
        int iB = aepVarC.b();
        int i = 0;
        while (true) {
            aepVar3 = this.c;
            if (i >= iB) {
                break;
            }
            if (aepVar3 == null) {
                defpackage.afga.d("velocityVector");
                aepVar3 = null;
            }
            defpackage.aff affVar = this.a;
            aepVar.a(i);
            aepVar3.e(i, affVar.e(j, aepVar2.a(i)));
            i++;
        }
        if (aepVar3 != null) {
            return aepVar3;
        }
        defpackage.afga.d("velocityVector");
        return null;
    }
}
