package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.F;

/* loaded from: classes.dex */
final class zzdd extends zzq {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ F zzb;

    public zzdd(TaskCompletionSource taskCompletionSource, F f10) {
        this.zza = taskCompletionSource;
        this.zzb = f10;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) {
        AbstractC1304a.J(zzlVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() throws RemoteException {
        this.zzb.zzf();
    }
}
