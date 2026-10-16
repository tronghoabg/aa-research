package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;

/* loaded from: classes3.dex */
public final class zzaqt implements zzarp {
    private final zzaqa zza;
    private final zzet zzb = new zzet(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfj zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaqt(zzaqa zzaqaVar) {
        this.zza = zzaqaVar;
    }

    private final void zze(int i5) {
        this.zzc = i5;
        this.zzd = 0;
    }

    private final boolean zzf(zzeu zzeuVar, byte[] bArr, int i5) {
        int iMin = Math.min(zzeuVar.zzd(), i5 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzeuVar.zzk(iMin);
        } else {
            zzeuVar.zzm(bArr, this.zzd, iMin);
        }
        int i10 = this.zzd + iMin;
        this.zzd = i10;
        return i10 == i5;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zza(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
        this.zze = zzfjVar;
        this.zza.zzb(zzagdVar, zzaroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzc(zzeu zzeuVar, int i5) throws zzat {
        int i10;
        int i11;
        long jZze;
        long j8;
        this.zze.getClass();
        int i12 = -1;
        int i13 = 2;
        if ((i5 & 1) != 0) {
            int i14 = this.zzc;
            if (i14 != 0 && i14 != 1) {
                if (i14 != 2) {
                    int i15 = this.zzj;
                    if (i15 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i15);
                        sb2.append(" more bytes");
                        zzeh.zzc("PesReader", sb2.toString());
                    }
                    this.zza.zze(zzeuVar.zze() == 0);
                } else {
                    zzeh.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i16 = i5;
        while (zzeuVar.zzd() > 0) {
            int i17 = this.zzc;
            if (i17 == 0) {
                i10 = i13;
                zzeuVar.zzk(zzeuVar.zzd());
            } else if (i17 != 1) {
                if (i17 != i13) {
                    int iZzd = zzeuVar.zzd();
                    int i18 = this.zzj;
                    int i19 = i18 == i12 ? 0 : iZzd - i18;
                    if (i19 > 0) {
                        iZzd -= i19;
                        zzeuVar.zzf(zzeuVar.zzg() + iZzd);
                    }
                    zzaqa zzaqaVar = this.zza;
                    zzaqaVar.zzd(zzeuVar);
                    int i20 = this.zzj;
                    if (i20 != i12) {
                        int i21 = i20 - iZzd;
                        this.zzj = i21;
                        if (i21 == 0) {
                            zzaqaVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzet zzetVar = this.zzb;
                    if (zzf(zzeuVar, zzetVar.zza, iMin) && zzf(zzeuVar, null, this.zzi)) {
                        zzetVar.zzf(0);
                        if (this.zzf) {
                            zzetVar.zzh(4);
                            long jZzj = zzetVar.zzj(3);
                            zzetVar.zzh(1);
                            int iZzj = zzetVar.zzj(15) << 15;
                            zzetVar.zzh(1);
                            long jZzj2 = zzetVar.zzj(15);
                            zzetVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j8 = jZzj;
                            } else {
                                zzetVar.zzh(4);
                                j8 = jZzj;
                                zzetVar.zzh(1);
                                int iZzj2 = zzetVar.zzj(15) << 15;
                                zzetVar.zzh(1);
                                long jZzj3 = zzetVar.zzj(15);
                                zzetVar.zzh(1);
                                this.zze.zze((zzetVar.zzj(3) << 30) | iZzj2 | jZzj3);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (j8 << 30) | iZzj);
                        } else {
                            jZze = -9223372036854775807L;
                        }
                        i16 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i16);
                        zze(3);
                        i12 = -1;
                        i13 = 2;
                    }
                }
                i10 = i13;
            } else {
                zzet zzetVar2 = this.zzb;
                if (zzf(zzeuVar, zzetVar2.zza, 9)) {
                    zzetVar2.zzf(0);
                    int iZzj3 = zzetVar2.zzj(24);
                    if (iZzj3 != 1) {
                        AbstractC1593a.v(new StringBuilder(String.valueOf(iZzj3).length() + 30), "Unexpected start code prefix: ", iZzj3, "PesReader");
                        i12 = -1;
                        this.zzj = -1;
                        i11 = 0;
                        i10 = 2;
                    } else {
                        zzetVar2.zzh(8);
                        int iZzj4 = zzetVar2.zzj(16);
                        zzetVar2.zzh(5);
                        this.zzk = zzetVar2.zzi();
                        i10 = 2;
                        zzetVar2.zzh(2);
                        this.zzf = zzetVar2.zzi();
                        this.zzg = zzetVar2.zzi();
                        zzetVar2.zzh(6);
                        int iZzj5 = zzetVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i12 = -1;
                        } else {
                            int i22 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i22;
                            if (i22 < 0) {
                                AbstractC1593a.v(new StringBuilder(String.valueOf(i22).length() + 36), "Found negative packet payload size: ", i22, "PesReader");
                                i12 = -1;
                                this.zzj = -1;
                            } else {
                                i12 = -1;
                            }
                        }
                        i11 = 2;
                    }
                    zze(i11);
                } else {
                    i12 = -1;
                    i10 = 2;
                }
            }
            i13 = i10;
        }
    }

    public final boolean zzd(boolean z2) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
