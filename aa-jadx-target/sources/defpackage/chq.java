package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class chq implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ chq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map map;
        final boolean z = true;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.cuw) obj).x((defpackage.cux) this.a, 0, 0);
                return defpackage.afbk.a;
            case 1:
                java.lang.Object obj2 = this.a;
                synchronized (((defpackage.cez) obj2).e) {
                    defpackage.cey ceyVar = ((defpackage.cez) obj2).f;
                    ceyVar.getClass();
                    java.lang.Object obj3 = ceyVar.b;
                    obj3.getClass();
                    int i = ceyVar.c;
                    defpackage.aal aalVar = ceyVar.g;
                    if (aalVar == null) {
                        aalVar = new defpackage.aal(6);
                        ceyVar.g = aalVar;
                        ceyVar.d().m(obj3, aalVar);
                    }
                    ceyVar.f(obj, i, obj3, aalVar);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Object obj4 = this.a;
                java.lang.Object obj5 = ((defpackage.czz) defpackage.cjv.t(((defpackage.cge) obj4).q)).J.a;
                defpackage.czz czzVar = (defpackage.czz) obj5;
                if (!czzVar.J.l().a()) {
                    czzVar.focusableViewAvailable((android.view.View) obj5);
                }
                defpackage.der derVar = ((defpackage.cjc) obj4).e;
                if (derVar != null) {
                    derVar.b();
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.cla claVar = (defpackage.cla) obj;
                defpackage.cle cleVar = (defpackage.cle) this.a;
                claVar.z(cleVar.a);
                claVar.A(cleVar.b);
                claVar.o(cleVar.c);
                claVar.F(0.0f);
                claVar.G(0.0f);
                claVar.B(cleVar.d);
                claVar.w(0.0f);
                claVar.x(0.0f);
                claVar.y(cleVar.e);
                claVar.r(cleVar.f);
                claVar.E(cleVar.g);
                claVar.C(cleVar.h);
                claVar.s(cleVar.i);
                claVar.v(null);
                claVar.p(cleVar.j);
                claVar.D(cleVar.k);
                claVar.t(cleVar.l);
                claVar.q(cleVar.m);
                claVar.u(cleVar.n);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                defpackage.cmd cmdVar = (defpackage.cmd) this.a;
                return java.lang.Double.valueOf(defpackage.afqt.a(cmdVar.k.a(dDoubleValue), cmdVar.e, cmdVar.f));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                double dDoubleValue2 = ((java.lang.Double) obj).doubleValue();
                defpackage.cmd cmdVar2 = (defpackage.cmd) this.a;
                return java.lang.Double.valueOf(cmdVar2.n.a(defpackage.afqt.a(dDoubleValue2, cmdVar2.e, cmdVar2.f)));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj6 = this.a;
                defpackage.cml cmlVar = (defpackage.cml) obj;
                defpackage.cmq cmqVar = (defpackage.cmq) obj6;
                defpackage.cju cjuVar = cmqVar.v;
                if (cmqVar.h && cmqVar.t && cjuVar != null) {
                    defpackage.cmi cmiVarR = cmlVar.r();
                    long jA = cmiVarR.a();
                    cmiVarR.b().g();
                    try {
                        cmiVarR.c.m(cjuVar);
                        ((defpackage.cmq) obj6).f(cmlVar);
                    } finally {
                        cmiVarR.b().e();
                        cmiVarR.h(jA);
                    }
                } else {
                    cmqVar.f(cmlVar);
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.col colVar = (defpackage.col) obj;
                defpackage.cnl cnlVar = (defpackage.cnl) this.a;
                cnlVar.e(colVar);
                defpackage.affc affcVar = cnlVar.d;
                if (affcVar != null) {
                    affcVar.invoke(colVar);
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.coo cooVar = (defpackage.coo) this.a;
                cooVar.c = true;
                cooVar.d.invoke();
                return defpackage.afbk.a;
            case 9:
                defpackage.cml cmlVar2 = (defpackage.cml) obj;
                defpackage.coo cooVar2 = (defpackage.coo) this.a;
                float f = cooVar2.g;
                float f2 = cooVar2.h;
                defpackage.cmi cmiVarR2 = cmlVar2.r();
                long jA2 = cmiVarR2.a();
                cmiVarR2.b().g();
                defpackage.cnl cnlVar2 = cooVar2.a;
                try {
                    cmiVarR2.c.k(f, f2, 0L);
                    cnlVar2.c(cmlVar2);
                    return defpackage.afbk.a;
                } finally {
                    cmiVarR2.b().e();
                    cmiVarR2.h(jA2);
                }
            case 10:
                ((defpackage.cuw) obj).y((defpackage.cux) this.a, 0, 0, defpackage.cuy.a);
                return defpackage.afbk.a;
            case 11:
                ((defpackage.aan) this.a).p((defpackage.cgd) obj);
                return java.lang.Boolean.TRUE;
            case 12:
                defpackage.afer aferVar = (defpackage.afer) obj;
                defpackage.czz czzVar2 = (defpackage.czz) this.a;
                android.os.Handler handler = czzVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
                    aferVar.invoke();
                } else {
                    android.os.Handler handler2 = czzVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.ku(aferVar, 15, null));
                    }
                }
                return defpackage.afbk.a;
            case 13:
                ((defpackage.czz) this.a).J.i(((defpackage.chz) obj).a, false);
                return defpackage.afbk.a;
            case 14:
                defpackage.cxs cxsVar = (defpackage.cxs) obj;
                defpackage.czw czwVar = (defpackage.czw) this.a;
                defpackage.csx csxVarL = czwVar.l();
                defpackage.byj byjVar = csxVarL != null ? csxVarL.c : null;
                if (byjVar != null && byjVar.e() > 0) {
                    defpackage.zo zoVar = defpackage.cvu.a;
                    long jH = cxsVar.n().h();
                    defpackage.csx csxVarL2 = czwVar.l();
                    defpackage.aau aauVar = csxVarL2 != null ? csxVarL2.a : null;
                    aauVar.getClass();
                    long j = jH >> 32;
                    long j2 = jH & 4294967295L;
                    defpackage.cvs[] cvsVarArr = defpackage.cvu.b;
                    int length = cvsVarArr.length;
                    for (int i2 = 0; i2 < 9; i2++) {
                        int i3 = (int) j2;
                        int i4 = (int) j;
                        defpackage.cvs cvsVar = cvsVarArr[i2];
                        java.lang.Object objA = aauVar.a(cvsVar);
                        objA.getClass();
                        defpackage.cvv cvvVar = (defpackage.cvv) objA;
                        defpackage.cvu.a(cxsVar, cvsVar.a(), cvvVar.c, i4, i3);
                        if (cvvVar.f()) {
                            defpackage.cvu.a(cxsVar, cvvVar.a, cvvVar.e, i4, i3);
                            defpackage.cvu.a(cxsVar, cvvVar.b, cvvVar.f, i4, i3);
                        }
                        defpackage.cvu.a(cxsVar, cvsVar.b(), cvvVar.d, i4, i3);
                    }
                    defpackage.csx csxVarL3 = czwVar.l();
                    defpackage.aan aanVar = csxVarL3 != null ? csxVarL3.d : null;
                    aanVar.getClass();
                    if (aanVar.g()) {
                        defpackage.csx csxVarL4 = czwVar.l();
                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = csxVarL4 != null ? csxVarL4.b : null;
                        snapshotStateList.getClass();
                        java.lang.Object[] objArr = aanVar.a;
                        int i5 = aanVar.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            android.graphics.Rect rect = (android.graphics.Rect) ((defpackage.bwx) objArr[i6]).a();
                            defpackage.cuz cuzVar = (defpackage.cuz) snapshotStateList.get(i6);
                            float f3 = rect.left;
                            float f4 = rect.top;
                            float f5 = rect.right;
                            float f6 = rect.bottom;
                            cxsVar.o(cuzVar.c(), f3);
                            cxsVar.o(cuzVar.b(), f4);
                            cxsVar.o(cuzVar.d(), f5);
                            cxsVar.o(cuzVar.a(), f6);
                        }
                    }
                }
                return defpackage.afbk.a;
            case 15:
                ((defpackage.cuw) obj).r((defpackage.cux) this.a, 0, 0, 0.0f);
                return defpackage.afbk.a;
            case 16:
                defpackage.czz czzVar3 = ((defpackage.dah) this.a).b;
                return java.lang.Boolean.valueOf(czzVar3.getParent().requestSendAccessibilityEvent(czzVar3, (android.view.accessibility.AccessibilityEvent) obj));
            case 17:
                ((defpackage.dah) this.a).v((dcg) obj);
                return defpackage.afbk.a;
            case 18:
                defpackage.dbi dbiVar = (defpackage.dbi) this.a;
                dch dchVar = dbiVar.n;
                if (dchVar != null) {
                    return dchVar;
                }
                dam damVar = new dam(dbiVar.a);
                dbiVar.n = damVar;
                return damVar;
            case 19:
                java.lang.Object obj7 = this.a;
                defpackage.czz czzVar4 = (defpackage.czz) obj7;
                defpackage.dbn dbnVar = czzVar4.g;
                if (dbnVar != null) {
                    return dbnVar;
                }
                defpackage.fbm fbmVarD = czzVar4.P().d();
                java.lang.Object parent = ((android.view.View) obj7).getParent();
                parent.getClass();
                android.view.View view = (android.view.View) parent;
                java.lang.Object tag = view.getTag(2131427822);
                java.lang.String strValueOf = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                if (strValueOf == null) {
                    strValueOf = java.lang.String.valueOf(view.getId());
                }
                final defpackage.fbk savedStateRegistry = fbmVarD.getSavedStateRegistry();
                final java.lang.String strConcat = "SaveableStateRegistry:".concat(java.lang.String.valueOf(strValueOf));
                android.os.Bundle bundleA = savedStateRegistry.a(strConcat);
                if (bundleA != null) {
                    defpackage.afie orCreateKotlinClass = defpackage.afgw.a.getOrCreateKotlinClass(androidx.compose.ui.platform.ParcelableMapHolder.class);
                    orCreateKotlinClass.getClass();
                    java.lang.Class<?> jClass = ((defpackage.affr) orCreateKotlinClass).getJClass();
                    jClass.getClass();
                    androidx.compose.ui.platform.ParcelableMapHolder parcelableMapHolder = (androidx.compose.ui.platform.ParcelableMapHolder) ((android.os.Parcelable) defpackage.ebl.v(bundleA, "androidx.compose.ui.platform.DisposableSaveableStateRegistry", jClass));
                    map = parcelableMapHolder != null ? parcelableMapHolder.a : null;
                    if (map == null) {
                        map = defpackage.afcf.a;
                    }
                } else {
                    map = null;
                }
                defpackage.cyw cywVar = new defpackage.cyw(7);
                defpackage.bvm bvmVar = defpackage.cdx.a;
                defpackage.cdw cdwVar = new defpackage.cdw(map, cywVar);
                if (savedStateRegistry.b(strConcat) == null) {
                    try {
                        savedStateRegistry.c(strConcat, new defpackage.bi(cdwVar, 4));
                    } catch (java.lang.IllegalArgumentException unused) {
                        z = false;
                    }
                    break;
                } else {
                    z = false;
                }
                defpackage.dbn dbnVar2 = new defpackage.dbn(cdwVar, new defpackage.afer() { // from class: dbo
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z2 = z;
                        java.lang.String str = strConcat;
                        if (z2) {
                            java.lang.Object obj8 = savedStateRegistry.a;
                            synchronized (((defpackage.fbq) obj8).g) {
                            }
                        }
                        return defpackage.afbk.a;
                    }
                });
                czzVar4.g = dbnVar2;
                return dbnVar2;
            default:
                return java.lang.Boolean.valueOf(((defpackage.czz) this.a).Y());
        }
    }
}
