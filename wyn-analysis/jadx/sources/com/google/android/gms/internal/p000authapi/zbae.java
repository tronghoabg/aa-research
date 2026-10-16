package com.google.android.gms.internal.p000authapi;

import X6.k;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zbae extends zbs {
    final /* synthetic */ TaskCompletionSource zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, k kVar) throws RemoteException {
        if (status.V()) {
            this.zba.setResult(kVar);
        } else {
            this.zba.setException(AbstractC1732v.n(status));
        }
    }
}
