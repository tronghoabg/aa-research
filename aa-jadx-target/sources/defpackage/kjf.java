package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kjf implements defpackage.kjd {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kjf(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kje] */
    @Override // defpackage.kjd
    public final java.lang.Object a() throws defpackage.qsu, defpackage.qst {
        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return this.a.invoke();
            case 1:
                ?? r4 = this.a;
                r4.a();
                return r4;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.mkp.a.f();
                return defpackage.ooa.d((defpackage.qsh) this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.sax) this.a).b();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i = defpackage.ngg.a;
                defpackage.mkp.a.g();
                return defpackage.oml.y((defpackage.qsh) this.a, "car_day_night_mode", defpackage.ngi.h.i);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i2 = 36;
                if (!defpackage.nrr.a().f() && !defpackage.nrr.a().d()) {
                    i2 = 5;
                }
                defpackage.qts qtsVarN = defpackage.nte.c().b().n(defpackage.nta.i);
                if (qtsVarN == null) {
                    defpackage.rox.o("GH.HunPresenterBase", "unable to find layout params for SystemLayoutRegionType.NOTIFICATION", new java.lang.Object[0]);
                    carWindowLayoutParamsA = new defpackage.qts(0, 0, java.util.UUID.randomUUID()).a();
                } else {
                    qtsVarN.m = i2;
                    qtsVarN.l = true;
                    qtsVarN.n = 2132149927;
                    carWindowLayoutParamsA = qtsVarN.a();
                }
                java.lang.Object obj = this.a;
                nxd nxdVar = new nxd();
                defpackage.eqg eqgVar = ((defpackage.nwz) obj).d;
                eqgVar.getClass();
                defpackage.noy noyVarB = defpackage.nsu.b(carWindowLayoutParamsA, "HUN", nxdVar, eqgVar);
                noyVarB.e = obj;
                return noyVarB.a();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.sax) this.a).d();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.mkp.a.g();
                return java.lang.Integer.valueOf(defpackage.oml.v((defpackage.qsh) this.a, com.google.android.gms.car.display.CarDisplayId.a).a());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.sax) this.a).b();
            case 9:
                defpackage.mkp.a.g();
                return defpackage.oml.v((defpackage.qsh) this.a, com.google.android.gms.car.display.CarDisplayId.a);
            default:
                defpackage.mkp.a.g();
                return defpackage.oml.v(defpackage.kit.b().e(), ((defpackage.xgu) this.a).b);
        }
    }
}
