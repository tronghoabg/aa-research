package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zzhzr implements zzhdr {
    private static final ThreadLocal zza = new zzhzq();
    private final byte[] zzb;
    private final zzhqo zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zzhzr(byte[] bArr, int i5, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i5 != 12 && i5 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i5;
        int length = bArr.length;
        zzibi.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zziax.zzb(zzhqm.zzc(zzhqn.zzb(length), zzibm.zza(bArr, zzhdx.zza())));
        this.zzb = bArr2;
    }

    public static zzhdr zzb(zzhfv zzhfvVar) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhfvVar.zzf();
        return new zzhzr(zzhfvVar.zze().zzc(zzhdx.zza()), zzhfvVar.zzf().zzd(), zzhfvVar.zzc().zzc());
    }

    private final byte[] zzc(int i5, byte[] bArr, int i10, int i11) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i11 + 16];
        bArr2[15] = (byte) i5;
        System.arraycopy(bArr, i10, bArr2, 16, i11);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i5 = this.zze;
        int i10 = ((length - length2) - i5) - 16;
        if (i10 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrZzc = zzc(0, bArr, length2, i5);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] bArrZzc3 = zzc(2, bArr, length2 + i5, i10);
        int i11 = length - 16;
        byte b5 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b5 = (byte) (b5 | (((bArr[i11 + i12] ^ bArrZzc2[i12]) ^ bArrZzc[i12]) ^ bArrZzc3[i12]));
        }
        if (b5 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(bArrZzc));
        return cipher.doFinal(bArr, bArr3.length + i5, i10);
    }
}
