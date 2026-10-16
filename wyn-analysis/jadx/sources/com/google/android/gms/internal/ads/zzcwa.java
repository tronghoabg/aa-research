package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcwa implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;

    private zzcwa(zzcvz zzcvzVar, zzini zziniVar) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
    }

    public static zzcwa zza(zzcvz zzcvzVar, zzini zziniVar) {
        return new zzcwa(zzcvzVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzinl) this.zzb).zzb());
    }
}
