package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.o.w f4820a;

    public c(int i2, com.google.android.gms.o.w wVar) {
        super(i2);
        this.f4820a = wVar;
    }

    @Override // com.google.android.gms.common.api.internal.a
    public final void b(Executor executor, Runnable runnable) {
        this.f4820a.a().n(executor, new b(runnable, 0));
    }

    protected abstract void e(ad adVar);

    @Override // com.google.android.gms.common.api.internal.h
    public final void f(Status status) {
        this.f4820a.d(new com.google.android.gms.common.api.i(status));
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void g(Exception exc) {
        this.f4820a.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void h(ad adVar) throws DeadObjectException {
        try {
            e(adVar);
        } catch (DeadObjectException e2) {
            f(h.j(e2));
            throw e2;
        } catch (RemoteException e3) {
            f(h.j(e3));
        } catch (RuntimeException e4) {
            g(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void i(u uVar, boolean z) {
    }
}
