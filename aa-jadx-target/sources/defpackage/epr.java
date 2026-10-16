package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class epr implements aizk {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public epr(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:192:0x0305  */
    /* JADX WARN: Type inference failed for: r9v19, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v29, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v44, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v47, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v50, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v53, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v59, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v63, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v66, types: [aizk, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) throws java.lang.Throwable {
        dxg dxgVar;
        fps fpsVar;
        java.lang.Object objA;
        java.lang.Object objA2;
        androidx.core.graphics.drawable.IconCompat icon;
        androidx.core.graphics.drawable.IconCompat icon2;
        gqw gqwVar;
        java.lang.Object objA3;
        java.lang.Object objA4;
        boolean z = false;
        gvr ftxVar = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Object objH = ((aiyl) this.a).h(obj, afdkVar);
                return objH == defpackage.afdr.a ? objH : defpackage.afbk.a;
            case 1:
                if (afdkVar instanceof dxg) {
                    dxgVar = (dxg) afdkVar;
                    int i = dxgVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dxgVar.b = i - Integer.MIN_VALUE;
                    } else {
                        dxgVar = new dxg(this, afdkVar);
                    }
                } else {
                    dxgVar = new dxg(this, afdkVar);
                }
                java.lang.Object obj2 = dxgVar.a;
                defpackage.afdr afdrVar = defpackage.afdr.a;
                int i2 = dxgVar.b;
                if (i2 == 0) {
                    defpackage.afga.cz(obj2);
                    ?? r9 = this.a;
                    android.os.Bundle bundle = ((dxs) obj).d;
                    if (bundle == null) {
                        bundle = new android.os.Bundle();
                    }
                    dxgVar.b = 1;
                    if (r9.a(bundle, dxgVar) == afdrVar) {
                        return afdrVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.afga.cz(obj2);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object objO = ((defpackage.tc) this.a).o(obj, afdkVar);
                return objO == defpackage.afdr.a ? objO : defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.bxj) this.a).b(obj);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.bxj) this.a).b(obj);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (afdkVar instanceof fps) {
                    fpsVar = (fps) afdkVar;
                    int i3 = fpsVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fpsVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        fpsVar = new fps(this, afdkVar);
                    }
                } else {
                    fpsVar = new fps(this, afdkVar);
                }
                java.lang.Object obj3 = fpsVar.a;
                defpackage.afdr afdrVar2 = defpackage.afdr.a;
                int i4 = fpsVar.b;
                if (i4 == 0) {
                    defpackage.afga.cz(obj3);
                    ?? r10 = this.a;
                    if (obj instanceof fmo) {
                        fpsVar.b = 1;
                        if (r10.a(obj, fpsVar) == afdrVar2) {
                            return afdrVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defpackage.afga.cz(obj3);
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                long j = ((defpackage.cjl) obj).a;
                if (j == 9205357640488583168L) {
                    ftxVar = ftx.a;
                } else {
                    int i5 = (int) (j >> 32);
                    if (java.lang.Float.intBitsToFloat(i5) >= 0.5d) {
                        int i6 = (int) (j & 4294967295L);
                        if (java.lang.Float.intBitsToFloat(i6) >= 0.5d) {
                            ftxVar = new ftx(java.lang.Math.abs(java.lang.Float.intBitsToFloat(i5)) <= Float.MAX_VALUE ? new fts(defpackage.afhi.k(java.lang.Float.intBitsToFloat(i5))) : ftt.a, java.lang.Math.abs(java.lang.Float.intBitsToFloat(i6)) <= Float.MAX_VALUE ? new fts(defpackage.afhi.k(java.lang.Float.intBitsToFloat(i6))) : ftt.a);
                        }
                    }
                }
                return (ftxVar != null && (objA = this.a.a(ftxVar, afdkVar)) == defpackage.afdr.a) ? objA : defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                long j2 = ((defpackage.dlm) obj).a;
                if (!defpackage.dlm.k(j2)) {
                    ftxVar = new ftx(defpackage.dlm.h(j2) ? new fts(defpackage.dlm.b(j2)) : ftt.a, defpackage.dlm.g(j2) ? new fts(defpackage.dlm.a(j2)) : ftt.a);
                }
                return (ftxVar != null && (objA2 = this.a.a(ftxVar, afdkVar)) == defpackage.afdr.a) ? objA2 : defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object objA5 = this.a.a(new java.lang.Integer(((android.support.v4.media.session.PlaybackStateCompat) obj).a), afdkVar);
                return objA5 == defpackage.afdr.a ? objA5 : defpackage.afbk.a;
            case 9:
                defpackage.hjb hjbVar = (defpackage.hjb) obj;
                java.lang.Object objA6 = this.a.a(hjbVar != null ? gqu.d(hjbVar.a) : null, afdkVar);
                return objA6 == defpackage.afdr.a ? objA6 : defpackage.afbk.a;
            case 10:
                androidx.car.app.model.CarIcon carIcon = (androidx.car.app.model.CarIcon) obj;
                if (carIcon != null && (icon = carIcon.getIcon()) != null && icon.b == 1 && (icon2 = carIcon.getIcon()) != null) {
                    ftxVar = icon2.d();
                }
                java.lang.Object objA7 = this.a.a(ftxVar, afdkVar);
                return objA7 == defpackage.afdr.a ? objA7 : defpackage.afbk.a;
            case 11:
                int i7 = ((android.support.v4.media.session.PlaybackStateCompat) obj).a;
                if (i7 != 1 && i7 != 2) {
                    z = true;
                }
                java.lang.Object objA8 = this.a.a(java.lang.Boolean.valueOf(z), afdkVar);
                return objA8 == defpackage.afdr.a ? objA8 : defpackage.afbk.a;
            case 12:
                defpackage.hjb hjbVar2 = (defpackage.hjb) obj;
                defpackage.wog wogVar = hjbVar2 != null ? hjbVar2.a : null;
                java.lang.Integer num = wogVar != null ? new java.lang.Integer(wogVar.a(85)) : null;
                java.lang.Integer num2 = wogVar != null ? new java.lang.Integer(wogVar.a(40)) : null;
                if (wogVar != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    num2.getClass();
                    ftxVar = new fwn(iIntValue, num2.intValue());
                }
                java.lang.Object objA9 = this.a.a(ftxVar, afdkVar);
                return objA9 == defpackage.afdr.a ? objA9 : defpackage.afbk.a;
            case 13:
                defpackage.hjb hjbVar3 = (defpackage.hjb) obj;
                java.lang.Object objA10 = this.a.a(hjbVar3 != null ? gqu.d(hjbVar3.b) : null, afdkVar);
                return objA10 == defpackage.afdr.a ? objA10 : defpackage.afbk.a;
            case 14:
                defpackage.hjb hjbVar4 = (defpackage.hjb) obj;
                if (hjbVar4 == null) {
                    gqwVar = new gqw((hkf) null, (hkf) null);
                } else {
                    defpackage.wog wogVar2 = hjbVar4.a;
                    long j3 = defpackage.cjv.j(wogVar2.a(40));
                    long j4 = defpackage.cjv.j(wogVar2.a(85));
                    defpackage.wog wogVar3 = hjbVar4.d;
                    gqwVar = new gqw(new hkf(j4, j3), new hkf(defpackage.cjv.j(wogVar3.a(95)), defpackage.cjv.j(wogVar3.a(10))));
                }
                java.lang.Object objA11 = this.a.a(gqwVar, afdkVar);
                return objA11 == defpackage.afdr.a ? objA11 : defpackage.afbk.a;
            case 15:
                fwv fwvVar = (fwv) obj;
                java.lang.Object objA12 = this.a.a(fwvVar != null ? fwv.a(fwvVar, (fws) null, (fxx) null, fxg.a, 3) : null, afdkVar);
                return objA12 == defpackage.afdr.a ? objA12 : defpackage.afbk.a;
            case 16:
                java.lang.Object objA13 = this.a.a(java.lang.Boolean.valueOf(!((java.lang.Boolean) obj).booleanValue()), afdkVar);
                return objA13 == defpackage.afdr.a ? objA13 : defpackage.afbk.a;
            case 17:
                java.util.List list = (java.util.List) obj;
                if (!list.isEmpty()) {
                    hhx hhxVar = (hkd) defpackage.afga.aC(list, 0);
                    hkd hkdVar = (hkd) defpackage.afga.aC(list, 1);
                    if (hhxVar == null) {
                        hhxVar = hhx.a;
                    }
                    ftxVar = new gvr(hhxVar, hkdVar);
                }
                java.lang.Object objA14 = this.a.a(ftxVar, afdkVar);
                return objA14 == defpackage.afdr.a ? objA14 : defpackage.afbk.a;
            case 18:
                java.lang.Object objA15 = this.a.a(new gzq((hjy) obj), afdkVar);
                return objA15 == defpackage.afdr.a ? objA15 : defpackage.afbk.a;
            case 19:
                return (((java.lang.Boolean) obj).booleanValue() || (objA3 = this.a.a(obj, afdkVar)) != defpackage.afdr.a) ? defpackage.afbk.a : objA3;
            default:
                return (((java.lang.Boolean) obj).booleanValue() || (objA4 = this.a.a(obj, afdkVar)) != defpackage.afdr.a) ? defpackage.afbk.a : objA4;
        }
    }
}
