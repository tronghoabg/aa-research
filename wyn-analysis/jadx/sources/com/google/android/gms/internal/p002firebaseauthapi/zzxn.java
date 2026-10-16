package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zzxn implements zzys {
    private static final zzil.zza zza = zzil.zza.zzb;
    private static final ThreadLocal<Cipher> zzb = new zzxm();
    private final SecretKeySpec zzc;
    private final int zzd;
    private final int zze;

    public zzxn(byte[] bArr, int i5) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzzb.zza(bArr.length);
        this.zzc = new SecretKeySpec(bArr, "AES");
        int blockSize = zzb.get().getBlockSize();
        this.zze = blockSize;
        if (i5 < 12 || i5 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzd = i5;
    }

    private final void zza(byte[] bArr, int i5, int i10, byte[] bArr2, int i11, byte[] bArr3, boolean z2) throws GeneralSecurityException {
        Cipher cipher = zzb.get();
        byte[] bArr4 = new byte[this.zze];
        System.arraycopy(bArr3, 0, bArr4, 0, this.zzd);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z2) {
            cipher.init(1, this.zzc, ivParameterSpec);
        } else {
            cipher.init(2, this.zzc, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i5, i10, bArr2, i11) != i10) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i5 = this.zzd;
        if (length > f.API_PRIORITY_OTHER - i5) {
            throw new GeneralSecurityException(AbstractC3256n.g(f.API_PRIORITY_OTHER - this.zzd, "plaintext length can not exceed "));
        }
        byte[] bArr2 = new byte[bArr.length + i5];
        byte[] bArrZza = zzpe.zza(i5);
        System.arraycopy(bArrZza, 0, bArr2, 0, this.zzd);
        zza(bArr, 0, bArr.length, bArr2, this.zzd, bArrZza, true);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzys
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i5 = this.zzd;
        if (length >= i5) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            int length2 = bArr.length;
            int i10 = this.zzd;
            byte[] bArr3 = new byte[length2 - i10];
            zza(bArr, i10, bArr.length - i10, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
