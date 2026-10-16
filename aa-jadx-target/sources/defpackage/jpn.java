package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpn implements defpackage.jpw {
    public final /* synthetic */ defpackage.jpy a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpn(defpackage.jpy jpyVar, int i) {
        this.b = i;
        this.a = jpyVar;
    }

    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = this.b;
        if (i == 0) {
            defpackage.rae raeVarM = this.a.m().M();
            raeVarM.getClass();
            return raeVarM;
        }
        defpackage.jpy jpyVar = this.a;
        if (i != 1) {
            defpackage.qwn qwnVarA = jpyVar.m().A();
            qwnVarA.getClass();
            return qwnVarA;
        }
        java.util.List listAa = jpyVar.m().aa();
        listAa.getClass();
        return listAa;
    }
}
