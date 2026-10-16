package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfcw implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfcw(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzfcw zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzfcw(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfcv zzb() {
        return new zzfcv(((zzcnz) this.zza).zza(), zzfoi.zzc(), ((zzinl) this.zzb).zzb(), (zzfqq) this.zzc.zzb());
    }
}
