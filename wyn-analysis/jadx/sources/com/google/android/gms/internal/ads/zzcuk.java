package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcuk implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcuk(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcuk zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcuk(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcuj(((zzcnz) this.zza).zza(), (zzbeu) this.zzb.zzb());
    }
}
