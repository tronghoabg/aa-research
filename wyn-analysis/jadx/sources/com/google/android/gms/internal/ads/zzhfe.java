package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class zzhfe implements zzhdw {
    @Override // com.google.android.gms.internal.ads.zzhdw
    public final Object zza(zzhel zzhelVar, Class cls) throws GeneralSecurityException {
        if (cls == zzhdr.class) {
            return cls.cast(zzhkl.zza(zzhelVar, zzhfd.zza));
        }
        throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
    }
}
