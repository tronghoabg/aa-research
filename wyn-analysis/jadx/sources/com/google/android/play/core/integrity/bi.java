package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
class bi extends i8.p {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f27202a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f27203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f27203b = bnVar;
        this.f27202a = taskCompletionSource;
    }

    @Override // i8.q
    public final void b(Bundle bundle) throws RemoteException {
        this.f27203b.f27211a.d(this.f27202a);
    }

    @Override // i8.q
    public void c(Bundle bundle) throws RemoteException {
        this.f27203b.f27211a.d(this.f27202a);
    }

    @Override // i8.q
    public final void d(Bundle bundle) throws RemoteException {
        this.f27203b.f27211a.d(this.f27202a);
    }

    @Override // i8.q
    public void e(Bundle bundle) throws RemoteException {
        this.f27203b.f27211a.d(this.f27202a);
    }
}
