package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzimx implements zzimz {
    private zzini zza;

    public static void zza(zzini zziniVar, zzini zziniVar2) {
        zzimx zzimxVar = (zzimx) zziniVar;
        if (zzimxVar.zza != null) {
            throw new IllegalStateException();
        }
        zzimxVar.zza = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzini zziniVar = this.zza;
        if (zziniVar != null) {
            return zziniVar.zzb();
        }
        throw new IllegalStateException();
    }
}
