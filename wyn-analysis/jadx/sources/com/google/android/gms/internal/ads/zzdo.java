package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdo {
    private int zzb;
    private int zzc;
    private int zzd = 7;
    private int[] zza = new int[8];

    public final void zza(int i5) {
        int[] iArr = this.zza;
        int i10 = this.zzc;
        iArr[i10] = i5;
        int i11 = this.zzd & (i10 + 1);
        this.zzc = i11;
        int i12 = this.zzb;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length + length;
            int[] iArr2 = new int[i14];
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.zza, 0, iArr2, i13, this.zzb);
            this.zza = iArr2;
            this.zzb = 0;
            this.zzc = length;
            this.zzd = i14 - 1;
        }
    }

    public final int zzb() {
        int i5 = this.zzb;
        if (i5 == this.zzc) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = this.zza[i5];
        this.zzb = (i5 + 1) & this.zzd;
        return i10;
    }

    public final void zzc() {
        this.zzc = this.zzb;
    }

    public final boolean zzd() {
        return this.zzb == this.zzc;
    }
}
