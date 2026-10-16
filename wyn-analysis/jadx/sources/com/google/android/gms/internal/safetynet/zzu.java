package com.google.android.gms.internal.safetynet;

import C7.i;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
final class zzu extends zzd {
    final /* synthetic */ zzv zza;

    public zzu(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzg(Status status, i iVar) {
        this.zza.setResult((zzv) new zzaa(status, iVar));
    }
}
