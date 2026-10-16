package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzako {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i5) {
        int i10 = 0;
        while (i10 < 8) {
            int i11 = i10 + 1;
            if ((zza[i10] & i5) != 0) {
                return i11;
            }
            i10 = i11;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i5, boolean z2) {
        long j8 = bArr[0] & 255;
        if (z2) {
            j8 &= ~zza[i5 - 1];
        }
        for (int i10 = 1; i10 < i5; i10++) {
            j8 = (j8 << 8) | (bArr[i10] & 255);
        }
        return j8;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzagb zzagbVar, boolean z2, boolean z10, int i5) throws IOException {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzagbVar.zzb(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iZzd = zzd(bArr[0] & ForkServer.ERROR);
            this.zzd = iZzd;
            if (iZzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i10 = this.zzd;
        if (i10 > i5) {
            this.zzc = 0;
            return -2L;
        }
        if (i10 != 1) {
            zzagbVar.zzc(this.zzb, 1, i10 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z10);
    }

    public final int zzc() {
        return this.zzd;
    }
}
