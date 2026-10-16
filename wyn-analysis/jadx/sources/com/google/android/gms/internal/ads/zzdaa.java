package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;

/* loaded from: classes3.dex */
public final class zzdaa implements InterfaceC0358a {
    private final zzdae zza;
    private final zzflg zzb;

    public zzdaa(zzdae zzdaeVar, zzflg zzflgVar) {
        this.zza = zzdaeVar;
        this.zzb = zzflgVar;
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
