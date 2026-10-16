package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.C4492d;

/* loaded from: classes.dex */
final /* synthetic */ class zzbp implements InterfaceC1708w {
    private final /* synthetic */ C4492d zza;
    private final /* synthetic */ CancellationToken zzb;

    public /* synthetic */ zzbp(C4492d c4492d, CancellationToken cancellationToken) {
        this.zza = c4492d;
        this.zzb = cancellationToken;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        i iVar = zzbi.zzb;
        ((zzdz) obj).zzr(this.zza, this.zzb, (TaskCompletionSource) obj2);
    }
}
