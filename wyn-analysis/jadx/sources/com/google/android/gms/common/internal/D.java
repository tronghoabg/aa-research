package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class D implements com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.r f26584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f26585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1731u f26586c;

    public D(com.google.android.gms.common.api.r rVar, TaskCompletionSource taskCompletionSource, InterfaceC1731u interfaceC1731u) {
        this.f26584a = rVar;
        this.f26585b = taskCompletionSource;
        this.f26586c = interfaceC1731u;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(Status status) {
        boolean zV = status.V();
        TaskCompletionSource taskCompletionSource = this.f26585b;
        if (!zV) {
            taskCompletionSource.setException(AbstractC1732v.n(status));
            return;
        }
        taskCompletionSource.setResult(this.f26586c.a(this.f26584a.await(0L, TimeUnit.MILLISECONDS)));
    }
}
