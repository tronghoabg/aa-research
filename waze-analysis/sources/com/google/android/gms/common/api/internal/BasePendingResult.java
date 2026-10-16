package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.aa> extends com.google.android.gms.common.api.v<R> {

    /* renamed from: a, reason: collision with root package name */
    static final ThreadLocal f4698a = new p();

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.gms.common.api.aa f4703f;

    /* renamed from: g, reason: collision with root package name */
    private Status f4704g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f4705h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4706i;

    /* renamed from: k, reason: collision with root package name */
    private volatile com.google.android.gms.common.api.ab f4708k;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4699b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f4700c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f4701d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f4702e = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    private boolean f4707j = false;

    protected BasePendingResult(com.google.android.gms.common.api.t tVar) {
        new q(tVar != null ? tVar.a() : Looper.getMainLooper());
        new WeakReference(tVar);
    }

    public static void i(com.google.android.gms.common.api.aa aaVar) {
        if (aaVar instanceof com.google.android.gms.common.api.x) {
            try {
                ((com.google.android.gms.common.api.x) aaVar).a();
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(aaVar))), e2);
            }
        }
    }

    protected abstract com.google.android.gms.common.api.aa a(Status status);

    @Override // com.google.android.gms.common.api.v
    public final void c(com.google.android.gms.common.api.u uVar) {
        av.d(true, "Callback cannot be null.");
        synchronized (this.f4699b) {
            if (k()) {
                uVar.a(this.f4704g);
            } else {
                this.f4701d.add(uVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.v
    public final void d(TimeUnit timeUnit) {
        com.google.android.gms.common.api.aa aaVar;
        av.j(!this.f4705h, "Result has already been consumed.");
        av.j(true, "Cannot await if then() has been called.");
        try {
            if (!this.f4700c.await(0L, timeUnit)) {
                g(Status.f4689d);
            }
        } catch (InterruptedException unused) {
            g(Status.f4687b);
        }
        av.j(k(), "Result is not ready.");
        synchronized (this.f4699b) {
            av.j(!this.f4705h, "Result has already been consumed.");
            av.j(k(), "Result is not ready.");
            aaVar = this.f4703f;
            this.f4703f = null;
            this.f4705h = true;
        }
        bp bpVar = (bp) this.f4702e.getAndSet(null);
        if (bpVar != null) {
            bpVar.a();
        }
        av.m(aaVar);
    }

    @Deprecated
    public final void g(Status status) {
        synchronized (this.f4699b) {
            if (!k()) {
                j(a(status));
                this.f4706i = true;
            }
        }
    }

    public final void h() {
        boolean z = true;
        if (!this.f4707j && !((Boolean) f4698a.get()).booleanValue()) {
            z = false;
        }
        this.f4707j = z;
    }

    public final void j(com.google.android.gms.common.api.aa aaVar) {
        synchronized (this.f4699b) {
            if (this.f4706i) {
                i(aaVar);
                return;
            }
            k();
            av.j(!k(), "Results have already been set");
            av.j(!this.f4705h, "Result has already been consumed");
            this.f4703f = aaVar;
            this.f4704g = (Status) aaVar;
            this.f4700c.countDown();
            ArrayList arrayList = this.f4701d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((com.google.android.gms.common.api.u) arrayList.get(i2)).a(this.f4704g);
            }
            arrayList.clear();
        }
    }

    public final boolean k() {
        return this.f4700c.getCount() == 0;
    }

    @Deprecated
    BasePendingResult() {
        new q(Looper.getMainLooper());
        new WeakReference(null);
    }
}
