package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgpi implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgpi(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgpi zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgpi(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgph((zzgcy) this.zza.zzb(), (zzgqo) this.zzb.zzb(), ((zzgdq) this.zzc.zzb()).zzk().zzb());
    }
}
