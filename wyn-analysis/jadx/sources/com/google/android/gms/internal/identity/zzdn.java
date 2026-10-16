package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzdn extends zzq {
    final /* synthetic */ Object zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdn(Object obj, TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) {
        AbstractC1304a.J(zzlVar.getStatus(), this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() {
    }
}
