package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzebj implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzebj(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzebj zza(zzini zziniVar, zzini zziniVar2) {
        return new zzebj(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzebi((zzebl) this.zza.zzb(), ((zzebh) this.zzb).zzb());
    }
}
