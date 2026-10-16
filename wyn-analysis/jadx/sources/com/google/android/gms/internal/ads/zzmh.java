package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzmh {
    private final zzno zzc;
    private final zzea zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjw zzh;
    private zzme zzi;
    private zzme zzj;
    private zzme zzk;
    private zzme zzl;
    private zzme zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzlp zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzmh(zzno zznoVar, zzea zzeaVar, zzlp zzlpVar, zzjw zzjwVar) {
        this.zzc = zznoVar;
        this.zzd = zzeaVar;
        this.zzr = zzlpVar;
        this.zzh = zzjwVar;
    }

    private static zzxl zzA(zzbf zzbfVar, Object obj, long j8, long j10, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j8);
        return iZze == -1 ? new zzxl(obj, j10, zzbdVar.zzf(j8)) : new zzxl(obj, iZze, zzbdVar.zzd(iZze), j10);
    }

    private final void zzB() {
        int i5 = zzgwt.zzd;
        final zzgwq zzgwqVar = new zzgwq();
        for (zzme zzmeVarZzp = this.zzi; zzmeVarZzp != null; zzmeVarZzp = zzmeVarZzp.zzp()) {
            zzgwqVar.zzf(zzmeVarZzp.zzg.zza);
        }
        zzme zzmeVar = this.zzj;
        final zzxl zzxlVar = zzmeVar == null ? null : zzmeVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgwqVar, zzxlVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i5 = 0; i5 < this.zzq.size(); i5++) {
            zzme zzmeVar = (zzme) this.zzq.get(i5);
            if (zzmeVar.zzb.equals(obj)) {
                return zzmeVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzme zzmeVarZzp = this.zzi;
        if (zzmeVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzmeVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzmeVarZzp.getClass();
                if (zzmeVarZzp.zzp() == null || zzmeVarZzp.zzg.zzg) {
                    break;
                }
                zzmeVarZzp = zzmeVarZzp.zzp();
            }
            zzme zzmeVarZzp2 = zzmeVarZzp.zzp();
            if (iZze == -1 || zzmeVarZzp2 == null || zzbfVar2.zze(zzmeVarZzp2.zzb) != iZze) {
                break;
            }
            zzmeVarZzp = zzmeVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzmeVarZzp);
        zzmeVarZzp.zzg = zzx(zzbfVar2, zzmeVarZzp.zzg);
        return iZzs;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzmf zzE(com.google.android.gms.internal.ads.zzbf r22, com.google.android.gms.internal.ads.zzme r23, long r24) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.zzE(com.google.android.gms.internal.ads.zzbf, com.google.android.gms.internal.ads.zzme, long):com.google.android.gms.internal.ads.zzmf");
    }

    private final zzmf zzF(zzbf zzbfVar, zzxl zzxlVar, long j8, long j10, long j11) {
        Object obj = zzxlVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxlVar.zzb() ? zzG(zzbfVar, obj, zzxlVar.zzb, zzxlVar.zzc, j8, zzxlVar.zzd) : zzH(zzbfVar, obj, j10, j11, j8, zzxlVar.zzd);
    }

    private final zzmf zzG(zzbf zzbfVar, Object obj, int i5, int i10, long j8, long j10) {
        zzxl zzxlVar = new zzxl(obj, i5, i10, j10);
        Object obj2 = zzxlVar.zza;
        int i11 = zzxlVar.zzb;
        int i12 = zzxlVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i11, i12);
        if (i10 == zzbdVar.zzd(i5)) {
            zzbdVar.zzi();
        }
        zzbdVar.zzj(i11);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzmf(zzxlVar, jMax, -9223372036854775807L, j8, jZzh, false, false, false, false);
    }

    private final zzmf zzH(zzbf zzbfVar, Object obj, long j8, long j10, long j11, long j12) {
        long jMax = j8;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf != -1) {
            zzbdVar.zzj(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzj(iZzf);
        }
        zzxl zzxlVar = new zzxl(obj, j12, iZzf);
        boolean zZzN = zzN(zzxlVar);
        boolean zZzI = zzI(zzbfVar, zzxlVar);
        boolean zZzJ = zzJ(zzbfVar, zzxlVar, zZzN);
        long jZzK = zzK(zzbfVar, zzxlVar);
        if (jZzK != -9223372036854775807L && jMax >= jZzK) {
            jMax = Math.max(0L, jZzK - 1);
        }
        return new zzmf(zzxlVar, jMax, j10, j11, jZzK, false, zZzN, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzxl zzxlVar) {
        if (!zzN(zzxlVar)) {
            return false;
        }
        Object obj = zzxlVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzxl zzxlVar, boolean z2) {
        int iZze = zzbfVar.zze(zzxlVar.zza);
        zzbd zzbdVar = this.zza;
        int i5 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i5, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z2;
    }

    private final long zzK(zzbf zzbfVar, zzxl zzxlVar) {
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxlVar.zzb()) {
            return zzbdVar.zzh(zzxlVar.zzb, zzxlVar.zzc);
        }
        int i5 = zzxlVar.zze;
        if (i5 == -1) {
            return zzbdVar.zzd;
        }
        zzbdVar.zzc(i5);
        return 0L;
    }

    private final long zzL(zzbf zzbfVar, Object obj, int i5) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i5);
        long j8 = zzbdVar.zzg.zza(i5).zzi;
        return 0L;
    }

    private static boolean zzM(zzbf zzbfVar, int i5, long j8, zzbe zzbeVar) {
        if (j8 == -9223372036854775807L) {
            zzbfVar.zzb(i5, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzN(zzxl zzxlVar) {
        return !zzxlVar.zzb() && zzxlVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i5) {
        this.zzf = i5;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z2) {
        this.zzg = z2;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjw zzjwVar) {
        this.zzh = zzjwVar;
        long j8 = zzjwVar.zzb;
        zzj();
    }

    public final boolean zzd(zzxj zzxjVar) {
        zzme zzmeVar = this.zzl;
        return zzmeVar != null && zzmeVar.zza == zzxjVar;
    }

    public final boolean zze(zzxj zzxjVar) {
        zzme zzmeVar = this.zzm;
        return zzmeVar != null && zzmeVar.zza == zzxjVar;
    }

    public final void zzf(long j8) {
        zzme zzmeVar = this.zzl;
        if (zzmeVar != null) {
            zzmeVar.zzi(j8);
        }
    }

    public final boolean zzg() {
        zzme zzmeVar = this.zzl;
        if (zzmeVar != null) {
            return !zzmeVar.zzg.zzi && zzmeVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzmf zzh(long j8, zzmu zzmuVar) {
        zzme zzmeVar = this.zzl;
        return zzmeVar == null ? zzF(zzmuVar.zza, zzmuVar.zzb, zzmuVar.zzc, zzmuVar.zzs, -9223372036854775807L) : zzE(zzmuVar.zza, zzmeVar, j8);
    }

    public final zzme zzi(zzmf zzmfVar) {
        zzme zzmeVarZza;
        zzme zzmeVar = this.zzl;
        long jZza = zzmeVar == null ? 1000000000000L : (zzmeVar.zza() + zzmeVar.zzg.zze) - zzmfVar.zzb;
        int i5 = 0;
        while (true) {
            if (i5 >= this.zzq.size()) {
                zzmeVarZza = null;
                break;
            }
            zzmf zzmfVar2 = ((zzme) this.zzq.get(i5)).zzg;
            long j8 = zzmfVar2.zze;
            long j10 = zzmfVar.zze;
            if ((j8 == -9223372036854775807L || j8 == j10) && zzmfVar2.zzb == zzmfVar.zzb && zzmfVar2.zza.equals(zzmfVar.zza)) {
                zzmeVarZza = (zzme) this.zzq.remove(i5);
                break;
            }
            i5++;
        }
        if (zzmeVarZza == null) {
            zzmeVarZza = this.zzr.zza(zzmfVar, jZza);
        } else {
            zzmeVarZza.zzg = zzmfVar;
            zzmeVarZza.zzb(jZza);
        }
        zzme zzmeVar2 = this.zzl;
        if (zzmeVar2 != null) {
            zzmeVar2.zzo(zzmeVarZza);
        } else {
            this.zzi = zzmeVarZza;
            this.zzj = zzmeVarZza;
            this.zzk = zzmeVarZza;
        }
        this.zzo = null;
        this.zzl = zzmeVarZza;
        this.zzn++;
        zzB();
        return zzmeVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < this.zzq.size(); i5++) {
            ((zzme) this.zzq.get(i5)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzme zzk() {
        return this.zzl;
    }

    public final zzme zzl() {
        return this.zzm;
    }

    public final zzme zzm() {
        return this.zzi;
    }

    public final zzme zzn() {
        return this.zzj;
    }

    public final zzme zzo() {
        return this.zzk;
    }

    public final zzme zzp() {
        zzme zzmeVar = this.zzk;
        zzme zzmeVar2 = this.zzj;
        if (zzmeVar == zzmeVar2) {
            zzmeVar2.getClass();
            this.zzk = zzmeVar2.zzp();
        }
        zzmeVar2.getClass();
        this.zzj = zzmeVar2.zzp();
        zzB();
        zzme zzmeVar3 = this.zzj;
        zzmeVar3.getClass();
        return zzmeVar3;
    }

    public final void zzq() {
        zzme zzmeVarZzp;
        zzme zzmeVar = this.zzk;
        if (zzmeVar == null || (zzmeVarZzp = zzmeVar.zzp()) == null) {
            throw null;
        }
        this.zzk = zzmeVarZzp;
        zzB();
    }

    public final zzme zzr() {
        zzme zzmeVar = this.zzi;
        if (zzmeVar == null) {
            return null;
        }
        if (zzmeVar == this.zzj) {
            this.zzj = zzmeVar.zzp();
        }
        if (zzmeVar == this.zzk) {
            this.zzk = zzmeVar.zzp();
        }
        zzmeVar.zzn();
        int i5 = this.zzn - 1;
        this.zzn = i5;
        if (i5 == 0) {
            this.zzl = null;
            zzme zzmeVar2 = this.zzi;
            this.zzo = zzmeVar2.zzb;
            this.zzp = zzmeVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final int zzs(zzme zzmeVar) {
        zzmeVar.getClass();
        int i5 = 0;
        if (zzmeVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzmeVar;
        while (zzmeVar.zzp() != null) {
            zzmeVar = zzmeVar.zzp();
            zzmeVar.getClass();
            if (zzmeVar == this.zzj) {
                zzme zzmeVar2 = this.zzi;
                this.zzj = zzmeVar2;
                this.zzk = zzmeVar2;
                i5 = 3;
            }
            if (zzmeVar == this.zzk) {
                this.zzk = this.zzj;
                i5 |= 2;
            }
            zzmeVar.zzn();
            this.zzn--;
        }
        zzme zzmeVar3 = this.zzl;
        zzmeVar3.getClass();
        zzmeVar3.zzo(null);
        zzB();
        return i5;
    }

    public final void zzt() {
        zzme zzmeVar = this.zzm;
        if (zzmeVar == null || zzmeVar.zze()) {
            this.zzm = null;
            for (int i5 = 0; i5 < this.zzq.size(); i5++) {
                zzme zzmeVar2 = (zzme) this.zzq.get(i5);
                if (!zzmeVar2.zze()) {
                    this.zzm = zzmeVar2;
                    return;
                }
            }
        }
    }

    public final zzme zzu(zzxj zzxjVar) {
        for (int i5 = 0; i5 < this.zzq.size(); i5++) {
            zzme zzmeVar = (zzme) this.zzq.get(i5);
            if (zzmeVar.zza == zzxjVar) {
                return zzmeVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzme zzmeVarZzp = this.zzi;
        zzmeVarZzp.getClass();
        this.zzo = zzmeVarZzp.zzb;
        this.zzp = zzmeVarZzp.zzg.zza.zzd;
        while (zzmeVarZzp != null) {
            zzmeVarZzp.zzn();
            zzmeVarZzp = zzmeVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzw(com.google.android.gms.internal.ads.zzbf r23, long r24, long r26, long r28) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.zzw(com.google.android.gms.internal.ads.zzbf, long, long, long):int");
    }

    public final zzmf zzx(zzbf zzbfVar, zzmf zzmfVar) {
        zzxl zzxlVar = zzmfVar.zza;
        boolean zZzN = zzN(zzxlVar);
        boolean zZzI = zzI(zzbfVar, zzxlVar);
        boolean zZzJ = zzJ(zzbfVar, zzxlVar, zZzN);
        long jZzK = zzK(zzbfVar, zzxlVar);
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxlVar.zzb()) {
            zzbdVar.zzj(zzxlVar.zzb);
        } else {
            int i5 = zzxlVar.zze;
            if (i5 != -1) {
                zzbdVar.zzj(i5);
            }
        }
        return new zzmf(zzxlVar, zzmfVar.zzb, zzmfVar.zzc, zzmfVar.zzd, jZzK, false, zZzN, zZzI, zZzJ);
    }

    public final zzxl zzy(zzbf zzbfVar, Object obj, long j8) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i5 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i5) {
            zzme zzmeVarZzp = this.zzi;
            while (true) {
                if (zzmeVarZzp == null) {
                    zzme zzmeVarZzp2 = this.zzi;
                    while (true) {
                        if (zzmeVarZzp2 != null) {
                            int iZze2 = zzbfVar.zze(zzmeVarZzp2.zzb);
                            if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i5) {
                                jZzC = zzmeVarZzp2.zzg.zza.zzd;
                                break;
                            }
                            zzmeVarZzp2 = zzmeVarZzp2.zzp();
                        } else {
                            jZzC = zzC(obj);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = jZzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzmeVarZzp.zzb.equals(obj)) {
                        jZzC = zzmeVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzmeVarZzp = zzmeVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j10 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i10 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j8, j10, zzbeVar, zzbdVar);
    }

    public final /* synthetic */ void zzz(zzgwq zzgwqVar, zzxl zzxlVar) {
        this.zzc.zzz(zzgwqVar.zzi(), zzxlVar);
    }
}
