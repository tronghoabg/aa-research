package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhoa implements zzhod {
    private final zzibk zza;
    private final zzhte zzb;

    private zzhoa(zzhte zzhteVar, zzibk zzibkVar) {
        this.zzb = zzhteVar;
        this.zza = zzibkVar;
    }

    public static zzhoa zza(zzhte zzhteVar) {
        return new zzhoa(zzhteVar, zzhok.zza(zzhteVar.zza()));
    }

    public static zzhoa zzb(zzhte zzhteVar) throws GeneralSecurityException {
        return new zzhoa(zzhteVar, zzhok.zzb(zzhteVar.zza()));
    }

    public final zzhte zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhod
    public final zzibk zzf() {
        return this.zza;
    }
}
