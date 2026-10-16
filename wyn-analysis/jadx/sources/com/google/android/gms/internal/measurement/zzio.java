package com.google.android.gms.internal.measurement;

import R8.v;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
final class zzio extends zziv {
    private final int zzc;
    private final int zzd;

    public zzio(byte[] bArr, int i5, int i10) {
        super(bArr);
        zzik.zza(i5, i5 + i10, bArr.length);
        this.zzc = i5;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
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

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final byte zzb(int i5) {
        return this.zzb[this.zzc + i5];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzik
    public final int zzb() {
        return this.zzd;
    }
}
