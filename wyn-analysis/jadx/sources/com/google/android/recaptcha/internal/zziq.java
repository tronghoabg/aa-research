package com.google.android.recaptcha.internal;

import R8.v;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
final class zziq extends zziu {
    private final int zzc;

    public zziq(byte[] bArr, int i5, int i10) {
        super(bArr);
        zziv.zzi(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final byte zza(int i5) {
        int i10 = this.zzc;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return ((zziu) this).zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(v.e(i5, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final byte zzb(int i5) {
        return ((zziu) this).zza[i5];
    }

    @Override // com.google.android.recaptcha.internal.zziu
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final void zze(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(((zziu) this).zza, 0, bArr, 0, i11);
    }
}
