package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class swr implements defpackage.swy {
    public final java.lang.Object a = new java.lang.Object();
    public final java.lang.Object b;
    private final java.util.concurrent.Executor c;
    private final /* synthetic */ int d;

    public swr(java.util.concurrent.Executor executor, java.lang.Object obj, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.swy
    public final void a(defpackage.swx swxVar) {
        int i = this.d;
        if (i == 0) {
            if (swxVar.g() || ((defpackage.sxc) swxVar).c) {
                return;
            }
            synchronized (this.a) {
            }
            this.c.execute(new defpackage.kfq(this, swxVar, 16, (char[]) null));
            return;
        }
        if (i == 1) {
            synchronized (this.a) {
            }
            this.c.execute(new defpackage.kfq(this, swxVar, 15, (char[]) null));
        } else if (swxVar.g()) {
            synchronized (this.a) {
            }
            this.c.execute(new defpackage.kfq(this, swxVar, 17, (char[]) null));
        }
    }
}
