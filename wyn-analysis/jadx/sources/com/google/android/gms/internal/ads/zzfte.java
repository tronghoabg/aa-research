package com.google.android.gms.internal.ads;

import D6.K0;

/* loaded from: classes3.dex */
final class zzfte extends zzbgs {
    private zzfsz zza;
    private String zzb;

    public zzfte(zzfsz zzfszVar, String str) {
        this.zza = zzfszVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzb(zzbgq zzbgqVar) {
        zzfsz zzfszVar = this.zza;
        if (zzfszVar == null) {
            return;
        }
        zzfszVar.zza(zzbgqVar);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzc(int i5) {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzd(K0 k02) {
        zzfsz zzfszVar = this.zza;
        if (zzfszVar == null) {
            return;
        }
        String string = k02.W().toString();
        String str = this.zzb;
        StringBuilder sb2 = new StringBuilder(string.length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        H6.l.f(sb2.toString());
        ((zzfty) zzfszVar).zza.zzI(k02);
        this.zza = null;
        this.zzb = null;
    }
}
