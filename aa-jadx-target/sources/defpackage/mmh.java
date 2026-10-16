package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mmh implements defpackage.kjd {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mmh(defpackage.qsh qshVar, java.lang.String str, int i) {
        this.d = i;
        this.b = qshVar;
        this.c = "driver_position_setting_key";
        this.a = str;
    }

    @Override // defpackage.kjd
    public final java.lang.Object a() throws defpackage.qst {
        int i = this.d;
        if (i == 0) {
            defpackage.mkp.a.g();
            return defpackage.oml.y((defpackage.qsh) this.b, (java.lang.String) this.c, this.a);
        }
        if (i == 1) {
            defpackage.mkp.a.g();
            com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) this.c;
            return java.lang.Boolean.valueOf(((defpackage.qtv) this.b).d().N(java.lang.String.format("%s_%s_%s_%s", carInfo.a, carInfo.b, carInfo.c, this.a)));
        }
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        qij qijVarF = defpackage.qik.f((defpackage.qsh) obj2, (defpackage.qqe) obj);
        java.lang.String str = this.a;
        try {
            defpackage.qik.e();
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(defpackage.oml.A((defpackage.qsh) obj2, str, ((defpackage.qqe) obj).ordinal()));
            if (qijVarF != null) {
                qijVarF.close();
            }
            return boolValueOf;
        } catch (java.lang.Throwable th) {
            if (qijVarF != null) {
                try {
                    qijVarF.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public /* synthetic */ mmh(defpackage.qsh qshVar, com.google.android.gms.car.CarInfo carInfo, java.lang.String str, int i) {
        this.d = i;
        this.b = qshVar;
        this.c = carInfo;
        this.a = str;
    }

    public /* synthetic */ mmh(defpackage.qsh qshVar, defpackage.qqe qqeVar, java.lang.String str, int i) {
        this.d = i;
        this.c = qshVar;
        this.b = qqeVar;
        this.a = str;
    }
}
