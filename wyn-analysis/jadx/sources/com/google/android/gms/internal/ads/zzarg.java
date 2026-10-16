package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzarg {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    public zzarg(int i5) {
    }

    private final int zze(zzagb zzagbVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagbVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzagb zzagbVar, zzaha zzahaVar, int i5) throws IOException {
        if (i5 <= 0) {
            zze(zzagbVar);
            return 0;
        }
        long j8 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzagbVar);
                return 0;
            }
            if (this.zzd) {
                long j10 = this.zzf;
                if (j10 == -9223372036854775807L) {
                    zze(zzagbVar);
                    return 0;
                }
                zzfj zzfjVar = this.zza;
                this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j10);
                zze(zzagbVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzagbVar.zzo());
            if (zzagbVar.zzn() != 0) {
                zzahaVar.zza = 0L;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(iMin);
            zzagbVar.zzl();
            zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
            int iZzg = zzeuVar.zzg();
            int iZze = zzeuVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzeuVar.zzi()[iZzg] == 71) {
                    long jZzb = zzarq.zzb(zzeuVar, iZzg, i5);
                    if (jZzb != -9223372036854775807L) {
                        j8 = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j8;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzagbVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j11 = jZzo - iMin2;
        if (zzagbVar.zzn() != j11) {
            zzahaVar.zza = j11;
            return 1;
        }
        zzeu zzeuVar2 = this.zzb;
        zzeuVar2.zza(iMin2);
        zzagbVar.zzl();
        zzagbVar.zzi(zzeuVar2.zzi(), 0, iMin2);
        int iZzg2 = zzeuVar2.zzg();
        int iZze2 = zzeuVar2.zze();
        int i10 = iZze2 - 188;
        while (true) {
            if (i10 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzeuVar2.zzi();
            int i11 = -4;
            int i12 = 0;
            while (true) {
                if (i11 > 4) {
                    break;
                }
                int i13 = (i11 * 188) + i10;
                if (i13 < iZzg2 || i13 >= iZze2 || bArrZzi[i13] != 71) {
                    i12 = 0;
                } else {
                    i12++;
                    if (i12 == 5) {
                        long jZzb2 = zzarq.zzb(zzeuVar2, i10, i5);
                        if (jZzb2 != -9223372036854775807L) {
                            j8 = jZzb2;
                            break;
                        }
                    }
                }
                i11++;
            }
            i10--;
        }
        this.zzg = j8;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfj zzd() {
        return this.zza;
    }
}
