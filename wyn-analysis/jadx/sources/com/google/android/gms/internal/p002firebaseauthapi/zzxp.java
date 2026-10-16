package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class zzxp implements zzbg {
    private static final zzil.zza zza = zzil.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzxo();
    private static final ThreadLocal<Cipher> zzc = new zzxr();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    private zzxp(byte[] bArr, int i5, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i5 != 12 && i5 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzh = i5;
        zzzb.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzg = secretKeySpec;
        Cipher cipher = zzb.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZza = zza(cipher.doFinal(new byte[16]));
        this.zzd = bArrZza;
        this.zze = zza(bArrZza);
        this.zzf = bArr2;
    }

    public static zzbg zza(zzdh zzdhVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (zzdhVar.zzc().zzd() == 16) {
            return new zzxp(zzdhVar.zze().zza(zzbq.zza()), zzdhVar.zzc().zzb(), zzdhVar.zzd().zzb());
        }
        throw new GeneralSecurityException(AbstractC3256n.g(zzdhVar.zzc().zzd(), "AesEaxJce only supports 16 byte tag size, not "));
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i5]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = f.API_PRIORITY_OTHER - bArr3.length;
        int i5 = this.zzh;
        if (length > (length2 - i5) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i5 + bArr.length + 16);
        byte[] bArrZza = zzpe.zza(this.zzh);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzf.length, this.zzh);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] bArrZza2 = zza(cipher, 0, bArrZza, 0, bArrZza.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrZza3 = zza(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(bArrZza2));
        cipher2.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzf.length + this.zzh);
        byte[] bArrZza4 = zza(cipher, 2, bArrCopyOf, this.zzf.length + this.zzh, bArr.length);
        int length3 = this.zzf.length + bArr.length + this.zzh;
        for (int i10 = 0; i10 < 16; i10++) {
            bArrCopyOf[length3 + i10] = (byte) ((bArrZza3[i10] ^ bArrZza2[i10]) ^ bArrZza4[i10]);
        }
        return bArrCopyOf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = ((length - bArr3.length) - this.zzh) - 16;
        if (length2 >= 0) {
            if (zzpr.zza(bArr3, bArr)) {
                Cipher cipher = zzb.get();
                cipher.init(1, this.zzg);
                byte[] bArrZza = zza(cipher, 0, bArr, this.zzf.length, this.zzh);
                byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
                byte[] bArrZza2 = zza(cipher, 1, bArr4, 0, bArr4.length);
                byte[] bArrZza3 = zza(cipher, 2, bArr, this.zzf.length + this.zzh, length2);
                int length3 = bArr.length - 16;
                byte b5 = 0;
                for (int i5 = 0; i5 < 16; i5++) {
                    b5 = (byte) (b5 | (((bArr[length3 + i5] ^ bArrZza2[i5]) ^ bArrZza[i5]) ^ bArrZza3[i5]));
                }
                if (b5 == 0) {
                    Cipher cipher2 = zzc.get();
                    cipher2.init(1, this.zzg, new IvParameterSpec(bArrZza));
                    return cipher2.doFinal(bArr, this.zzf.length + this.zzh, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i5 = 0;
        while (i5 < 15) {
            int i10 = i5 + 1;
            bArr2[i5] = (byte) ((bArr[i5] << 1) ^ ((bArr[i10] & ForkServer.ERROR) >>> 7));
            i5 = i10;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE) ^ (bArr[15] << 1));
        return bArr2;
    }

    private final byte[] zza(Cipher cipher, int i5, byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i5;
        if (i11 == 0) {
            zzc(bArr2, this.zzd);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i12 = 0;
        while (i11 - i12 > 16) {
            for (int i13 = 0; i13 < 16; i13++) {
                bArr4[i13] = (byte) (bArr4[i13] ^ bArr[(i10 + i12) + i13]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i12 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12 + i10, i10 + i11);
        if (bArrCopyOfRange.length == 16) {
            zzc(bArrCopyOfRange, this.zzd);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.zze, 16);
            for (int i14 = 0; i14 < bArrCopyOfRange.length; i14++) {
                bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ bArrCopyOfRange[i14]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        zzc(bArr4, bArrCopyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }
}
