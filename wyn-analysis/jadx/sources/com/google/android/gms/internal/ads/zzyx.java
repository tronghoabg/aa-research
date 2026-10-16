package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzyx {
    private final zzabm zza;
    private final zzeu zzb = new zzeu(32);
    private zzyw zzc;
    private zzyw zzd;
    private zzyw zze;
    private long zzf;

    public zzyx(zzabm zzabmVar) {
        this.zza = zzabmVar;
        zzyw zzywVar = new zzyw(0L, 65536);
        this.zzc = zzywVar;
        this.zzd = zzywVar;
        this.zze = zzywVar;
    }

    private final int zzi(int i5) {
        zzyw zzywVar = this.zze;
        if (zzywVar.zzc == null) {
            zzabk zzabkVarZza = this.zza.zza();
            zzyw zzywVar2 = new zzyw(this.zze.zzb, 65536);
            zzywVar.zzc = zzabkVarZza;
            zzywVar.zzd = zzywVar2;
        }
        return Math.min(i5, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i5) {
        long j8 = this.zzf + i5;
        this.zzf = j8;
        zzyw zzywVar = this.zze;
        if (j8 == zzywVar.zzb) {
            this.zze = zzywVar.zzd;
        }
    }

    private static zzyw zzk(zzyw zzywVar, zzix zzixVar, zzyy zzyyVar, zzeu zzeuVar) {
        zzyw zzywVarZzm;
        int iZzt;
        if (zzixVar.zzk()) {
            long j8 = zzyyVar.zzb;
            zzeuVar.zza(1);
            zzyw zzywVarZzm2 = zzm(zzywVar, j8, zzeuVar.zzi(), 1);
            long j10 = j8 + 1;
            byte b5 = zzeuVar.zzi()[0];
            int i5 = b5 & 128;
            int i10 = b5 & 127;
            zziu zziuVar = zzixVar.zzb;
            byte[] bArr = zziuVar.zza;
            if (bArr == null) {
                zziuVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z2 = i5 != 0;
            zzywVarZzm = zzm(zzywVarZzm2, j10, zziuVar.zza, i10);
            long j11 = j10 + i10;
            if (z2) {
                zzeuVar.zza(2);
                zzywVarZzm = zzm(zzywVarZzm, j11, zzeuVar.zzi(), 2);
                j11 += 2;
                iZzt = zzeuVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zziuVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zziuVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i11 = iZzt * 6;
                zzeuVar.zza(i11);
                zzywVarZzm = zzm(zzywVarZzm, j11, zzeuVar.zzi(), i11);
                j11 += i11;
                zzeuVar.zzh(0);
                for (int i12 = 0; i12 < iZzt; i12++) {
                    iArr2[i12] = zzeuVar.zzt();
                    iArr4[i12] = zzeuVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzyyVar.zza - ((int) (j11 - zzyyVar.zzb));
            }
            zzahl zzahlVar = zzyyVar.zzc;
            String str = zzfm.zza;
            zziuVar.zza(iZzt, iArr2, iArr4, zzahlVar.zzb, zziuVar.zza, zzahlVar.zza, zzahlVar.zzc, zzahlVar.zzd);
            long j12 = zzyyVar.zzb;
            int i13 = (int) (j11 - j12);
            zzyyVar.zzb = j12 + i13;
            zzyyVar.zza -= i13;
        } else {
            zzywVarZzm = zzywVar;
        }
        if (!zzixVar.zze()) {
            zzixVar.zzj(zzyyVar.zza);
            return zzl(zzywVarZzm, zzyyVar.zzb, zzixVar.zzc, zzyyVar.zza);
        }
        zzeuVar.zza(4);
        zzyw zzywVarZzm3 = zzm(zzywVarZzm, zzyyVar.zzb, zzeuVar.zzi(), 4);
        int iZzH = zzeuVar.zzH();
        zzyyVar.zzb += 4;
        zzyyVar.zza -= 4;
        zzixVar.zzj(iZzH);
        zzyw zzywVarZzl = zzl(zzywVarZzm3, zzyyVar.zzb, zzixVar.zzc, iZzH);
        zzyyVar.zzb += iZzH;
        int i14 = zzyyVar.zza - iZzH;
        zzyyVar.zza = i14;
        ByteBuffer byteBuffer = zzixVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            zzixVar.zze = ByteBuffer.allocate(i14);
        } else {
            zzixVar.zze.clear();
        }
        return zzl(zzywVarZzl, zzyyVar.zzb, zzixVar.zze, zzyyVar.zza);
    }

    private static zzyw zzl(zzyw zzywVar, long j8, ByteBuffer byteBuffer, int i5) {
        zzyw zzywVarZzn = zzn(zzywVar, j8);
        while (i5 > 0) {
            int iMin = Math.min(i5, (int) (zzywVarZzn.zzb - j8));
            byteBuffer.put(zzywVarZzn.zzc.zza, zzywVarZzn.zzb(j8), iMin);
            i5 -= iMin;
            j8 += iMin;
            if (j8 == zzywVarZzn.zzb) {
                zzywVarZzn = zzywVarZzn.zzd;
            }
        }
        return zzywVarZzn;
    }

    private static zzyw zzm(zzyw zzywVar, long j8, byte[] bArr, int i5) {
        zzyw zzywVarZzn = zzn(zzywVar, j8);
        int i10 = i5;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzywVarZzn.zzb - j8));
            System.arraycopy(zzywVarZzn.zzc.zza, zzywVarZzn.zzb(j8), bArr, i5 - i10, iMin);
            i10 -= iMin;
            j8 += iMin;
            if (j8 == zzywVarZzn.zzb) {
                zzywVarZzn = zzywVarZzn.zzd;
            }
        }
        return zzywVarZzn;
    }

    private static zzyw zzn(zzyw zzywVar, long j8) {
        while (j8 >= zzywVar.zzb) {
            zzywVar = zzywVar.zzd;
        }
        return zzywVar;
    }

    public final void zza() {
        zzyw zzywVar = this.zzc;
        if (zzywVar.zzc != null) {
            this.zza.zzc(zzywVar);
            zzywVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzyw zzywVar2 = this.zzc;
        this.zzd = zzywVar2;
        this.zze = zzywVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzix zzixVar, zzyy zzyyVar) {
        this.zzd = zzk(this.zzd, zzixVar, zzyyVar, this.zzb);
    }

    public final void zzd(zzix zzixVar, zzyy zzyyVar) {
        zzk(this.zzd, zzixVar, zzyyVar, this.zzb);
    }

    public final void zze(long j8) {
        zzyw zzywVar;
        if (j8 != -1) {
            while (true) {
                zzywVar = this.zzc;
                if (j8 < zzywVar.zzb) {
                    break;
                }
                this.zza.zzb(zzywVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzywVar.zza) {
                this.zzd = zzywVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i5, boolean z2) throws IOException {
        int iZzi = zzi(i5);
        zzyw zzywVar = this.zze;
        int iZza = zzjVar.zza(zzywVar.zzc.zza, zzywVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzeu zzeuVar, int i5) {
        while (i5 > 0) {
            int iZzi = zzi(i5);
            zzyw zzywVar = this.zze;
            zzeuVar.zzm(zzywVar.zzc.zza, zzywVar.zzb(this.zzf), iZzi);
            i5 -= iZzi;
            zzj(iZzi);
        }
    }
}
