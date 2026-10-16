package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgiy implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgiy(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgiy zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgiy(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgix((zzaxt) this.zza.zzb(), (zzgie) this.zzb.zzb(), (zzgqo) this.zzc.zzb());
    }
}
