package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcwp implements zzimz {
    private final zzini zza;

    private zzcwp(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcwp zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwp(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzdga zzdgaVarZza = ((zzcxv) this.zza).zza();
        return new zzdky(new zzdhw() { // from class: com.google.android.gms.internal.ads.zzcvx
            @Override // com.google.android.gms.internal.ads.zzdhw
            public final /* synthetic */ void zza() {
                zzdgaVarZza.zzc();
            }
        }, zzcfy.zzh);
    }
}
