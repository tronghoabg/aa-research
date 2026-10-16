package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcwl implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;

    private zzcwl(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
    }

    public static zzcwl zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwl(zzcvzVar, zziniVar);
    }

    public static zzdky zzc(zzcvz zzcvzVar, zzcxn zzcxnVar) {
        return new zzdky(zzcxnVar, zzcfy.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcxn) this.zzb.zzb());
    }
}
