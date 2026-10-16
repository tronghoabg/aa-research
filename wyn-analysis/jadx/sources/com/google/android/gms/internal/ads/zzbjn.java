package com.google.android.gms.internal.ads;

import android.view.View;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbjn extends zzbjo {
    private final C6.e zza;
    private final String zzb;
    private final String zzc;

    public zzbjn(C6.e eVar, String str, String str2) {
        this.zza = eVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zzd(InterfaceC3876a interfaceC3876a) {
        if (interfaceC3876a == null) {
            return;
        }
        this.zza.zza((View) BinderC3877b.S(interfaceC3876a));
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zzf() {
        this.zza.zzc();
    }
}
