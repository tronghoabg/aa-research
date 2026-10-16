package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final /* synthetic */ class zzcb implements InterfaceC1708w {
    static final /* synthetic */ zzcb zza = new zzcb();

    private /* synthetic */ zzcb() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((zzdz) obj).zzy((TaskCompletionSource) obj2);
    }
}
