package com.google.android.gms.internal.safetynet;

import C7.h;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
final class zzq extends zzd {
    final /* synthetic */ zzr zza;

    public zzq(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzd(Status status, h hVar) {
        this.zza.setResult((zzr) new zzp(status, hVar));
    }
}
