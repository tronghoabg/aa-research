package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzecr implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzecr(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzecr zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzecr(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzecn((zzecz) this.zza.zzb(), ((zzdcq) this.zzb).zza(), (String) this.zzc.zzb());
    }
}
