package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpv implements defpackage.jpw {
    public final /* synthetic */ defpackage.jpy a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpv(defpackage.jpy jpyVar, java.lang.String str, boolean z, int i) {
        this.d = i;
        this.a = jpyVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.d;
        defpackage.jpy jpyVar = this.a;
        if (i != 0) {
            return java.lang.Boolean.valueOf(jpyVar.m().bq(this.b, this.c));
        }
        return java.lang.Boolean.valueOf(jpyVar.m().bp(this.b, this.c));
    }
}
