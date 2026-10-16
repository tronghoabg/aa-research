package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzlx implements zzlk {
    private final zzya zza;
    private final zzle zzb;

    private zzlx(zzle zzleVar, zzya zzyaVar) {
        this.zzb = zzleVar;
        this.zza = zzyaVar;
    }

    public static zzlx zza(zzya zzyaVar) throws GeneralSecurityException {
        int i5 = zzlw.zza[zzyaVar.ordinal()];
        if (i5 == 1) {
            return new zzlx(new zzle("HmacSha256"), zzya.NIST_P256);
        }
        if (i5 == 2) {
            return new zzlx(new zzle("HmacSha384"), zzya.NIST_P384);
        }
        if (i5 == 3) {
            return new zzlx(new zzle("HmacSha512"), zzya.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(zzyaVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza(byte[] bArr, zzln zzlnVar) throws GeneralSecurityException {
        byte[] bArrZza = zzyb.zza(zzyb.zza(this.zza, zzlnVar.zza().zzb()), zzyb.zza(this.zza, zzyd.UNCOMPRESSED, bArr));
        byte[] bArrZza2 = zzxv.zza(bArr, zzlnVar.zzb().zzb());
        byte[] bArrZza3 = zzlq.zza(zza());
        zzle zzleVar = this.zzb;
        return zzleVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzleVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza() throws GeneralSecurityException {
        int i5 = zzlw.zza[this.zza.ordinal()];
        if (i5 == 1) {
            return zzlq.zzc;
        }
        if (i5 == 2) {
            return zzlq.zzd;
        }
        if (i5 == 3) {
            return zzlq.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
