package com.google.android.gms.internal.ads;

import D6.K0;

/* loaded from: classes3.dex */
final class zzftj extends D6.A {
    private D6.L zza;
    private zzfsz zzb;
    private String zzc;

    public zzftj(D6.L l10, zzfsz zzfszVar, String str) {
        this.zza = l10;
        this.zzb = zzfszVar;
        this.zzc = str;
    }

    @Override // D6.B
    public final void zzb() {
        zzfsz zzfszVar = this.zzb;
        D6.L l10 = this.zza;
        if (l10 == null || zzfszVar == null) {
            return;
        }
        zzfszVar.zza(l10);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // D6.B
    public final void zzc(K0 k02) {
        zzfsz zzfszVar = this.zzb;
        if (this.zza == null || zzfszVar == null) {
            return;
        }
        String string = k02.W().toString();
        String str = this.zzc;
        StringBuilder sb2 = new StringBuilder(string.length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        H6.l.f(sb2.toString());
        ((zzfty) zzfszVar).zza.zzI(k02);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
