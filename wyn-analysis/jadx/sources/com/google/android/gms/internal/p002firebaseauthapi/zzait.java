package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
final class zzait extends zzaiw {
    private final int zzc;
    private final int zzd;

    public zzait(byte[] bArr, int i5, int i10) {
        super(bArr);
        zzaip.zza(i5, i5 + i10, bArr.length);
        this.zzc = i5;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final byte zza(int i5) {
        int iZzb = zzb();
        if (((iZzb - (i5 + 1)) | i5) >= 0) {
            return this.zzb[this.zzc + i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(v.e(i5, iZzb, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final byte zzb(int i5) {
        return this.zzb[this.zzc + i5];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final void zza(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i11);
    }
}
