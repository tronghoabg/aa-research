package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.u;

/* loaded from: classes.dex */
final /* synthetic */ class zzbr implements InterfaceC1708w {
    static final /* synthetic */ zzbr zza = new zzbr();

    private /* synthetic */ zzbr() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public final void accept(Object obj, Object obj2) throws RemoteException {
        i iVar = zzbi.zzb;
        ((zzdz) obj).zzp(new u(false, null), (TaskCompletionSource) obj2);
    }
}
