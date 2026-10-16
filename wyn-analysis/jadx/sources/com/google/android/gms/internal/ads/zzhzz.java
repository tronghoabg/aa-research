package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhzz implements zzheu {
    private final byte[] zza;

    private zzhzz(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        byte[] bArrZzb = zzhlp.zzb(bArr);
        this.zza = bArrZzb;
        zzhlp.zza(bArrZzb);
    }

    public static zzheu zzb(zzhvq zzhvqVar) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhym.zzb(zzhvqVar);
        } catch (GeneralSecurityException unused) {
            return new zzhzz(zzhvqVar.zzf().zzc(zzhdx.zza()), zzhvqVar.zze().zze().zzc(), zzhvqVar.zzd().zzc().equals(zzhvo.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
