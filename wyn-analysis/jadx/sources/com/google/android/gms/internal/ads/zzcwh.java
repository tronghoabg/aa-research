package com.google.android.gms.internal.ads;

import D6.C0395s;

/* loaded from: classes3.dex */
public final class zzcwh implements zzimz {
    private final zzini zza;

    private zzcwh(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcwh zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwh(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzgxd zzgxdVarZzi = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzon)).booleanValue() ? zzgxd.zzi(new zzdky(((zzcxl) this.zza).zzb(), zzcfy.zza)) : zzgxd.zzh();
        zzinh.zzb(zzgxdVarZzi);
        return zzgxdVarZzi;
    }
}
