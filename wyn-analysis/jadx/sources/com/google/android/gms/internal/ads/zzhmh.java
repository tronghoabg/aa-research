package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class zzhmh {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhmh(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhmh zzd(zzhmg zzhmgVar, Class cls, Class cls2) {
        return new zzhmf(cls, cls2, zzhmgVar);
    }

    public abstract zzhod zza(zzhdz zzhdzVar, zzhey zzheyVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
