package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcxa implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcxa(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzcxa zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcxa(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return true == Boolean.valueOf(zzcwy.zza()).booleanValue() ? ((zzepe) this.zza).zzb() : ((zzerd) this.zzb).zzb();
    }
}
