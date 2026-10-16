package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaqn implements zzaqa {
    private String zzf;
    private zzahm zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzeu zzb = new zzeu(new byte[15], 2);
    private final zzet zzc = new zzet();
    private final zzeu zzd = new zzeu();
    private final zzaqo zzq = new zzaqo();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzaqn(String str) {
    }

    private static final void zzf(zzeu zzeuVar, zzeu zzeuVar2, boolean z2) {
        int iZzg = zzeuVar.zzg();
        int iMin = Math.min(zzeuVar.zzd(), zzeuVar2.zzd());
        zzeuVar.zzm(zzeuVar2.zzi(), zzeuVar2.zzg(), iMin);
        zzeuVar2.zzk(iMin);
        if (z2) {
            zzeuVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzf = zzaroVar.zzc();
        this.zzg = zzagdVar.zzs(zzaroVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzl = i5;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j8 != -9223372036854775807L) {
            double d3 = j8;
            if (this.zzj) {
                this.zzi = d3;
            } else {
                this.zzh = d3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i5;
        int iZzj;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i10 = this.zze;
            if (i10 == 0) {
                int i11 = this.zzl;
                if ((i11 & 2) != 0) {
                    if ((i11 & 4) == 0) {
                        while (zzeuVar.zzd() > 0) {
                            int i12 = this.zzm << 8;
                            this.zzm = i12;
                            int iZzs = i12 | zzeuVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & 16777215) == 12583333) {
                                zzeuVar.zzh(zzeuVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzeuVar.zzh(zzeuVar.zze());
            } else if (i10 != 1) {
                zzaqo zzaqoVar = this.zzq;
                int i13 = zzaqoVar.zza;
                if (i13 == 1 || i13 == 17) {
                    zzf(zzeuVar, this.zzd, true);
                }
                int iMin = Math.min(zzeuVar.zzd(), zzaqoVar.zzc - this.zzo);
                this.zzg.zzc(zzeuVar, iMin);
                int i14 = this.zzo + iMin;
                this.zzo = i14;
                if (i14 == zzaqoVar.zzc) {
                    int i15 = zzaqoVar.zza;
                    if (i15 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzaqp zzaqpVarZzb = zzaqq.zzb(new zzet(bArrZzi, bArrZzi.length));
                        this.zzr = zzaqpVarZzb.zzb;
                        this.zzs = zzaqpVarZzb.zzc;
                        long j8 = this.zzu;
                        long j10 = zzaqoVar.zzb;
                        if (j8 != j10) {
                            this.zzu = j10;
                            int i16 = zzaqpVarZzb.zza;
                            String strConcat = i16 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i16))) : "mhm1";
                            byte[] bArr = zzaqpVarZzb.zzd;
                            zzgwt zzgwtVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgwtVarZzk = zzgwt.zzk(zzfm.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzn(this.zza);
                            zztVar.zzo("audio/mhm1");
                            zztVar.zzI(this.zzr);
                            zztVar.zzk(strConcat);
                            zztVar.zzr(zzgwtVarZzk);
                            this.zzg.zzA(zztVar.zzP());
                        }
                        this.zzv = true;
                    } else if (i15 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzet zzetVar = new zzet(bArrZzi2, bArrZzi2.length);
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(2);
                            iZzj = zzetVar.zzj(13);
                        } else {
                            iZzj = 0;
                        }
                        this.zzt = iZzj;
                    } else if (i15 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i17 = this.zzs - this.zzt;
                        double d3 = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i17 * 1000000.0d) / d3;
                        }
                        this.zzg.zze(jRound, i5, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzeu zzeuVar2 = this.zzb;
                zzf(zzeuVar, zzeuVar2, false);
                if (zzeuVar2.zzd() == 0) {
                    zzet zzetVar2 = this.zzc;
                    int iZze = zzeuVar2.zze();
                    zzetVar2.zzb(zzeuVar2.zzi(), iZze);
                    zzaqo zzaqoVar2 = this.zzq;
                    if (zzaqq.zza(zzetVar2, zzaqoVar2)) {
                        this.zzo = 0;
                        this.zzp = zzaqoVar2.zzc + iZze + this.zzp;
                        zzeuVar2.zzh(0);
                        this.zzg.zzc(zzeuVar2, zzeuVar2.zze());
                        zzeuVar2.zza(2);
                        this.zzd.zza(zzaqoVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzeuVar2.zze() < 15) {
                        zzeuVar2.zzf(zzeuVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
    }
}
