package com.google.android.gms.internal.safetynet;

import C7.j;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
final class zzw extends zzd {
    final /* synthetic */ zzx zza;

    public zzw(zzx zzxVar) {
        this.zza = zzxVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzh(Status status, j jVar) {
        this.zza.setResult((zzx) new zzab(status, jVar));
    }
}
