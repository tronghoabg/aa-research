package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bds implements defpackage.cty {
    final /* synthetic */ defpackage.beg a;
    final /* synthetic */ defpackage.blw b;
    final /* synthetic */ defpackage.dcn c;
    final /* synthetic */ aiuw d;
    final /* synthetic */ defpackage.affc e;
    final /* synthetic */ defpackage.dkd f;
    final /* synthetic */ defpackage.djv g;
    final /* synthetic */ defpackage.dlo h;
    final /* synthetic */ int i;
    final /* synthetic */ defpackage.bcf j;

    public bds(defpackage.beg begVar, defpackage.blw blwVar, defpackage.dcn dcnVar, aiuw aiuwVar, defpackage.affc affcVar, defpackage.dkd dkdVar, defpackage.djv djvVar, defpackage.dlo dloVar, defpackage.bcf bcfVar, int i) {
        this.a = begVar;
        this.b = blwVar;
        this.c = dcnVar;
        this.d = aiuwVar;
        this.e = affcVar;
        this.f = dkdVar;
        this.g = djvVar;
        this.h = dloVar;
        this.j = bcfVar;
        this.i = i;
    }

    @Override // defpackage.cty
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.q(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final int b(defpackage.csz cszVar, java.util.List list, int i) {
        defpackage.beg begVar = this.a;
        begVar.a.c(cszVar.p());
        return begVar.a.a();
    }

    @Override // defpackage.cty
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.s(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.t(this, cszVar, list, i);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0215  */
    /* JADX WARN: Code duplicated, block: B:77:0x021a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0225  */
    /* JADX WARN: Code duplicated, block: B:82:0x0243  */
    /* JADX WARN: Code duplicated, block: B:85:0x024e  */
    /* JADX WARN: Code duplicated, block: B:86:0x025e  */
    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        int i;
        defpackage.bep bepVar;
        defpackage.dga dgaVar;
        defpackage.dga dgaVar2;
        defpackage.dga dgaVar3;
        defpackage.bds bdsVar;
        defpackage.beg begVar;
        int iRound;
        defpackage.ctc ctcVar;
        defpackage.blw blwVar;
        defpackage.dfb dfbVar;
        int iB;
        boolean z;
        defpackage.dlz dlzVar;
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.beg begVar2 = this.a;
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            defpackage.bfi bfiVarE = begVar2.e();
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            defpackage.dga dgaVar4 = bfiVarE != null ? bfiVarE.a : null;
            defpackage.beg begVar3 = this.a;
            defpackage.bep bepVar2 = begVar3.a;
            defpackage.dlz dlzVarP = cubVar.p();
            if (dgaVar4 != null) {
                defpackage.dfb dfbVar2 = bepVar2.a;
                defpackage.dgd dgdVar = bepVar2.b;
                java.util.List list2 = bepVar2.f;
                boolean z2 = bepVar2.c;
                int i2 = bepVar2.d;
                defpackage.dlo dloVar = bepVar2.e;
                defpackage.wde wdeVar = bepVar2.g;
                defpackage.dfi dfiVar = dgaVar4.b;
                if (dfiVar.a.c()) {
                    bepVar = bepVar2;
                    i = 0;
                } else {
                    defpackage.dfz dfzVar = dgaVar4.a;
                    defpackage.dfb dfbVar3 = dfzVar.a;
                    if (defpackage.afga.f(dfbVar3, dfbVar2) && dfzVar.b.v(dgdVar)) {
                        java.util.List list3 = dfzVar.c;
                        if (defpackage.afga.f(list3, list2) && dfzVar.d == Integer.MAX_VALUE && (z = dfzVar.e) == z2 && dfzVar.f == 1) {
                            defpackage.dlo dloVar2 = dfzVar.g;
                            if (defpackage.afga.f(dloVar2, dloVar) && (dlzVar = dfzVar.h) == dlzVarP) {
                                defpackage.wde wdeVar2 = dfzVar.j;
                                if (defpackage.afga.f(wdeVar2, wdeVar)) {
                                    int iD = defpackage.dlm.d(j);
                                    long j2 = dfzVar.i;
                                    if (iD == defpackage.dlm.d(j2) && (!z2 || (defpackage.dlm.b(j) == defpackage.dlm.b(j2) && defpackage.dlm.a(j) == defpackage.dlm.a(j2)))) {
                                        begVar3 = begVar3;
                                        dgaVar = dgaVar4.n(new defpackage.dfz(dfbVar3, dgdVar, list3, Integer.MAX_VALUE, z, 1, dloVar2, dlzVar, wdeVar2, j), defpackage.dln.e(j, (((long) java.lang.Math.round((float) java.lang.Math.ceil(dfiVar.e))) & 4294967295L) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(dfiVar.d))) << 32)));
                                    }
                                    long j3 = dgaVar.c;
                                    afaz afazVar = new afaz(java.lang.Integer.valueOf((int) (j3 >> 32)), java.lang.Integer.valueOf((int) (j3 & 4294967295L)), dgaVar);
                                    int iIntValue = ((java.lang.Number) afazVar.a).intValue();
                                    int iIntValue2 = ((java.lang.Number) afazVar.b).intValue();
                                    dgaVar2 = (defpackage.dga) afazVar.c;
                                    dgaVar2.b.a.c();
                                    dgaVar3 = dgaVar4;
                                    if (defpackage.afga.f(dgaVar3, dgaVar2)) {
                                        bdsVar = this;
                                        begVar = begVar3;
                                    } else {
                                        if (bfiVarE != 0) {
                                            ctcVar = bfiVarE.c;
                                        } else {
                                            ctcVar = null;
                                        }
                                        defpackage.bfi bfiVar = new defpackage.bfi(dgaVar2, ctcVar);
                                        begVar = begVar3;
                                        begVar.e.b(bfiVar);
                                        begVar.j = false;
                                        bdsVar = this;
                                        blwVar = bdsVar.b;
                                        if (blwVar.v() && blwVar.u() && bdsVar.c.d() && !begVar.t() && begVar.q()) {
                                            if (dgaVar3 != null) {
                                                dfbVar = dgaVar3.a.a;
                                            } else {
                                                dfbVar = null;
                                            }
                                            if (!defpackage.afga.f(dfbVar, dgaVar2.a.a)) {
                                                ahoc.d(bdsVar.d, (defpackage.afdo) null, 0, new defpackage.ais(blwVar, bdsVar.j, (defpackage.afdk) null, 18), 3);
                                            }
                                        }
                                        bdsVar.e.invoke(dgaVar2);
                                        defpackage.asq.aj(begVar, bdsVar.f, bdsVar.g);
                                    }
                                    defpackage.dlo dloVar3 = bdsVar.h;
                                    if (bdsVar.i == 1) {
                                        iRound = java.lang.Math.round((float) java.lang.Math.ceil(dgaVar2.a(0)));
                                    } else {
                                        iRound = 0;
                                    }
                                    begVar.c.b(new defpackage.dlr(dloVar3.dG(iRound)));
                                    defpackage.afau[] afauVarArr = {new defpackage.afau(defpackage.csi.a, java.lang.Integer.valueOf(java.lang.Math.round(dgaVar2.d))), new defpackage.afau(defpackage.csi.b, java.lang.Integer.valueOf(java.lang.Math.round(dgaVar2.e)))};
                                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.afga.P(2));
                                    defpackage.afga.Z(linkedHashMap, afauVarArr);
                                    return cubVar.dS(iIntValue, iIntValue2, linkedHashMap, new defpackage.awl(15));
                                }
                            }
                        }
                    }
                    i = 0;
                    bepVar = bepVar2;
                }
            } else {
                i = 0;
                bepVar = bepVar2;
            }
            bepVar.c(dlzVarP);
            int iD2 = defpackage.dlm.d(j);
            boolean z3 = bepVar.c;
            if (z3) {
                iB = defpackage.dlm.h(j) ? defpackage.dlm.b(j) : Integer.MAX_VALUE;
                if (!z3) {
                    int i3 = bepVar.d;
                }
                if (iD2 != iB) {
                    iB = defpackage.afqt.g(bepVar.a(), iD2, iB);
                }
                defpackage.dfj dfjVarB = bepVar.b();
                long jL = defpackage.dln.l(i, iB, i, defpackage.dlm.a(j));
                int i4 = bepVar.d;
                defpackage.dfi dfiVar2 = new defpackage.dfi(dfjVarB, jL, Integer.MAX_VALUE, 1);
                dgaVar = new defpackage.dga(new defpackage.dfz(bepVar.a, bepVar.b, bepVar.f, Integer.MAX_VALUE, z3, 1, bepVar.e, dlzVarP, bepVar.g, j), dfiVar2, defpackage.dln.e(j, (((long) java.lang.Math.round((float) java.lang.Math.ceil(dfiVar2.e))) & 4294967295L) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(dfiVar2.d))) << 32)));
                long j4 = dgaVar.c;
                afaz afazVar2 = new afaz(java.lang.Integer.valueOf((int) (j4 >> 32)), java.lang.Integer.valueOf((int) (j4 & 4294967295L)), dgaVar);
                int iIntValue3 = ((java.lang.Number) afazVar2.a).intValue();
                int iIntValue4 = ((java.lang.Number) afazVar2.b).intValue();
                dgaVar2 = (defpackage.dga) afazVar2.c;
                dgaVar2.b.a.c();
                dgaVar3 = dgaVar4;
                if (defpackage.afga.f(dgaVar3, dgaVar2)) {
                    if (bfiVarE != 0) {
                        ctcVar = bfiVarE.c;
                    } else {
                        ctcVar = null;
                    }
                    defpackage.bfi bfiVar2 = new defpackage.bfi(dgaVar2, ctcVar);
                    begVar = begVar3;
                    begVar.e.b(bfiVar2);
                    begVar.j = false;
                    bdsVar = this;
                    blwVar = bdsVar.b;
                    if (blwVar.v()) {
                        if (dgaVar3 != null) {
                            dfbVar = dgaVar3.a.a;
                        } else {
                            dfbVar = null;
                        }
                        if (!defpackage.afga.f(dfbVar, dgaVar2.a.a)) {
                            ahoc.d(bdsVar.d, (defpackage.afdo) null, 0, new defpackage.ais(blwVar, bdsVar.j, (defpackage.afdk) null, 18), 3);
                        }
                    }
                    bdsVar.e.invoke(dgaVar2);
                    defpackage.asq.aj(begVar, bdsVar.f, bdsVar.g);
                } else {
                    bdsVar = this;
                    begVar = begVar3;
                }
                defpackage.dlo dloVar4 = bdsVar.h;
                if (bdsVar.i == 1) {
                    iRound = java.lang.Math.round((float) java.lang.Math.ceil(dgaVar2.a(0)));
                } else {
                    iRound = 0;
                }
                begVar.c.b(new defpackage.dlr(dloVar4.dG(iRound)));
                defpackage.afau[] afauVarArr2 = {new defpackage.afau(defpackage.csi.a, java.lang.Integer.valueOf(java.lang.Math.round(dgaVar2.d))), new defpackage.afau(defpackage.csi.b, java.lang.Integer.valueOf(java.lang.Math.round(dgaVar2.e)))};
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.afga.P(2));
                defpackage.afga.Z(linkedHashMap2, afauVarArr2);
                return cubVar.dS(iIntValue3, iIntValue4, linkedHashMap2, new defpackage.awl(15));
            }
            int i5 = bepVar.d;
            if (!z3) {
                int i6 = bepVar.d;
            }
            if (iD2 != iB) {
                iB = defpackage.afqt.g(bepVar.a(), iD2, iB);
            }
            defpackage.dfj dfjVarB2 = bepVar.b();
            long jL2 = defpackage.dln.l(i, iB, i, defpackage.dlm.a(j));
            int i7 = bepVar.d;
            defpackage.dfi dfiVar3 = new defpackage.dfi(dfjVarB2, jL2, Integer.MAX_VALUE, 1);
            dgaVar = new defpackage.dga(new defpackage.dfz(bepVar.a, bepVar.b, bepVar.f, Integer.MAX_VALUE, z3, 1, bepVar.e, dlzVarP, bepVar.g, j), dfiVar3, defpackage.dln.e(j, (((long) java.lang.Math.round((float) java.lang.Math.ceil(dfiVar3.e))) & 4294967295L) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(dfiVar3.d))) << 32)));
            long j5 = dgaVar.c;
            afaz afazVar3 = new afaz(java.lang.Integer.valueOf((int) (j5 >> 32)), java.lang.Integer.valueOf((int) (j5 & 4294967295L)), dgaVar);
            int iIntValue5 = ((java.lang.Number) afazVar3.a).intValue();
            int iIntValue6 = ((java.lang.Number) afazVar3.b).intValue();
            dgaVar2 = (defpackage.dga) afazVar3.c;
            dgaVar2.b.a.c();
            dgaVar3 = dgaVar4;
            if (defpackage.afga.f(dgaVar3, dgaVar2)) {
                if (bfiVarE != 0) {
                    ctcVar = bfiVarE.c;
                } else {
                    ctcVar = null;
                }
                defpackage.bfi bfiVar3 = new defpackage.bfi(dgaVar2, ctcVar);
                begVar = begVar3;
                begVar.e.b(bfiVar3);
                begVar.j = false;
                bdsVar = this;
                blwVar = bdsVar.b;
                if (blwVar.v()) {
                    if (dgaVar3 != null) {
                        dfbVar = dgaVar3.a.a;
                    } else {
                        dfbVar = null;
                    }
                    if (!defpackage.afga.f(dfbVar, dgaVar2.a.a)) {
                        ahoc.d(bdsVar.d, (defpackage.afdo) null, 0, new defpackage.ais(blwVar, bdsVar.j, (defpackage.afdk) null, 18), 3);
                    }
                }
                bdsVar.e.invoke(dgaVar2);
                defpackage.asq.aj(begVar, bdsVar.f, bdsVar.g);
            } else {
                bdsVar = this;
                begVar = begVar3;
            }
            defpackage.dlo dloVar5 = bdsVar.h;
            if (bdsVar.i == 1) {
                iRound = java.lang.Math.round((float) java.lang.Math.ceil(dgaVar2.a(0)));
            } else {
                iRound = 0;
            }
            begVar.c.b(new defpackage.dlr(dloVar5.dG(iRound)));
            defpackage.afau[] afauVarArr3 = {new defpackage.afau(defpackage.csi.a, java.lang.Integer.valueOf(java.lang.Math.round(dgaVar2.d))), new defpackage.afau(defpackage.csi.b, java.lang.Integer.valueOf(java.lang.Math.round(dgaVar2.e)))};
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(defpackage.afga.P(2));
            defpackage.afga.Z(linkedHashMap3, afauVarArr3);
            return cubVar.dS(iIntValue5, iIntValue6, linkedHashMap3, new defpackage.awl(15));
        } catch (java.lang.Throwable th) {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            throw th;
        }
    }
}
