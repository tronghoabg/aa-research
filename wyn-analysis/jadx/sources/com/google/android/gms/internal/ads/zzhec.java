package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhec {
    public static final zzhte zza(zzheq zzheqVar) {
        try {
            return ((zzhoa) zzhne.zza().zzk(null, zzhoa.class)).zzc();
        } catch (GeneralSecurityException e7) {
            throw new zzhoj("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e7);
        }
    }

    public static final zzheq zzb(zzheq zzheqVar) throws GeneralSecurityException {
        return zzheqVar != null ? zzheqVar : zzhfa.zzb(zza(null).zzaN());
    }
}
