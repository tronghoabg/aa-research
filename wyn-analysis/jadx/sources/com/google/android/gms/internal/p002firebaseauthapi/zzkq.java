package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
final class zzkq implements zzlh {
    private final int zza;

    public zzkq(int i5) throws InvalidAlgorithmParameterException {
        if (i5 != 16 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(AbstractC3256n.g(i5, "Unsupported key length: "));
        }
        this.zza = i5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zzc() throws GeneralSecurityException {
        int i5 = this.zza;
        if (i5 == 16) {
            return zzlq.zzi;
        }
        if (i5 == 32) {
            return zzlq.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i5, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == this.zza) {
            return new zzhj(bArr).zza(bArr2, bArr3, i5, bArr4);
        }
        throw new InvalidAlgorithmParameterException(AbstractC3256n.g(bArr.length, "Unexpected key length: "));
    }
}
