package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes3.dex */
public final class zzhkm implements zzhdr {
    private final byte[] zza;
    private final int zzb;
    private final zzhqo zzc;

    private zzhkm(byte[] bArr, zzibk zzibkVar, int i5) throws GeneralSecurityException {
        this.zzc = zziax.zzb(zzhqm.zzc(zzhqn.zzb(bArr.length), zzibm.zza(bArr, zzhdx.zza())));
        this.zza = zzibkVar.zzc();
        this.zzb = i5;
    }

    public static zzhdr zzb(zzhij zzhijVar) throws GeneralSecurityException {
        zzhijVar.zzf();
        zzhijVar.zzf();
        return new zzhkm(zzhijVar.zze().zzc(zzhdx.zza()), zzhijVar.zzc(), zzhijVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i5 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i10 = i5 + length2;
        if (length < i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        zzhqo zzhqoVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzhqoVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhqoVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzb = zzhjh.zzb(bArr6);
        int i11 = i10 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, i11);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i10 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzhjh.zzc(bArrCopyOfRange2, 0, 12);
        Cipher cipherZza = zzhjh.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, i11, length - i11);
    }
}
