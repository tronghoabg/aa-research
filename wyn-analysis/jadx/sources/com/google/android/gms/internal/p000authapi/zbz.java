package com.google.android.gms.internal.p000authapi;

import X6.a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zbz extends zbi {
    final /* synthetic */ TaskCompletionSource zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(Status status, a aVar) throws RemoteException {
        if (status.V()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(AbstractC1732v.n(status));
        }
    }
}
