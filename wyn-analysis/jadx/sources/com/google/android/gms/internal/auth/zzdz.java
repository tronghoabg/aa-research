package com.google.android.gms.internal.auth;

import R8.v;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzdz extends zzec {
    private final int zzc;

    public zzdz(byte[] bArr, int i5, int i10) {
        super(bArr);
        zzef.zzi(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i5) {
        int i10 = this.zzc;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.zza[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(v.e(i5, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zzb(int i5) {
        return this.zza[i5];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
