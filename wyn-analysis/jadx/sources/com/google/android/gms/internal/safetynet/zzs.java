package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
final class zzs extends zzd {
    final /* synthetic */ zzt zza;

    public zzs(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z2) {
        this.zza.setResult((zzt) new zzad(status, z2));
    }
}
