package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhyp implements zzhev {
    private final zzhev zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhyp(zzhev zzhevVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhevVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzhev zzb(zzhmm zzhmmVar) throws GeneralSecurityException {
        zzhnz zzhnzVarZzc = zzhmmVar.zzc(zzhdx.zza());
        return new zzhyp((zzhev) zzhmb.zza().zzc(zzhnzVarZzc.zzg(), zzhev.class).zza(zzhnzVarZzc.zzb()), zzc(zzhnzVarZzc), zzd(zzhnzVarZzc));
    }

    public static byte[] zzc(zzhnz zzhnzVar) throws GeneralSecurityException {
        int iOrdinal = zzhnzVar.zzd().ordinal();
        if (iOrdinal == 1) {
            return zzhnf.zzb(zzhnzVar.zze().intValue()).zzc();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhnf.zza.zzc();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return zzhnf.zza(zzhnzVar.zze().intValue()).zzc();
    }

    public static byte[] zzd(zzhnz zzhnzVar) {
        return zzhnzVar.zzd().equals(zzhtx.LEGACY) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
        } else {
            if (!zzhok.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zzhzw.zza(bArr2, bArr4);
            }
            this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
