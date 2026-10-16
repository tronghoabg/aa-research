package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kjg implements defpackage.kjd {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kjg(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kje] */
    @Override // defpackage.kjd
    public final java.lang.Object a() throws defpackage.qsu, defpackage.qst {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return this.a.invoke();
            case 1:
                ?? r1 = this.a;
                r1.a();
                return r1;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.mru.a;
                defpackage.mkp.a.g();
                return ((defpackage.rbu) this.a).a.h(com.google.android.gms.car.display.CarDisplayId.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.sax) this.a).d();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar2 = defpackage.mru.a;
                defpackage.mkp.a.f();
                com.google.android.gms.car.CarInfo carInfoC = ((defpackage.rbu) this.a).a.c();
                carInfoC.getClass();
                return carInfoC;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.msj msjVar = defpackage.msl.a;
                defpackage.mkp.a.g();
                java.lang.Object obj = this.a;
                return ((defpackage.qsh) obj).a().h(com.google.android.gms.car.display.CarDisplayId.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.msj msjVar2 = defpackage.msl.a;
                return ((defpackage.sax) this.a).d();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.mkp.a.f();
                return java.lang.Boolean.valueOf(((defpackage.qsh) this.a).a().y().d(22));
            default:
                return java.lang.Integer.valueOf(((com.google.android.projection.gearhead.system.GhLifecycleService) this.a).k(com.google.android.gms.car.display.CarDisplayId.a).a());
        }
    }
}
