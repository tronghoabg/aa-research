package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class zzht extends zzhj {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzht(MessageDigest messageDigest, int i5, zzhs zzhsVar) {
        this.zza = messageDigest;
        this.zzb = i5;
    }

    private final void zzc() {
        zzgx.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzhj
    public final void zza(byte[] bArr, int i5, int i10) {
        zzc();
        this.zza.update(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzhp
    public final zzhn zzb() {
        zzc();
        this.zzc = true;
        int i5 = this.zzb;
        if (i5 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i10 = zzhn.zzb;
            return new zzhm(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i5);
        int i11 = zzhn.zzb;
        return new zzhm(bArrCopyOf);
    }
}
