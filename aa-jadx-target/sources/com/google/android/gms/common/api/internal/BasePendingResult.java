package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class BasePendingResult<R extends defpackage.sme> extends defpackage.smc<R> {
    public static final java.lang.ThreadLocal b = new defpackage.smu();
    public defpackage.sme c;
    private com.google.android.gms.common.api.Status h;
    private volatile boolean i;
    private boolean j;
    private volatile sqg k;
    private smw resultGuardian;
    private final java.lang.Object a = new java.lang.Object();
    private final java.util.concurrent.CountDownLatch e = new java.util.concurrent.CountDownLatch(1);
    private final java.util.ArrayList f = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference();
    public boolean d = false;

    protected BasePendingResult(defpackage.slz slzVar) {
        new defpackage.smv(((defpackage.sng) slzVar).a.g);
        new java.lang.ref.WeakReference(slzVar);
    }

    public static void i(defpackage.sme smeVar) {
        if (smeVar instanceof rcf) {
            try {
                android.graphics.Bitmap bitmap = ((rcf) smeVar).a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("BasePendingResult", "Unable to release ".concat(java.lang.String.valueOf(java.lang.String.valueOf(smeVar))), e);
            }
        }
    }

    protected abstract defpackage.sme a(com.google.android.gms.common.api.Status status);

    @Override // defpackage.smc
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.sme c(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.sme smeVar;
        if (j > 0) {
            defpackage.sqs.au("await must not be called on the UI thread when time is greater than zero.");
        }
        if (this.i) {
            throw new java.lang.IllegalStateException("Result has already been consumed.");
        }
        try {
            if (!this.e.await(j, timeUnit)) {
                h(com.google.android.gms.common.api.Status.d);
            }
        } catch (java.lang.InterruptedException unused) {
            h(com.google.android.gms.common.api.Status.b);
        }
        if (!k()) {
            throw new java.lang.IllegalStateException("Result is not ready.");
        }
        synchronized (this.a) {
            if (this.i) {
                throw new java.lang.IllegalStateException("Result has already been consumed.");
            }
            if (!k()) {
                throw new java.lang.IllegalStateException("Result is not ready.");
            }
            smeVar = this.c;
            this.c = null;
            this.i = true;
        }
        defpackage.soa soaVar = (defpackage.soa) this.g.getAndSet(null);
        if (soaVar != null) {
            soaVar.a();
        }
        if (smeVar != null) {
            return smeVar;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    @Override // defpackage.smc
    public final void d(defpackage.smb smbVar) {
        synchronized (this.a) {
            if (k()) {
                smbVar.a(this.h);
            } else {
                this.f.add(smbVar);
            }
        }
    }

    @java.lang.Deprecated
    public final void h(com.google.android.gms.common.api.Status status) {
        synchronized (this.a) {
            if (!k()) {
                j(a(status));
                this.j = true;
            }
        }
    }

    public final void j(defpackage.sme smeVar) {
        synchronized (this.a) {
            if (this.j) {
                i(smeVar);
                return;
            }
            k();
            if (k()) {
                throw new java.lang.IllegalStateException("Results have already been set");
            }
            if (this.i) {
                throw new java.lang.IllegalStateException("Result has already been consumed");
            }
            this.c = smeVar;
            this.h = smeVar.b();
            this.e.countDown();
            if (this.c instanceof rcf) {
                this.resultGuardian = new smw(this);
            }
            java.util.ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.smb) arrayList.get(i)).a(this.h);
            }
            arrayList.clear();
        }
    }

    public final boolean k() {
        return this.e.getCount() == 0;
    }

    @java.lang.Deprecated
    protected BasePendingResult(android.os.Looper looper) {
        new defpackage.smv(looper);
        new java.lang.ref.WeakReference(null);
    }

    @java.lang.Deprecated
    BasePendingResult() {
        new defpackage.smv(android.os.Looper.getMainLooper());
        new java.lang.ref.WeakReference(null);
    }
}
