package com.google.android.gms.internal.p000authapi;

import a.AbstractC1304a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC1696j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zban extends AbstractBinderC1696j {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1697k
    public final void onResult(Status status) throws RemoteException {
        AbstractC1304a.J(status, null, this.zba);
    }
}
