package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class aun implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aun(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v57, types: [cdv, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.axo axoVar;
        defpackage.axo axoVar2 = null;
        int i = 0;
        float f = 0.0f;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.afgv) this.a).a = (defpackage.cux) obj;
                return defpackage.afbk.a;
            case 1:
                defpackage.bzc bzcVar = (defpackage.bzc) this.a;
                java.lang.Object[] objArr = bzcVar.a;
                int i2 = bzcVar.b;
                while (i < i2) {
                    ((defpackage.ctz) objArr[i]).h();
                    i++;
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.afgv) this.a).a = (defpackage.cux) obj;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cux cuxVar = (defpackage.cux) obj;
                if (cuxVar != null) {
                    cuxVar.x();
                    cuxVar.dK();
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cux cuxVar2 = (defpackage.cux) obj;
                if (cuxVar2 != null) {
                    cuxVar2.x();
                    cuxVar2.dK();
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.czh czhVar = (defpackage.czh) obj;
                czhVar.getClass();
                defpackage.auy auyVar = (defpackage.auy) czhVar;
                defpackage.awu awuVar = ((defpackage.auy) this.a).c;
                if (!defpackage.afga.f(auyVar.b, awuVar)) {
                    auyVar.b = awuVar;
                    auyVar.d();
                }
                return defpackage.czg.b;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.czh czhVar2 = (defpackage.czh) obj;
                czhVar2.getClass();
                ((defpackage.auy) this.a).b = ((defpackage.auy) czhVar2).c;
                return java.lang.Boolean.FALSE;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                defpackage.dlz dlzVarO = cuwVar.o();
                java.lang.Object obj2 = this.a;
                if (dlzVarO == defpackage.dlz.a || cuwVar.n() == 0) {
                    defpackage.cux cuxVar3 = (defpackage.cux) obj2;
                    cuwVar.q(cuxVar3);
                    cuxVar3.dD(defpackage.dlw.d(0L, cuxVar3.e), 0.0f, null);
                } else {
                    defpackage.cux cuxVar4 = (defpackage.cux) obj2;
                    int iN = cuwVar.n() - cuxVar4.a;
                    cuwVar.q(cuxVar4);
                    cuxVar4.dD(defpackage.dlw.d(((long) iN) << 32, cuxVar4.e), 0.0f, null);
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.cuw) obj).x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
            case 9:
                ((defpackage.cuw) obj).x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
            case 10:
                ((java.lang.Integer) obj).intValue();
                return this.a;
            case 11:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.azs azsVar = (defpackage.azs) this.a;
                return azsVar.a(iIntValue, azsVar.b);
            case 12:
                float f2 = -((java.lang.Float) obj).floatValue();
                java.lang.Object obj3 = this.a;
                if ((f2 >= 0.0f || ((defpackage.axx) obj3).h()) && (f2 <= 0.0f || ((defpackage.axx) obj3).g())) {
                    defpackage.axx axxVar = (defpackage.axx) obj3;
                    if (java.lang.Math.abs(axxVar.g) > 0.5f) {
                        defpackage.asq.d("entered drag with non-zero pending scroll");
                    }
                    axxVar.c = true;
                    float f3 = axxVar.g + f2;
                    axxVar.g = f3;
                    if (java.lang.Math.abs(f3) > 0.5f) {
                        float f4 = axxVar.g;
                        int iRound = java.lang.Math.round(f4);
                        defpackage.axo axoVarE = ((defpackage.axo) axxVar.e.a()).e(iRound, !axxVar.a);
                        if (axoVarE == null || (axoVar = axxVar.b) == null) {
                            axoVar2 = axoVarE;
                        } else {
                            defpackage.axo axoVarE2 = axoVar.e(iRound, true);
                            if (axoVarE2 != null) {
                                axxVar.b = axoVarE2;
                                axoVar2 = axoVarE;
                            }
                        }
                        if (axoVar2 != null) {
                            axxVar.f(axoVar2, axxVar.a, true);
                            axxVar.o.b(defpackage.afbk.a);
                            axxVar.m(f4 - axxVar.g, axoVar2);
                        } else {
                            defpackage.cxl cxlVar = axxVar.r;
                            if (cxlVar != null) {
                                cxlVar.D();
                            }
                            axxVar.m(f4 - axxVar.g, axxVar.l());
                        }
                    }
                    if (java.lang.Math.abs(axxVar.g) > 0.5f) {
                        f2 -= axxVar.g;
                        axxVar.g = 0.0f;
                    }
                    f = f2;
                }
                return java.lang.Float.valueOf(-f);
            case 13:
                float f5 = -((java.lang.Float) obj).floatValue();
                java.lang.Object obj4 = this.a;
                if ((f5 >= 0.0f || ((defpackage.aye) obj4).h()) && (f5 <= 0.0f || ((defpackage.aye) obj4).g())) {
                    defpackage.aye ayeVar = (defpackage.aye) obj4;
                    if (java.lang.Math.abs(ayeVar.b) > 0.5f) {
                        defpackage.asq.d("entered drag with non-zero pending scroll");
                    }
                    float f6 = ayeVar.b + f5;
                    ayeVar.b = f6;
                    if (java.lang.Math.abs(f6) > 0.5f) {
                        defpackage.afhi.k(ayeVar.b);
                        ayeVar.d();
                        ayeVar.j();
                    }
                    if (java.lang.Math.abs(ayeVar.b) > 0.5f) {
                        f5 -= ayeVar.b;
                        ayeVar.b = 0.0f;
                    }
                    f = f5;
                }
                return java.lang.Float.valueOf(-f);
            case 14:
                ((defpackage.cuw) obj).r((defpackage.cux) this.a, 0, 0, 0.0f);
                return defpackage.afbk.a;
            case 15:
                return new defpackage.agq(this.a, 2);
            case 16:
                return new defpackage.agq(this.a, 4);
            case 17:
                defpackage.azm azmVar = (defpackage.azm) ((defpackage.baf) this.a).a.invoke();
                int iB = azmVar.b();
                while (i < iB) {
                    if (defpackage.afga.f(azmVar.d(i), obj)) {
                        return java.lang.Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return java.lang.Integer.valueOf(i);
            case 18:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj5 = this.a;
                defpackage.baf bafVar = (defpackage.baf) obj5;
                defpackage.azm azmVar2 = (defpackage.azm) bafVar.a.invoke();
                if (iIntValue2 < 0 || iIntValue2 >= azmVar2.b()) {
                    defpackage.asq.c("Can't scroll to index " + iIntValue2 + ", it is out of bounds [0, " + azmVar2.b() + ")");
                }
                ahoc.d(((defpackage.cge) obj5).N(), (defpackage.afdo) null, 0, new defpackage.bbx(bafVar, iIntValue2, (defpackage.afdk) null, 1), 3);
                return java.lang.Boolean.TRUE;
            case 19:
                ?? r8 = this.a;
                return java.lang.Boolean.valueOf(r8 != 0 ? r8.d(obj) : true);
            default:
                defpackage.czh czhVar3 = (defpackage.czh) obj;
                czhVar3.getClass();
                defpackage.azy azyVar = ((defpackage.bar) czhVar3).a;
                defpackage.afgv afgvVar = (defpackage.afgv) this.a;
                java.util.List listAe = (java.util.List) afgvVar.a;
                if (listAe != null) {
                    listAe.add(azyVar);
                } else {
                    listAe = defpackage.afga.ae(azyVar);
                }
                afgvVar.a = listAe;
                return defpackage.czg.b;
        }
    }
}
