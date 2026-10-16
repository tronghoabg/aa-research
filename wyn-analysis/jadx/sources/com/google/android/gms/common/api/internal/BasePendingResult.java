package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.InterfaceC1728q;
import com.google.android.gms.internal.ads.zzcjh;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.t> extends com.google.android.gms.common.api.r {
    static final ThreadLocal zaa = new f0(0);
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private g0 resultGuardian;
    protected final HandlerC1693g zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.u zah;
    private com.google.android.gms.common.api.t zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC1728q zao;
    private volatile X zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        this.zab = new HandlerC1693g(oVar != null ? ((J) oVar).f26468b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zal(com.google.android.gms.common.api.t tVar) {
        if (tVar instanceof zzcjh) {
            try {
                ((zzcjh) tVar).release();
            } catch (RuntimeException e7) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(tVar)), e7);
            }
        }
    }

    public final com.google.android.gms.common.api.t a() {
        com.google.android.gms.common.api.t tVar;
        synchronized (this.zae) {
            AbstractC1732v.k("Result has already been consumed.", !this.zal);
            AbstractC1732v.k("Result is not ready.", isReady());
            tVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        AbstractC1732v.i(tVar);
        return tVar;
    }

    @Override // com.google.android.gms.common.api.r
    public final void addStatusListener(com.google.android.gms.common.api.q qVar) {
        AbstractC1732v.a("Callback cannot be null.", qVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    qVar.a(this.zak);
                } else {
                    this.zag.add(qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() throws InterruptedException {
        AbstractC1732v.h("await must not be called on the UI thread");
        AbstractC1732v.k("Result has already been consumed", !this.zal);
        AbstractC1732v.k("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f26425f);
        }
        AbstractC1732v.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.t tVar) {
        this.zaj = tVar;
        this.zak = tVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.u uVar = this.zah;
            if (uVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(uVar, a());
            } else if (this.zaj instanceof zzcjh) {
                this.resultGuardian = new g0(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((com.google.android.gms.common.api.q) arrayList.get(i5)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    InterfaceC1728q interfaceC1728q = this.zao;
                    if (interfaceC1728q != null) {
                        try {
                            com.google.android.gms.common.internal.a0 a0Var = (com.google.android.gms.common.internal.a0) interfaceC1728q;
                            a0Var.zzC(2, a0Var.zza());
                        } catch (RemoteException unused) {
                        }
                    }
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f26428i));
                }
            } finally {
            }
        }
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult((BasePendingResult<R>) createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z2;
        synchronized (this.zae) {
            z2 = this.zam;
        }
        return z2;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC1728q interfaceC1728q) {
        synchronized (this.zae) {
            this.zao = interfaceC1728q;
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z2 = true;
                AbstractC1732v.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z2 = false;
                }
                AbstractC1732v.k("Cannot set callbacks if then() has been called.", z2);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.t> com.google.android.gms.common.api.w then(com.google.android.gms.common.api.v vVar) {
        X xA;
        AbstractC1732v.k("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                AbstractC1732v.k("Cannot call then() twice.", this.zap == null);
                AbstractC1732v.k("Cannot call then() if callbacks are set.", this.zah == null);
                AbstractC1732v.k("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new X(this.zac);
                xA = this.zap.a();
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xA;
    }

    public final void zak() {
        boolean z2 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z2 = false;
        }
        this.zaq = z2;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.o) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(Y y10) {
        this.zai.set(y10);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1692f
    public final void setResult(R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                AbstractC1732v.k("Results have already been set", !isReady());
                AbstractC1732v.k("Result has already been consumed", !this.zal);
                b(r10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.r
    @ResultIgnorabilityUnspecified
    public final R await(long j8, TimeUnit timeUnit) {
        if (j8 > 0) {
            AbstractC1732v.h("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC1732v.k("Result has already been consumed.", !this.zal);
        AbstractC1732v.k("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j8, timeUnit)) {
                forceFailureUnlessReady(Status.f26427h);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f26425f);
        }
        AbstractC1732v.k("Result is not ready.", isReady());
        return (R) a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.u uVar, long j8, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (uVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z2 = true;
                AbstractC1732v.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z2 = false;
                }
                AbstractC1732v.k("Cannot set callbacks if then() has been called.", z2);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(uVar, a());
                } else {
                    this.zah = uVar;
                    HandlerC1693g handlerC1693g = this.zab;
                    handlerC1693g.sendMessageDelayed(handlerC1693g.obtainMessage(2, this), timeUnit.toMillis(j8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
