package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f27205c;

    /* renamed from: d, reason: collision with root package name */
    private final i8.y f27206d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j8) {
        super(bnVar, taskCompletionSource);
        this.f27205c = bnVar;
        this.f27206d = new i8.y("OnRequestIntegrityTokenCallback");
        this.f27207e = j8;
    }

    @Override // com.google.android.play.core.integrity.bi, i8.q
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f27206d.b("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f27205c.f27216f.a(bundle);
        if (jVarA != null) {
            this.f27202a.trySetException(jVarA);
            return;
        }
        bj bjVar = new bj(this, this.f27205c.f27213c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f27202a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
