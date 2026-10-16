package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class X extends com.google.android.gms.common.api.w implements com.google.android.gms.common.api.u {

    /* renamed from: a, reason: collision with root package name */
    public X f26498a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26499b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f26500c;

    public X(WeakReference weakReference) {
        AbstractC1732v.j(weakReference, "GoogleApiClient reference must not be null");
        this.f26500c = weakReference;
        com.google.android.gms.common.api.o oVar = (com.google.android.gms.common.api.o) weakReference.get();
        new W(this, oVar != null ? ((J) oVar).f26468b.getLooper() : Looper.getMainLooper());
    }

    public final X a() {
        X x5;
        synchronized (this.f26499b) {
            x5 = new X(this.f26500c);
            this.f26498a = x5;
        }
        return x5;
    }

    public final void b(com.google.android.gms.common.api.r rVar) {
        synchronized (this.f26499b) {
        }
    }

    public final void c(Status status) {
        synchronized (this.f26499b) {
            d();
        }
    }

    public final void d() {
        synchronized (this.f26499b) {
        }
    }
}
