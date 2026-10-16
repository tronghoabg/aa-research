package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import j$.util.Objects;
import x6.AbstractC4479j;
import x6.C4481l;

/* loaded from: classes3.dex */
final class zzedm extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AbstractC4479j zzb;
    final /* synthetic */ zzedw zzc;

    public zzedm(zzedw zzedwVar, String str, AbstractC4479j abstractC4479j) {
        this.zza = str;
        this.zzb = abstractC4479j;
        Objects.requireNonNull(zzedwVar);
        this.zzc = zzedwVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.zzc.zzg(zzedw.zzm(c4481l));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
