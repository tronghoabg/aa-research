package com.google.android.gms.internal.safetynet;

import C7.b;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
final class zzy extends zzd {
    final /* synthetic */ zzz zza;

    public zzy(zzz zzzVar) {
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzj(Status status, b bVar) {
        this.zza.setResult((zzz) new zzac(status, bVar));
    }
}
