package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vvz {
    private static final defpackage.vvy k = new defpackage.vvw();
    public final defpackage.aclm a;
    public final java.util.concurrent.Executor b;
    public final defpackage.zhw c;
    public final defpackage.aclm d;
    public final java.util.Random e;
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    public volatile defpackage.vvy g = k;
    public java.util.concurrent.ScheduledFuture h;
    public java.util.concurrent.ScheduledFuture i;
    public java.util.concurrent.ScheduledFuture j;

    public vvz(defpackage.vra vraVar, defpackage.zhw zhwVar, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.aclm aclmVar2, defpackage.aclm aclmVar3, java.util.Random random) {
        this.a = aclmVar;
        this.b = executor;
        this.c = zhwVar;
        this.d = aclmVar2;
        this.e = random;
        vraVar.a(new defpackage.vvx(this, aclmVar3, zhwVar));
    }

    public final void a() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.h = null;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture2 = this.i;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.i = null;
        }
    }
}
