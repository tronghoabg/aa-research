package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgex implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgex(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgex zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgex(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgew zzgewVar = ((zzgdq) this.zzc.zzb()).zzv() ? (zzgew) zzimy.zzc(this.zza).zzb() : (zzgew) zzimy.zzc(this.zzb).zzb();
        zzinh.zzb(zzgewVar);
        return zzgewVar;
    }
}
