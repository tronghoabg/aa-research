package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sno {
    public volatile defpackage.snm a;
    private final java.util.concurrent.Executor b;

    public sno(android.os.Looper looper, java.lang.Object obj, java.lang.String str) {
        this.b = new defpackage.sqv(looper);
        defpackage.sqs.aB(obj, "Listener must not be null");
        defpackage.sqs.ax(str);
        this.a = new defpackage.snm(obj, str);
    }

    public final void a() {
        this.a = null;
    }

    public final void b(defpackage.snn snnVar) {
        this.b.execute(new defpackage.sbj(this, snnVar, 10));
    }

    public final boolean c() {
        return this.a != null;
    }

    public sno(java.util.concurrent.Executor executor, java.lang.Object obj) {
        this.b = executor;
        defpackage.sqs.ax("GetCurrentLocation");
        this.a = new defpackage.snm(obj, "GetCurrentLocation");
    }
}
