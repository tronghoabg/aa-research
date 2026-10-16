package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeaf implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeaf(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeaf zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeaf(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeae((String) this.zza.zzb(), (zzdzy) this.zzb.zzb());
    }
}
