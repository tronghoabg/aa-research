package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zziaf implements zzhdr {
    private final zziav zza;
    private final zzhep zzb;
    private final int zzc;
    private final byte[] zzd;

    private zziaf(zziav zziavVar, zzhep zzhepVar, int i5, byte[] bArr) {
        this.zza = zziavVar;
        this.zzb = zzhepVar;
        this.zzc = i5;
        this.zzd = bArr;
    }

    public static zzhdr zzb(zzhfl zzhflVar) throws GeneralSecurityException {
        zzhzp zzhzpVar = new zzhzp(zzhflVar.zze().zzc(zzhdx.zza()), zzhflVar.zzg().zzf());
        String strValueOf = String.valueOf(zzhflVar.zzg().zzh());
        return new zziaf(zzhzpVar, new zziba(new zziaz("HMAC".concat(strValueOf), new SecretKeySpec(zzhflVar.zzf().zzc(zzhdx.zza()), "HMAC")), zzhflVar.zzg().zze()), zzhflVar.zzg().zze(), zzhflVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i5 = this.zzc;
        int length2 = bArr3.length;
        if (length < i5 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhok.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i10 = length - i5;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i10);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i10, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zziba) this.zzb).zzc(zzhzw.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
