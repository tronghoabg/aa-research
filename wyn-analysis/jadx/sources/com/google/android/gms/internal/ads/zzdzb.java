package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdzb implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdzb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdzb zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdzb(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdza((zzdzo) this.zza.zzb(), (zzdzy) this.zzb.zzb(), ((zzcnz) this.zzc).zza());
    }
}
