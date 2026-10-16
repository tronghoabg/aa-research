package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpu implements defpackage.jpw {
    public final /* synthetic */ defpackage.jpy a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpu(defpackage.jpy jpyVar, int i) {
        this.b = i;
        this.a = jpyVar;
    }

    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = this.b;
        if (i == 0) {
            defpackage.qyf qyfVarF = this.a.m().F();
            qyfVarF.getClass();
            return qyfVarF;
        }
        if (i == 1) {
            defpackage.rik rikVarN = this.a.m().N();
            rikVarN.getClass();
            return rikVarN;
        }
        if (i == 2) {
            return java.lang.Integer.valueOf(this.a.m().fo());
        }
        if (i == 3) {
            qwt qwtVarB = this.a.m().B();
            qwtVarB.getClass();
            return qwtVarB;
        }
        if (i == 4) {
            defpackage.rab rabVarL = this.a.m().L();
            rabVarL.getClass();
            return rabVarL;
        }
        defpackage.jpy jpyVar = this.a;
        if (i == 5) {
            return java.lang.Boolean.valueOf(jpyVar.m().bo());
        }
        rjx rjxVarP = jpyVar.m().P();
        rjxVarP.getClass();
        return rjxVarP;
    }
}
