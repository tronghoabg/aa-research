package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class zzapy implements zzaqa {
    private final zzeu zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzahm zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzapy(String str, int i5, int i10, String str2) {
        this.zza = new zzeu(new byte[i10]);
        this.zzc = str;
        this.zzd = i5;
    }

    private final boolean zzf(zzeu zzeuVar, byte[] bArr, int i5) {
        int iMin = Math.min(zzeuVar.zzd(), i5 - this.zzi);
        zzeuVar.zzm(bArr, this.zzi, iMin);
        int i10 = this.zzi + iMin;
        this.zzi = i10;
        return i10 == i5;
    }

    private final void zzg(zzafy zzafyVar) {
        int i5;
        int i10 = zzafyVar.zzb;
        if (i10 == -2147483647 || (i5 = zzafyVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i5 == zzvVar.zzH && i10 == zzvVar.zzJ && Objects.equals(zzafyVar.zza, zzvVar.zzp)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(zzafyVar.zza);
        zztVar.zzG(i5);
        zztVar.zzI(i10);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzP = zztVar.zzP();
        this.zzl = zzvVarZzP;
        this.zzg.zzA(zzvVarZzP);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzf = zzaroVar.zzc();
        this.zzg = zzagdVar.zzs(zzaroVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzq = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i5;
        byte b5;
        int i10;
        byte b10;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i11 = this.zzh;
            if (i11 == 0) {
                while (true) {
                    if (zzeuVar.zzd() > 0) {
                        int i12 = this.zzj << 8;
                        this.zzj = i12;
                        int iZzs = i12 | zzeuVar.zzs();
                        this.zzj = iZzs;
                        int iZza = zzafz.zza(iZzs);
                        this.zzn = iZza;
                        if (iZza != 0) {
                            byte[] bArrZzi = this.zza.zzi();
                            int i13 = this.zzj;
                            bArrZzi[0] = (byte) ((i13 >> 24) & 255);
                            bArrZzi[1] = (byte) ((i13 >> 16) & 255);
                            bArrZzi[2] = (byte) ((i13 >> 8) & 255);
                            bArrZzi[3] = (byte) (i13 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            int i14 = this.zzn;
                            if (i14 == 3 || i14 == 4) {
                                this.zzh = 4;
                            } else if (i14 == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i11 == 1) {
                zzeu zzeuVar2 = this.zza;
                if (zzf(zzeuVar, zzeuVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzeuVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzafz.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzA(zzvVarZzb);
                    }
                    this.zzm = zzafz.zzc(bArrZzi2);
                    byte b11 = bArrZzi2[0];
                    if (b11 != -2) {
                        if (b11 == -1) {
                            i5 = (bArrZzi2[4] & 7) << 4;
                            b10 = bArrZzi2[7];
                        } else if (b11 != 31) {
                            i5 = (bArrZzi2[4] & 1) << 6;
                            b5 = bArrZzi2[5];
                        } else {
                            i5 = (bArrZzi2[5] & 7) << 4;
                            b10 = bArrZzi2[6];
                        }
                        i10 = b10 & 60;
                        this.zzk = zzhaq.zza(zzfm.zzu(((i5 | (i10 >> 2)) + 1) * 32, this.zzl.zzJ));
                        zzeuVar2.zzh(0);
                        this.zzg.zzc(zzeuVar2, 18);
                        this.zzh = 6;
                    } else {
                        i5 = (bArrZzi2[5] & 1) << 6;
                        b5 = bArrZzi2[4];
                    }
                    i10 = b5 & 252;
                    this.zzk = zzhaq.zza(zzfm.zzu(((i5 | (i10 >> 2)) + 1) * 32, this.zzl.zzJ));
                    zzeuVar2.zzh(0);
                    this.zzg.zzc(zzeuVar2, 18);
                    this.zzh = 6;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    zzeu zzeuVar3 = this.zza;
                    if (zzf(zzeuVar, zzeuVar3.zzi(), this.zzo)) {
                        zzafy zzafyVarZzd = zzafz.zzd(zzeuVar3.zzi());
                        zzg(zzafyVarZzd);
                        this.zzm = zzafyVarZzd.zzd;
                        long j8 = zzafyVarZzd.zze;
                        this.zzk = j8 != -9223372036854775807L ? j8 : 0L;
                        zzeuVar3.zzh(0);
                        this.zzg.zzc(zzeuVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i11 == 4) {
                    zzeu zzeuVar4 = this.zza;
                    if (zzf(zzeuVar, zzeuVar4.zzi(), 6)) {
                        int iZzg = zzafz.zzg(zzeuVar4.zzi());
                        this.zzp = iZzg;
                        int i15 = this.zzi;
                        if (i15 > iZzg) {
                            int i16 = i15 - iZzg;
                            this.zzi = i15 - i16;
                            zzeuVar.zzh(zzeuVar.zzg() - i16);
                        }
                        this.zzh = 5;
                    }
                } else if (i11 != 5) {
                    int iMin = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzeuVar, iMin);
                    int i17 = this.zzi + iMin;
                    this.zzi = i17;
                    if (i17 == this.zzm) {
                        zzgtr.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzeu zzeuVar5 = this.zza;
                    if (zzf(zzeuVar, zzeuVar5.zzi(), this.zzp)) {
                        zzafy zzafyVarZzf = zzafz.zzf(zzeuVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzafyVarZzf);
                        }
                        this.zzm = zzafyVarZzf.zzd;
                        long j10 = zzafyVarZzf.zze;
                        this.zzk = j10 != -9223372036854775807L ? j10 : 0L;
                        zzeuVar5.zzh(0);
                        this.zzg.zzc(zzeuVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzeu zzeuVar6 = this.zza;
                if (zzf(zzeuVar, zzeuVar6.zzi(), 7)) {
                    this.zzo = zzafz.zze(zzeuVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
    }
}
