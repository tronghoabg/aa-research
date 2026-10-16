package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpl implements jpx {
    public final /* synthetic */ defpackage.jpy a;
    private final /* synthetic */ int b;

    public /* synthetic */ jpl(defpackage.jpy jpyVar, int i) {
        this.b = i;
        this.a = jpyVar;
    }

    public final void a() throws android.os.RemoteException {
        int i = this.b;
        defpackage.jpy jpyVar = this.a;
        if (i != 0) {
            jpyVar.m().bf();
        } else {
            jpyVar.m().av();
        }
    }
}
