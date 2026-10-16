package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ggb implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;
    public final /* synthetic */ java.lang.Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ ggb(defpackage.cgf cgfVar, defpackage.axx axxVar, defpackage.avv avvVar, defpackage.ath athVar, defpackage.cft cftVar, defpackage.aor aorVar, boolean z, defpackage.aiz aizVar, defpackage.affc affcVar, int i) {
        this.j = i;
        this.f = cgfVar;
        this.c = axxVar;
        this.e = avvVar;
        this.d = athVar;
        this.g = cftVar;
        this.i = aorVar;
        this.b = z;
        this.h = aizVar;
        this.a = affcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [hkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [avv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ath, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [cft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [aor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [avv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [asj, ask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [cld, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cgc cgcVar;
        defpackage.cgf cgfVarH;
        defpackage.cgf cgfVarH2;
        defpackage.afer aferVar;
        java.lang.Object obj3;
        defpackage.ajl ajlVar;
        int i = this.j;
        int i2 = 0;
        i2 = 0;
        int i3 = 1;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                java.lang.Object obj4 = this.c;
                bveVar.t(-363495132, this.a);
                long j = ((defpackage.ckd) bveVar.f(ggl.a)).a;
                defpackage.cgc cgcVar2 = defpackage.cgf.e;
                gge ggeVar = (gge) obj4;
                if (((java.lang.Number) ggeVar.a().d()).floatValue() < 1.0f) {
                    cgcVar = cgcVar2;
                    cgfVarH = defpackage.cjv.h(cgcVar2, 0.0f, 0.0f, ((java.lang.Number) ggeVar.a().d()).floatValue(), 0.0f, 0.0f, null, false, 0, 1048571);
                } else {
                    cgcVar = cgcVar2;
                    cgfVarH = cgcVar;
                }
                ?? r6 = this.i;
                ?? r9 = this.h;
                java.lang.Object obj5 = this.f;
                java.lang.Object obj6 = this.e;
                java.lang.Object obj7 = this.d;
                boolean z = this.b;
                defpackage.cit citVar = (defpackage.cit) obj7;
                gvv gvvVar = (gvv) obj5;
                defpackage.bqv.b(cgfVarH, null, j, 0L, 0.0f, null, defpackage.dai.as(-410232931, true, new hjo(ggeVar, (defpackage.cit) obj6, citVar, gvvVar, (defpackage.cgf) r6, (defpackage.cgf) r9, 1), bveVar), bveVar, 122);
                if (z) {
                    bveVar.v(1618684048);
                    cgcVar.getClass();
                    obj6.getClass();
                    defpackage.cgf cgfVarBe = obj7 != null ? defpackage.ca.be(defpackage.bzd.q(cgcVar, citVar)) : cgcVar;
                    int iOrdinal = gvvVar.ordinal();
                    if (iOrdinal == 0) {
                        cgfVarH2 = cgcVar;
                    } else if (iOrdinal == 1 || iOrdinal == 2) {
                        cgfVarH2 = defpackage.fxj.h(cgcVar, new defpackage.fzs(obj6, 5));
                    } else {
                        if (iOrdinal != 3 && iOrdinal != 4) {
                            throw new defpackage.afas();
                        }
                        cgfVarH2 = defpackage.fxj.h(cgcVar, new defpackage.fzs(obj6, 6));
                    }
                    fwu.l(((gvo) this.g).a().b(), cgfVarBe.a(cgfVarH2), (defpackage.cgf) r9, bveVar, 0);
                    bveVar.o();
                } else {
                    bveVar.v(1619080941);
                    bveVar.o();
                }
                bveVar.m();
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.bve bveVar2 = (defpackage.bve) obj;
            int iIntValue2 = ((java.lang.Integer) obj2).intValue();
            if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                ?? r1 = this.f;
                fxh fxhVar = (fxh) r1;
                defpackage.afer aferVar2 = fxhVar.d;
                if (aferVar2 == null) {
                    bveVar2.v(-1614309574);
                    java.lang.Object objG = bveVar2.g();
                    if (objG == defpackage.bvd.a) {
                        objG = new fwy(4);
                        bveVar2.x(objG);
                    }
                    bveVar2.o();
                    aferVar = (defpackage.afer) objG;
                } else {
                    bveVar2.v(-1714643015);
                    bveVar2.o();
                    aferVar = aferVar2;
                }
                ?? r10 = this.h;
                ?? r11 = this.c;
                java.lang.Object obj8 = this.a;
                defpackage.cgf cgfVarA = fxf.a(gzs.b((defpackage.cgf) this.e, (hkd) r1));
                fxn fxnVar = (fxn) obj8;
                long j2 = ((defpackage.ckd) fxnVar.j.invoke(bveVar2, 0)).a;
                float f = defpackage.gvt.i(bveVar2).f.c;
                ggo ggoVar = new ggo(f, f, f);
                long j3 = ((defpackage.ckd) fxnVar.k.invoke(bveVar2, 0)).a;
                float f2 = (defpackage.gvt.i(bveVar2).f.c - 1.0f) + 0.0f;
                defpackage.cgf cgfVarA2 = ggn.a(cgfVarA, (defpackage.cld) r11, j2, j3, ggoVar, new ggo(f2, f2, f2), (defpackage.asj) r10, false, false, bveVar2, 113246208, 0);
                if (fxhVar.e && aferVar2 != null) {
                    i2 = 1;
                }
                java.lang.Object obj9 = this.d;
                defpackage.afer aferVar3 = aferVar;
                defpackage.bmr bmrVar = new defpackage.bmr(((defpackage.ckd) fxnVar.h.invoke(bveVar2, 0)).a, ((defpackage.ckd) fxnVar.i.invoke(bveVar2, 0)).a, ((defpackage.ckd) fxnVar.l.invoke(bveVar2, 0)).a, ((defpackage.ckd) fxnVar.m.invoke(bveVar2, 0)).a);
                if (obj9 == null) {
                    bveVar2.v(-1714617353);
                    defpackage.avv avvVar = defpackage.bms.a;
                    defpackage.bmv bmvVar = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    bveVar2.o();
                    obj3 = bmvVar;
                } else {
                    bveVar2.v(-1714618221);
                    bveVar2.o();
                    obj3 = obj9;
                }
                fxg fxgVar = (fxg) this.g;
                defpackage.affg affgVar = fxgVar.k;
                if (affgVar == null) {
                    bveVar2.v(-1613393773);
                    bveVar2.o();
                    ajlVar = null;
                } else {
                    bveVar2.v(-1714612946);
                    ajlVar = (defpackage.ajl) affgVar.invoke(bveVar2, 0);
                    bveVar2.o();
                }
                defpackage.bxi.q(aferVar3, cgfVarA2, i2, r11, bmrVar, (defpackage.bmv) obj3, ajlVar, this.i, r10, defpackage.dai.as(945387382, true, new kle(fxhVar, fxgVar, this.b, 1), bveVar2), bveVar2, 805306368, 0);
            } else {
                bveVar2.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.bve bveVar3 = (defpackage.bve) obj;
            int iIntValue3 = ((java.lang.Integer) obj2).intValue();
            if (bveVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                java.lang.Object obj10 = this.a;
                boolean zC = bveVar3.C(obj10);
                java.lang.Object objG2 = bveVar3.g();
                if (zC || objG2 == defpackage.bvd.a) {
                    objG2 = new defpackage.kwz(obj10, i3);
                    bveVar3.x(objG2);
                }
                java.lang.Object obj11 = this.h;
                boolean z2 = this.b;
                defpackage.axd.c(this.f, (defpackage.axx) this.c, this.e, this.d, this.g, this.i, z2, (defpackage.aiz) obj11, (defpackage.affc) objG2, bveVar3, 0, 0);
            } else {
                bveVar3.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar4 = (defpackage.bve) obj;
        int iIntValue4 = ((java.lang.Integer) obj2).intValue();
        if (bveVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
            java.lang.Object objG3 = bveVar4.g();
            java.lang.Object obj12 = defpackage.bvd.a;
            if (objG3 == obj12) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bveVar4.x(parcelableSnapshotMutableState);
                objG3 = parcelableSnapshotMutableState;
            }
            java.lang.Object obj13 = this.f;
            defpackage.bwx bwxVar = (defpackage.bwx) objG3;
            java.lang.Object objG4 = bveVar4.g();
            if (objG4 == obj12) {
                defpackage.mtd mtdVar = new defpackage.mtd(obj13, this.d, i3);
                defpackage.lam lamVar = defpackage.byp.a;
                objG4 = new defpackage.bvr(mtdVar, null);
                bveVar4.x(objG4);
            }
            defpackage.muf mufVar = (defpackage.muf) obj13;
            defpackage.bys bysVar = (defpackage.bys) objG4;
            defpackage.bys bysVarM = defpackage.bxi.m(mufVar.c, java.lang.Float.valueOf(0.0f), bveVar4);
            java.lang.Object objG5 = bveVar4.g();
            if (objG5 == obj12) {
                defpackage.mtd mtdVar2 = new defpackage.mtd((java.lang.Object) bysVarM, (java.lang.Object) bwxVar, i2);
                defpackage.lam lamVar2 = defpackage.byp.a;
                defpackage.bvr bvrVar = new defpackage.bvr(mtdVar2, null);
                bveVar4.x(bvrVar);
                objG5 = bvrVar;
            }
            ?? r7 = this.e;
            java.lang.Object[] objArr = (((defpackage.aft) this.h).e() && ((java.lang.Boolean) r7.a()).booleanValue() && !((java.lang.Boolean) ((defpackage.bys) objG5).a()).booleanValue()) ? false : true;
            defpackage.afau afauVar = (defpackage.afau) bysVar.a();
            java.lang.Object objG6 = bveVar4.g();
            if (objG6 == obj12) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(afauVar, defpackage.bxv.c);
                bveVar4.x(parcelableSnapshotMutableState2);
                objG6 = parcelableSnapshotMutableState2;
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objG6;
            if (objArr == false) {
                bwxVar2.b(afauVar);
            }
            defpackage.afau afauVar2 = (defpackage.afau) bwxVar2.a();
            float fraction = ((android.content.Context) bveVar4.f(defpackage.daj.b)).getResources().getFraction(2131361794, 1, 1);
            boolean z3 = bveVar4.z(fraction);
            java.lang.Object objG7 = bveVar4.g();
            if (z3 || objG7 == obj12) {
                objG7 = new mte(fraction, bwxVar, 0);
                bveVar4.x(objG7);
            }
            defpackage.ca.V(afauVar2, null, (defpackage.affc) objG7, null, "topCard", null, defpackage.dai.as(-1067501200, true, new mtf(mufVar, (defpackage.affh) this.a, this.b, (defpackage.cit) this.c, bysVarM, fraction, (defpackage.bys) r7, bwxVar, (defpackage.bwx) this.i, (defpackage.cit) this.g), bveVar4), bveVar4, 1597448, 42);
        } else {
            bveVar4.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ ggb(fxh fxhVar, defpackage.cgf cgfVar, fxn fxnVar, defpackage.cld cldVar, defpackage.ask askVar, defpackage.bmv bmvVar, fxg fxgVar, defpackage.avv avvVar, boolean z, int i) {
        this.j = i;
        this.f = fxhVar;
        this.e = cgfVar;
        this.a = fxnVar;
        this.c = cldVar;
        this.h = askVar;
        this.d = bmvVar;
        this.g = fxgVar;
        this.i = avvVar;
        this.b = z;
    }

    public /* synthetic */ ggb(java.lang.Object obj, gge ggeVar, boolean z, defpackage.cit citVar, defpackage.cit citVar2, gvv gvvVar, gvo gvoVar, defpackage.cgf cgfVar, defpackage.cgf cgfVar2, int i) {
        this.j = i;
        this.a = obj;
        this.c = ggeVar;
        this.b = z;
        this.d = citVar;
        this.e = citVar2;
        this.f = gvvVar;
        this.g = gvoVar;
        this.h = cgfVar;
        this.i = cgfVar2;
    }

    public /* synthetic */ ggb(defpackage.muf mufVar, defpackage.aft aftVar, defpackage.bys bysVar, defpackage.bys bysVar2, defpackage.affh affhVar, boolean z, defpackage.cit citVar, defpackage.bwx bwxVar, defpackage.cit citVar2, int i) {
        this.j = i;
        this.f = mufVar;
        this.h = aftVar;
        this.d = bysVar;
        this.e = bysVar2;
        this.a = affhVar;
        this.b = z;
        this.c = citVar;
        this.i = bwxVar;
        this.g = citVar2;
    }
}
