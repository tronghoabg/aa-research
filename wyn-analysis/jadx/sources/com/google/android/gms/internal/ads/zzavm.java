package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzavm implements zzavl {
    @Override // com.google.android.gms.internal.ads.zzavl
    public final byte zza(zzavx zzavxVar, int i5) {
        return zzavxVar.zzb(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final zzavx zzb(zzavx zzavxVar, int i5, int i10) {
        byte[] bArr;
        int length;
        if (i5 < 0 || i5 > i10 || i10 > (length = (bArr = zzavxVar.zza).length) || i5 > i10 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzavx(zzavx.zzh(bArr, i5, i10 - i5));
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final zzavl zzc() {
        return new zzavm();
    }
}
