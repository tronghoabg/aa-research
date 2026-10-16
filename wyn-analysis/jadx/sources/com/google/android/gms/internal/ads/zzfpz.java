package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfpz implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzfpz(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzfpz zza(zzini zziniVar, zzini zziniVar2) {
        return new zzfpz(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfpy(((zzcnz) this.zza).zza(), (zzfqq) this.zzb.zzb());
    }
}
