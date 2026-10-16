package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, U6.c
    public final void zzc(boolean z2) {
        this.zza.setResult((zzag) new zzak(z2 ? Status.f26424e : zzal.zza));
    }
}
