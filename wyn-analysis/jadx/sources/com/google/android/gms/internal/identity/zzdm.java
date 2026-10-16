package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzdm extends zzn {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdm(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzo
    public final void zzb(Status status, boolean z2) {
        AbstractC1304a.J(status, Boolean.valueOf(z2), this.zza);
    }
}
