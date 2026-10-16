package com.google.android.gms.internal.ads;

import D6.K0;
import z6.AbstractC4618a;

/* loaded from: classes3.dex */
public final class zzbgl extends zzbgs {
    private final AbstractC4618a zza;
    private final String zzb;

    public zzbgl(AbstractC4618a abstractC4618a, String str) {
        this.zza = abstractC4618a;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzb(zzbgq zzbgqVar) {
        AbstractC4618a abstractC4618a = this.zza;
        if (abstractC4618a != null) {
            abstractC4618a.onAdLoaded(new zzbgm(zzbgqVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzc(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzd(K0 k02) {
        AbstractC4618a abstractC4618a = this.zza;
        if (abstractC4618a != null) {
            abstractC4618a.onAdFailedToLoad(k02.W());
        }
    }
}
