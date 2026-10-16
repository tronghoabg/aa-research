package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpq implements jpx {
    public final /* synthetic */ defpackage.jpy a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpq(defpackage.jpy jpyVar, java.lang.Object obj, int i, int i2) {
        this.d = i2;
        this.a = jpyVar;
        this.c = obj;
        this.b = i;
    }

    public final void a() throws android.os.RemoteException {
        int i = this.d;
        defpackage.jpy jpyVar = this.a;
        if (i != 0) {
            jpyVar.m().aU((java.lang.String) this.c, this.b);
        } else {
            jpyVar.m().aA((byte[]) this.c, this.b);
        }
    }
}
