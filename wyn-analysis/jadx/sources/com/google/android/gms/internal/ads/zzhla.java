package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes3.dex */
public final class zzhla implements zzhdr {
    private static final ThreadLocal zza = new zzhky();

    public static zzhdr zzb(zzhgm zzhgmVar) throws GeneralSecurityException {
        return zzhjo.zzc(zzhgmVar, zzhkz.zza);
    }

    public static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e7) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
