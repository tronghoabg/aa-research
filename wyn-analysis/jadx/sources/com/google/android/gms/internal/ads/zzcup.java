package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcup implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcup(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcup zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcup(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbeu zzbeuVar = (zzbeu) this.zza.zzb();
        return new zzcui(zzbeuVar.zzd(), (zzbuy) this.zzb.zzb(), zzfoe.zzc());
    }
}
