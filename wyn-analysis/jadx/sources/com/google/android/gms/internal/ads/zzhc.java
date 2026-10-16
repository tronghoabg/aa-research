package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzhc {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzhc(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        int i5 = (this.zza[this.zzc] & ForkServer.ERROR) >> this.zzd;
        zzc(1);
        return 1 == (i5 & 1);
    }

    public final int zzb(int i5) {
        int i10 = this.zzc;
        int i11 = 8 - this.zzd;
        int i12 = i10 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i5, i11);
        int i13 = ((bArr[i10] & ForkServer.ERROR) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i5) {
            i13 |= (bArr[i12] & ForkServer.ERROR) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i5));
        zzc(i5);
        return i14;
    }

    public final void zzc(int i5) {
        int i10;
        int i11 = i5 / 8;
        int i12 = this.zzc + i11;
        this.zzc = i12;
        int i13 = (i5 - (i11 * 8)) + this.zzd;
        this.zzd = i13;
        if (i13 > 7) {
            i12++;
            this.zzc = i12;
            i13 -= 8;
            this.zzd = i13;
        }
        boolean z2 = false;
        if (i12 >= 0 && (i12 < (i10 = this.zzb) || (i12 == i10 && i13 == 0))) {
            z2 = true;
        }
        zzgtr.zzi(z2);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
