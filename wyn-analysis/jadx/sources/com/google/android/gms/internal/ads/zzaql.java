package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzaql implements zzaqa {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzeu zzd;
    private final zzet zze;
    private zzahm zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzaql(String str, int i5, String str2) {
        this.zza = str;
        this.zzb = i5;
        zzeu zzeuVar = new zzeu(Segment.SHARE_MINIMUM);
        this.zzd = zzeuVar;
        byte[] bArrZzi = zzeuVar.zzi();
        this.zze = new zzet(bArrZzi, bArrZzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzet zzetVar) throws zzat {
        int iZzc = zzetVar.zzc();
        zzaex zzaexVarZzb = zzaey.zzb(zzetVar, true);
        this.zzw = zzaexVarZzb.zzc;
        this.zzt = zzaexVarZzb.zza;
        this.zzv = zzaexVarZzb.zzb;
        return iZzc - zzetVar.zzc();
    }

    private static long zzg(zzet zzetVar) {
        return zzetVar.zzj((zzetVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzf = zzagdVar.zzs(zzaroVar.zzb(), 1);
        this.zzg = zzaroVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzm = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i5;
        int i10;
        int iZzj;
        boolean zZzi;
        this.zzf.getClass();
        while (zzeuVar.zzd() > 0) {
            int i11 = this.zzi;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iZzs = zzeuVar.zzs();
                    if ((iZzs & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE) == 224) {
                        this.zzl = iZzs;
                        this.zzi = 2;
                    } else if (iZzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i11 != 2) {
                    int iMin = Math.min(zzeuVar.zzd(), this.zzk - this.zzj);
                    zzet zzetVar = this.zze;
                    zzeuVar.zzm(zzetVar.zza, this.zzj, iMin);
                    int i12 = this.zzj + iMin;
                    this.zzj = i12;
                    if (i12 == this.zzk) {
                        zzetVar.zzf(0);
                        if (zzetVar.zzi()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzj2 = zzetVar.zzj(1);
                            if (iZzj2 == 1) {
                                iZzj = zzetVar.zzj(1);
                                i10 = 1;
                            } else {
                                i10 = iZzj2;
                                iZzj = 0;
                            }
                            this.zzo = iZzj;
                            if (iZzj != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i10 == 1) {
                                zzg(zzetVar);
                                i10 = 1;
                            }
                            if (!zzetVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzetVar.zzj(6);
                            int iZzj3 = zzetVar.zzj(4);
                            int iZzj4 = zzetVar.zzj(3);
                            if (iZzj3 != 0 || iZzj4 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i10 == 0) {
                                int iZzd = zzetVar.zzd();
                                int iZzf = zzf(zzetVar);
                                zzetVar.zzf(iZzd);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzetVar.zzl(bArr, 0, iZzf);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzn(this.zzc);
                                zztVar.zzo("audio/mp4a-latm");
                                zztVar.zzk(this.zzw);
                                zztVar.zzG(this.zzv);
                                zztVar.zzI(this.zzt);
                                zztVar.zzr(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzvVarZzP = zztVar.zzP();
                                if (!zzvVarZzP.equals(this.zzh)) {
                                    this.zzh = zzvVarZzP;
                                    this.zzu = 1024000000 / zzvVarZzP.zzJ;
                                    this.zzf.zzA(zzvVarZzP);
                                }
                            } else {
                                zzetVar.zzh(((int) zzg(zzetVar)) - zzf(zzetVar));
                            }
                            int iZzj5 = zzetVar.zzj(3);
                            this.zzq = iZzj5;
                            if (iZzj5 == 0) {
                                zzetVar.zzh(8);
                            } else if (iZzj5 == 1) {
                                zzetVar.zzh(9);
                            } else if (iZzj5 == 3 || iZzj5 == 4 || iZzj5 == 5) {
                                zzetVar.zzh(6);
                            } else {
                                if (iZzj5 != 6 && iZzj5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzetVar.zzh(1);
                            }
                            boolean zZzi2 = zzetVar.zzi();
                            this.zzr = zZzi2;
                            this.zzs = 0L;
                            if (zZzi2) {
                                if (i10 != 1) {
                                    do {
                                        zZzi = zzetVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzetVar.zzj(8);
                                    } while (zZzi);
                                } else {
                                    this.zzs = zzg(zzetVar);
                                }
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i13 = 0;
                        while (true) {
                            int iZzj6 = zzetVar.zzj(8);
                            i5 = i13 + iZzj6;
                            if (iZzj6 != 255) {
                                break;
                            } else {
                                i13 = i5;
                            }
                        }
                        int iZzd2 = zzetVar.zzd();
                        if ((iZzd2 & 7) == 0) {
                            this.zzd.zzh(iZzd2 >> 3);
                        } else {
                            zzeu zzeuVar2 = this.zzd;
                            zzetVar.zzl(zzeuVar2.zzi(), 0, i5 * 8);
                            zzeuVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i5);
                        zzgtr.zzi(this.zzm != -9223372036854775807L);
                        this.zzf.zze(this.zzm, 1, i5, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzetVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzs2 = ((this.zzl & (-225)) << 8) | zzeuVar.zzs();
                    this.zzk = iZzs2;
                    zzeu zzeuVar3 = this.zzd;
                    if (iZzs2 > zzeuVar3.zzi().length) {
                        zzeuVar3.zza(iZzs2);
                        zzet zzetVar2 = this.zze;
                        byte[] bArrZzi = zzeuVar3.zzi();
                        zzetVar2.zzb(bArrZzi, bArrZzi.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzeuVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
    }
}
