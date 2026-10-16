package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC1696j;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzdj extends AbstractBinderC1696j {
    final /* synthetic */ Object zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdj(Object obj, TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1697k
    public final void onResult(Status status) {
        AbstractC1304a.J(status, this.zza, this.zzb);
    }
}
