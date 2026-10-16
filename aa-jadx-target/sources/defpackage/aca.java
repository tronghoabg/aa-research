package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aca implements defpackage.affh {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ aca(defpackage.acb acbVar, defpackage.acw acwVar, defpackage.acx acxVar, int i) {
        this.e = i;
        this.a = acbVar;
        this.b = acwVar;
        this.c = acxVar;
        this.d = "animateEnterExit";
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [affi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [djv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [cgf] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r2v34, types: [bve] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.cgf cgfVarA;
        defpackage.bam bamVar;
        defpackage.cgf cgfVarA2;
        int i = this.e;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj2;
            ((java.lang.Integer) obj3).intValue();
            bveVar.v(1840112047);
            defpackage.cgf cgfVarA3 = ((defpackage.cgf) obj).a(defpackage.acs.m(((defpackage.acc) this.a).a, (defpackage.acw) this.b, (defpackage.acx) this.c, null, (java.lang.String) this.d, bveVar, 0, 28));
            bveVar.o();
            return cgfVarA3;
        }
        boolean z = true;
        if (i == 1) {
            defpackage.acb acbVar = (defpackage.acb) obj;
            defpackage.bve bveVar2 = (defpackage.bve) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != ((iIntValue & 8) == 0 ? bveVar2.C(acbVar) : bveVar2.E(acbVar)) ? 2 : 4;
            }
            if (bveVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.c;
                boolean zC = bveVar2.C(obj5) | bveVar2.E(obj6) | bveVar2.E(obj4);
                java.lang.Object objG = bveVar2.g();
                if (zC || objG == defpackage.bvd.a) {
                    defpackage.acn acnVar = new defpackage.acn(obj5, obj6, obj4, 1, (byte[]) null);
                    bveVar2.x(acnVar);
                    objG = acnVar;
                }
                defpackage.bvx.b(acbVar, obj6, (defpackage.affc) objG, bveVar2);
                defpackage.aau aauVar = ((defpackage.abr) obj4).f;
                acbVar.getClass();
                aauVar.m(obj6, ((defpackage.acc) acbVar).b);
                java.lang.Object objG2 = bveVar2.g();
                if (objG2 == defpackage.bvd.a) {
                    objG2 = new defpackage.abn(acbVar);
                    bveVar2.x(objG2);
                }
                this.d.invoke((defpackage.abn) objG2, obj6, bveVar2, 0);
            } else {
                bveVar2.s();
            }
            return defpackage.afbk.a;
        }
        byte[] bArr = null;
        if (i != 2) {
            defpackage.cgf cgfVar = (defpackage.cgf) obj;
            ?? r2 = (defpackage.bve) obj2;
            ((java.lang.Integer) obj3).intValue();
            r2.v(-84507373);
            boolean zBooleanValue = ((java.lang.Boolean) r2.f(defpackage.dbl.s)).booleanValue();
            boolean zD = r2.D(zBooleanValue);
            java.lang.Object objG3 = r2.g();
            if (zD || objG3 == defpackage.bvd.a) {
                objG3 = new defpackage.jlj(zBooleanValue);
                r2.x(objG3);
            }
            java.lang.Object obj7 = this.b;
            defpackage.jlj jljVar = (defpackage.jlj) objG3;
            if ((obj7 instanceof defpackage.clf) && ((defpackage.clf) obj7).a == 16) {
                z = false;
            }
            if (((defpackage.dcn) r2.f(defpackage.dbl.o)).d()) {
                java.lang.Object obj8 = this.a;
                defpackage.beg begVar = (defpackage.beg) obj8;
                if (begVar.q()) {
                    java.lang.Object obj9 = this.d;
                    defpackage.dkd dkdVar = (defpackage.dkd) obj9;
                    long j = dkdVar.b;
                    if (defpackage.dgc.i(j) && z) {
                        r2.v(-707487962);
                        defpackage.dfb dfbVar = dkdVar.a;
                        defpackage.dgc dgcVar = new defpackage.dgc(j);
                        boolean zE = r2.E(jljVar);
                        java.lang.Object objG4 = r2.g();
                        if (zE || objG4 == defpackage.bvd.a) {
                            objG4 = new defpackage.ber(jljVar, (defpackage.afdk) null, 0);
                            r2.x(objG4);
                        }
                        ?? r11 = this.c;
                        defpackage.bvx.f(dfbVar, dgcVar, (defpackage.affg) objG4, r2);
                        boolean zE2 = r2.E(jljVar) | r2.E(r11) | r2.C(obj9) | r2.E(obj8) | r2.C(obj7);
                        java.lang.Object objG5 = r2.g();
                        if (zE2 || objG5 == defpackage.bvd.a) {
                            defpackage.bia biaVar = new defpackage.bia(jljVar, (defpackage.djv) r11, dkdVar, begVar, (defpackage.cka) obj7, 1);
                            r2.x(biaVar);
                            objG5 = biaVar;
                        }
                        cgfVarA2 = cgfVar.a(new defpackage.chm((defpackage.affc) objG5));
                        r2.o();
                    } else {
                        r2.v(-705473241);
                        r2.o();
                        cgfVarA2 = defpackage.cgf.e;
                    }
                } else {
                    r2.v(-705473241);
                    r2.o();
                    cgfVarA2 = defpackage.cgf.e;
                }
            } else {
                r2.v(-705473241);
                r2.o();
                cgfVarA2 = defpackage.cgf.e;
            }
            r2.o();
            return cgfVarA2;
        }
        defpackage.cds cdsVar = (defpackage.cds) obj;
        defpackage.bve bveVar3 = (defpackage.bve) obj2;
        ((java.lang.Integer) obj3).intValue();
        java.lang.Object objG6 = bveVar3.g();
        java.lang.Object obj10 = defpackage.bvd.a;
        if (objG6 == obj10) {
            defpackage.ngb ngbVar = new defpackage.ngb(cdsVar, new defpackage.aln(this.c, 17));
            bveVar3.x(ngbVar);
            objG6 = ngbVar;
        }
        defpackage.ngb ngbVar2 = (defpackage.ngb) objG6;
        java.lang.Object objG7 = bveVar3.g();
        if (objG7 == obj10) {
            objG7 = new defpackage.cvl(new defpackage.azn(ngbVar2));
            bveVar3.x(objG7);
        }
        java.lang.Object obj11 = this.b;
        defpackage.cvl cvlVar = (defpackage.cvl) objG7;
        if (obj11 != null) {
            bveVar3.v(1743490539);
            bveVar3.v(887527095);
            if (android.os.Build.FINGERPRINT == null || !defpackage.afga.f(android.os.Build.FINGERPRINT, "robolectric")) {
                bveVar3.v(1345729441);
                android.view.View view = (android.view.View) bveVar3.f(defpackage.daj.f);
                boolean zC2 = bveVar3.C(view);
                java.lang.Object objG8 = bveVar3.g();
                if (zC2 || objG8 == obj10) {
                    java.lang.Object tag = view.getTag(2131427821);
                    objG8 = tag instanceof defpackage.bam ? (defpackage.bam) tag : null;
                    if (objG8 == null) {
                        objG8 = new defpackage.ayi(view);
                        view.setTag(2131427821, objG8);
                    }
                    bveVar3.x(objG8);
                }
                bamVar = (defpackage.bam) objG8;
                bveVar3.o();
            } else {
                bveVar3.v(1345548711);
                java.lang.Object objG9 = bveVar3.g();
                if (objG9 == obj10) {
                    objG9 = new defpackage.ban();
                    bveVar3.x(objG9);
                }
                bamVar = (defpackage.ban) objG9;
                bveVar3.o();
            }
            defpackage.bam bamVar2 = bamVar;
            bveVar3.o();
            java.lang.Object[] objArr = {obj11, ngbVar2, cvlVar, bamVar2};
            boolean zC3 = bveVar3.C(obj11) | bveVar3.E(ngbVar2) | bveVar3.E(cvlVar) | bveVar3.E(bamVar2);
            java.lang.Object objG10 = bveVar3.g();
            if (zC3 || objG10 == obj10) {
                defpackage.afl aflVar = new defpackage.afl((defpackage.azy) obj11, ngbVar2, cvlVar, bamVar2, 5);
                bveVar3.x(aflVar);
                objG10 = aflVar;
            }
            defpackage.bvx.d(objArr, (defpackage.affc) objG10, bveVar3);
            bveVar3.o();
        } else {
            bveVar3.v(1744076749);
            bveVar3.o();
        }
        ?? r1 = this.d;
        ?? r3 = r1;
        if (obj11 != null && (cgfVarA = r1.a(new defpackage.baq((defpackage.azy) obj11))) != null) {
            r3 = r1;
            r3 = cgfVarA;
        }
        r3 = r1;
        java.lang.Object obj12 = this.a;
        boolean zC4 = bveVar3.C(ngbVar2) | bveVar3.C(obj12);
        java.lang.Object objG11 = bveVar3.g();
        if (zC4 || objG11 == obj10) {
            objG11 = new defpackage.aps(ngbVar2, obj12, 5, bArr);
            bveVar3.x(objG11);
        }
        defpackage.cvh.b(cvlVar, r3, (defpackage.affg) objG11, bveVar3, 8);
        return defpackage.afbk.a;
    }

    public /* synthetic */ aca(defpackage.azy azyVar, defpackage.cgf cgfVar, defpackage.azo azoVar, defpackage.bys bysVar, int i) {
        this.e = i;
        this.b = azyVar;
        this.d = cgfVar;
        this.a = azoVar;
        this.c = bysVar;
    }

    public /* synthetic */ aca(defpackage.cka ckaVar, defpackage.beg begVar, defpackage.dkd dkdVar, defpackage.djv djvVar, int i) {
        this.e = i;
        this.b = ckaVar;
        this.a = begVar;
        this.d = dkdVar;
        this.c = djvVar;
    }

    public /* synthetic */ aca(java.lang.Object obj, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, defpackage.abr abrVar, defpackage.affi affiVar, int i) {
        this.e = i;
        this.c = obj;
        this.b = snapshotStateList;
        this.a = abrVar;
        this.d = affiVar;
    }
}
