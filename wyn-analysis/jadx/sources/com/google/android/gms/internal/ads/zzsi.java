package com.google.android.gms.internal.ads;

import Va.M6;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
final class zzsi {
    private final zzsh zza;
    private final int zzb;
    private final zzth zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzsi(AudioTrack audioTrack, zzth zzthVar) {
        this.zza = new zzsh(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzthVar;
        zzf(0);
    }

    private final void zzf(int i5) {
        this.zzd = i5;
        long j8 = 10000;
        if (i5 == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i5 == 1) {
                this.zzf = 10000L;
                return;
            }
            j8 = (i5 == 2 || i5 == 3) ? 10000000L : 500000L;
        }
        this.zzf = j8;
    }

    private final long zzg(long j8, float f10) {
        zzsh zzshVar = this.zza;
        return zzh(zzshVar.zzc(), zzshVar.zzb(), j8, f10);
    }

    private final long zzh(long j8, long j10, long j11, float f10) {
        long j12 = j11 - j10;
        return zzfm.zzy(j12, f10) + zzfm.zzu(j8, this.zzb);
    }

    public final void zza(long j8, float f10, long j10, boolean z2) {
        boolean z10;
        int i5;
        if (z2 || j8 - this.zzg >= this.zzf) {
            this.zzg = j8;
            zzsh zzshVar = this.zza;
            boolean zZza = zzshVar.zza();
            if (zZza) {
                long jZzb = zzshVar.zzb();
                long jZzg = zzg(j8, f10);
                i5 = 2;
                if (Math.abs(jZzb - j8) > 5000000) {
                    zzth zzthVar = this.zzc;
                    long jZzc = zzshVar.zzc();
                    long jZzs = ((zzsu) zzthVar).zza.zzs();
                    int length = String.valueOf(jZzc).length();
                    int length2 = String.valueOf(jZzb).length();
                    int length3 = String.valueOf(j8).length();
                    StringBuilder sb2 = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j10).length() + 2 + String.valueOf(jZzs).length());
                    M6.A(sb2, "Spurious audio timestamp (system clock mismatch): ", jZzc, ", ");
                    sb2.append(jZzb);
                    M6.A(sb2, ", ", j8, ", ");
                    sb2.append(j10);
                    sb2.append(", ");
                    sb2.append(jZzs);
                    zzeh.zzc("AudioTrackAudioOutput", sb2.toString());
                    zzf(4);
                    z10 = zZza;
                } else if (Math.abs(jZzg - j10) > 5000000) {
                    zzth zzthVar2 = this.zzc;
                    long jZzc2 = zzshVar.zzc();
                    long jZzs2 = ((zzsu) zzthVar2).zza.zzs();
                    int length4 = String.valueOf(jZzc2).length();
                    int length5 = String.valueOf(jZzb).length();
                    int length6 = String.valueOf(j8).length();
                    int length7 = length4 + 54 + length5 + 2 + length6 + 2 + String.valueOf(j10).length() + 2;
                    z10 = zZza;
                    StringBuilder sb3 = new StringBuilder(length7 + String.valueOf(jZzs2).length());
                    M6.A(sb3, "Spurious audio timestamp (frame position mismatch): ", jZzc2, ", ");
                    sb3.append(jZzb);
                    M6.A(sb3, ", ", j8, ", ");
                    sb3.append(j10);
                    sb3.append(", ");
                    sb3.append(jZzs2);
                    zzeh.zzc("AudioTrackAudioOutput", sb3.toString());
                    zzf(4);
                } else {
                    z10 = zZza;
                    if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z10 = zZza;
                i5 = 2;
            }
            int i10 = this.zzd;
            if (i10 == 0) {
                if (!z10) {
                    if (j8 - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzshVar.zzb() >= this.zze) {
                        this.zzh = zzshVar.zzc();
                        this.zzi = zzshVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == i5) {
                    if (z10) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i10 == 3 && z10) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z10) {
                zzf(0);
                return;
            }
            long jZzc3 = zzshVar.zzc();
            long j11 = this.zzh;
            if (jZzc3 > j11) {
                if (Math.abs(zzg(j8, f10) - zzh(j11, this.zzi, j8, f10)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j8 - this.zze > 2000000) {
                zzf(3);
            } else {
                this.zzh = zzshVar.zzc();
                this.zzi = zzshVar.zzb();
            }
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i5 = this.zzd;
        return i5 == 0 || i5 == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j8, float f10) {
        return zzg(j8, f10);
    }
}
