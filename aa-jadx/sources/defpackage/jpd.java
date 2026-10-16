package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jpd implements defpackage.jde {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MTMCByteCounter");
    public final defpackage.jfo b;
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicLong e = new java.util.concurrent.atomic.AtomicLong();
    public volatile long f = -1;

    public jpd(defpackage.jfo jfoVar) {
        this.b = jfoVar;
    }

    @Override // defpackage.jde
    public final void a(long j) {
        if (this.c.get()) {
            this.d.addAndGet(j);
        } else {
            java.util.concurrent.TimeUnit.SECONDS.getClass();
        }
    }

    @Override // defpackage.jde
    public final void b(long j) {
        if (this.c.get()) {
            this.e.addAndGet(j);
        } else {
            java.util.concurrent.TimeUnit.SECONDS.getClass();
        }
    }
}
