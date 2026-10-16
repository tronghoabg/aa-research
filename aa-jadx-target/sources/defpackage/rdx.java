package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdx implements defpackage.rzz {
    public final /* synthetic */ defpackage.ref a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rdx(defpackage.ref refVar, java.lang.Object obj, int i) {
        this.c = i;
        this.a = refVar;
        this.b = obj;
    }

    @Override // defpackage.rzz, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = this.c;
        if (i == 0) {
            return java.lang.Boolean.valueOf(this.a.C().bp((java.lang.String) this.b, false));
        }
        int i2 = 1;
        if (i == 1) {
            defpackage.ref refVar = this.a;
            java.lang.Object obj = this.b;
            defpackage.qvl qvlVarC = refVar.C();
            defpackage.rpt rptVar = (defpackage.rpt) obj;
            java.lang.String str = rptVar.f;
            boolean z = rptVar.g;
            return java.lang.Boolean.valueOf(qvlVarC.bq(str, false));
        }
        int i3 = 2;
        if (i == 2) {
            com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) this.b;
            java.lang.String strA = carDisplayId.a();
            defpackage.ref refVar2 = this.a;
            return (defpackage.sax) refVar2.g.c(defpackage.sax.class, strA, new defpackage.rds(refVar2, carDisplayId, i3));
        }
        java.lang.Object obj2 = this.b;
        if (i == 3) {
            return this.a.M((com.google.android.gms.car.display.CarDisplayId) obj2);
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId2 = (com.google.android.gms.car.display.CarDisplayId) obj2;
        java.lang.String strA2 = carDisplayId2.a();
        defpackage.ref refVar3 = this.a;
        return (defpackage.row) refVar3.g.c(defpackage.row.class, strA2, new defpackage.rds(refVar3, carDisplayId2, i2));
    }
}
