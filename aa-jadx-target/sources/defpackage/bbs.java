package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bbs implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bbs(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Type inference failed for: r0v20, types: [bkc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v55, types: [bys, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws afbj {
        defpackage.bbo bboVar;
        java.lang.Boolean boolA;
        defpackage.bbo bboVar2 = null;
        int i = 1;
        boolean z = true;
        int i2 = 0;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Float f = (java.lang.Float) obj;
                float fFloatValue = f.floatValue();
                defpackage.bby bbyVar = (defpackage.bby) this.a;
                long jT = defpackage.afw.T(bbyVar);
                float f2 = bbyVar.j + fFloatValue;
                long jM = defpackage.afhi.m(f2);
                bbyVar.j = f2 - jM;
                if (java.lang.Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jT + jM;
                    long j2 = defpackage.afqt.j(j, bbyVar.i, bbyVar.h);
                    long j3 = j2 - jT;
                    float f3 = j3;
                    bbyVar.k = f3;
                    if (java.lang.Math.abs(j3) != 0) {
                        bbyVar.A.b(java.lang.Boolean.valueOf(f3 > 0.0f));
                        bbyVar.B.b(java.lang.Boolean.valueOf(f3 < 0.0f));
                    }
                    int i3 = (int) j3;
                    int i4 = -i3;
                    defpackage.bbo bboVarE = ((defpackage.bbo) bbyVar.n.a()).e(i4);
                    if (bboVarE == null || (bboVar = bbyVar.d) == null) {
                        bboVar2 = bboVarE;
                    } else {
                        defpackage.bbo bboVarE2 = bboVar.e(i4);
                        if (bboVarE2 != null) {
                            bbyVar.d = bboVarE2;
                            bboVar2 = bboVarE;
                        }
                    }
                    if (bboVar2 != null) {
                        bbyVar.r(bboVar2, bbyVar.c, true);
                        bbyVar.y.b(defpackage.afbk.a);
                        bbyVar.m++;
                    } else {
                        defpackage.bbq bbqVar = bbyVar.e;
                        defpackage.bby bbyVar2 = bbqVar.a;
                        bbqVar.d(bbqVar.a() + (bbyVar2.l() != 0 ? i3 / bbyVar2.l() : 0.0f));
                        defpackage.cxl cxlVarB = bbyVar.B();
                        if (cxlVarB != null) {
                            cxlVarB.D();
                        }
                        bbyVar.l++;
                    }
                    java.lang.Number numberValueOf = f;
                    if (j != j2) {
                        numberValueOf = java.lang.Long.valueOf(j3);
                    }
                    fFloatValue = numberValueOf.floatValue();
                }
                return java.lang.Float.valueOf(fFloatValue);
            case 1:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                ?? r0 = this.a;
                int size = r0.size();
                int i5 = 0;
                while (i5 < size) {
                    defpackage.bba bbaVar = (defpackage.bba) r0.get(i5);
                    if (bbaVar.i == Integer.MIN_VALUE) {
                        defpackage.asq.c("position() should be called first");
                    }
                    java.util.List list = bbaVar.b;
                    int size2 = list.size();
                    int i6 = i2;
                    while (i6 < size2) {
                        defpackage.cux cuxVar = (defpackage.cux) list.get(i6);
                        int[] iArr = bbaVar.g;
                        int i7 = i6 + i6;
                        defpackage.cuw cuwVar2 = cuwVar;
                        long jD = defpackage.dlw.d((((long) iArr[i7]) << 32) | (((long) iArr[i7 + i]) & 4294967295L), bbaVar.c);
                        if (bbaVar.e) {
                            cuwVar = cuwVar2;
                            cuwVar.u(cuxVar, jD, 0.0f, defpackage.cuy.a);
                        } else {
                            cuwVar = cuwVar2;
                            cuwVar.z(cuxVar, jD, defpackage.cuy.a);
                        }
                        i6++;
                        i = 1;
                    }
                    i5++;
                    i = 1;
                    i2 = 0;
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.azw azwVar = (defpackage.azw) obj;
                java.lang.Object obj2 = this.a;
                defpackage.cej cejVarG = defpackage.bzd.g();
                defpackage.affc affcVarI = cejVarG != null ? cejVarG.i() : null;
                defpackage.cej cejVarH = defpackage.bzd.h(cejVarG);
                try {
                    azwVar.a(((defpackage.bby) obj2).f);
                    return defpackage.afbk.a;
                } finally {
                    defpackage.bzd.k(cejVarG, cejVarH, affcVarI);
                }
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                float fFloatValue2 = ((java.lang.Float) obj).floatValue();
                defpackage.bby bbyVar3 = ((defpackage.bcc) this.a).a;
                bbyVar3.A(defpackage.afhi.k(bbyVar3.l() != 0 ? fFloatValue2 / bbyVar3.l() : 0.0f) + bbyVar3.j());
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cgo cgoVar = (defpackage.cgo) obj;
                java.lang.Object obj3 = this.a;
                if (((defpackage.aiw) obj3).b && (boolA = cgoVar.a()) != null) {
                    boolA.booleanValue();
                    ((defpackage.bcq) obj3).j.invoke(boolA);
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.dek) obj).a(defpackage.ble.a, new defpackage.bld(defpackage.bdy.a, this.a.a(), 2, true));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.a.af(this.a, (defpackage.cuw) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bjj bjjVar = (defpackage.bjj) obj;
                this.a.b(bjjVar.c ? bjjVar.b : bjjVar.a);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.util.List list2 = (java.util.List) obj;
                ?? r1 = this.a;
                if (r1 != 0) {
                    r1.b(list2);
                }
                return defpackage.afbk.a;
            case 9:
                return new defpackage.agq(this.a, 5);
            case 10:
                defpackage.ctc ctcVar = (defpackage.ctc) obj;
                defpackage.bfi bfiVarE = ((defpackage.beg) this.a).e();
                if (bfiVarE != null) {
                    bfiVarE.c = ctcVar;
                }
                return defpackage.afbk.a;
            case 11:
                ((defpackage.blw) this.a).s();
                return defpackage.afbk.a;
            case 12:
                defpackage.dkd dkdVar = (defpackage.dkd) obj;
                java.lang.String strA = dkdVar.a();
                defpackage.beg begVar = (defpackage.beg) this.a;
                defpackage.dfb dfbVar = begVar.f;
                if (!defpackage.afga.f(strA, dfbVar != null ? dfbVar.b : null)) {
                    begVar.i(defpackage.bdz.a);
                    if (begVar.r()) {
                        begVar.k(false);
                    } else {
                        begVar.g(false);
                    }
                }
                long j4 = defpackage.dgc.a;
                begVar.l(j4);
                begVar.h(j4);
                begVar.l.invoke(dkdVar);
                begVar.q.a();
                return defpackage.afbk.a;
            case 13:
                ((defpackage.beg) this.a).t.c(((defpackage.djk) obj).a);
                return defpackage.afbk.a;
            case 14:
                return java.lang.Boolean.valueOf(((defpackage.beg) this.a).t.c(((defpackage.djk) obj).a));
            case 15:
                this.a.c(((defpackage.cji) obj).a, defpackage.bkr.a);
                return defpackage.afbk.a;
            case 16:
                ((defpackage.beg) this.a).j(((java.lang.Boolean) obj).booleanValue());
                return defpackage.afbk.a;
            case 17:
                return new defpackage.agq(this.a, 6);
            case 18:
                ((defpackage.affc) this.a.a()).invoke((defpackage.cji) obj);
                return defpackage.afbk.a;
            case 19:
                float fFloatValue3 = ((java.lang.Float) obj).floatValue();
                defpackage.bff bffVar = (defpackage.bff) this.a;
                float fB = bffVar.b() + fFloatValue3;
                if (fB > bffVar.a()) {
                    fFloatValue3 = bffVar.a() - bffVar.b();
                } else if (fB < 0.0f) {
                    fFloatValue3 = -bffVar.b();
                }
                bffVar.d(bffVar.b() + fFloatValue3);
                return java.lang.Float.valueOf(fFloatValue3);
            default:
                ((defpackage.cuw) obj).x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
        }
    }
}
