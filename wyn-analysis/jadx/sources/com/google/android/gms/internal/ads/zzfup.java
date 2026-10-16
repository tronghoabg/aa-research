package com.google.android.gms.internal.ads;

import D6.K0;

/* loaded from: classes3.dex */
final class zzfup extends zzccv {
    private zzccp zza;
    private zzfsz zzb;
    private String zzc;

    public zzfup(zzccp zzccpVar, zzfsz zzfszVar, String str) {
        this.zza = zzccpVar;
        this.zzb = zzfszVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() {
        zzfsz zzfszVar = this.zzb;
        zzccp zzccpVar = this.zza;
        if (zzccpVar == null || zzfszVar == null) {
            return;
        }
        zzfszVar.zza(zzccpVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(K0 k02) {
        zzfsz zzfszVar = this.zzb;
        if (this.zza == null || zzfszVar == null) {
            return;
        }
        String string = k02.W().toString();
        String str = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        H6.l.f(sb2.toString());
        ((zzfty) zzfszVar).zza.zzI(k02);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
