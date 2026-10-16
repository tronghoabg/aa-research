package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfpx implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfpx(zzfpw zzfpwVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzfpx zza(zzfpw zzfpwVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfpx(zzfpwVar, zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbup zzbupVarZzb = new zzbug().zzb(((zzcnz) this.zza).zza(), ((zzcop) this.zzb).zza(), (zzfqt) this.zzc.zzb());
        zzinh.zzb(zzbupVarZzb);
        return zzbupVarZzb;
    }
}
