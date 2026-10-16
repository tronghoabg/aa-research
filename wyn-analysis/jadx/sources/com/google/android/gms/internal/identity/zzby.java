package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.k;

/* loaded from: classes.dex */
final /* synthetic */ class zzby implements InterfaceC1708w {
    static final /* synthetic */ zzby zza = new zzby();

    private /* synthetic */ zzby() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ((zzdz) obj).zzq(new k(Long.MAX_VALUE, 0, false, null), (TaskCompletionSource) obj2);
    }
}
