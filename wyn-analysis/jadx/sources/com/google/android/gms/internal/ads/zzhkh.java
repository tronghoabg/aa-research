package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhkh implements zzhdr {
    private final zzhdr zza;
    private final byte[] zzb;

    private zzhkh(zzhdr zzhdrVar, byte[] bArr) {
        this.zza = zzhdrVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhdr zzb(zzhmm zzhmmVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhnz zzhnzVarZzc = zzhmmVar.zzc(zzhdx.zza());
        zzhdr zzhdrVar = (zzhdr) zzhmb.zza().zzc(zzhnzVarZzc.zzg(), zzhdr.class).zza(zzhnzVarZzc.zzb());
        zzhtx zzhtxVarZzd = zzhnzVarZzc.zzd();
        int iOrdinal = zzhtxVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhnf.zzb(zzhmmVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhnf.zza(zzhmmVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhtxVarZzd)));
            }
            bArrZzc = zzhnf.zza(zzhmmVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhnf.zza.zzc();
        }
        return new zzhkh(zzhdrVar, bArrZzc);
    }

    public static zzhdr zzc(zzhdr zzhdrVar, zzibk zzibkVar) {
        return new zzhkh(zzhdrVar, zzibkVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhok.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
