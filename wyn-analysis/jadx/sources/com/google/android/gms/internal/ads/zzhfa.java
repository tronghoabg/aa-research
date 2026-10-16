package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhfa {
    public static byte[] zza(zzheq zzheqVar) throws GeneralSecurityException {
        return ((zzhoa) zzhne.zza().zzk(zzheqVar, zzhoa.class)).zzc().zzaN();
    }

    public static zzheq zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhte zzhteVarZzd = zzhte.zzd(bArr, zzidz.zzb());
            zzhne zzhneVarZza = zzhne.zza();
            zzhoa zzhoaVarZzb = zzhoa.zzb(zzhteVarZzd);
            return !zzhneVarZza.zzi(zzhoaVarZzb) ? new zzhmn(zzhoaVarZzb) : zzhneVarZza.zzj(zzhoaVarZzb);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }
}
