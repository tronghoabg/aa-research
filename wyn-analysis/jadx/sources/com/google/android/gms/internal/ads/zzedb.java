package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzedb implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzedb(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzedb zza(zzini zziniVar, zzini zziniVar2) {
        return new zzedb(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzecu((zzece) this.zza.zzb(), (zzdxh) this.zzb.zzb());
    }
}
