package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzdi implements zzdr {
    final /* synthetic */ C1703q zza;
    final /* synthetic */ TaskCompletionSource zzb;

    public zzdi(zzdz zzdzVar, C1703q c1703q, TaskCompletionSource taskCompletionSource) {
        this.zza = c1703q;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final C1703q zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzb(C1703q c1703q) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
        this.zzb.trySetResult(null);
    }
}
