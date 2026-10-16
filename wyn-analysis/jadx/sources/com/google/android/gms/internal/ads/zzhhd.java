package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzhhd implements zzhdr {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zze;
    private final String zzc;
    private final zzhdr zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zze = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzhhd(zzhte zzhteVar, zzhdr zzhdrVar) throws GeneralSecurityException {
        if (!zze.contains(zzhteVar.zza())) {
            String strZza = zzhteVar.zza();
            throw new IllegalArgumentException(M6.t(new StringBuilder(String.valueOf(strZza).length() + 67), "Unsupported DEK key type: ", strZza, ". Only Tink AEAD key types are supported."));
        }
        this.zzc = zzhteVar.zza();
        zzhtd zzhtdVarZzg = zzhte.zzg(zzhteVar);
        zzhtdVarZzg.zzc(zzhtx.RAW);
        zzhfa.zzb(((zzhte) zzhtdVarZzg.zzbu()).zzaN());
        this.zzd = zzhdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i5 = byteBufferWrap.getInt();
            if (i5 <= 0 || i5 > 4096 || i5 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i5];
            byteBufferWrap.get(bArr3, 0, i5);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zzd.zza(bArr3, zzb);
            String str = this.zzc;
            zzidl zzidlVar = zzidl.zza;
            return ((zzhdr) zzhnb.zza().zzd(zzhne.zza().zzg(zzhnz.zza(str, zzidl.zzt(bArrZza, 0, bArrZza.length), zzhta.SYMMETRIC, zzhtx.RAW, null), zzhdx.zza()), zzhdr.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
