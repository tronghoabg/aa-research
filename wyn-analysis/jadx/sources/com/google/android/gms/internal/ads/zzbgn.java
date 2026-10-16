package com.google.android.gms.internal.ads;

import D6.K0;
import x6.AbstractC4480k;

/* loaded from: classes3.dex */
public final class zzbgn extends zzbgw {
    private AbstractC4480k zza;

    public final void zzb(AbstractC4480k abstractC4480k) {
        this.zza = abstractC4480k;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzc() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzd() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(K0 k02) {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdFailedToShowFullScreenContent(k02.V());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzf() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzg() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdClicked();
        }
    }
}
