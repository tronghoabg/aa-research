package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzhnl {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhnl(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhnl zzd(zzhnk zzhnkVar, Class cls, Class cls2) {
        return new zzhnj(cls, cls2, zzhnkVar);
    }

    public abstract zzhod zza(zzheq zzheqVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
