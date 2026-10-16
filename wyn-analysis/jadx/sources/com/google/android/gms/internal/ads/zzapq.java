package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzapq implements zzaqa {
    private final zzet zza;
    private final zzeu zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzahm zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzapq(String str, int i5, String str2) {
        zzet zzetVar = new zzet(new byte[128], 128);
        this.zza = zzetVar;
        this.zzb = new zzeu(zzetVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i5;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzf = zzaroVar.zzc();
        this.zzg = zzagdVar.zzs(zzaroVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j8, int i5) {
        this.zzn = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i5 = this.zzh;
            if (i5 == 0) {
                while (true) {
                    if (zzeuVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int iZzs = zzeuVar.zzs();
                        if (iZzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzeu zzeuVar2 = this.zzb;
                            zzeuVar2.zzi()[0] = 11;
                            zzeuVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = iZzs == 11;
                    } else {
                        this.zzj = zzeuVar.zzs() == 11;
                    }
                }
            } else if (i5 != 1) {
                int iMin = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzeuVar, iMin);
                int i10 = this.zzi + iMin;
                this.zzi = i10;
                if (i10 == this.zzm) {
                    zzgtr.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzeu zzeuVar3 = this.zzb;
                byte[] bArrZzi = zzeuVar3.zzi();
                int iMin2 = Math.min(zzeuVar.zzd(), 128 - this.zzi);
                zzeuVar.zzm(bArrZzi, this.zzi, iMin2);
                int i11 = this.zzi + iMin2;
                this.zzi = i11;
                if (i11 == 128) {
                    zzet zzetVar = this.zza;
                    zzetVar.zzf(0);
                    zzaez zzaezVarZzc = zzafa.zzc(zzetVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzaezVarZzc.zzc != zzvVar.zzH || zzaezVarZzc.zzb != zzvVar.zzJ || !Objects.equals(zzaezVarZzc.zza, zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        String str = zzaezVarZzc.zza;
                        zztVar.zzo(str);
                        zztVar.zzG(zzaezVarZzc.zzc);
                        zztVar.zzI(zzaezVarZzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i12 = zzaezVarZzc.zzf;
                        zztVar.zzj(i12);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzi(i12);
                        }
                        zzv zzvVarZzP = zztVar.zzP();
                        this.zzl = zzvVarZzP;
                        this.zzg.zzA(zzvVarZzP);
                    }
                    this.zzm = zzaezVarZzc.zzd;
                    this.zzk = (zzaezVarZzc.zze * 1000000) / this.zzl.zzJ;
                    zzeuVar3.zzh(0);
                    this.zzg.zzc(zzeuVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z2) {
    }
}
