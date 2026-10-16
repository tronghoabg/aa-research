package com.google.android.gms.internal.ads;

import j$.util.Objects;
import x6.C4481l;

/* loaded from: classes3.dex */
final class zzedo extends R6.d {
    final /* synthetic */ String zza;
    final /* synthetic */ zzedw zzb;

    public zzedo(zzedw zzedwVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzedwVar);
        this.zzb = zzedwVar;
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.zzb.zzg(zzedw.zzm(c4481l));
    }

    @Override // x6.AbstractC4473d
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzb.zzf(this.zza, (R6.c) obj);
    }
}
