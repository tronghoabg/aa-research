package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpr implements defpackage.jpw {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpr(defpackage.jpy jpyVar, android.content.Intent intent, int i) {
        this.c = i;
        this.b = jpyVar;
        this.a = intent;
    }

    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = this.c;
        if (i == 0) {
            defpackage.qzm qzmVarK = ((defpackage.jpy) this.a).m().K((java.lang.String) this.b);
            qzmVarK.getClass();
            return qzmVarK;
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(((defpackage.jpy) this.b).m().by((android.content.Intent) this.a));
        }
        if (i != 2) {
            java.util.List listAi = ((defpackage.jpy) this.b).m().ai((android.content.Intent) this.a);
            listAi.getClass();
            return listAi;
        }
        defpackage.rki rkiVarQ = ((defpackage.jpy) this.a).m().Q((com.google.android.gms.car.display.CarDisplayId) this.b);
        rkiVarQ.getClass();
        return rkiVarQ;
    }

    public /* synthetic */ jpr(defpackage.jpy jpyVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = jpyVar;
        this.b = obj;
    }
}
