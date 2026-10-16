package com.google.android.gms.internal.ads;

import D6.K0;
import x6.AbstractC4480k;
import x6.InterfaceC4487r;

/* loaded from: classes3.dex */
public final class zzcdh extends zzccr {
    private AbstractC4480k zza;
    private InterfaceC4487r zzb;

    public final void zzb(AbstractC4480k abstractC4480k) {
        this.zza = abstractC4480k;
    }

    public final void zzc(InterfaceC4487r interfaceC4487r) {
        this.zzb = interfaceC4487r;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg(zzccm zzccmVar) {
        InterfaceC4487r interfaceC4487r = this.zzb;
        if (interfaceC4487r != null) {
            interfaceC4487r.onUserEarnedReward(new zzccz(zzccmVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(K0 k02) {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdFailedToShowFullScreenContent(k02.V());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() {
        AbstractC4480k abstractC4480k = this.zza;
        if (abstractC4480k != null) {
            abstractC4480k.onAdClicked();
        }
    }
}
