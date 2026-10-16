package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bso implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bso(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, uv] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v45, types: [ctc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v46, types: [ctc] */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v5, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v88 */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        java.util.List listAS;
        java.lang.Object obj;
        defpackage.cxl cxlVar;
        defpackage.cjj cjjVar;
        defpackage.cfq cfqVar = null;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                this.a.j(this.b);
                return defpackage.afbk.a;
            case 1:
                return new defpackage.tc((bqx) this.b, (defpackage.affc) this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.a.j(this.b);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bjm bjmVar = new defpackage.bjm(this.a, 11);
                defpackage.bwc bwcVar = (defpackage.bwc) ((defpackage.cfm) this.b).b;
                defpackage.bzm bzmVar = bwcVar.c;
                defpackage.bzl bzlVarE = bzmVar.e();
                int i = 0;
                while (true) {
                    try {
                        if (i < bzmVar.b) {
                            if (bzlVarE.B(i) && ((java.lang.Boolean) bjmVar.invoke(bzlVarE.o(i))).booleanValue()) {
                                defpackage.cfq cfqVar2 = new defpackage.cfq(i, null);
                                bzlVarE.r();
                                cfqVar = cfqVar2;
                            } else {
                                int[] iArr = bzlVarE.b;
                                int i2 = i + 1;
                                int iD = (i2 < bzlVarE.c ? iArr[(i2 * 5) + 4] : bzlVarE.d) - defpackage.bzo.d(iArr, i);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iD) {
                                        i = i2;
                                    } else if (((java.lang.Boolean) bjmVar.invoke(bzlVarE.l(i, i3))).booleanValue()) {
                                        cfqVar = new defpackage.cfq(i, java.lang.Integer.valueOf(i3));
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        bzlVarE.r();
                    } catch (java.lang.Throwable th) {
                        bzlVarE.r();
                        throw th;
                    }
                }
                if (cfqVar != null) {
                    defpackage.bzm bzmVar2 = bwcVar.c;
                    int i4 = cfqVar.a;
                    java.lang.Integer num = cfqVar.b;
                    defpackage.bzl bzlVarE2 = bzmVar2.e();
                    try {
                        java.util.List listC = defpackage.vm.c(bzlVarE2, i4, num);
                        bzlVarE2.r();
                        listAS = defpackage.afga.aS(listC, bwcVar.T());
                    } catch (java.lang.Throwable th2) {
                        bzlVarE2.r();
                        throw th2;
                    }
                } else {
                    listAS = defpackage.afce.a;
                }
                return new defpackage.adnr(listAS, bwcVar.k);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.afgv) this.a).a = ((defpackage.cjc) this.b).b();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.cqn) this.a).c((defpackage.cge) this.b);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(defpackage.czz.X((defpackage.czz) this.a, (android.view.KeyEvent) this.b));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(defpackage.czz.Z((defpackage.czz) this.a, (android.view.MotionEvent) this.b));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                dcg dcgVar = (dcg) this.a;
                defpackage.ddx ddxVar = dcgVar.d;
                defpackage.ddx ddxVar2 = dcgVar.e;
                java.lang.Float f = dcgVar.b;
                java.lang.Float f2 = dcgVar.c;
                float fFloatValue = (ddxVar == null || f == null) ? 0.0f : ((java.lang.Number) ddxVar.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (ddxVar2 == null || f2 == null) ? 0.0f : ((java.lang.Number) ddxVar2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    java.lang.Object obj2 = this.b;
                    defpackage.dah dahVar = (defpackage.dah) obj2;
                    int iM = dahVar.m(dcgVar.a);
                    defpackage.hio hioVar = (defpackage.hio) dahVar.q().a(dahVar.d);
                    if (hioVar != null) {
                        try {
                            edn ednVar = ((defpackage.dah) obj2).f;
                            if (ednVar != null) {
                                ednVar.o(((defpackage.dah) obj2).M(hioVar));
                            }
                            break;
                        } catch (java.lang.IllegalStateException unused) {
                        }
                    }
                    defpackage.hio hioVar2 = (defpackage.hio) dahVar.q().a(dahVar.e);
                    if (hioVar2 != null) {
                        try {
                            edn ednVar2 = ((defpackage.dah) obj2).g;
                            if (ednVar2 != null) {
                                ednVar2.o(((defpackage.dah) obj2).M(hioVar2));
                            }
                            break;
                        } catch (java.lang.IllegalStateException unused2) {
                        }
                    }
                    dahVar.b.invalidate();
                    defpackage.hio hioVar3 = (defpackage.hio) dahVar.q().a(iM);
                    if (hioVar3 != null && (obj = hioVar3.b) != null && (cxlVar = ((defpackage.dec) obj).a) != null) {
                        if (ddxVar != null) {
                            dahVar.t.g(iM, ddxVar);
                        }
                        if (ddxVar2 != null) {
                            dahVar.u.g(iM, ddxVar2);
                        }
                        dahVar.u(cxlVar);
                    }
                }
                if (ddxVar != null) {
                    dcgVar.b = (java.lang.Float) ddxVar.a.invoke();
                }
                if (ddxVar2 != null) {
                    dcgVar.c = (java.lang.Float) ddxVar2.a.invoke();
                }
                return defpackage.afbk.a;
            case 9:
                ?? r0 = this.a;
                if (r0 != 0 && (cjjVar = (defpackage.cjj) r0.invoke()) != null) {
                    return cjjVar;
                }
                ?? r10 = this.b;
                boolean zT = r10.t();
                ?? r11 = r10;
                if (true != zT) {
                    r11 = 0;
                }
                if (r11 != 0) {
                    return defpackage.bzo.C(0L, defpackage.dlv.f(r11.h()));
                }
                return null;
            case 10:
                defpackage.byj byjVar = (defpackage.byj) this.b;
                byjVar.h((byjVar.e() + 1) % ((java.lang.Object[]) this.a).length);
                return defpackage.afbk.a;
            case 11:
                ((defpackage.afgv) this.a).a = defpackage.cjv.y(this.b, defpackage.cuv.a);
                return defpackage.afbk.a;
            case 12:
                ((android.telecom.Call) ((se) this.a).a).unregisterCallback((android.telecom.Call.Callback) this.b);
                return defpackage.afbk.a;
            case 13:
                ajba ajbaVar = ((defpackage.evx) this.a).g;
                ajbaVar.d(defpackage.afga.L((java.util.Set) ajbaVar.b(), this.b));
                return defpackage.afbk.a;
            case 14:
                java.lang.Object obj3 = this.a;
                defpackage.ebs ebsVar = ((defpackage.evx) obj3).h;
                java.lang.Object obj4 = this.b;
                synchronized (ebsVar) {
                    ajba ajbaVar2 = ((defpackage.evx) obj3).f;
                    java.lang.Iterable iterable = (java.lang.Iterable) ajbaVar2.b();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj5 : iterable) {
                        if (defpackage.afga.f((defpackage.euw) obj5, obj4)) {
                            ajbaVar2.d(arrayList);
                        } else {
                            arrayList.add(obj5);
                        }
                    }
                    ajbaVar2.d(arrayList);
                }
                return defpackage.afbk.a;
            case 15:
                defpackage.evx evxVar = (defpackage.evx) this.a;
                for (defpackage.euw euwVar : (java.lang.Iterable) evxVar.e.b()) {
                    if (defpackage.ewm.k()) {
                        android.util.Log.v("FragmentNavigator", "Marking transition complete for entry " + euwVar + " due to fragment " + this.b + " viewmodel being cleared");
                    }
                    evxVar.c(euwVar);
                }
                return defpackage.afbk.a;
            case 16:
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                synchronized (fmt.b) {
                    java.util.Map map = fmt.c;
                    map.remove(obj7);
                    if (map.isEmpty()) {
                        fjv.a().c(fmw.a, "NetworkRequestConstraintController unregister shared callback");
                        ((android.net.ConnectivityManager) obj6).unregisterNetworkCallback(fmt.a);
                        fmt.f = null;
                        fmt.d = null;
                        fmt.e = false;
                    }
                    break;
                }
                return defpackage.afbk.a;
            case 17:
                fnj fnjVar = ((fmx) this.a).a;
                java.lang.Object obj8 = this.b;
                synchronized (fnjVar.b) {
                    java.util.LinkedHashSet linkedHashSet = fnjVar.c;
                    if (linkedHashSet.remove(obj8) && linkedHashSet.isEmpty()) {
                        fnjVar.e();
                    }
                    break;
                }
                return defpackage.afbk.a;
            case 18:
                java.lang.Object obj9 = this.b;
                flv flvVar = (flv) obj9;
                androidx.work.impl.WorkDatabase workDatabase = flvVar.d;
                workDatabase.getClass();
                workDatabase.m(new etd(obj9, this.a, 12, (byte[]) null));
                fky.a(flvVar.c, flvVar.d, flvVar.e);
                return defpackage.afbk.a;
            case 19:
                uv onClickDelegate = ((androidx.car.app.model.Action) this.b).getOnClickDelegate();
                if (onClickDelegate != null) {
                    gdd.i((gfa) this.a, onClickDelegate);
                }
                return defpackage.afbk.a;
            default:
                return defpackage.a.ac((gfa) this.a, this.b);
        }
    }

    public /* synthetic */ bso(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
