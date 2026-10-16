package com.google.android.gms.internal.fido;

import R8.v;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
final class zzct extends zzcw {
    private final int zzc;
    private final int zzd;

    public zzct(byte[] bArr, int i5, int i10) {
        super(bArr);
        zzcz.zzj(i5, i5 + i10, bArr.length);
        this.zzc = i5;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zza(int i5) {
        int i10 = this.zzd;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.zza[this.zzc + i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC3256n.g(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(v.e(i5, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final byte zzb(int i5) {
        return this.zza[this.zzc + i5];
    }

    @Override // com.google.android.gms.internal.fido.zzcw
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzcw, com.google.android.gms.internal.fido.zzcz
    public final void zze(byte[] bArr, int i5, int i10, int i11) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i11);
    }
}
