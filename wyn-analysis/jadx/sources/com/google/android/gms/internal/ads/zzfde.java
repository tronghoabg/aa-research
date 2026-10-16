package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfde implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfde(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzfde zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzfde(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdd zzb() {
        return new zzfdd(zzfoi.zzc(), ((zzcnz) this.zza).zza(), (zzeej) this.zzb.zzb(), (String) this.zzc.zzb());
    }
}
