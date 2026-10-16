package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfci implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfci(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzfci zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzfci(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfcg zzb() {
        return new zzfcg(zzfoi.zzc(), ((zzcnz) this.zza).zza(), ((zzcop) this.zzb).zza(), ((zzcof) this.zzc).zzb());
    }
}
