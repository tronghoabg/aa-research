package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class abs implements defpackage.affc {
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abs(java.lang.Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        long jA;
        int iOrdinal;
        defpackage.affc affcVar;
        defpackage.affc affcVar2;
        int i = this.c;
        long jA2 = 0;
        if (i == 0) {
            defpackage.abt abtVar = (defpackage.abt) this.b;
            if (defpackage.afga.f(obj, abtVar.c.f())) {
                jA2 = abtVar.a(this.a);
            } else {
                defpackage.bys bysVar = (defpackage.bys) abtVar.c.f.a(obj);
                if (bysVar != null) {
                    jA2 = ((defpackage.dly) bysVar.a()).a;
                }
            }
            return new defpackage.dly(jA2);
        }
        if (i == 1) {
            defpackage.agj agjVar = (defpackage.agj) obj;
            java.lang.Object objF = agjVar.f();
            defpackage.abt abtVar2 = (defpackage.abt) this.b;
            if (defpackage.afga.f(objF, abtVar2.c.f())) {
                jA = abtVar2.a(this.a);
            } else {
                defpackage.bys bysVar2 = (defpackage.bys) abtVar2.c.f.a(agjVar.f());
                jA = bysVar2 != null ? ((defpackage.dly) bysVar2.a()).a : 0L;
            }
            defpackage.bys bysVar3 = (defpackage.bys) abtVar2.c.f.a(agjVar.g());
            jA2 = bysVar3 != null ? ((defpackage.dly) bysVar3.a()).a : 0L;
            defpackage.adp adpVar = (defpackage.adp) abtVar2.b.a();
            if (adpVar != null) {
                defpackage.afd afdVar = (defpackage.afd) adpVar.b.invoke(new defpackage.dly(jA), new defpackage.dly(jA2));
                if (afdVar != null) {
                    return afdVar;
                }
            }
            return new defpackage.aga(1.0f, 400.0f, null);
        }
        if (i == 2) {
            int iOrdinal2 = ((defpackage.acj) obj).ordinal();
            java.lang.Object obj2 = this.b;
            long j = this.a;
            if (iOrdinal2 == 0) {
                defpackage.acd acdVar = ((defpackage.acv) obj2).e.b.c;
                if (acdVar != null) {
                    j = ((defpackage.dly) acdVar.b.invoke(new defpackage.dly(j))).a;
                }
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new defpackage.afas();
                }
                defpackage.acd acdVar2 = ((defpackage.acv) obj2).f.b.c;
                if (acdVar2 != null) {
                    j = ((defpackage.dly) acdVar2.b.invoke(new defpackage.dly(j))).a;
                }
            }
            return new defpackage.dly(j);
        }
        if (i != 3) {
            if (i != 4) {
                long jC = defpackage.dlw.c(((defpackage.dlw) ((defpackage.aeb) obj).d()).a, this.a);
                defpackage.azf azfVar = (defpackage.azf) this.b;
                azfVar.g(jC);
                azfVar.b.invoke();
                return defpackage.afbk.a;
            }
            defpackage.acj acjVar = (defpackage.acj) obj;
            defpackage.acv acvVar = (defpackage.acv) this.b;
            defpackage.adq adqVar = acvVar.e.b.b;
            long j2 = this.a;
            long j3 = (adqVar == null || (affcVar2 = adqVar.a) == null) ? 0L : ((defpackage.dlw) affcVar2.invoke(new defpackage.dly(j2))).a;
            defpackage.adq adqVar2 = acvVar.f.b.b;
            long j4 = (adqVar2 == null || (affcVar = adqVar2.a) == null) ? 0L : ((defpackage.dlw) affcVar.invoke(new defpackage.dly(j2))).a;
            int iOrdinal3 = acjVar.ordinal();
            if (iOrdinal3 == 0) {
                jA2 = j3;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    throw new defpackage.afas();
                }
                jA2 = j4;
            }
            return new defpackage.dlw(jA2);
        }
        defpackage.acj acjVar2 = (defpackage.acj) obj;
        defpackage.acv acvVar2 = (defpackage.acv) this.b;
        if (acvVar2.j != null && acvVar2.a() != null && !defpackage.afga.f(acvVar2.j, acvVar2.a()) && (iOrdinal = acjVar2.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new defpackage.afas();
            }
            defpackage.acd acdVar3 = acvVar2.f.b.c;
            if (acdVar3 != null) {
                long j5 = this.a;
                long j6 = ((defpackage.dly) acdVar3.b.invoke(new defpackage.dly(j5))).a;
                defpackage.cfu cfuVarA = acvVar2.a();
                cfuVarA.getClass();
                defpackage.dlz dlzVar = defpackage.dlz.a;
                long jA3 = cfuVarA.a(j5, j6, dlzVar);
                defpackage.cfu cfuVar = acvVar2.j;
                cfuVar.getClass();
                jA2 = defpackage.dlw.c(jA3, cfuVar.a(j5, j6, dlzVar));
            }
        }
        return new defpackage.dlw(jA2);
    }
}
