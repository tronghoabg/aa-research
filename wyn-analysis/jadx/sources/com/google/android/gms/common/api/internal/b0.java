package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b0 extends L {

    /* renamed from: b, reason: collision with root package name */
    public final A f26509b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f26510c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1710y f26511d;

    public b0(int i5, A a5, TaskCompletionSource taskCompletionSource, InterfaceC1710y interfaceC1710y) {
        super(i5);
        this.f26510c = taskCompletionSource;
        this.f26509b = a5;
        this.f26511d = interfaceC1710y;
        if (i5 == 2 && a5.f26438b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void a(Status status) {
        ((C1687a) this.f26511d).getClass();
        this.f26510c.trySetException(AbstractC1732v.n(status));
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void b(RuntimeException runtimeException) {
        this.f26510c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void c(H h10) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f26510c;
        try {
            this.f26509b.b(h10.f26455b, taskCompletionSource);
        } catch (DeadObjectException e7) {
            throw e7;
        } catch (RemoteException e10) {
            a(c0.e(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void d(D d3, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        Map map = (Map) d3.f26444b;
        TaskCompletionSource taskCompletionSource = this.f26510c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new D(d3, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.L
    public final boolean f(H h10) {
        return this.f26509b.f26438b;
    }

    @Override // com.google.android.gms.common.api.internal.L
    public final d7.d[] g(H h10) {
        return this.f26509b.f26437a;
    }
}
