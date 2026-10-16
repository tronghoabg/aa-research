package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcre implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcre(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcre zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcre(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new H6.p(((zzcnz) this.zza).zza(), (String) this.zzb.zzb());
    }
}
