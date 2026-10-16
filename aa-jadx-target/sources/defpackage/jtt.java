package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jtt implements defpackage.affh {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jtt(java.lang.Object obj, defpackage.cit citVar, defpackage.cit citVar2, int i) {
        this.d = i;
        this.a = obj;
        this.c = citVar;
        this.b = citVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [hkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v40, types: [afer, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.ktf ktfVar;
        defpackage.bcr bcrVarB;
        int i = this.d;
        int i2 = 1;
        if (i == 0) {
            jto jtoVar = (jto) obj;
            defpackage.bve bveVar = (defpackage.bve) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            jtoVar.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != ((iIntValue & 8) == 0 ? bveVar.C(jtoVar) : bveVar.E(jtoVar)) ? 2 : 4;
            }
            if (bveVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                java.lang.Object obj4 = jtoVar.d;
                if (obj4 == null) {
                    bveVar.v(1389791153);
                    bveVar.o();
                } else {
                    ?? r3 = this.a;
                    bveVar.v(1389791154);
                    java.lang.Object obj5 = jtoVar.a;
                    fxw fxwVar = (fxw) r3;
                    int i3 = fxwVar.f;
                    boolean z = fxwVar.e;
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        ktfVar = i4 != 1 ? jtv.c.e : jtv.b.e;
                    } else {
                        ktfVar = jtv.a.e;
                    }
                    defpackage.ktf ktfVar2 = ktfVar;
                    defpackage.cgf cgfVarD = gvd.d((defpackage.cgf) this.b, (hkd) r3);
                    if (i4 != 0) {
                        bcrVarB = i4 != 1 ? defpackage.bcw.b(jtv.c.d) : defpackage.bcw.b(jtv.b.d);
                    } else {
                        bcrVarB = defpackage.bcw.b(jtv.a.d);
                    }
                    defpackage.bcr bcrVar = bcrVarB;
                    boolean zE = bveVar.E(r3);
                    java.lang.Object objG = bveVar.g();
                    if (zE || objG == defpackage.bvd.a) {
                        objG = new jtr((java.lang.Object) r3, 2);
                        bveVar.x(objG);
                    }
                    defpackage.khg.j((defpackage.cne) obj4, (defpackage.afer) objG, cgfVarD, ktfVar2, z, false, bcrVar, null, (defpackage.ktl) obj5, (defpackage.bmv) this.c, null, null, bveVar, 8, 0, 3232);
                    bveVar.o();
                }
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.atr atrVar = (defpackage.atr) obj;
            defpackage.bve bveVar2 = (defpackage.bve) obj2;
            int iIntValue2 = ((java.lang.Integer) obj3).intValue();
            atrVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true != bveVar2.C(atrVar) ? 2 : 4;
            }
            if (bveVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                hkd hkdVar = ((hcv) this.a).b;
                if (hkdVar == null) {
                    bveVar2.v(64229541);
                    bveVar2.o();
                } else {
                    java.lang.Object obj6 = this.c;
                    bveVar2.v(-690664740);
                    defpackage.cgf cgfVarQ = defpackage.bzd.q(atrVar.a(defpackage.cgf.e, defpackage.cfs.e), (defpackage.cit) obj6);
                    java.lang.Object objG2 = bveVar2.g();
                    if (objG2 == defpackage.bvd.a) {
                        objG2 = new gok(this.b, 19);
                        bveVar2.x(objG2);
                    }
                    gwa.f(hkdVar, defpackage.fxj.h(cgfVarQ, (defpackage.affc) objG2), bveVar2, 0, 0);
                    bveVar2.o();
                }
            } else {
                bveVar2.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.cgf cgfVar = (defpackage.cgf) obj;
            defpackage.bve bveVar3 = (defpackage.bve) obj2;
            int iIntValue3 = ((java.lang.Integer) obj3).intValue();
            cgfVar.getClass();
            if ((iIntValue3 & 6) == 0) {
                iIntValue3 |= true != bveVar3.C(cgfVar) ? 2 : 4;
            }
            if (bveVar3.I((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                java.lang.Object obj7 = this.c;
                java.lang.Object obj8 = this.a;
                defpackage.cgf cgfVarQ2 = defpackage.bzd.q(cgfVar, (defpackage.cit) obj7);
                java.lang.Object objG3 = bveVar3.g();
                if (objG3 == defpackage.bvd.a) {
                    objG3 = new hmz(this.b, 10);
                    bveVar3.x(objG3);
                }
                juu.c(((gdn) obj8).c, defpackage.fxj.h(cgfVarQ2, (defpackage.affc) objG3), bveVar3, 0);
            } else {
                bveVar3.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 3) {
            defpackage.cgf cgfVar2 = (defpackage.cgf) obj;
            defpackage.bve bveVar4 = (defpackage.bve) obj2;
            int iIntValue4 = ((java.lang.Integer) obj3).intValue();
            cgfVar2.getClass();
            if ((iIntValue4 & 6) == 0) {
                iIntValue4 |= true != bveVar4.C(cgfVar2) ? 2 : 4;
            }
            if (bveVar4.I((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                java.lang.Object obj9 = this.b;
                java.lang.Object obj10 = this.a;
                java.lang.Object objG4 = bveVar4.g();
                if (objG4 == defpackage.bvd.a) {
                    objG4 = new hmz(obj9, 9);
                    bveVar4.x(objG4);
                }
                defpackage.juv.a(((gdn) obj10).b, defpackage.fxj.h(cgfVar2, (defpackage.affc) objG4), (defpackage.cit) this.c, (defpackage.cit) obj9, bveVar4, 3456, 0);
            } else {
                bveVar4.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 4) {
            tjt tjtVar = (tjt) obj;
            defpackage.bve bveVar5 = (defpackage.bve) obj2;
            int iIntValue5 = ((java.lang.Integer) obj3).intValue();
            int i5 = klg.a;
            tjtVar.getClass();
            if ((iIntValue5 & 6) == 0) {
                iIntValue5 |= true != ((iIntValue5 & 8) == 0 ? bveVar5.C(tjtVar) : bveVar5.E(tjtVar)) ? 2 : 4;
            }
            int i6 = iIntValue5;
            if (bveVar5.I((i6 & 19) != 18, i6 & 1)) {
                kki kkiVarAy = defpackage.tna.ay(this.c);
                if (kkiVarAy instanceof kki) {
                    ?? r4 = this.a;
                    bveVar5.v(-1713584928);
                    java.util.Iterator it = r4.iterator();
                    while (it.hasNext()) {
                        int i7 = i6 & 14;
                        java.lang.Object obj11 = this.b;
                        int iIntValue6 = ((java.lang.Number) it.next()).intValue();
                        sub.j(tjtVar, jug.e(((kkf) obj11).a.a, iIntValue6), new tkb(((java.lang.Number) kkiVarAy.a).intValue() == iIntValue6), false, (defpackage.affh) null, bveVar5, i7, 58);
                    }
                    bveVar5.o();
                } else {
                    bveVar5.v(222349031);
                    java.util.Objects.toString(kkiVarAy);
                    sub.j(tjtVar, "Current status: ".concat(java.lang.String.valueOf(kkiVarAy)), (tkd) null, false, (defpackage.affh) null, bveVar5, i6 & 14, 62);
                    bveVar5.o();
                }
            } else {
                bveVar5.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 5) {
            defpackage.bve bveVar6 = (defpackage.bve) obj2;
            int iIntValue7 = ((java.lang.Integer) obj3).intValue();
            ((defpackage.awd) obj).getClass();
            if (bveVar6.I((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                java.lang.Object obj12 = this.a;
                java.lang.Object obj13 = this.b;
                java.lang.Object obj14 = this.c;
                defpackage.ktf ktfVar3 = defpackage.ktf.a;
                defpackage.khg.g((defpackage.cne) obj14, (defpackage.dfb) obj13, (defpackage.ktf) obj12, null, bveVar6, 8, 8);
            } else {
                bveVar6.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar7 = (defpackage.bve) obj2;
        int iIntValue8 = ((java.lang.Integer) obj3).intValue();
        ((defpackage.acb) obj).getClass();
        if (bveVar7.I((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
            java.lang.Object obj15 = this.b;
            java.lang.Object obj16 = this.c;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            int i8 = mcx.a;
            defpackage.cgf cgfVarQ3 = defpackage.bzd.q(defpackage.awj.i(defpackage.asq.J(cgcVar, 0.0f, 0.0f, mcw.a, 0.0f), 64.0f), (defpackage.cit) obj16);
            boolean zC = bveVar7.C(obj15);
            java.lang.Object objG5 = bveVar7.g();
            if (zC || objG5 == defpackage.bvd.a) {
                objG5 = new defpackage.mda(obj15, i2);
                bveVar7.x(objG5);
            }
            defpackage.cgf cgfVarS = defpackage.bzd.s(cgfVarQ3, (defpackage.affc) objG5);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            int iF = defpackage.a.f(bveVar7.b());
            defpackage.cdd cddVarN = bveVar7.N();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar7, cgfVarS);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVar7.M();
            bveVar7.w();
            if (bveVar7.G()) {
                bveVar7.j(aferVar);
            } else {
                bveVar7.y();
            }
            ?? r8 = this.a;
            defpackage.byw.c(bveVar7, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVar7, cddVarN, defpackage.cwl.d);
            defpackage.byw.c(bveVar7, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVar7, defpackage.cwl.g);
            defpackage.byw.c(bveVar7, cgfVarN, defpackage.cwl.c);
            defpackage.khg.m(defpackage.day.h(2131231971, bveVar7, 0), r8, null, null, false, null, null, null, null, bveVar7, 8, 0, 4092);
            bveVar7.n();
        } else {
            bveVar7.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ jtt(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ jtt(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
