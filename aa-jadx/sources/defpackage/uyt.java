package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uyt extends defpackage.zga implements java.lang.Runnable, defpackage.zhu {
    final long a;
    final long b;
    final boolean c;
    final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong(0);
    java.lang.Runnable e;
    final /* synthetic */ defpackage.uyv f;

    public uyt(defpackage.uyv uyvVar, java.lang.Runnable runnable, long j, long j2, boolean z) {
        this.f = uyvVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long d() {
        return java.lang.Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.a());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return defpackage.uyv.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(d(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            java.lang.Runnable runnable = this.e;
            runnable.getClass();
            runnable.run();
            boolean z = this.c;
            defpackage.uyv uyvVar = this.f;
            if (z) {
                uyvVar.b.postDelayed(this, d());
            } else {
                uyvVar.b.postDelayed(this, this.b);
            }
        } catch (java.lang.Throwable th) {
            this.e = null;
            p(th);
        }
    }
}
