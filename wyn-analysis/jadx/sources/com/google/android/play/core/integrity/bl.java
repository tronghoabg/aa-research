package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f27208c;

    /* renamed from: d, reason: collision with root package name */
    private final i8.y f27209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f27208c = bnVar;
        this.f27209d = new i8.y("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, i8.q
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f27209d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f27208c.f27216f.a(bundle);
        if (jVarA != null) {
            this.f27202a.trySetException(jVarA);
        } else {
            this.f27202a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
