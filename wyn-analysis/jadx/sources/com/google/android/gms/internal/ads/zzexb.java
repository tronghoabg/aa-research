package com.google.android.gms.internal.ads;

import n7.AbstractC3601f;

/* loaded from: classes3.dex */
public final class zzexb implements zzfcs {
    private final zzfhm zza;

    public zzexb(zzfhm zzfhmVar) {
        this.zza = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzfhm zzfhmVar = this.zza;
        if (zzfhmVar == null) {
            return zzhcf.zza(new zzexa(null));
        }
        String strZza = zzfhmVar.zza();
        return AbstractC3601f.b(strZza) ? zzhcf.zza(new zzexa(null)) : zzhcf.zza(new zzexa(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 15;
    }
}
