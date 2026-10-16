package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpp implements defpackage.jpw {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpp(defpackage.jpy jpyVar, android.content.Intent intent, int i, int i2) {
        this.d = i2;
        this.c = jpyVar;
        this.b = intent;
        this.a = i;
    }

    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() throws defpackage.jny, android.os.RemoteException {
        switch (this.d) {
            case defpackage.abnt.b /* 0 */:
                return java.lang.Boolean.valueOf(((defpackage.jpy) this.b).m().bw((java.lang.String) this.c, this.a));
            case 1:
                return java.lang.Integer.valueOf(((defpackage.jpy) this.b).m().k((java.lang.String) this.c, this.a));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List listAe = ((defpackage.jpy) this.c).m().ae((android.content.Intent) this.b, this.a);
                listAe.getClass();
                return listAe;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(((defpackage.jpy) this.b).m().fn((java.lang.String) this.c, this.a));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List listAg = ((defpackage.jpy) this.c).m().ag((android.content.Intent) this.b, this.a);
                listAg.getClass();
                return listAg;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.List listAh = ((defpackage.jpy) this.c).m().ah((android.content.Intent) this.b, this.a);
                listAh.getClass();
                return listAh;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.jpy) this.b).m().bv((java.lang.String) this.c, this.a));
            default:
                java.util.List listAf = ((defpackage.jpy) this.c).m().af((android.content.Intent) this.b, this.a);
                listAf.getClass();
                return listAf;
        }
    }

    public /* synthetic */ jpp(defpackage.jpy jpyVar, java.lang.String str, int i, int i2) {
        this.d = i2;
        this.b = jpyVar;
        this.c = str;
        this.a = i;
    }
}
