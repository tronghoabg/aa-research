package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bmp implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bmp(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [dlo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
        boolean z;
        float f;
        long j;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.a.aj((defpackage.cux) this.a, (defpackage.cuw) obj);
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                android.view.View view = (android.view.View) entry.getValue();
                int[] iArr = defpackage.ebt.a;
                return java.lang.Boolean.valueOf(defpackage.afga.bh(this.a, view.getTransitionName()));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.dek) obj).a(defpackage.def.d, this.a);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.dek dekVar = (defpackage.dek) obj;
                int i = defpackage.boh.a;
                defpackage.dbb.g(dekVar, (java.lang.String) this.a);
                defpackage.dbb.j(dekVar, 5);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.dek dekVar2 = (defpackage.dek) obj;
                defpackage.aeu aeuVar = bpf.a;
                java.lang.Object objInvoke = this.a.invoke();
                java.lang.Float f2 = (java.lang.Float) (true != java.lang.Float.isNaN(((java.lang.Number) objInvoke).floatValue()) ? objInvoke : null);
                defpackage.dbb.i(dekVar2, new defpackage.ddv(f2 != null ? f2.floatValue() : 0.0f, new defpackage.afhw(0.0f, 1.0f)));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj2 = this.a;
                bqh bqhVar = bqh.a;
                return defpackage.a.aj((defpackage.cux) obj2, (defpackage.cuw) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                bqp bqpVar = (bqp) this.a;
                defpackage.afhw afhwVar = bqpVar.h;
                float f3 = bqn.a;
                float fD = defpackage.afqt.d(fFloatValue, ((java.lang.Number) afhwVar.d()).floatValue(), ((java.lang.Number) afhwVar.c()).floatValue());
                if (fD == bqpVar.c()) {
                    z = false;
                } else {
                    if (fD != bqpVar.c()) {
                        defpackage.affc affcVar = bqpVar.b;
                        if (affcVar != null) {
                            affcVar.invoke(java.lang.Float.valueOf(fD));
                        } else {
                            bqpVar.j(fD);
                        }
                    }
                    defpackage.afer aferVar = bqpVar.a;
                    if (aferVar != null) {
                        aferVar.invoke();
                    }
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Float f4 = (java.lang.Float) obj;
                float fFloatValue2 = f4.floatValue();
                float f5 = bqn.a;
                bqp bqpVar2 = (bqp) this.a;
                defpackage.affc affcVar2 = bqpVar2.b;
                if (affcVar2 != null) {
                    affcVar2.invoke(f4);
                } else {
                    bqpVar2.j(fFloatValue2);
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                long j2 = ((defpackage.dly) obj).a;
                float f6 = bqn.a;
                bqp bqpVar3 = (bqp) this.a;
                bqpVar3.k.h((int) (j2 >> 32));
                bqpVar3.l.h((int) (j2 & 4294967295L));
                return defpackage.afbk.a;
            case 9:
                bqp bqpVar4 = (bqp) this.a;
                bqpVar4.g(0.0f);
                bqpVar4.g.invoke();
                return defpackage.afbk.a;
            case 10:
                ((java.lang.Float) obj).floatValue();
                return java.lang.Float.valueOf(this.a.dI(56.0f));
            case 11:
                return new defpackage.tc((bqx) obj, (defpackage.affc) this.a);
            case 12:
                return new defpackage.dlw(((long) ((defpackage.dlo) obj).dN(((defpackage.dlr) this.a.a()).a)) << 32);
            case 13:
                defpackage.dek dekVar3 = (defpackage.dek) obj;
                defpackage.aej aejVar = bsj.a;
                java.lang.Object objInvoke2 = this.a.invoke();
                java.lang.Float f7 = (java.lang.Float) (true != java.lang.Float.isNaN(((java.lang.Number) objInvoke2).floatValue()) ? objInvoke2 : null);
                float fFloatValue3 = f7 != null ? f7.floatValue() : 0.0f;
                if (fFloatValue3 < 0.0f) {
                    fFloatValue3 = 0.0f;
                }
                if (fFloatValue3 > 1.0f) {
                    fFloatValue3 = 1.0f;
                }
                defpackage.dbb.i(dekVar3, new defpackage.ddv(fFloatValue3, new defpackage.afhw(0.0f, 1.0f)));
                return defpackage.afbk.a;
            case 14:
                ((bst) this.a).j.h(((java.lang.Number) ((defpackage.aeb) obj).d()).floatValue() % 1.0f);
                return defpackage.afbk.a;
            case 15:
                java.lang.Object obj3 = this.a;
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                bst bstVar = (bst) obj3;
                defpackage.aeb aebVar = bstVar.h;
                float fFloatValue4 = aebVar != null ? ((java.lang.Number) aebVar.d()).floatValue() : 0.0f;
                btf btfVar = bstVar.i;
                btfVar.a(cxnVar.o(), cxnVar.dI(bstVar.f), ((bsy) obj3).h(), fFloatValue4, fFloatValue4 > 0.0f ? bstVar.j.e() : 0.0f, cxnVar.dI(bstVar.e), bstVar.c, bstVar.d);
                f = cxnVar.p() == defpackage.dlz.a ? 0.0f : 180.0f;
                long jN = cxnVar.n();
                defpackage.cmi cmiVarR = cxnVar.r();
                long jA = cmiVarR.a();
                cmiVarR.b().g();
                try {
                    cmiVarR.c.j(f, jN);
                    j = jA;
                    try {
                        defpackage.dai.aH(cxnVar, btfVar.b, ((bst) obj3).b, ((bst) obj3).d, 52);
                        defpackage.cju[] cjuVarArr = btfVar.c;
                        if (cjuVarArr != null) {
                            for (defpackage.cju cjuVar : cjuVarArr) {
                                defpackage.dai.aH(cxnVar, cjuVar, ((bst) obj3).a, ((bst) obj3).c, 52);
                            }
                        }
                        float f8 = ((bsy) obj3).h()[1];
                        long jO = cxnVar.o();
                        float f9 = ((bsy) obj3).m;
                        float f10 = btfVar.a;
                        defpackage.cmo cmoVar = ((bst) obj3).d;
                        long j3 = ((bst) obj3).a;
                        float f11 = cmoVar.a;
                        float fMin = java.lang.Math.min(f11, cxnVar.dI(f9));
                        int i2 = (int) (jO >> 32);
                        float fIntBitsToFloat = (java.lang.Float.intBitsToFloat(i2) - fMin) - (fMin == f11 ? 0.0f : f11 / 4.0f);
                        float fIntBitsToFloat2 = (java.lang.Float.intBitsToFloat(i2) * f8) + f10;
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            fMin = java.lang.Math.max(0.0f, fMin - (fIntBitsToFloat2 - fIntBitsToFloat));
                            fIntBitsToFloat = fIntBitsToFloat2;
                        }
                        if (fMin > 0.0f) {
                            if (defpackage.a.X(cmoVar.c, 1)) {
                                float f12 = fMin / 2.0f;
                                defpackage.dai.aF(cxnVar, j3, f12, (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat + f12)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jO & 4294967295L)) / 2.0f)) & 4294967295L), null, 120);
                            } else {
                                defpackage.dai.U(cxnVar, j3, (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits((java.lang.Float.intBitsToFloat((int) (jO & 4294967295L)) - fMin) / 2.0f)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(fMin)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMin)) & 4294967295L), 0.0f, null, 120);
                            }
                        }
                        cmiVarR.b().e();
                        cmiVarR.h(j);
                        return defpackage.afbk.a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cmiVarR.b().e();
                        cmiVarR.h(j);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    j = jA;
                }
                break;
            case 16:
                defpackage.chg chgVar = (defpackage.chg) obj;
                java.lang.Object obj4 = this.a;
                bsy bsyVar = (bsy) obj4;
                float fFloatValue5 = ((java.lang.Number) bsyVar.k.invoke()).floatValue();
                if (fFloatValue5 < 0.0f) {
                    fFloatValue5 = 0.0f;
                }
                if (fFloatValue5 > 1.0f) {
                    fFloatValue5 = 1.0f;
                }
                float fFloatValue6 = ((java.lang.Number) bsyVar.l.invoke(java.lang.Float.valueOf(fFloatValue5))).floatValue();
                float f13 = fFloatValue6 >= 0.0f ? fFloatValue6 : 0.0f;
                ((bst) obj4).f(f13 <= 1.0f ? f13 : 1.0f);
                return chgVar.q(new defpackage.bmp(obj4, 15));
            case 17:
                java.lang.Object obj5 = this.a;
                defpackage.cxn cxnVar2 = (defpackage.cxn) obj;
                bst bstVar2 = (bst) obj5;
                defpackage.aeb aebVar2 = bstVar2.h;
                float fFloatValue7 = aebVar2 != null ? ((java.lang.Number) aebVar2.d()).floatValue() : 0.0f;
                btf btfVar2 = bstVar2.i;
                long jO2 = cxnVar2.o();
                float fDI = cxnVar2.dI(bstVar2.f);
                bte bteVar = (bte) obj5;
                float[] fArr = bteVar.p;
                fArr[0] = ((java.lang.Number) bteVar.l.invoke()).floatValue();
                fArr[1] = ((java.lang.Number) bteVar.k.invoke()).floatValue();
                fArr[2] = ((java.lang.Number) bteVar.n.invoke()).floatValue();
                fArr[3] = ((java.lang.Number) bteVar.m.invoke()).floatValue();
                btfVar2.a(jO2, fDI, fArr, fFloatValue7, fFloatValue7 > 0.0f ? bstVar2.j.e() : 0.0f, cxnVar2.dI(bstVar2.e), bstVar2.c, bstVar2.d);
                f = cxnVar2.p() == defpackage.dlz.a ? 0.0f : 180.0f;
                long jN2 = cxnVar2.n();
                defpackage.cmi cmiVarR2 = cxnVar2.r();
                long jA2 = cmiVarR2.a();
                cmiVarR2.b().g();
                try {
                    cmiVarR2.c.j(f, jN2);
                    defpackage.dai.aH(cxnVar2, btfVar2.b, ((bst) obj5).b, ((bst) obj5).d, 52);
                    defpackage.cju[] cjuVarArr2 = btfVar2.c;
                    if (cjuVarArr2 != null) {
                        for (defpackage.cju cjuVar2 : cjuVarArr2) {
                            defpackage.dai.aH(cxnVar2, cjuVar2, ((bst) obj5).a, ((bst) obj5).c, 52);
                        }
                    }
                    return defpackage.afbk.a;
                } finally {
                    cmiVarR2.b().e();
                    cmiVarR2.h(jA2);
                }
            case 18:
                java.lang.Object obj6 = this.a;
                ((bst) obj6).f(((bte) obj6).o);
                return ((defpackage.chg) obj).q(new defpackage.bmp(obj6, 17));
            case 19:
                return java.lang.Integer.valueOf(((defpackage.bzm) this.a).d(defpackage.bzd.d(((defpackage.bws) obj).g)));
            default:
                defpackage.chb chbVar = (defpackage.chb) obj;
                if (!chbVar.A) {
                    return defpackage.czg.b;
                }
                defpackage.chb chbVar2 = chbVar.d;
                defpackage.affc affcVar3 = chbVar.a;
                chbVar.d = null;
                defpackage.chb chbVar3 = chbVar.d;
                return defpackage.czg.a;
        }
    }
}
