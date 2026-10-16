package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class beh implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ beh(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [aiyx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [eqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v33, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v51, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v53, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v63, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [dlo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [eqg, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        defpackage.dga dgaVarA;
        defpackage.dfa dfaVarD;
        defpackage.cju cjuVarR;
        defpackage.dgb dgbVarA;
        int i = 6;
        int i2 = 2;
        int i3 = 0;
        java.lang.Throwable th = null;
        java.lang.Object obj2 = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.cuw cuwVar = (defpackage.cuw) obj;
                java.util.List listI = defpackage.afw.I(this.a, ((defpackage.bei) this.b).a);
                if (listI != null) {
                    int size = listI.size();
                    while (i3 < size) {
                        defpackage.afau afauVar = (defpackage.afau) listI.get(i3);
                        defpackage.cux cuxVar = (defpackage.cux) afauVar.a;
                        defpackage.afer aferVar = (defpackage.afer) afauVar.b;
                        cuwVar.s(cuxVar, aferVar != null ? ((defpackage.dlw) aferVar.invoke()).a : 0L, 0.0f);
                        i3++;
                    }
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.cxn cxnVar = (defpackage.cxn) obj;
                cxnVar.q();
                defpackage.beg begVar = (defpackage.beg) this.b;
                if (((java.lang.Boolean) begVar.k.a()).booleanValue() || begVar.r()) {
                    defpackage.dai.aI(cxnVar, (defpackage.cka) this.a, 0L, 0L, null, 0, 126);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.cla claVar = (defpackage.cla) obj;
                java.lang.Object obj3 = this.b;
                if (!((java.lang.Boolean) new defpackage.bfd(obj3, i2).invoke()).booleanValue() || (dgaVarA = ((defpackage.bfk) obj3).a()) == null || (dfaVarD = defpackage.bfk.d((defpackage.dfa) this.a, dgaVarA)) == null) {
                    cjuVarR = null;
                } else {
                    int i4 = dfaVarD.b;
                    int i5 = dfaVarD.c;
                    cjuVarR = dgaVarA.r(i4, i5);
                    defpackage.cjj cjjVarL = dgaVarA.l(i4);
                    int i6 = i5 - 1;
                    cjuVarR.n(((((long) java.lang.Float.floatToRawIntBits(dgaVarA.g(i4) == dgaVarA.g(i6) ? java.lang.Math.min(dgaVarA.l(i6).b, cjjVarL.b) : 0.0f)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(cjjVarL.c)))) ^ (-9223372034707292160L));
                }
                defpackage.bfj bfjVar = cjuVarR != null ? new defpackage.bfj(cjuVarR) : null;
                if (bfjVar != null) {
                    claVar.C(bfjVar);
                    claVar.s(true);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj4 = this.b;
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = ((defpackage.bfk) obj4).c;
                java.lang.Object obj5 = this.a;
                snapshotStateList.add(obj5);
                return new defpackage.agp(obj4, obj5, 6);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Object obj6 = this.a;
                defpackage.bem bemVar = (defpackage.bem) obj;
                defpackage.dfg dfgVar = (defpackage.dfg) ((defpackage.dfa) obj6).a;
                defpackage.dgb dgbVarA2 = dfgVar.a();
                defpackage.dft dftVar = dgbVarA2 != null ? dgbVarA2.a : null;
                defpackage.bil bilVar = (defpackage.bil) this.b;
                defpackage.dft dftVarC = (!bilVar.h() || (dgbVarA = dfgVar.a()) == null) ? null : dgbVarA.b;
                if (dftVar != null) {
                    dftVarC = dftVar.c(dftVarC);
                }
                if (bilVar.i()) {
                    dfgVar.a();
                }
                if (dftVarC == null) {
                    dftVarC = null;
                }
                if (bilVar.j()) {
                    dfgVar.a();
                }
                bemVar.b = ((defpackage.dfb) bemVar.a).b(new defpackage.acn(new defpackage.afgq(), obj6, dftVarC != null ? dftVarC : null, i));
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.cuw cuwVar2 = (defpackage.cuw) obj;
                ?? r0 = this.b;
                if (r0 != 0) {
                    int size2 = r0.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        defpackage.afau afauVar2 = (defpackage.afau) r0.get(i7);
                        cuwVar2.s((defpackage.cux) afauVar2.a, ((defpackage.dlw) afauVar2.b).a, 0.0f);
                    }
                }
                ?? r13 = this.a;
                if (r13 != 0) {
                    int size3 = r13.size();
                    while (i3 < size3) {
                        defpackage.afau afauVar3 = (defpackage.afau) r13.get(i3);
                        defpackage.cux cuxVar2 = (defpackage.cux) afauVar3.a;
                        defpackage.afer aferVar2 = (defpackage.afer) afauVar3.b;
                        cuwVar2.s(cuxVar2, aferVar2 != null ? ((defpackage.dlw) aferVar2.invoke()).a : 0L, 0.0f);
                        i3++;
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                aiti aitiVar = (aiti) obj;
                defpackage.afgt afgtVar = (defpackage.afgt) this.b;
                if (afgtVar.a == -1) {
                    afgtVar.a = aitiVar.b().a;
                }
                ((defpackage.afgt) this.a).a = aitiVar.b().b + 1;
                return "";
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i8 = 9;
                return new defpackage.aks(new defpackage.bjm((defpackage.afer) obj, i8), new defpackage.beh(this.a, this.b, i8), android.os.Build.VERSION.SDK_INT == 28 ? defpackage.ali.b : defpackage.ali.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bgb bgbVar = (defpackage.bgb) obj;
                this.b.invoke();
                ?? r14 = this.a;
                if (r14 == 0 || ((java.lang.Boolean) r14.invoke()).booleanValue()) {
                    bgbVar.a();
                }
                return defpackage.afbk.a;
            case 9:
                long j = ((defpackage.dlt) obj).a;
                float fB = defpackage.dlt.b(j);
                ?? r2 = this.a;
                this.b.b(new defpackage.dly((((long) r2.dN(fB)) << 32) | (4294967295L & ((long) r2.dN(defpackage.dlt.a(j))))));
                return defpackage.afbk.a;
            case 10:
                ((defpackage.bww) this.b).f(this.a, obj);
                return defpackage.afbk.a;
            case 11:
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                java.lang.Throwable th2 = (java.lang.Throwable) obj;
                synchronized (((defpackage.bxt) obj8).c) {
                    if (obj7 != null) {
                        if (th2 != null) {
                            if (true != (th2 instanceof java.util.concurrent.CancellationException)) {
                                th = th2;
                            }
                            if (th != null) {
                                defpackage.adrs.E((java.lang.Throwable) obj7, th);
                            }
                        }
                        obj2 = obj7;
                    }
                    ((defpackage.bxt) obj8).e = (java.lang.Throwable) obj2;
                    ((defpackage.bxt) obj8).l.d(defpackage.bxo.a);
                }
                return defpackage.afbk.a;
            case 12:
                ajba ajbaVar = defpackage.bxt.k;
                ((defpackage.bvk) this.a).t(obj);
                java.lang.Object obj9 = this.b;
                if (obj9 != null) {
                    ((defpackage.aaw) obj9).j(obj);
                }
                return defpackage.afbk.a;
            case 13:
                defpackage.affc affcVar = defpackage.cer.a;
                this.b.invoke(obj);
                this.a.invoke(obj);
                return defpackage.afbk.a;
            case 14:
                defpackage.affc affcVar2 = defpackage.cer.a;
                this.b.invoke(obj);
                this.a.invoke(obj);
                return defpackage.afbk.a;
            case 15:
                ((java.lang.Integer) obj).intValue();
                return ((android.os.Parcel) this.b).readValue((java.lang.ClassLoader) this.a);
            case 16:
                defpackage.cuw.A((defpackage.cuw) obj, (defpackage.cux) this.a, 0, 0, ((defpackage.cjz) this.b).a, 4);
                return defpackage.afbk.a;
            case 17:
                defpackage.cuw.A((defpackage.cuw) obj, (defpackage.cux) this.a, 0, 0, ((defpackage.cle) this.b).o, 4);
                return defpackage.afbk.a;
            case 18:
                defpackage.dbi dbiVar = (defpackage.dbi) obj;
                ?? r1 = this.b;
                defpackage.dcx dcxVar = (defpackage.dcx) r1;
                if (!dcxVar.c) {
                    ?? r15 = this.a;
                    defpackage.epy lifecycle = dbiVar.b().getLifecycle();
                    dcxVar.e = r15;
                    if (dcxVar.d == null) {
                        android.view.View view = dbiVar.a;
                        if (defpackage.afga.f(android.os.Looper.myLooper(), view.getHandler().getLooper())) {
                            dcxVar.d = lifecycle;
                            lifecycle.c(r1);
                        } else {
                            view.post(new defpackage.af((java.lang.Object) r1, (java.lang.Object) lifecycle, 17, (byte[]) null));
                        }
                    } else if (lifecycle.a().a(defpackage.epx.c)) {
                        dcxVar.b.e(new defpackage.ccz(-1723985096, true, new defpackage.bgl((java.lang.Object) r1, dbiVar, (defpackage.affg) r15, i2)));
                    }
                }
                return defpackage.afbk.a;
            case 19:
                java.lang.Object obj10 = this.a;
                java.lang.Object obj11 = ((defpackage.fbl) obj10).a;
                defpackage.diu diuVar = (defpackage.diu) obj;
                java.lang.Object obj12 = this.b;
                synchronized (obj11) {
                    if (diuVar.b()) {
                    }
                }
                return defpackage.afbk.a;
            default:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                entry.getClass();
                defpackage.eqf eqfVar = (defpackage.eqf) entry.getKey();
                defpackage.eqh eqhVar = (defpackage.eqh) entry.getValue();
                while (true) {
                    defpackage.eqi eqiVar = (defpackage.eqi) this.a;
                    if (eqhVar.a.compareTo(eqiVar.e) > 0 && !eqiVar.c && eqiVar.b.b(eqfVar)) {
                        defpackage.epv epvVar = defpackage.epw.Companion;
                        defpackage.epw epwVarA = defpackage.epv.a(eqhVar.a);
                        if (epwVarA == null) {
                            defpackage.epx epxVar = eqhVar.a;
                            java.util.Objects.toString(epxVar);
                            throw new java.lang.IllegalStateException("no event down from ".concat(java.lang.String.valueOf(epxVar)));
                        }
                        ?? r3 = this.b;
                        java.util.List list = eqiVar.d;
                        list.add(epwVarA.a());
                        eqhVar.a(r3, epwVarA);
                        defpackage.afga.bu(list);
                    }
                }
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ beh(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
