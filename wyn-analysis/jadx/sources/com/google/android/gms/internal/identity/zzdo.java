package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.I;

/* loaded from: classes.dex */
final class zzdo extends zzq {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ I zzb;

    public zzdo(TaskCompletionSource taskCompletionSource, I i5) {
        this.zza = taskCompletionSource;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) {
        AbstractC1304a.J(zzlVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() throws RemoteException {
        this.zzb.zze();
    }
}
