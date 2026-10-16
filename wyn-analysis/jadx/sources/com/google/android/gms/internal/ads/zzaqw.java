package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzaqw {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    public static long zze(zzeu zzeuVar) {
        int iZzg = zzeuVar.zzg();
        if (zzeuVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzeuVar.zzm(bArr, 0, 9);
        zzeuVar.zzh(iZzg);
        byte b5 = bArr[0];
        if ((b5 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j8 = b5;
        long j10 = b10;
        long j11 = (248 & j10) >> 3;
        long j12 = (bArr[1] & 255) << 20;
        long j13 = (j10 & 3) << 13;
        return j13 | j12 | ((j8 & 3) << 28) | (((j8 & 56) >> 3) << 30) | (j11 << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
    }

    private final int zzf(zzagb zzagbVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagbVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i5) {
        return (bArr[i5 + 3] & ForkServer.ERROR) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfj zzb() {
        return this.zza;
    }

    public final int zzc(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        long j8 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzagbVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j10 = jZzo - iMin;
            if (zzagbVar.zzn() != j10) {
                zzahaVar.zza = j10;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(iMin);
            zzagbVar.zzl();
            zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
            int iZzg = zzeuVar.zzg();
            int iZze = zzeuVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzeuVar.zzi(), iZze) == 442) {
                    zzeuVar.zzh(iZze + 4);
                    long jZze = zze(zzeuVar);
                    if (jZze != -9223372036854775807L) {
                        j8 = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j8;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzagbVar);
            return 0;
        }
        if (this.zzd) {
            long j11 = this.zzf;
            if (j11 == -9223372036854775807L) {
                zzf(zzagbVar);
                return 0;
            }
            zzfj zzfjVar = this.zza;
            this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j11);
            zzf(zzagbVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzagbVar.zzo());
        if (zzagbVar.zzn() != 0) {
            zzahaVar.zza = 0L;
            return 1;
        }
        zzeu zzeuVar2 = this.zzb;
        zzeuVar2.zza(iMin2);
        zzagbVar.zzl();
        zzagbVar.zzi(zzeuVar2.zzi(), 0, iMin2);
        int iZzg2 = zzeuVar2.zzg();
        int iZze2 = zzeuVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzeuVar2.zzi(), iZzg2) == 442) {
                zzeuVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzeuVar2);
                if (jZze2 != -9223372036854775807L) {
                    j8 = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j8;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
