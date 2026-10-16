package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzahv implements zzaga {
    private final zzeu zza;
    private final zzahu zzb;
    private final boolean zzc;
    private final zzanq zzd;
    private int zze;
    private zzagd zzf;
    private zzahw zzg;
    private long zzh;
    private zzahy[] zzi;
    private long zzj;
    private zzahy zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzahv() {
        this(1, zzanq.zza);
    }

    private final zzahy zzi(int i5) {
        for (zzahy zzahyVar : this.zzi) {
            if (zzahyVar.zzc(i5)) {
                return zzahyVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 12);
        zzeuVar.zzh(0);
        if (zzeuVar.zzC() != 1179011410) {
            return false;
        }
        zzeuVar.zzk(4);
        return zzeuVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zze = 0;
        if (this.zzc) {
            zzagdVar = new zzant(zzagdVar, this.zzd);
        }
        this.zzf = zzagdVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        boolean z2;
        ?? r20;
        long j8;
        long j10 = this.zzj;
        if (j10 != -1) {
            long jZzn = zzagbVar.zzn();
            if (j10 < jZzn || j10 > 262144 + jZzn) {
                zzahaVar.zza = j10;
                z2 = true;
            } else {
                zzagbVar.zzf((int) (j10 - jZzn));
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.zzj = -1L;
        if (z2) {
            return 1;
        }
        int i5 = this.zze;
        zzahy zzahyVar = null;
        if (i5 == 0) {
            if (!zza(zzagbVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzagbVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i5 == 1) {
            zzeu zzeuVar = this.zza;
            zzagbVar.zzc(zzeuVar.zzi(), 0, 12);
            zzeuVar.zzh(0);
            zzahu zzahuVar = this.zzb;
            zzahuVar.zza(zzeuVar);
            int i10 = zzahuVar.zza;
            if (i10 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(AbstractC0279p0.f(i10, 22));
                sb2.append("LIST expected, found: ");
                sb2.append(i10);
                throw zzat.zzb(sb2.toString(), null);
            }
            int iZzC = zzeuVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzahuVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(AbstractC0279p0.f(iZzC, 22));
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i5 == 2) {
            int i11 = this.zzl - 4;
            zzeu zzeuVar2 = new zzeu(i11);
            zzagbVar.zzc(zzeuVar2.zzi(), 0, i11);
            zzahz zzahzVarZzb = zzahz.zzb(1819436136, zzeuVar2);
            if (zzahzVarZzb.zza() != 1819436136) {
                int iZza = zzahzVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzat.zzb(sb4.toString(), null);
            }
            zzahw zzahwVar = (zzahw) zzahzVarZzb.zzc(zzahw.class);
            if (zzahwVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzahwVar;
            this.zzh = zzahwVar.zzc * zzahwVar.zza;
            ArrayList arrayList = new ArrayList();
            zzgwt zzgwtVar = zzahzVarZzb.zza;
            int size = zzgwtVar.size();
            int i12 = 0;
            int i13 = 0;
            while (i12 < size) {
                zzahs zzahsVar = (zzahs) zzgwtVar.get(i12);
                if (zzahsVar.zza() == 1819440243) {
                    zzahz zzahzVar = (zzahz) zzahsVar;
                    int i14 = i13 + 1;
                    zzahx zzahxVar = (zzahx) zzahzVar.zzc(zzahx.class);
                    zzaia zzaiaVar = (zzaia) zzahzVar.zzc(zzaia.class);
                    if (zzahxVar == null) {
                        zzeh.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzaiaVar == null) {
                        zzeh.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzahxVar.zzd();
                        zzv zzvVar = zzaiaVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i13);
                        int i15 = zzahxVar.zze;
                        if (i15 != 0) {
                            zztVarZza.zzp(i15);
                        }
                        zzaib zzaibVar = (zzaib) zzahzVar.zzc(zzaib.class);
                        if (zzaibVar != null) {
                            zztVarZza.zzc(zzaibVar.zza);
                        }
                        int iZzf = zzas.zzf(zzvVar.zzp);
                        if (iZzf == 1) {
                            zzahm zzahmVarZzs = this.zzf.zzs(i13, iZzf);
                            zzahmVarZzs.zzA(zztVarZza.zzP());
                            zzahmVarZzs.zzP(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzahyVar = new zzahy(i13, zzahxVar, zzahmVarZzs);
                        } else if (iZzf == 2) {
                            iZzf = 2;
                            zzahm zzahmVarZzs2 = this.zzf.zzs(i13, iZzf);
                            zzahmVarZzs2.zzA(zztVarZza.zzP());
                            zzahmVarZzs2.zzP(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzahyVar = new zzahy(i13, zzahxVar, zzahmVarZzs2);
                        } else {
                            zzahyVar = null;
                        }
                    }
                    if (zzahyVar != null) {
                        arrayList.add(zzahyVar);
                    }
                    i13 = i14;
                }
                i12++;
                zzahyVar = null;
            }
            this.zzi = (zzahy[]) arrayList.toArray(new zzahy[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i5 == 3) {
            long j11 = this.zzm;
            if (j11 != -1 && zzagbVar.zzn() != j11) {
                this.zzj = j11;
                return 0;
            }
            zzeu zzeuVar3 = this.zza;
            zzagbVar.zzi(zzeuVar3.zzi(), 0, 12);
            zzagbVar.zzl();
            zzeuVar3.zzh(0);
            zzahu zzahuVar2 = this.zzb;
            zzahuVar2.zza(zzeuVar3);
            int iZzC2 = zzeuVar3.zzC();
            int i16 = zzahuVar2.zza;
            if (i16 == 1179011410) {
                zzagbVar.zzf(12);
                return 0;
            }
            if (i16 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzagbVar.zzn() + zzahuVar2.zzb + 8;
                return 0;
            }
            long jZzn2 = zzagbVar.zzn();
            this.zzm = jZzn2;
            long j12 = jZzn2 + zzahuVar2.zzb + 8;
            this.zzn = j12;
            if (!this.zzp) {
                zzahw zzahwVar2 = this.zzg;
                zzahwVar2.getClass();
                if ((zzahwVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j12;
                    return 0;
                }
                this.zzf.zzw(new zzahc(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzagbVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i5 == 4) {
            zzeu zzeuVar4 = this.zza;
            zzagbVar.zzc(zzeuVar4.zzi(), 0, 8);
            zzeuVar4.zzh(0);
            int iZzC3 = zzeuVar4.zzC();
            int iZzC4 = zzeuVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzagbVar.zzn() + iZzC4;
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i5 != 5) {
            if (zzagbVar.zzn() >= this.zzn) {
                return -1;
            }
            zzahy zzahyVar2 = this.zzk;
            if (zzahyVar2 != null) {
                if (!zzahyVar2.zze(zzagbVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzagbVar.zzn() & 1) == 1) {
                zzagbVar.zzf(1);
            }
            zzeu zzeuVar5 = this.zza;
            zzagbVar.zzi(zzeuVar5.zzi(), 0, 12);
            zzeuVar5.zzh(0);
            int iZzC5 = zzeuVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzeuVar5.zzh(8);
                zzagbVar.zzf(zzeuVar5.zzC() != 1769369453 ? 8 : 12);
                zzagbVar.zzl();
                return 0;
            }
            int iZzC6 = zzeuVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzagbVar.zzn() + iZzC6 + 8;
                return 0;
            }
            zzagbVar.zzf(8);
            zzagbVar.zzl();
            zzahy zzahyVarZzi = zzi(iZzC5);
            if (zzahyVarZzi == null) {
                this.zzj = zzagbVar.zzn() + iZzC6;
                return 0;
            }
            zzahyVarZzi.zzd(iZzC6);
            this.zzk = zzahyVarZzi;
            return 0;
        }
        zzeu zzeuVar6 = new zzeu(this.zzo);
        zzagbVar.zzc(zzeuVar6.zzi(), 0, this.zzo);
        if (zzeuVar6.zzd() < 16) {
            r20 = 0;
            j8 = 0;
        } else {
            int iZzg = zzeuVar6.zzg();
            zzeuVar6.zzk(8);
            long jZzC = zzeuVar6.zzC();
            r20 = 0;
            long j13 = this.zzm;
            j8 = jZzC > j13 ? 0L : j13 + 8;
            zzeuVar6.zzh(iZzg);
        }
        while (zzeuVar6.zzd() >= 16) {
            int iZzC7 = zzeuVar6.zzC();
            int iZzC8 = zzeuVar6.zzC();
            long jZzC2 = zzeuVar6.zzC() + j8;
            zzeuVar6.zzk(4);
            zzahy zzahyVarZzi2 = zzi(iZzC7);
            if (zzahyVarZzi2 != null) {
                zzahyVarZzi2.zza(jZzC2, (iZzC8 & 16) == 16 ? true : r20);
            }
        }
        zzahy[] zzahyVarArr = this.zzi;
        int length = zzahyVarArr.length;
        for (int i17 = r20; i17 < length; i17++) {
            zzahyVarArr[i17].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzahc(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzaht(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return r20;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzahy zzahyVar : this.zzi) {
            zzahyVar.zzf(j8);
        }
        if (j8 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public final /* synthetic */ zzahy[] zzh() {
        return this.zzi;
    }

    public zzahv(int i5, zzanq zzanqVar) {
        this.zzd = zzanqVar;
        this.zzc = 1 == (i5 ^ 1);
        this.zza = new zzeu(12);
        this.zzb = new zzahu(null);
        this.zzf = new zzagz();
        this.zzi = new zzahy[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
