package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdl implements defpackage.rzz {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rdl(defpackage.ref refVar, android.content.Intent intent, int i, int i2) {
        this.d = i2;
        this.c = refVar;
        this.b = intent;
        this.a = i;
    }

    @Override // defpackage.rzz, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = this.d;
        if (i == 0) {
            return java.lang.Boolean.valueOf(((defpackage.ref) this.b).C().bv((java.lang.String) this.c, this.a));
        }
        if (i == 1) {
            return ((defpackage.ref) this.c).C().ag((android.content.Intent) this.b, this.a);
        }
        if (i == 2) {
            return ((defpackage.ref) this.c).C().ae((android.content.Intent) this.b, this.a);
        }
        java.lang.Object obj = this.c;
        if (i != 3) {
            return ((defpackage.ref) obj).C().ah((android.content.Intent) this.b, this.a);
        }
        return ((defpackage.ref) obj).C().af((android.content.Intent) this.b, this.a);
    }

    public /* synthetic */ rdl(defpackage.ref refVar, java.lang.String str, int i, int i2) {
        this.d = i2;
        this.b = refVar;
        this.c = str;
        this.a = i;
    }
}
