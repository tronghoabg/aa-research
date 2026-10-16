package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class a0 extends L {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f26502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26503c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26504d;

    public a0(int i5, TaskCompletionSource taskCompletionSource) {
        super(i5);
        this.f26502b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void a(Status status) {
        this.f26502b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void b(RuntimeException runtimeException) {
        this.f26502b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final void c(H h10) throws DeadObjectException {
        try {
            h(h10);
        } catch (DeadObjectException e7) {
            a(c0.e(e7));
            throw e7;
        } catch (RemoteException e10) {
            a(c0.e(e10));
        } catch (RuntimeException e11) {
            this.f26502b.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.c0
    public final /* bridge */ /* synthetic */ void d(D d3, boolean z2) {
        int i5 = this.f26503c;
    }

    @Override // com.google.android.gms.common.api.internal.L
    public final boolean f(H h10) {
        switch (this.f26503c) {
            case 0:
                return ((P) this.f26504d).f26481a.f26555b;
            default:
                P p10 = (P) h10.f26459f.get((C1701o) this.f26504d);
                return p10 != null && p10.f26481a.f26555b;
        }
    }

    @Override // com.google.android.gms.common.api.internal.L
    public final d7.d[] g(H h10) {
        switch (this.f26503c) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    public final void h(H h10) {
        switch (this.f26503c) {
            case 0:
                AbstractC1706u abstractC1706u = ((P) this.f26504d).f26481a;
                ((InterfaceC1708w) ((S) abstractC1706u).f26485d.f7076c).accept(h10.f26455b, this.f26502b);
                C1701o c1701o = ((P) this.f26504d).f26481a.f26554a.f26552c;
                if (c1701o != null) {
                    h10.f26459f.put(c1701o, (P) this.f26504d);
                    break;
                }
                break;
            default:
                P p10 = (P) h10.f26459f.remove((C1701o) this.f26504d);
                TaskCompletionSource taskCompletionSource = this.f26502b;
                if (p10 == null) {
                    taskCompletionSource.trySetResult(Boolean.FALSE);
                    break;
                } else {
                    ((InterfaceC1708w) ((T) p10.f26482b).f26486b.f7077d).accept(h10.f26455b, taskCompletionSource);
                    p10.f26481a.f26554a.a();
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(C1701o c1701o, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.f26503c = 1;
        this.f26504d = c1701o;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(P p10, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.f26503c = 0;
        this.f26504d = p10;
    }

    private final /* bridge */ /* synthetic */ void i(D d3, boolean z2) {
    }

    private final /* bridge */ /* synthetic */ void j(D d3, boolean z2) {
    }
}
