package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzafr implements zzagb {
    private final zzj zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzal.zzb("media3.extractor");
    }

    public zzafr(zzj zzjVar, long j8, long j10) {
        this.zzb = zzjVar;
        this.zzd = j8;
        this.zzc = j10;
    }

    private final void zzp(int i5) {
        int i10 = this.zzf + i5;
        int length = this.zze.length;
        if (i10 > length) {
            String str = zzfm.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i10, Math.min(length + length, i10 + 524288)));
        }
    }

    private final int zzq(int i5) {
        int iMin = Math.min(this.zzg, i5);
        zzs(iMin);
        return iMin;
    }

    private final int zzr(byte[] bArr, int i5, int i10) {
        int i11 = this.zzg;
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.zze, 0, bArr, i5, iMin);
        zzs(iMin);
        return iMin;
    }

    private final void zzs(int i5) {
        int i10 = this.zzg - i5;
        this.zzg = i10;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i10 < bArr.length + (-524288) ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        this.zze = bArr2;
    }

    private final int zzt(byte[] bArr, int i5, int i10, int i11, boolean z2) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i5 + i11, i10 - i11);
        if (iZza != -1) {
            return i11 + iZza;
        }
        if (i11 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    private final void zzu(int i5) {
        if (i5 != -1) {
            this.zzd += i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        int iZzr = zzr(bArr, i5, i10);
        if (iZzr == 0) {
            iZzr = zzt(bArr, i5, i10, 0, true);
        }
        zzu(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final boolean zzb(byte[] bArr, int i5, int i10, boolean z2) throws IOException {
        int iZzr = zzr(bArr, i5, i10);
        while (iZzr < i10 && iZzr != -1) {
            iZzr = zzt(bArr, i5, i10, iZzr, z2);
        }
        zzu(iZzr);
        return iZzr != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzc(byte[] bArr, int i5, int i10) throws IOException {
        zzb(bArr, i5, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final int zzd(int i5) throws IOException {
        int iZzq = zzq(1);
        if (iZzq == 0) {
            iZzq = zzt(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzu(iZzq);
        return iZzq;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final boolean zze(int i5, boolean z2) throws IOException {
        int iZzq = zzq(i5);
        while (iZzq < i5 && iZzq != -1) {
            iZzq = zzt(this.zza, -iZzq, Math.min(i5, iZzq + 4096), iZzq, z2);
        }
        zzu(iZzq);
        return iZzq != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzf(int i5) throws IOException {
        zze(i5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final int zzg(byte[] bArr, int i5, int i10) throws IOException {
        zzafr zzafrVar;
        int iMin;
        zzp(i10);
        int i11 = this.zzg;
        int i12 = this.zzf;
        int i13 = i11 - i12;
        if (i13 == 0) {
            zzafrVar = this;
            iMin = zzafrVar.zzt(this.zze, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzafrVar.zzg += iMin;
        } else {
            zzafrVar = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(zzafrVar.zze, zzafrVar.zzf, bArr, i5, iMin);
        zzafrVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final boolean zzh(byte[] bArr, int i5, int i10, boolean z2) throws IOException {
        if (!zzj(i10, z2)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i10, bArr, i5, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzi(byte[] bArr, int i5, int i10) throws IOException {
        zzh(bArr, i5, i10, false);
    }

    public final boolean zzj(int i5, boolean z2) throws IOException {
        zzp(i5);
        int iZzt = this.zzg - this.zzf;
        while (iZzt < i5) {
            int i10 = i5;
            boolean z10 = z2;
            iZzt = zzt(this.zze, this.zzf, i10, iZzt, z10);
            if (iZzt == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzt;
            i5 = i10;
            z2 = z10;
        }
        this.zzf += i5;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzk(int i5) throws IOException {
        zzj(i5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzl() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final long zzm() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final long zzn() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final long zzo() {
        return this.zzc;
    }
}
