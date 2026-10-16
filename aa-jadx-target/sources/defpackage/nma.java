package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nma implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nma(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nqe] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nqe] */
    /* JADX WARN: Type inference failed for: r0v49, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r8v41, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v61, types: [aiyx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v76, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v78, types: [bwx, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int i;
        int i2 = 5;
        int i3 = 7;
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ?? r0 = this.a;
                if (r0 != 0) {
                    ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new defpackage.nbo((nqe) r0, (defpackage.afdk) null, 5, (byte[]) null), 3);
                }
                return defpackage.afbk.a;
            case 1:
                odn odnVarB = odn.b();
                defpackage.afja<?> afjaVar = njv.a[0];
                java.lang.Object obj = this.b;
                odj odjVarA = odnVarB.a((defpackage.noz) ((njv) obj).r.getValue(obj, afjaVar), new ods((android.view.View) this.a));
                odjVarA.f = new njr((android.support.v4.app.Fragment) obj, 0);
                return odjVarA;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ?? r1 = this.a;
                if (r1 != 0) {
                    ahoc.d((aiuw) this.b, (defpackage.afdo) null, 0, new defpackage.nbo((nqe) r1, (defpackage.afdk) null, 4), 3);
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.RAIL, defpackage.zbd.HU);
                rrvVarH.p(((com.google.android.apps.auto.components.telecom.PhoneCall) this.b).f);
                oimVarU.F(rrvVarH.l());
                defpackage.mpk.a().i(new android.content.Intent().setComponent((android.content.ComponentName) this.a));
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.npu.d(358614275, ((klx) this.a).b, new defpackage.npo(15));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.npu.d(320865540, this.a, new defpackage.npo(8));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.npu.d(356517120, this.a, new defpackage.npo(i2));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.npu.d(354419977, this.a, new defpackage.npo(i3));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.npu.d(354419976, this.a, new defpackage.npo(9));
            case 9:
                return defpackage.npu.d(354419978, this.a, new defpackage.npo(6));
            case 10:
                return defpackage.npu.d(624984185, this.a, new defpackage.npo(11));
            case 11:
                return defpackage.npu.d(354419973, this.a, new defpackage.npo(14));
            case 12:
                defpackage.qts qtsVarN = defpackage.nte.c().b().n(defpackage.nta.d);
                if (qtsVarN == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA = qtsVarN.a();
                defpackage.qts qtsVar = new defpackage.qts(carWindowLayoutParamsA);
                qtsVar.g = carWindowLayoutParamsA.i + 3;
                qtsVar.j = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
                qtsVar.k = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0);
                qtsVar.q = null;
                qtsVar.l = true;
                return defpackage.nsu.b(qtsVar.a(), "immersive_education", (android.support.v4.app.Fragment) obj2, ((oxg) obj3).a).a();
            case 13:
                java.lang.Object obj4 = this.b;
                if (defpackage.acyc.ac()) {
                    defpackage.nxh nxhVar = (defpackage.nxh) obj4;
                    i = nxhVar.v;
                    if (i == 1 && (nxhVar.u == 2 || nxhVar.m == null)) {
                        if (nxhVar.n != null) {
                            nxhVar.v = 4;
                            i = 4;
                        } else {
                            nxhVar.v = 2;
                            i = 2;
                        }
                    }
                } else {
                    defpackage.nxh nxhVar2 = (defpackage.nxh) obj4;
                    i = nxhVar2.v;
                    if (i == 1 && nxhVar2.u == 2) {
                        nxhVar2.v = 4;
                        i = 4;
                    }
                }
                if (i == 0) {
                    throw new defpackage.afas();
                }
                java.lang.Object obj5 = this.a;
                int i4 = i - 1;
                if (i4 == 0) {
                    ((nwl) obj5).i.a(7);
                } else if (i4 == 1) {
                    ((nwl) obj5).j.a(7);
                } else if (i4 == 2) {
                    ((nwl) obj5).i.a(7);
                } else if (i4 == 3) {
                    ((nwl) obj5).k.a(7);
                } else if (i4 != 4) {
                    ((nwl) obj5).m.a(7);
                } else {
                    ((nwl) obj5).l.a(7);
                }
                return defpackage.afbk.a;
            case 14:
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                int i5 = nzw.a;
                return defpackage.nsu.b((com.google.android.gms.car.CarWindowLayoutParams) obj7, "HeroStatusBarWindow", (android.support.v4.app.Fragment) obj6, defpackage.ler.c()).a();
            case 15:
                java.util.List listK = ((defpackage.ogk) this.a).c.k();
                listK.getClass();
                java.lang.Object objA = aiea.a((aiyx) this.b, listK);
                if (objA instanceof aiyn) {
                    throw new java.lang.IllegalStateException("Could not post updated calls", aiyo.b(objA));
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.ogk ogkVar = (defpackage.ogk) this.b;
                ogkVar.c.E((defpackage.omf) this.a);
                java.util.Map map = ogkVar.d;
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ogkVar.e((ogf) it.next());
                }
                map.clear();
                ogkVar.e.clear();
                return defpackage.afbk.a;
            case 17:
                defpackage.mkp.a.g();
                ((defpackage.eqp) this.a).m(java.lang.Integer.valueOf(defpackage.oml.q((defpackage.qsh) this.b).a()));
                return defpackage.afbk.a;
            case 18:
                ((defpackage.od) this.b).startActivityForResult(new android.content.Intent((android.content.Context) this.a, (java.lang.Class<?>) com.google.android.apps.auto.components.widgets.EarthPickerActivity.class), 100);
                return defpackage.afbk.a;
            case 19:
                ((defpackage.kwv) this.a).N(0);
                this.b.invoke();
                return defpackage.afbk.a;
            default:
                this.a.b(java.lang.Boolean.valueOf(false));
                this.b.b(java.lang.Boolean.valueOf(true));
                return defpackage.afbk.a;
        }
    }

    public /* synthetic */ nma(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
