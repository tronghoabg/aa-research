package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dxp extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(aiuf aiufVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = aiufVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aiuf, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.dxp((aiuf) this.a, afdkVar, 0);
            case 1:
                return new defpackage.dxp((dxb) this.a, afdkVar, 1);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.dxp((aiuf) this.a, afdkVar, 2, (byte[]) null);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.dxp((eha) this.a, afdkVar, 3);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.dxp((eha) this.a, afdkVar, 4, (byte[]) null);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.dxp((epn) this.a, afdkVar, 5);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.dxp((epn) this.a, afdkVar, 6, (byte[]) null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.dxp((eyy) this.a, afdkVar, 7);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.dxp((fok) this.a, afdkVar, 8);
            case 9:
                return new defpackage.dxp((fro) this.a, afdkVar, 9);
            case 10:
                return new defpackage.dxp((defpackage.cit) this.a, afdkVar, 10);
            case 11:
                return new defpackage.dxp((gvv) this.a, afdkVar, 11);
            case 12:
                return new defpackage.dxp((gtd) this.a, afdkVar, 12);
            case 13:
                return new defpackage.dxp((hnd) this.a, afdkVar, 13);
            case 14:
                return new defpackage.dxp((defpackage.cit) this.a, afdkVar, 14, (byte[]) null);
            case 15:
                return new defpackage.dxp((com.google.android.apps.auto.components.apphost.basewidgets.action.ui.ContentActionsViewShim) this.a, afdkVar, 15);
            case 16:
                return new defpackage.dxp((jxv) this.a, afdkVar, 16);
            case 17:
                return new defpackage.dxp((defpackage.bwx) this.a, afdkVar, 17);
            case 18:
                return new defpackage.dxp((android.graphics.Bitmap) this.a, afdkVar, 18);
            case 19:
                return new defpackage.dxp((defpackage.bys) this.a, afdkVar, 19);
            default:
                return new defpackage.dxp((defpackage.bys) this.a, afdkVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afdk, aiuf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v62, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v72, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [afdk, aiuf, java.lang.Object] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.afga.cz(obj);
                ?? r4 = this.a;
                if (r4.h()) {
                    r4.w(defpackage.afbk.a);
                }
                return defpackage.afbk.a;
            case 1:
                defpackage.afga.cz(obj);
                dxb dxbVar = (dxb) this.a;
                if (dxbVar.b.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    return new java.lang.Integer(android.util.Log.i(dxb.a, "waitForResponse: VoIP app returned a result"));
                }
                android.util.Log.i(dxb.a, "waitForResponse: latch timeout reached");
                dxbVar.c = new dwv(6);
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.afga.cz(obj);
                ?? r5 = this.a;
                if (r5.h()) {
                    r5.w(defpackage.afbk.a);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.afga.cz(obj);
                return new java.lang.Integer(((eha) this.a).f().a());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.afga.cz(obj);
                return new java.lang.Integer(((eha) this.a).f().b());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.afga.cz(obj);
                ((epn) this.a).b();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afga.cz(obj);
                ((epn) this.a).b();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.afga.cz(obj);
                ((eyy) this.a).e.incrementAndGet();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afga.cz(obj);
                java.lang.String str = fpu.a;
                fjv fjvVarA = fjv.a();
                java.lang.Object obj2 = this.a;
                java.util.Objects.toString(obj2);
                fjvVarA.c(str, "Constraints changed for ".concat(java.lang.String.valueOf(obj2)));
                return defpackage.afbk.a;
            case 9:
                defpackage.afga.cz(obj);
                java.lang.Object obj3 = this.a;
                synchronized (obj3) {
                    try {
                        if (!((fro) obj3).d || ((fro) obj3).e) {
                            return defpackage.afbk.a;
                        }
                        try {
                            ((fro) obj3).c();
                            break;
                        } catch (java.io.IOException unused) {
                            ((fro) obj3).f = true;
                        }
                        try {
                            if (((fro) obj3).e()) {
                                ((fro) obj3).d();
                            }
                            break;
                        } catch (java.io.IOException unused2) {
                            ((fro) obj3).g = true;
                            ((fro) obj3).b = airj.a(new ajnw());
                        }
                        return defpackage.afbk.a;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            case 10:
                defpackage.afga.cz(obj);
                ((defpackage.cit) this.a).a(7);
                return defpackage.afbk.a;
            case 11:
                defpackage.afga.cz(obj);
                ((defpackage.ype) grx.a.e().o(defpackage.yqn.a, "CarApp.H.Overlay").ai(81)).y("overlayStyle: %s", this.a);
                return defpackage.afbk.a;
            case 12:
                defpackage.afga.cz(obj);
                ((defpackage.ype) ((defpackage.yox) ((gtd) this.a).b).f().o(defpackage.yqn.a, "CarApp.H.Nav.Alert").ai(84)).u("Received new Alert");
                return defpackage.afbk.a;
            case 13:
                defpackage.afga.cz(obj);
                ((hnd) this.a).d.d((java.lang.Object) null);
                return defpackage.afbk.a;
            case 14:
                defpackage.afga.cz(obj);
                ((defpackage.cit) this.a).a(7);
                return defpackage.afbk.a;
            case 15:
                defpackage.afga.cz(obj);
                ((com.google.android.apps.auto.components.apphost.basewidgets.action.ui.ContentActionsViewShim) this.a).c.a(7);
                return defpackage.afbk.a;
            case 16:
                defpackage.afga.cz(obj);
                ((jxv) this.a).b++;
                return defpackage.afbk.a;
            case 17:
                defpackage.afga.cz(obj);
                this.a.b(java.lang.Boolean.TRUE);
                return defpackage.afbk.a;
            case 18:
                defpackage.afga.cz(obj);
                return new defpackage.acbb(((defpackage.gju) defpackage.mkp.a.i(defpackage.gju.class)).a((android.graphics.Bitmap) this.a));
            case 19:
                defpackage.afga.cz(obj);
                ?? r6 = this.a;
                if (defpackage.mkc.l(r6) == defpackage.nbf.b) {
                    defpackage.mwr.a(defpackage.zbd.Hr, null);
                } else if (defpackage.mkc.l(r6) == defpackage.nbf.c) {
                    defpackage.mwr.a(defpackage.zbd.Hs, null);
                }
                return defpackage.afbk.a;
            default:
                defpackage.afga.cz(obj);
                java.lang.Boolean boolS = defpackage.mvm.s(this.a);
                if (defpackage.afga.f(boolS, java.lang.Boolean.TRUE)) {
                    defpackage.mwr.a(defpackage.zbd.Hx, null);
                } else if (defpackage.afga.f(boolS, java.lang.Boolean.FALSE)) {
                    defpackage.mwr.a(defpackage.zbd.Hz, null);
                } else if (boolS != null) {
                    throw new defpackage.afas();
                }
                return defpackage.afbk.a;
        }
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 1:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.dxp) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.dxp) b((flx) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 9:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 10:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 11:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 12:
                return ((defpackage.dxp) b((androidx.car.app.model.Alert) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 13:
                return ((defpackage.dxp) b((hkd) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 14:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 15:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 16:
                return ((defpackage.dxp) b((gsd) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 17:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 18:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            case 19:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
            default:
                return ((defpackage.dxp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(aiuf aiufVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = aiufVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(android.graphics.Bitmap bitmap, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(defpackage.bwx bwxVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = bwxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(defpackage.bys bysVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = bysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(defpackage.bys bysVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = bysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(defpackage.cit citVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = citVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(defpackage.cit citVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = citVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(com.google.android.apps.auto.components.apphost.basewidgets.action.ui.ContentActionsViewShim contentActionsViewShim, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = contentActionsViewShim;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(dxb dxbVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = dxbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(eha ehaVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = ehaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(eha ehaVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = ehaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(epn epnVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = epnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(epn epnVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.b = i;
        this.a = epnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(eyy eyyVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = eyyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(fok fokVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = fokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(fro froVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = froVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(gtd gtdVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = gtdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(gvv gvvVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = gvvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(hnd hndVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = hndVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxp(jxv jxvVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.b = i;
        this.a = jxvVar;
    }
}
