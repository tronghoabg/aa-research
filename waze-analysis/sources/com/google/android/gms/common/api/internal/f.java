package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private final bn f4823a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.o.w f4824b;

    public f(int i2, bn bnVar, com.google.android.gms.o.w wVar) {
        super(i2);
        this.f4824b = wVar;
        this.f4823a = bnVar;
        if (i2 == 2 && bnVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final int a(ad adVar) {
        return this.f4823a.a();
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final void b(Executor executor, Runnable runnable) {
        this.f4824b.a().n(executor, new b(runnable, 2));
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final boolean c(ad adVar) {
        return this.f4823a.c();
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final com.google.android.gms.common.f[] d(ad adVar) {
        return this.f4823a.d();
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void f(Status status) {
        this.f4824b.d(com.google.android.gms.common.api.ab.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void g(Exception exc) {
        this.f4824b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void h(ad adVar) throws DeadObjectException {
        try {
            bn bnVar = this.f4823a;
            bnVar.f4812a.f4807a.a(adVar.f(), this.f4824b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            f(h.j(e3));
        } catch (RuntimeException e4) {
            g(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void i(u uVar, boolean z) {
        uVar.d(this.f4824b, z);
    }
}
