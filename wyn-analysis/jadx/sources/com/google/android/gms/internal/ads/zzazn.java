package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzazn {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzazn(byte[] bArr) {
        for (int i5 = 0; i5 < 256; i5++) {
            this.zza[i5] = (byte) i5;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            byte b5 = bArr2[i11];
            i10 = (i10 + b5 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b5;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i5 = this.zzb;
        int i10 = this.zzc;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            i5 = (i5 + 1) & 255;
            byte b5 = bArr2[i5];
            i10 = (i10 + b5) & 255;
            bArr2[i5] = bArr2[i10];
            bArr2[i10] = b5;
            bArr[i11] = (byte) (bArr2[(bArr2[i5] + b5) & 255] ^ bArr[i11]);
        }
        this.zzb = i5;
        this.zzc = i10;
    }
}
