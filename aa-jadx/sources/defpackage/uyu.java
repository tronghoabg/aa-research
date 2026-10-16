package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uyu extends defpackage.zga implements java.lang.Runnable, defpackage.zhu {
    final /* synthetic */ defpackage.uyv a;
    private java.util.concurrent.Callable b;
    private final long c;

    public uyu(defpackage.uyv uyvVar, java.util.concurrent.Callable callable, long j) {
        this.a = uyvVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return defpackage.uyv.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return java.lang.Math.max(0L, java.util.concurrent.TimeUnit.MILLISECONDS.convert(this.c - this.a.a.a(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            java.util.concurrent.Callable callable = this.b;
            callable.getClass();
            this.b = null;
            o(callable.call());
        } catch (java.lang.Throwable th) {
            p(th);
            throw new java.lang.RuntimeException(th);
        }
    }
}
