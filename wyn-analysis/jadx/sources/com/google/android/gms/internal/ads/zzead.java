package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzead implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzead(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
        this.zzd = zziniVar5;
    }

    public static zzead zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzead(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        H6.p pVar = (H6.p) this.zza.zzb();
        O6.a aVarZzb = ((O6.b) this.zzb).zzb();
        ((O6.d) this.zzc).getClass();
        return new zzdzy(zzhcpVarZzc, pVar, aVarZzb, new O6.c(), ((zzcnz) this.zzd).zza());
    }
}
