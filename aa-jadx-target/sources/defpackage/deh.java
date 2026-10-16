package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class deh implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ deh(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [cwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v57, types: [aiuw, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.dau dauVar;
        android.graphics.Rect rect = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((java.util.List) obj).add(this.a.invoke());
                return java.lang.Boolean.TRUE;
            case 1:
                java.lang.Object obj2 = this.a;
                defpackage.dej dejVar = defpackage.def.a;
                java.util.List listSingletonList = java.util.Collections.singletonList(obj2);
                listSingletonList.getClass();
                ((defpackage.dek) obj).a(dejVar, listSingletonList);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.dmm) this.a).p = (defpackage.affc) obj;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.cxl) this.a).ab((defpackage.dlo) obj);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.cyu cyuVar = (defpackage.cyu) obj;
                defpackage.czz czzVar = cyuVar instanceof defpackage.czz ? (defpackage.czz) cyuVar : null;
                java.lang.Object obj3 = this.a;
                if (czzVar != null && (dauVar = czzVar.y) != null) {
                    dauVar.removeViewInLayout((android.view.View) obj3);
                    java.lang.Object objRemove = dauVar.a.remove(obj3);
                    java.util.HashMap map = dauVar.b;
                    defpackage.afgz.i(map);
                    map.remove(objRemove);
                    ((defpackage.dmm) obj3).setImportantForAccessibility(0);
                }
                ((defpackage.dmm) obj3).removeAllViewsInLayout();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cjj cjjVar = (defpackage.cjj) obj;
                java.lang.Object obj4 = this.a;
                defpackage.cge cgeVar = (defpackage.cge) obj4;
                if (cgeVar.A) {
                    ahoc.d(cgeVar.N(), (defpackage.afdo) null, 0, new defpackage.bnx((dmt) obj4, cjjVar, (defpackage.afdk) null, 17), 3);
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r10 = this.a;
                defpackage.chw chwVar = (defpackage.chw) obj;
                android.view.View viewN = defpackage.vz.n((defpackage.cge) r10);
                if (!viewN.isFocused() && !viewN.hasFocus()) {
                    defpackage.cik cikVar = ((defpackage.czz) defpackage.cjv.t(r10)).J;
                    android.view.View viewG = defpackage.ua.g(r10);
                    java.lang.Integer numD = defpackage.cie.d(chwVar.a);
                    int[] iArr = new int[2];
                    viewG.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewN.getLocationOnScreen(iArr2);
                    defpackage.cjj cjjVarC = cikVar.c();
                    if (cjjVarC != null) {
                        int i = iArr[0];
                        int i2 = ((int) cjjVarC.b) + i;
                        int i3 = iArr2[0];
                        int i4 = iArr[1];
                        int i5 = ((int) cjjVarC.c) + i4;
                        int i6 = iArr2[1];
                        rect = new android.graphics.Rect(i2 - i3, i5 - i6, (((int) cjjVarC.d) + i) - i3, (((int) cjjVarC.e) + i4) - i6);
                    }
                    if (!defpackage.cie.e(viewN, numD, rect)) {
                        chwVar.a();
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.vz.n((defpackage.cge) this.a);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj5 = this.a;
                ((dnu) obj5).show();
                return new defpackage.dnb(obj5, 0);
            case 9:
                return defpackage.a.af(this.a, (defpackage.cuw) obj);
            case 10:
                defpackage.bvm bvmVar = dnj.a;
                defpackage.ctc ctcVarQ = ((defpackage.ctc) obj).q();
                ctcVarQ.getClass();
                dny dnyVar = (dny) this.a;
                dnyVar.g.b(ctcVarQ);
                dnyVar.m();
                return defpackage.afbk.a;
            case 11:
                defpackage.bvm bvmVar2 = dnj.a;
                dny dnyVar2 = (dny) this.a;
                dnyVar2.f.b((defpackage.dly) obj);
                dnyVar2.n();
                return defpackage.afbk.a;
            case 12:
                ((dnu) this.a).a.invoke();
                return defpackage.afbk.a;
            case 13:
                defpackage.afer aferVar = (defpackage.afer) obj;
                dny dnyVar3 = (dny) this.a;
                android.os.Handler handler = dnyVar3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    aferVar.invoke();
                } else {
                    android.os.Handler handler2 = dnyVar3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.ku(aferVar, 20, null));
                    }
                }
                return defpackage.afbk.a;
            case 14:
                defpackage.cla claVar = (defpackage.cla) obj;
                defpackage.dqi dqiVar = (defpackage.dqi) this.a;
                if (!java.lang.Float.isNaN(dqiVar.f) || !java.lang.Float.isNaN(dqiVar.g)) {
                    claVar.E(defpackage.tna.aK(java.lang.Float.isNaN(dqiVar.f) ? 0.5f : dqiVar.f, java.lang.Float.isNaN(dqiVar.g) ? 0.5f : dqiVar.g));
                }
                if (!java.lang.Float.isNaN(dqiVar.h)) {
                    claVar.w(dqiVar.h);
                }
                if (!java.lang.Float.isNaN(dqiVar.i)) {
                    claVar.x(dqiVar.i);
                }
                if (!java.lang.Float.isNaN(dqiVar.j)) {
                    claVar.y(dqiVar.j);
                }
                if (!java.lang.Float.isNaN(dqiVar.k)) {
                    claVar.F(dqiVar.k);
                }
                if (!java.lang.Float.isNaN(dqiVar.l)) {
                    claVar.G(dqiVar.l);
                }
                if (!java.lang.Float.isNaN(dqiVar.m)) {
                    claVar.B(dqiVar.m);
                }
                if (!java.lang.Float.isNaN(dqiVar.n) || !java.lang.Float.isNaN(dqiVar.o)) {
                    claVar.z(java.lang.Float.isNaN(dqiVar.n) ? 1.0f : dqiVar.n);
                    claVar.A(java.lang.Float.isNaN(dqiVar.o) ? 1.0f : dqiVar.o);
                }
                if (!java.lang.Float.isNaN(dqiVar.p)) {
                    claVar.o(dqiVar.p);
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.afer aferVar2 = (defpackage.afer) obj;
                if (defpackage.afga.f(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    aferVar2.invoke();
                } else {
                    doz dozVar = (doz) this.a;
                    android.os.Handler handler3 = dozVar.a;
                    if (handler3 == null) {
                        handler3 = new android.os.Handler(android.os.Looper.getMainLooper());
                        dozVar.a = handler3;
                    }
                    handler3.post(new eaw(aferVar2, 1));
                }
                return defpackage.afbk.a;
            case 16:
                ((doz) this.a).c = true;
                return defpackage.afbk.a;
            case 17:
                java.io.File file = (java.io.File) obj;
                file.getClass();
                return new eha(defpackage.dtn.f(this.a), file);
            case 18:
                ((defpackage.eqp) this.a).m(obj);
                return defpackage.afbk.a;
            case 19:
                java.lang.String str = (java.lang.String) obj;
                java.lang.Object obj6 = this.a;
                aito aitoVar = evc.a;
                str.getClass();
                return java.lang.Boolean.valueOf(!defpackage.fbh.f((android.os.Bundle) obj6, str));
            default:
                defpackage.afau afauVar = (defpackage.afau) obj;
                afauVar.getClass();
                return java.lang.Boolean.valueOf(defpackage.afga.f(afauVar.a, this.a));
        }
    }
}
