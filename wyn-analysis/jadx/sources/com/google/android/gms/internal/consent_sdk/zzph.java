package com.google.android.gms.internal.consent_sdk;

import A7.AbstractC0279p0;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
final class zzph extends zzpk {
    public zzph(byte[] bArr, int i5, int i10) {
        super(bArr);
        zzpm.zzi(0, 47, bArr.length);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zza(int i5) {
        if (((47 - (i5 + 1)) | i5) >= 0) {
            return ((zzpk) this).zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0279p0.i(i5, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zzb(int i5) {
        return ((zzpk) this).zza[i5];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final int zzd() {
        return 47;
    }
}
