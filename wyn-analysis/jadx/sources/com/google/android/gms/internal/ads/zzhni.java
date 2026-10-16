package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzhni {
    private final zzibk zza;
    private final Class zzb;

    public /* synthetic */ zzhni(zzibk zzibkVar, Class cls, byte[] bArr) {
        this.zza = zzibkVar;
        this.zzb = cls;
    }

    public static zzhni zzd(zzhnh zzhnhVar, zzibk zzibkVar, Class cls) {
        return new zzhng(zzibkVar, cls, zzhnhVar);
    }

    public abstract zzheq zza(zzhod zzhodVar) throws GeneralSecurityException;

    public final zzibk zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
