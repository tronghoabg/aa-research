package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzaiu implements zzaga {
    private zzagd zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzajb zzg;
    private zzagb zzh;
    private zzahi zzi;
    private zzami zzj;
    private final zzeu zza = new zzeu(2);
    private long zzf = -1;

    private final int zzh(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt();
    }

    private final int zzi(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt() - 2;
    }

    private final void zzj() {
        zzagd zzagdVar = this.zzb;
        zzagdVar.getClass();
        zzagdVar.zzv();
        this.zzb.zzw(new zzahc(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        int iZzi;
        if (zzh(zzagbVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzagbVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzagbVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    zzagbVar.zzk(iZzi);
                } else {
                    zzeu zzeuVar = this.zza;
                    zzeuVar.zza(iZzi);
                    zzagbVar.zzi(zzeuVar.zzi(), 0, iZzi);
                    if (!Objects.equals(zzeuVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaix.zzb(zzeuVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzb = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        String strZzM;
        zzaiw zzaiwVarZza;
        long j8;
        char c10 = 65535;
        int i5 = this.zzc;
        long j10 = -1;
        if (i5 == 0) {
            zzeu zzeuVar = this.zza;
            zzeuVar.zza(2);
            zzagbVar.zzc(zzeuVar.zzi(), 0, 2);
            int iZzt = zzeuVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i5 == 1) {
            this.zze = zzi(zzagbVar);
            zzagbVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i5 != 2) {
            if (i5 != 4) {
                if (i5 != 5) {
                    if (i5 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzagbVar != this.zzh) {
                    this.zzh = zzagbVar;
                    this.zzi = new zzahi(zzagbVar, this.zzf);
                }
                zzami zzamiVar = this.zzj;
                zzamiVar.getClass();
                int iZzd = zzamiVar.zzd(this.zzi, zzahaVar);
                if (iZzd == 1) {
                    zzahaVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzagbVar.zzn();
            long j11 = this.zzf;
            if (jZzn != j11) {
                zzahaVar.zza = j11;
                return 1;
            }
            if (zzagbVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzagbVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzami(zzanq.zza, 8);
                }
                zzahi zzahiVar = new zzahi(zzagbVar, this.zzf);
                this.zzi = zzahiVar;
                if (this.zzj.zza(zzahiVar)) {
                    zzami zzamiVar2 = this.zzj;
                    long j12 = this.zzf;
                    zzagd zzagdVar = this.zzb;
                    zzagdVar.getClass();
                    zzamiVar2.zzc(new zzahk(j12, zzagdVar));
                    zzajb zzajbVar = this.zzg;
                    zzajbVar.getClass();
                    zzagd zzagdVar2 = this.zzb;
                    zzagdVar2.getClass();
                    zzahm zzahmVarZzs = zzagdVar2.zzs(Segment.SHARE_MINIMUM, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzajbVar));
                    zzahmVarZzs.zzA(zztVar.zzP());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzeu zzeuVar2 = new zzeu(this.zze);
            zzagbVar.zzc(zzeuVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzeuVar2.zzM((char) 0)) && (strZzM = zzeuVar2.zzM((char) 0)) != null) {
                long jZzo = zzagbVar.zzo();
                zzajb zzajbVar2 = null;
                if (jZzo != -1 && (zzaiwVarZza = zzaix.zza(strZzM)) != null) {
                    List list = zzaiwVarZza.zzb;
                    if (list.size() >= 2) {
                        int size = list.size() - 1;
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        while (size >= 0) {
                            zzaiv zzaivVar = (zzaiv) list.get(size);
                            char c11 = c10;
                            String str = zzaivVar.zza;
                            long j17 = j10;
                            boolean z2 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= zzaivVar.zzc;
                                j8 = 0;
                            } else {
                                j8 = jZzo - zzaivVar.zzb;
                            }
                            long j18 = j8;
                            long j19 = jZzo;
                            jZzo = j18;
                            if (z2 && jZzo != j19) {
                                j16 = j19 - jZzo;
                                j15 = jZzo;
                            }
                            if (size == 0) {
                                j14 = j19;
                            }
                            if (size == 0) {
                                j13 = jZzo;
                            }
                            size--;
                            c10 = c11;
                            j10 = j17;
                        }
                        long j20 = j10;
                        if (j15 != j20 && j16 != j20 && j13 != j20 && j14 != j20) {
                            zzajbVar2 = new zzajb(j13, j14, zzaiwVarZza.zza, j15, j16);
                        }
                    }
                }
                this.zzg = zzajbVar2;
                if (zzajbVar2 != null) {
                    this.zzf = zzajbVar2.zzd;
                }
            }
        } else {
            zzagbVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        if (j8 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzami zzamiVar = this.zzj;
            zzamiVar.getClass();
            zzamiVar.zze(j8, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }
}
