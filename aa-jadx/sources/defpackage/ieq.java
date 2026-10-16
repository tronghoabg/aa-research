package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ieq implements java.util.concurrent.Future, defpackage.ier, defpackage.ifd {
    private java.lang.Object a;
    private defpackage.ien b;
    private boolean c;
    private boolean d;
    private boolean e;
    private defpackage.hxc f;

    private final synchronized java.lang.Object i(java.lang.Long l) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (!isDone() && !defpackage.igg.h()) {
            throw new java.lang.IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.c) {
            throw new java.util.concurrent.CancellationException();
        }
        if (this.e) {
            throw new java.util.concurrent.ExecutionException(this.f);
        }
        if (!this.d) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                }
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            if (this.e) {
                throw new java.util.concurrent.ExecutionException(this.f);
            }
            if (this.c) {
                throw new java.util.concurrent.CancellationException();
            }
            if (!this.d) {
                throw new java.util.concurrent.TimeoutException();
            }
        }
        return this.a;
    }

    @Override // defpackage.ifd
    public final synchronized void b(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public final synchronized void c(java.lang.Object obj, defpackage.ifm ifmVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            defpackage.ien ienVar = null;
            if (z) {
                defpackage.ien ienVar2 = this.b;
                this.b = null;
                ienVar = ienVar2;
            }
            if (ienVar != null) {
                ienVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.ifd
    public final synchronized defpackage.ien d() {
        return this.b;
    }

    @Override // defpackage.ifd
    public final void e(defpackage.ifc ifcVar) {
        ifcVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.ier
    public final synchronized boolean ep(defpackage.hxc hxcVar, java.lang.Object obj, defpackage.ifd ifdVar) {
        this.e = true;
        this.f = hxcVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.ier
    public final synchronized boolean eq(java.lang.Object obj, java.lang.Object obj2, defpackage.ifd ifdVar, int i) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        try {
            return i(null);
        } catch (java.util.concurrent.TimeoutException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // defpackage.ifd
    public final synchronized void h(defpackage.ien ienVar) {
        this.b = ienVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.c || this.d || this.e;
    }

    public final java.lang.String toString() {
        defpackage.ien ienVar;
        java.lang.String str;
        java.lang.String strValueOf = java.lang.String.valueOf(super.toString());
        synchronized (this) {
            ienVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.SUCCESS;
            } else {
                str = "PENDING";
                ienVar = this.b;
            }
        }
        java.lang.String strConcat = strValueOf.concat("[status=");
        if (ienVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + ienVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return i(java.lang.Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.idq
    public final void j() {
    }

    @Override // defpackage.idq
    public final void k() {
    }

    @Override // defpackage.idq
    public final void l() {
    }

    @Override // defpackage.ifd
    public final void a(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public final void f(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.ifd
    public final void g(defpackage.ifc ifcVar) {
    }
}
