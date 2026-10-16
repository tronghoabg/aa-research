package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
final class zzlw implements Handler.Callback, zzxi, zzabh, zzms, zzjj, zzmw, zzcc, zzadt {
    private static final long zza = zzfm.zzs(10000);
    private zznk zzA;
    private boolean zzC;
    private boolean zzD;
    private zzlv zzE;
    private int zzF;
    private zzmu zzG;
    private zzlt zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzlv zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zzjm zzX;
    private zzjw zzZ;
    private boolean zzab;
    private final zzjf zzad;
    private final zzng[] zzb;
    private final zzne[] zzc;
    private final boolean[] zzd;
    private final zzabi zze;
    private final zzabj zzf;
    private final zzma zzg;
    private final zzea zzh;
    private final zzmv zzi;
    private final Looper zzj;
    private final zzbe zzk;
    private final zzbd zzl;
    private final long zzm;
    private final zzjk zzn;
    private final ArrayList zzo;
    private final zzdp zzp;
    private final zzlu zzq;
    private final zzmh zzr;
    private final zzmt zzs;
    private final long zzt;
    private final zzqh zzu;
    private final boolean zzv;
    private final zzno zzw;
    private final zzea zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zznj zzB = zznj.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlw(Context context, zznc[] zzncVarArr, zznc[] zzncVarArr2, zzabi zzabiVar, zzabj zzabjVar, zzma zzmaVar, zzabr zzabrVar, int i5, boolean z2, zzno zznoVar, zznk zznkVar, zzjf zzjfVar, long j8, boolean z10, boolean z11, Looper looper, zzdp zzdpVar, zzlu zzluVar, zzqh zzqhVar, zzmv zzmvVar, zzjw zzjwVar, final zzadt zzadtVar) {
        this.zzq = zzluVar;
        this.zze = zzabiVar;
        this.zzf = zzabjVar;
        this.zzg = zzmaVar;
        this.zzA = zznkVar;
        this.zzad = zzjfVar;
        this.zzt = j8;
        this.zzv = z11;
        this.zzp = zzdpVar;
        this.zzu = zzqhVar;
        this.zzZ = zzjwVar;
        this.zzw = zznoVar;
        this.zzm = zzmaVar.zzf(zzqhVar);
        zzmaVar.zzg(zzqhVar);
        zzbf zzbfVar = zzbf.zza;
        zzmu zzmuVarZza = zzmu.zza(zzabjVar);
        this.zzG = zzmuVarZza;
        this.zzH = new zzlt(zzmuVarZza);
        int length = zzncVarArr.length;
        this.zzc = new zzne[2];
        this.zzd = new boolean[2];
        zznd zzndVarZzg = zzabiVar.zzg();
        this.zzb = new zzng[2];
        boolean z12 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzncVarArr[i10].zzc(i10, zzqhVar, zzdpVar);
            this.zzc[i10] = zzncVarArr[i10].zzb();
            this.zzc[i10].zzv(zzndVarZzg);
            zznc zzncVar = zzncVarArr2[i10];
            if (zzncVar != null) {
                zzncVar.zzc(i10, zzqhVar, zzdpVar);
                z12 = true;
            }
            this.zzb[i10] = new zzng(zzncVarArr[i10], zzncVarArr2[i10], i10);
        }
        this.zzy = z12;
        this.zzn = new zzjk(this, zzdpVar);
        this.zzo = new ArrayList();
        this.zzk = new zzbe();
        this.zzl = new zzbd();
        zzabiVar.zzs(this, zzabrVar);
        this.zzW = true;
        zzea zzeaVarZzd = zzdpVar.zzd(looper, null);
        this.zzx = zzeaVarZzd;
        this.zzr = new zzmh(zznoVar, zzeaVarZzd, new zzlp(this), zzjwVar);
        this.zzs = new zzmt(this, zznoVar, zzeaVarZzd, zzqhVar, zzabrVar);
        zzmv zzmvVar2 = new zzmv(null);
        this.zzi = zzmvVar2;
        Looper looperZza = zzmvVar2.zza();
        this.zzj = looperZza;
        zzea zzeaVarZzd2 = zzdpVar.zzd(looperZza, this);
        this.zzh = zzeaVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzeaVarZzd2.zzd(35, new zzadt() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzadt
            public final /* synthetic */ void zzcS(long j10, long j11, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j10, j11, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i5) {
        zzmh zzmhVar = this.zzr;
        zzjm zzjmVarZza = zzjm.zza(iOException, i5);
        zzme zzmeVarZzm = zzmhVar.zzm();
        if (zzmeVarZzm != null) {
            zzjmVarZza = zzjmVarZza.zzd(zzmeVarZzm.zzg.zza);
        }
        zzeh.zzf("ExoPlayerImplInternal", "Playback error", zzjmVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zzjmVarZza);
    }

    private final void zzB(int i5) {
        zzmu zzmuVar = this.zzG;
        if (zzmuVar.zze != i5) {
            if (i5 != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmuVar.zze(i5);
        }
    }

    private final void zzC(int i5) {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            if (!this.zzG.zza.zzg()) {
                zzmu zzmuVar = this.zzG;
                boolean z2 = zzmuVar.zza.zze(zzmuVar.zzb.zza) != -1;
                Locale locale = Locale.US;
                zzmu zzmuVar2 = this.zzG;
                zzgtr.zzj(z2, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", zzmuVar2.zzb.zza, zzmuVar2.zza.getClass().getName(), Integer.valueOf(this.zzG.zza.zza()), Integer.valueOf(i5)));
            }
            this.zzq.zza(this.zzH);
            this.zzH = new zzlt(this.zzG);
        }
    }

    private final void zzD(float f10) throws zzjm {
        this.zzac = f10;
        float fZza = this.zzz.zza() * f10;
        int i5 = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            zzngVarArr[i5].zzL(fZza);
            i5++;
        }
    }

    private final void zzE(boolean z2, int i5, boolean z10, int i10) throws zzjm {
        this.zzH.zza(z10 ? 1 : 0);
        zzG(z2, i5, i10);
    }

    private final void zzF() throws zzjm {
        zzmu zzmuVar = this.zzG;
        zzG(zzmuVar.zzl, zzmuVar.zzn, zzmuVar.zzm);
    }

    private final void zzG(boolean z2, int i5, int i10) throws zzjm {
        zzH(z2, this.zzz.zzc(z2, this.zzG.zze), i5, i10);
    }

    private final void zzH(boolean z2, int i5, int i10, int i11) throws zzjm {
        boolean z10;
        if (!z2) {
            z10 = false;
        } else if (i5 != -1) {
            z10 = true;
        } else {
            i5 = -1;
            z10 = false;
        }
        if (i5 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z11 = this.zzC;
        if (i5 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z11 ? 4 : 0;
        }
        zzmu zzmuVar = this.zzG;
        if (zzmuVar.zzl == z10 && zzmuVar.zzn == i10 && zzmuVar.zzm == i11) {
            return;
        }
        this.zzG = zzmuVar.zzi(z10, i11, i10);
        zzaC(false, false);
        zzmh zzmhVar = this.zzr;
        for (zzme zzmeVarZzm = zzmhVar.zzm(); zzmeVarZzm != null; zzmeVarZzm = zzmeVarZzm.zzp()) {
            for (zzabb zzabbVar : zzmeVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z12 = this.zzG.zzp;
            zzmhVar.zzf(this.zzT);
            return;
        }
        int i12 = this.zzG.zze;
        if (i12 == 3) {
            this.zzn.zza();
            zzJ();
            this.zzh.zzh(2);
        } else if (i12 == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzI(boolean z2) throws zzjm {
        zzxl zzxlVar = this.zzr.zzm().zzg.zza;
        long jZzT = zzT(zzxlVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmu zzmuVar = this.zzG;
            this.zzG = zzao(zzxlVar, jZzT, zzmuVar.zzc, zzmuVar.zzd, z2, 5);
        }
    }

    private final void zzJ() throws zzjm {
        zzme zzmeVarZzm = this.zzr.zzm();
        if (zzmeVarZzm == null) {
            return;
        }
        zzabj zzabjVarZzr = zzmeVarZzm.zzr();
        int i5 = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            if (zzabjVarZzr.zza(i5)) {
                zzngVarArr[i5].zzv();
            }
            i5++;
        }
    }

    private final void zzK() throws zzjm {
        this.zzn.zzb();
        int i5 = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            zzngVarArr[i5].zzw();
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzh.zzk(16);
        this.zzn.zzi(zzavVar);
    }

    private final void zzN(final int i5, final boolean z2) {
        boolean[] zArr = this.zzd;
        if (zArr[i5] != z2) {
            zArr[i5] = z2;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i5, z2);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j8) {
        int i5 = zzbfVar.zzo(obj, this.zzl).zzc;
        zzbe zzbeVar = this.zzk;
        zzbfVar.zzb(i5, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j10 = zzbeVar.zzg;
        String str = zzfm.zza;
        return zzfm.zzt((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j8;
    }

    private final boolean zzP(zzbf zzbfVar, zzxl zzxlVar) {
        if (!zzxlVar.zzb() && !zzbfVar.zzg()) {
            int i5 = zzbfVar.zzo(zzxlVar.zza, this.zzl).zzc;
            zzbe zzbeVar = this.zzk;
            zzbfVar.zzb(i5, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j8) {
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzng[] zzngVarArr = this.zzb;
            for (int i5 = 0; i5 < 2; i5++) {
                jMin = Math.min(jMin, zzfm.zzs(zzngVarArr[i5].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzmh zzmhVar = this.zzr;
                if ((zzmhVar.zzm() != null ? zzmhVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfm.zzt(jMin) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzh.zzj(2, j8 + jMin);
    }

    private final void zzR(zzlv zzlvVar) throws Throwable {
        long jLongValue;
        long j8;
        zzxl zzxlVarZzy;
        boolean z2;
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long jZzu;
        zzmu zzmuVar;
        int i5;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzlvVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar = this.zzG.zza;
        int i10 = this.zzO;
        boolean z11 = this.zzP;
        zzbe zzbeVar = this.zzk;
        zzbd zzbdVar = this.zzl;
        Pair pairZzaD = zzaD(zzbfVar, zzlvVar, true, i10, z11, zzbeVar, zzbdVar);
        long jMax = -9223372036854775807L;
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzxl zzxlVar = (zzxl) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z2 = !this.zzG.zza.zzg();
            zzxlVarZzy = zzxlVar;
            j8 = -9223372036854775807L;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j14 = zzlvVar.zzc;
            if (j14 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                j8 = -9223372036854775807L;
                jMax = jLongValue;
            }
            zzxlVarZzy = this.zzr.zzy(this.zzG.zza, obj, jLongValue);
            if (zzxlVarZzy.zzb()) {
                this.zzG.zza.zzo(zzxlVarZzy.zza, zzbdVar);
                int i11 = zzxlVarZzy.zzb;
                if (zzbdVar.zzd(i11) == zzxlVarZzy.zzc) {
                    zzbdVar.zzi();
                }
                long j15 = zzbdVar.zzg.zza(i11).zza;
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j14 != -9223372036854775807L) {
                z2 = false;
            }
            z2 = true;
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzlvVar;
            } else if (pairZzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzxlVarZzy.equals(this.zzG.zzb)) {
                    zzme zzmeVarZzm = this.zzr.zzm();
                    if (zzmeVarZzm == null || !zzmeVarZzm.zze || jLongValue == 0) {
                        jZzu = jLongValue;
                    } else {
                        zzxj zzxjVar = zzmeVarZzm.zza;
                        long j16 = zzbeVar.zzm;
                        if (this.zzC && j16 != j8) {
                            Double d3 = this.zzB.zzc;
                        }
                        jZzu = zzxjVar.zzu(jLongValue, this.zzA);
                    }
                    long j17 = jZzu;
                    if (zzfm.zzs(jZzu) == zzfm.zzs(this.zzG.zzs) && ((i5 = (zzmuVar = this.zzG).zze) == 2 || i5 == 3)) {
                        jLongValue = zzmuVar.zzs;
                    } else {
                        j11 = j17;
                    }
                } else {
                    j11 = jLongValue;
                }
                if (this.zzC) {
                    zzng[] zzngVarArr = this.zzb;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 2) {
                            break;
                        }
                        zzng zzngVar = zzngVarArr[i12];
                        if (zzngVar.zzM() && zzngVar.zze() == 2) {
                            this.zzD = true;
                            break;
                        }
                        i12++;
                    }
                }
                long jZzS = zzS(zzxlVarZzy, j11, this.zzG.zze == 4);
                z10 = (jLongValue != jZzS) | z2;
                try {
                    zzmu zzmuVar2 = this.zzG;
                    zzxl zzxlVar2 = zzxlVarZzy;
                    try {
                        zzbf zzbfVar2 = zzmuVar2.zza;
                        long j18 = jMax;
                        try {
                            zzag(zzbfVar2, zzxlVar2, zzbfVar2, zzmuVar2.zzb, j18, true);
                            zzxlVarZzy = zzxlVar2;
                            j12 = j18;
                            j13 = jZzS;
                            this.zzG = zzao(zzxlVarZzy, j13, j12, j13, z10, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzxlVarZzy = zzxlVar2;
                            jMax = j18;
                            j10 = jZzS;
                            this.zzG = zzao(zzxlVarZzy, j10, jMax, j10, z10, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzxlVarZzy = zzxlVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z10 = z2;
            j12 = jMax;
            j13 = jLongValue;
            this.zzG = zzao(zzxlVarZzy, j13, j12, j13, z10, 2);
        } catch (Throwable th4) {
            th = th4;
            z10 = z2;
            j10 = jLongValue;
        }
    }

    private final long zzS(zzxl zzxlVar, long j8, boolean z2) throws zzjm {
        zzmh zzmhVar = this.zzr;
        return zzT(zzxlVar, j8, zzmhVar.zzm() != zzmhVar.zzn(), z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzT(com.google.android.gms.internal.ads.zzxl r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.zzT(com.google.android.gms.internal.ads.zzxl, long, boolean, boolean):long");
    }

    private final void zzU(long j8, boolean z2) throws zzjm {
        zzme zzmeVarZzm = this.zzr.zzm();
        long jZza = j8 + (zzmeVarZzm == null ? 1000000000000L : zzmeVarZzm.zza());
        this.zzT = jZza;
        this.zzn.zzc(jZza);
        zzng[] zzngVarArr = this.zzb;
        for (int i5 = 0; i5 < 2; i5++) {
            zzngVarArr[i5].zzE(zzmeVarZzm, this.zzT, z2);
        }
        for (zzme zzmeVarZzm2 = r0.zzm(); zzmeVarZzm2 != null; zzmeVarZzm2 = zzmeVarZzm2.zzp()) {
            for (zzabb zzabbVar : zzmeVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzjm {
        int i5 = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i5 >= 2) {
                return;
            }
            zzngVarArr[i5].zzz(this.zzC ? this.zzB : null);
            i5++;
        }
    }

    private final void zzW(boolean z2, boolean z10) {
        zzX(z2 || !this.zzQ, false, true, false);
        this.zzH.zza(z10 ? 1 : 0);
        this.zzg.zzc(this.zzu);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[PHI: r2 r7 r9
  0x009d: PHI (r2v2 com.google.android.gms.internal.ads.zzxl) = (r2v1 com.google.android.gms.internal.ads.zzxl), (r2v11 com.google.android.gms.internal.ads.zzxl) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v2 com.google.android.gms.internal.ads.zzbf)
  (r3v12 com.google.android.gms.internal.ads.zzbf)
  (r3v12 com.google.android.gms.internal.ads.zzbf)
 binds: [B:34:0x00aa, B:36:0x00ae, B:38:0x00bf, B:40:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j8 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmu.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzk;
        zzbd zzbdVar = this.zzl;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzxl zzxlVarZzy = this.zzr.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzxlVarZzy.zzb()) {
            zzbfVar.zzo(zzxlVarZzy.zza, zzbdVar);
            if (zzxlVarZzy.zzc == zzbdVar.zzd(zzxlVarZzy.zzb)) {
                zzbdVar.zzi();
            }
        } else {
            j8 = jLongValue;
        }
        return Pair.create(zzxlVarZzy, Long.valueOf(j8));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzo;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzls) arrayList.get(size)).zzb;
            String str = zzfm.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzv) {
            if (!this.zzC) {
                return false;
            }
            boolean z2 = this.zzB.zzg;
        }
        return true;
    }

    private static boolean zzaB(zzmu zzmuVar, zzbd zzbdVar) {
        zzxl zzxlVar = zzmuVar.zzb;
        zzbf zzbfVar = zzmuVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxlVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z2, boolean z10) {
        this.zzL = z2;
        long jElapsedRealtime = -9223372036854775807L;
        if (z2 && !z10) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private static Pair zzaD(zzbf zzbfVar, zzlv zzlvVar, boolean z2, int i5, boolean z10, zzbe zzbeVar, zzbd zzbdVar) {
        Pair pairZzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzlvVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar3 = zzbfVar;
        }
        try {
            pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzlvVar.zzb, zzlvVar.zzc);
            zzbfVar2 = zzbfVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar2)) {
            return pairZzm;
        }
        if (zzbfVar.zze(pairZzm.first) != -1) {
            return (zzbfVar2.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzlvVar.zzc) : pairZzm;
        }
        int iZzr = zzr(zzbeVar, zzbdVar, i5, z10, pairZzm.first, zzbfVar2, zzbfVar);
        if (iZzr != -1) {
            return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
        }
        return null;
    }

    private static final void zzaE(zzmy zzmyVar) throws zzjm {
        zzmyVar.zzh();
        try {
            zzmyVar.zza().zzx(zzmyVar.zzc(), zzmyVar.zze());
        } finally {
            zzmyVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzme zzmeVar) {
        if (zzmeVar != null) {
            try {
                if (zzmeVar.zze) {
                    zzzd[] zzzdVarArr = zzmeVar.zzc;
                    for (int i5 = 0; i5 < 2; i5++) {
                        zzzd zzzdVar = zzzdVarArr[i5];
                        if (zzzdVar != null) {
                            zzzdVar.zzb();
                        }
                    }
                } else {
                    zzmeVar.zza.zzm();
                }
                if (zzmeVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzjm {
        int i5 = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i5 >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzngVarArr[i5].zzd();
            zzngVarArr[i5].zzA(this.zzn);
            zzN(i5, false);
            this.zzR -= iZzd;
            i5++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzng[] zzngVarArr = this.zzb;
            for (int i5 = 0; i5 < 2; i5++) {
                zzng zzngVar = zzngVarArr[i5];
                int iZzd = zzngVar.zzd();
                zzngVar.zzC(this.zzn);
                this.zzR -= iZzd - zzngVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzjm {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzjm {
        zzlw zzlwVar;
        int i5;
        int i10;
        boolean z2;
        zzjk zzjkVar = this.zzn;
        float f10 = zzjkVar.zzj().zzb;
        zzmh zzmhVar = this.zzr;
        zzme zzmeVarZzm = zzmhVar.zzm();
        zzme zzmeVarZzn = zzmhVar.zzn();
        zzabj zzabjVar = null;
        boolean z10 = true;
        while (zzmeVarZzm != null && zzmeVarZzm.zze) {
            zzmu zzmuVar = this.zzG;
            zzabj zzabjVarZzk = zzmeVarZzm.zzk(f10, zzmuVar.zza, zzmuVar.zzl);
            zzabj zzabjVar2 = zzmeVarZzm == zzmhVar.zzm() ? zzabjVarZzk : zzabjVar;
            zzabj zzabjVarZzr = zzmeVarZzm.zzr();
            boolean z11 = false;
            if (zzabjVarZzr != null) {
                zzabb[] zzabbVarArr = zzabjVarZzk.zzc;
                if (zzabjVarZzr.zzc.length == zzabbVarArr.length) {
                    for (int i11 = 0; i11 < zzabbVarArr.length; i11++) {
                        if (zzabjVarZzk.zzb(zzabjVarZzr, i11)) {
                        }
                    }
                    if (zzmeVarZzm != zzmeVarZzn) {
                        z11 = true;
                    }
                    z10 &= z11;
                    zzmeVarZzm = zzmeVarZzm.zzp();
                    zzabjVar = zzabjVar2;
                }
            }
            if (z10) {
                zzme zzmeVarZzm2 = zzmhVar.zzm();
                int iZzs = zzmhVar.zzs(zzmeVarZzm2) & 1;
                zzng[] zzngVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzabjVar2.getClass();
                long jZzm = zzmeVarZzm2.zzm(zzabjVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzmu zzmuVar2 = this.zzG;
                if (zzmuVar2.zze == 4 || jZzm == zzmuVar2.zzs) {
                    z2 = false;
                } else {
                    z2 = false;
                    z11 = true;
                }
                zzmu zzmuVar3 = this.zzG;
                boolean z12 = z2;
                i5 = 4;
                i10 = 2;
                zzlwVar = this;
                zzlwVar.zzG = zzao(zzmuVar3.zzb, jZzm, zzmuVar3.zzc, zzmuVar3.zzd, z11, 5);
                if (z11) {
                    zzlwVar.zzU(jZzm, true);
                }
                zzlwVar.zzab();
                boolean[] zArr2 = new boolean[2];
                int i12 = z12;
                while (i12 < 2) {
                    int iZzd = zzngVarArr[i12].zzd();
                    zArr2[i12] = zzngVarArr[i12].zzM();
                    zzjk zzjkVar2 = zzjkVar;
                    zzngVarArr[i12].zzD(zzmeVarZzm2.zzc[i12], zzjkVar2, zzlwVar.zzT, zArr[i12]);
                    if (iZzd - zzngVarArr[i12].zzd() > 0) {
                        zzlwVar.zzN(i12, z12);
                    }
                    zzlwVar.zzR -= iZzd - zzngVarArr[i12].zzd();
                    i12++;
                    zzjkVar = zzjkVar2;
                }
                zzlwVar.zzaq(zArr2, zzlwVar.zzT);
                zzmeVarZzm2.zzh = true;
            } else {
                zzlwVar = this;
                i5 = 4;
                i10 = 2;
                zzmhVar.zzs(zzmeVarZzm);
                if (zzmeVarZzm.zze) {
                    long jMax = Math.max(zzmeVarZzm.zzg.zzb, zzlwVar.zzT - zzmeVarZzm.zza());
                    if (zzlwVar.zzy && zzlwVar.zzaz() && zzmhVar.zzo() == zzmeVarZzm) {
                        zzlwVar.zzab();
                    }
                    zzmeVarZzm.zzl(zzabjVarZzk, jMax, false);
                }
            }
            zzlwVar.zzas(true);
            if (zzlwVar.zzG.zze != i5) {
                zzlwVar.zzam();
                zzlwVar.zzL();
                zzlwVar.zzh.zzh(i10);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzme zzmeVarZzm = this.zzr.zzm();
        long j8 = zzmeVarZzm.zzg.zze;
        if (zzmeVarZzm.zze) {
            return j8 == -9223372036854775807L || this.zzG.zzs < j8 || !zzax();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.google.android.gms.internal.ads.zzlv] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.android.gms.internal.ads.zzlv] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r36, boolean r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzxl zzxlVar, zzbf zzbfVar2, zzxl zzxlVar2, long j8, boolean z2) throws zzjm {
        if (!zzP(zzbfVar, zzxlVar)) {
            zzav zzavVar = zzxlVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzn.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zzl;
        int i5 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzk;
        zzbfVar.zzb(i5, zzbeVar, 0L);
        zzjf zzjfVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfm.zza;
        zzjfVar.zza(zzafVar);
        if (j8 != -9223372036854775807L) {
            zzjfVar.zzb(zzO(zzbfVar, obj, j8));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxlVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z2) {
            zzjfVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzme zzmeVar) {
        if (zzmeVar == null) {
            return 0L;
        }
        long jZza = zzmeVar.zza();
        if (zzmeVar.zze) {
            int i5 = 0;
            while (true) {
                zzng[] zzngVarArr = this.zzb;
                if (i5 >= 2) {
                    break;
                }
                if (zzngVarArr[i5].zzp(zzmeVar)) {
                    long jZzf = zzngVarArr[i5].zzf(zzmeVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i5++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzmh zzmhVar = this.zzr;
        zzmhVar.zzt();
        zzme zzmeVarZzl = zzmhVar.zzl();
        if (zzmeVarZzl != null) {
            if (!zzmeVarZzl.zzd || zzmeVarZzl.zze) {
                zzxj zzxjVar = zzmeVarZzl.zza;
                if (zzxjVar.zze()) {
                    return;
                }
                if (this.zzg.zzj(this.zzu, this.zzG.zza, zzmeVarZzl.zzg.zza, zzmeVarZzl.zze ? zzxjVar.zzb() : 0L)) {
                    if (!zzmeVarZzl.zzd) {
                        zzmeVarZzl.zzs(this, zzmeVarZzl.zzg.zzb);
                        return;
                    }
                    zzmb zzmbVar = new zzmb();
                    zzmbVar.zza(this.zzT - zzmeVarZzl.zza());
                    zzmbVar.zzb(this.zzn.zzj().zzb);
                    zzmbVar.zzc(this.zzM);
                    zzmeVarZzl.zzj(new zzmc(zzmbVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzme zzmeVarZzm = this.zzr.zzm();
        boolean z2 = false;
        if (zzmeVarZzm != null && zzmeVarZzm.zzg.zzh && this.zzJ) {
            z2 = true;
        }
        this.zzK = z2;
    }

    private final void zzak(zzav zzavVar, boolean z2) throws zzjm {
        zzal(zzavVar, zzavVar.zzb, true, z2);
    }

    private final void zzal(zzav zzavVar, float f10, boolean z2, boolean z10) throws zzjm {
        int i5;
        if (z2) {
            if (z10) {
                this.zzH.zza(1);
            }
            zzmu zzmuVar = this.zzG;
            this.zzG = new zzmu(zzmuVar.zza, zzmuVar.zzb, zzmuVar.zzc, zzmuVar.zzd, zzmuVar.zze, zzmuVar.zzf, zzmuVar.zzg, zzmuVar.zzh, zzmuVar.zzi, zzmuVar.zzj, zzmuVar.zzk, zzmuVar.zzl, zzmuVar.zzm, zzmuVar.zzn, zzavVar, zzmuVar.zzq, zzmuVar.zzr, zzmuVar.zzs, zzmuVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzme zzmeVarZzm = this.zzr.zzm();
        while (true) {
            i5 = 0;
            if (zzmeVarZzm == null) {
                break;
            }
            zzabb[] zzabbVarArr = zzmeVarZzm.zzr().zzc;
            int length = zzabbVarArr.length;
            while (i5 < length) {
                zzabb zzabbVar = zzabbVarArr[i5];
                i5++;
            }
            zzmeVarZzm = zzmeVarZzm.zzp();
        }
        zzng[] zzngVarArr = this.zzb;
        while (i5 < 2) {
            zzngVarArr[i5].zzm(f10, f11);
            i5++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzmh zzmhVar = this.zzr;
        boolean zZzh = false;
        if (zzaF(zzmhVar.zzk())) {
            zzme zzmeVarZzk = zzmhVar.zzk();
            long jZzau = zzau(zzmeVarZzk.zzg());
            if (zzmeVarZzk == zzmhVar.zzm()) {
                jZza = this.zzT;
                jZza2 = zzmeVarZzk.zza();
            } else {
                jZza = this.zzT - zzmeVarZzk.zza();
                jZza2 = zzmeVarZzk.zzg.zzb;
            }
            zzlz zzlzVar = new zzlz(this.zzu, this.zzG.zza, zzmeVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzn.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzmeVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzma zzmaVar = this.zzg;
            boolean zZzh2 = zzmaVar.zzh(zzlzVar);
            zzme zzmeVarZzm = zzmhVar.zzm();
            if (zZzh2 || !zzmeVarZzm.zze || jZzau >= 500000 || this.zzm <= 0) {
                zZzh = zZzh2;
            } else {
                zzmeVarZzm.zza.zzq(this.zzG.zzs, false);
                zZzh = zzmaVar.zzh(zzlzVar);
            }
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzme zzmeVarZzk2 = zzmhVar.zzk();
            zzmeVarZzk2.getClass();
            zzmb zzmbVar = new zzmb();
            zzmbVar.zza(this.zzT - zzmeVarZzk2.zza());
            zzmbVar.zzb(this.zzn.zzj().zzb);
            zzmbVar.zzc(this.zzM);
            zzmeVarZzk2.zzj(new zzmc(zzmbVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzme zzmeVarZzk = this.zzr.zzk();
        boolean z2 = true;
        if (!this.zzN && (zzmeVarZzk == null || !zzmeVarZzk.zza.zze())) {
            z2 = false;
        }
        zzmu zzmuVar = this.zzG;
        if (z2 != zzmuVar.zzg) {
            this.zzG = zzmuVar.zzg(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.zzmu zzao(com.google.android.gms.internal.ads.zzxl r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.zzao(com.google.android.gms.internal.ads.zzxl, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzmu");
    }

    private final void zzap() throws zzjm {
        zzaq(new boolean[2], this.zzr.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j8) throws zzjm {
        zzng[] zzngVarArr;
        long j10;
        zzme zzmeVarZzn = this.zzr.zzn();
        zzabj zzabjVarZzr = zzmeVarZzn.zzr();
        int i5 = 0;
        while (true) {
            zzngVarArr = this.zzb;
            if (i5 >= 2) {
                break;
            }
            if (!zzabjVarZzr.zza(i5)) {
                zzngVarArr[i5].zzG();
            }
            i5++;
        }
        int i10 = 0;
        while (i10 < 2) {
            if (!zzabjVarZzr.zza(i10) || zzngVarArr[i10].zzp(zzmeVarZzn)) {
                j10 = j8;
            } else {
                j10 = j8;
                zzar(zzmeVarZzn, i10, zArr[i10], j10);
            }
            i10++;
            j8 = j10;
        }
    }

    private final void zzar(zzme zzmeVar, int i5, boolean z2, long j8) throws zzjm {
        zzng zzngVar = this.zzb[i5];
        if (zzngVar.zzM()) {
            return;
        }
        boolean z10 = zzmeVar == this.zzr.zzm();
        zzabj zzabjVarZzr = zzmeVar.zzr();
        zznf zznfVar = zzabjVarZzr.zzb[i5];
        zzabb zzabbVar = zzabjVarZzr.zzc[i5];
        boolean z11 = zzax() && this.zzG.zze == 3;
        boolean z12 = !z2 && z11;
        this.zzR++;
        zzngVar.zzx(zznfVar, zzabbVar, zzmeVar.zzc[i5], this.zzT, z12, z10, j8, zzmeVar.zza(), zzmeVar.zzg.zza, this.zzn);
        zzngVar.zzy(11, new zzlk(this), zzmeVar);
        if (z11 && z10) {
            zzngVar.zzv();
        }
    }

    private final void zzas(boolean z2) {
        zzme zzmeVarZzk = this.zzr.zzk();
        zzxl zzxlVar = zzmeVarZzk == null ? this.zzG.zzb : zzmeVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzxlVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzxlVar);
        }
        zzmu zzmuVar = this.zzG;
        zzmuVar.zzq = zzmeVarZzk == null ? zzmuVar.zzs : zzmeVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z2) && zzmeVarZzk != null && zzmeVarZzk.zze) {
            zzaw(zzmeVarZzk.zzg.zza, zzmeVarZzk.zzq(), zzmeVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j8) {
        zzme zzmeVarZzk = this.zzr.zzk();
        if (zzmeVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j8 - (this.zzT - zzmeVarZzk.zza()));
    }

    private final long zzav(zzme zzmeVar) {
        zzgtr.zzi(zzmeVar.zze);
        return (long) ((zzmeVar.zzc() - this.zzT) / this.zzn.zzj().zzb);
    }

    private final void zzaw(zzxl zzxlVar, zzzo zzzoVar, zzabj zzabjVar) {
        long jZza;
        long jZza2;
        zzmh zzmhVar = this.zzr;
        zzme zzmeVarZzk = zzmhVar.zzk();
        zzmeVarZzk.getClass();
        if (zzmeVarZzk == zzmhVar.zzm()) {
            jZza = this.zzT;
            jZza2 = zzmeVarZzk.zza();
        } else {
            jZza = this.zzT - zzmeVarZzk.zza();
            jZza2 = zzmeVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlz(this.zzu, this.zzG.zza, zzxlVar, jZza - jZza2, zzau(zzmeVarZzk.zzf()), this.zzn.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzmeVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzzoVar, zzabjVar.zzc);
    }

    private final boolean zzax() {
        zzmu zzmuVar = this.zzG;
        return zzmuVar.zzl && zzmuVar.zzn == 0;
    }

    private final void zzay(int i5) throws Throwable {
        zzng zzngVar = this.zzb[i5];
        try {
            zzme zzmeVarZzm = this.zzr.zzm();
            if (zzmeVarZzm == null) {
                throw null;
            }
            zzngVar.zzu(zzmeVarZzm);
        } catch (IOException e7) {
            e = e7;
            zzngVar.zze();
            throw e;
        } catch (RuntimeException e10) {
            e = e10;
            zzngVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzng[] zzngVarArr = this.zzb;
        for (int i5 = 0; i5 < 2; i5++) {
            if (zzngVarArr[i5].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i5, boolean z2, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i10 = 0; i10 < zzbfVar2.zza(); i10++) {
            if (zzbfVar2.zzb(i10, zzbeVar, 0L).zzb.equals(obj2)) {
                return i10;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= iZzc || iZze2 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar2, i5, z2);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i11++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
            zzbeVar2 = zzbeVar;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzmy zzmyVar) {
        try {
            zzaE(zzmyVar);
        } catch (zzjm e7) {
            zzeh.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:419:0x07f9
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0725 A[Catch: IOException -> 0x04d6, zzwn -> 0x04db, zzhs -> 0x04e0, zzat -> 0x04e5, zzui -> 0x04ea, RuntimeException -> 0x05a7, zzjm -> 0x05ac, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x05a7, blocks: (B:277:0x05a3, B:288:0x05c8, B:289:0x05d2, B:291:0x05e4, B:293:0x05f2, B:298:0x060c, B:396:0x078e, B:398:0x0794, B:400:0x079a, B:403:0x079f, B:404:0x07aa, B:406:0x07ae, B:410:0x07d3, B:412:0x07d9, B:414:0x07e1, B:415:0x07e9, B:416:0x07ec, B:418:0x07f5, B:472:0x08cf, B:477:0x08dc, B:479:0x08e4, B:482:0x08ee, B:484:0x08fc, B:485:0x0916, B:487:0x091a, B:489:0x0922, B:503:0x094f, B:490:0x0928, B:492:0x0933, B:496:0x093c, B:502:0x094c, B:506:0x0963, B:508:0x0969, B:512:0x0971, B:514:0x0979, B:516:0x097d, B:517:0x0988, B:519:0x098e, B:570:0x0a9b, B:573:0x0aa3, B:575:0x0aa7, B:577:0x0aaf, B:578:0x0ab2, B:579:0x0ab6, B:581:0x0abc, B:583:0x0ac5, B:585:0x0acf, B:587:0x0ad5, B:589:0x0adb, B:596:0x0afd, B:598:0x0b03, B:602:0x0b0d, B:613:0x0b26, B:610:0x0b1f, B:612:0x0b23, B:590:0x0ae2, B:593:0x0af0, B:594:0x0af8, B:595:0x0af9, B:520:0x0997, B:522:0x099e, B:524:0x09a2, B:549:0x0a3c, B:551:0x0a48, B:527:0x09ac, B:529:0x09b0, B:531:0x09c2, B:533:0x09cd, B:535:0x09d7, B:539:0x09e0, B:541:0x09ea, B:547:0x09f5, B:552:0x0a55, B:554:0x0a5c, B:556:0x0a60, B:560:0x0a69, B:562:0x0a79, B:564:0x0a7f, B:566:0x0a89, B:567:0x0a8e, B:568:0x0a93, B:569:0x0a98, B:505:0x095a, B:421:0x0800, B:423:0x0804, B:425:0x080a, B:427:0x0810, B:429:0x081a, B:433:0x0821, B:435:0x0825, B:437:0x082d, B:439:0x083f, B:441:0x0848, B:443:0x0850, B:448:0x085c, B:450:0x0879, B:452:0x088b, B:454:0x0891, B:456:0x0896, B:457:0x089e, B:459:0x08a4, B:460:0x08a7, B:461:0x08b0, B:463:0x08b4, B:465:0x08ba, B:466:0x08bf, B:471:0x08ce, B:301:0x0617, B:311:0x0633, B:316:0x0644, B:320:0x0656, B:325:0x066c, B:330:0x06ab, B:332:0x06b2, B:334:0x06b6, B:338:0x06c6, B:340:0x06ca, B:344:0x06d1, B:346:0x06d7, B:348:0x06f4, B:351:0x06fd, B:353:0x0702, B:355:0x0709, B:356:0x0711, B:358:0x0717, B:336:0x06bc, B:360:0x0725, B:376:0x0755, B:378:0x075b, B:380:0x075f, B:383:0x0764, B:386:0x076d, B:388:0x0773, B:392:0x0781, B:394:0x0788), top: B:704:0x05a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07ae A[Catch: IOException -> 0x04d6, zzwn -> 0x04db, zzhs -> 0x04e0, zzat -> 0x04e5, zzui -> 0x04ea, RuntimeException -> 0x05a7, zzjm -> 0x05ac, LOOP:11: B:404:0x07aa->B:406:0x07ae, LOOP_END, TryCatch #9 {RuntimeException -> 0x05a7, blocks: (B:277:0x05a3, B:288:0x05c8, B:289:0x05d2, B:291:0x05e4, B:293:0x05f2, B:298:0x060c, B:396:0x078e, B:398:0x0794, B:400:0x079a, B:403:0x079f, B:404:0x07aa, B:406:0x07ae, B:410:0x07d3, B:412:0x07d9, B:414:0x07e1, B:415:0x07e9, B:416:0x07ec, B:418:0x07f5, B:472:0x08cf, B:477:0x08dc, B:479:0x08e4, B:482:0x08ee, B:484:0x08fc, B:485:0x0916, B:487:0x091a, B:489:0x0922, B:503:0x094f, B:490:0x0928, B:492:0x0933, B:496:0x093c, B:502:0x094c, B:506:0x0963, B:508:0x0969, B:512:0x0971, B:514:0x0979, B:516:0x097d, B:517:0x0988, B:519:0x098e, B:570:0x0a9b, B:573:0x0aa3, B:575:0x0aa7, B:577:0x0aaf, B:578:0x0ab2, B:579:0x0ab6, B:581:0x0abc, B:583:0x0ac5, B:585:0x0acf, B:587:0x0ad5, B:589:0x0adb, B:596:0x0afd, B:598:0x0b03, B:602:0x0b0d, B:613:0x0b26, B:610:0x0b1f, B:612:0x0b23, B:590:0x0ae2, B:593:0x0af0, B:594:0x0af8, B:595:0x0af9, B:520:0x0997, B:522:0x099e, B:524:0x09a2, B:549:0x0a3c, B:551:0x0a48, B:527:0x09ac, B:529:0x09b0, B:531:0x09c2, B:533:0x09cd, B:535:0x09d7, B:539:0x09e0, B:541:0x09ea, B:547:0x09f5, B:552:0x0a55, B:554:0x0a5c, B:556:0x0a60, B:560:0x0a69, B:562:0x0a79, B:564:0x0a7f, B:566:0x0a89, B:567:0x0a8e, B:568:0x0a93, B:569:0x0a98, B:505:0x095a, B:421:0x0800, B:423:0x0804, B:425:0x080a, B:427:0x0810, B:429:0x081a, B:433:0x0821, B:435:0x0825, B:437:0x082d, B:439:0x083f, B:441:0x0848, B:443:0x0850, B:448:0x085c, B:450:0x0879, B:452:0x088b, B:454:0x0891, B:456:0x0896, B:457:0x089e, B:459:0x08a4, B:460:0x08a7, B:461:0x08b0, B:463:0x08b4, B:465:0x08ba, B:466:0x08bf, B:471:0x08ce, B:301:0x0617, B:311:0x0633, B:316:0x0644, B:320:0x0656, B:325:0x066c, B:330:0x06ab, B:332:0x06b2, B:334:0x06b6, B:338:0x06c6, B:340:0x06ca, B:344:0x06d1, B:346:0x06d7, B:348:0x06f4, B:351:0x06fd, B:353:0x0702, B:355:0x0709, B:356:0x0711, B:358:0x0717, B:336:0x06bc, B:360:0x0725, B:376:0x0755, B:378:0x075b, B:380:0x075f, B:383:0x0764, B:386:0x076d, B:388:0x0773, B:392:0x0781, B:394:0x0788), top: B:704:0x05a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0896 A[Catch: IOException -> 0x04d6, zzwn -> 0x04db, zzhs -> 0x04e0, zzat -> 0x04e5, zzui -> 0x04ea, RuntimeException -> 0x05a7, zzjm -> 0x05ac, LOOP:14: B:455:0x0894->B:456:0x0896, LOOP_END, TryCatch #9 {RuntimeException -> 0x05a7, blocks: (B:277:0x05a3, B:288:0x05c8, B:289:0x05d2, B:291:0x05e4, B:293:0x05f2, B:298:0x060c, B:396:0x078e, B:398:0x0794, B:400:0x079a, B:403:0x079f, B:404:0x07aa, B:406:0x07ae, B:410:0x07d3, B:412:0x07d9, B:414:0x07e1, B:415:0x07e9, B:416:0x07ec, B:418:0x07f5, B:472:0x08cf, B:477:0x08dc, B:479:0x08e4, B:482:0x08ee, B:484:0x08fc, B:485:0x0916, B:487:0x091a, B:489:0x0922, B:503:0x094f, B:490:0x0928, B:492:0x0933, B:496:0x093c, B:502:0x094c, B:506:0x0963, B:508:0x0969, B:512:0x0971, B:514:0x0979, B:516:0x097d, B:517:0x0988, B:519:0x098e, B:570:0x0a9b, B:573:0x0aa3, B:575:0x0aa7, B:577:0x0aaf, B:578:0x0ab2, B:579:0x0ab6, B:581:0x0abc, B:583:0x0ac5, B:585:0x0acf, B:587:0x0ad5, B:589:0x0adb, B:596:0x0afd, B:598:0x0b03, B:602:0x0b0d, B:613:0x0b26, B:610:0x0b1f, B:612:0x0b23, B:590:0x0ae2, B:593:0x0af0, B:594:0x0af8, B:595:0x0af9, B:520:0x0997, B:522:0x099e, B:524:0x09a2, B:549:0x0a3c, B:551:0x0a48, B:527:0x09ac, B:529:0x09b0, B:531:0x09c2, B:533:0x09cd, B:535:0x09d7, B:539:0x09e0, B:541:0x09ea, B:547:0x09f5, B:552:0x0a55, B:554:0x0a5c, B:556:0x0a60, B:560:0x0a69, B:562:0x0a79, B:564:0x0a7f, B:566:0x0a89, B:567:0x0a8e, B:568:0x0a93, B:569:0x0a98, B:505:0x095a, B:421:0x0800, B:423:0x0804, B:425:0x080a, B:427:0x0810, B:429:0x081a, B:433:0x0821, B:435:0x0825, B:437:0x082d, B:439:0x083f, B:441:0x0848, B:443:0x0850, B:448:0x085c, B:450:0x0879, B:452:0x088b, B:454:0x0891, B:456:0x0896, B:457:0x089e, B:459:0x08a4, B:460:0x08a7, B:461:0x08b0, B:463:0x08b4, B:465:0x08ba, B:466:0x08bf, B:471:0x08ce, B:301:0x0617, B:311:0x0633, B:316:0x0644, B:320:0x0656, B:325:0x066c, B:330:0x06ab, B:332:0x06b2, B:334:0x06b6, B:338:0x06c6, B:340:0x06ca, B:344:0x06d1, B:346:0x06d7, B:348:0x06f4, B:351:0x06fd, B:353:0x0702, B:355:0x0709, B:356:0x0711, B:358:0x0717, B:336:0x06bc, B:360:0x0725, B:376:0x0755, B:378:0x075b, B:380:0x075f, B:383:0x0764, B:386:0x076d, B:388:0x0773, B:392:0x0781, B:394:0x0788), top: B:704:0x05a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x08a4 A[Catch: IOException -> 0x04d6, zzwn -> 0x04db, zzhs -> 0x04e0, zzat -> 0x04e5, zzui -> 0x04ea, RuntimeException -> 0x05a7, zzjm -> 0x05ac, TryCatch #9 {RuntimeException -> 0x05a7, blocks: (B:277:0x05a3, B:288:0x05c8, B:289:0x05d2, B:291:0x05e4, B:293:0x05f2, B:298:0x060c, B:396:0x078e, B:398:0x0794, B:400:0x079a, B:403:0x079f, B:404:0x07aa, B:406:0x07ae, B:410:0x07d3, B:412:0x07d9, B:414:0x07e1, B:415:0x07e9, B:416:0x07ec, B:418:0x07f5, B:472:0x08cf, B:477:0x08dc, B:479:0x08e4, B:482:0x08ee, B:484:0x08fc, B:485:0x0916, B:487:0x091a, B:489:0x0922, B:503:0x094f, B:490:0x0928, B:492:0x0933, B:496:0x093c, B:502:0x094c, B:506:0x0963, B:508:0x0969, B:512:0x0971, B:514:0x0979, B:516:0x097d, B:517:0x0988, B:519:0x098e, B:570:0x0a9b, B:573:0x0aa3, B:575:0x0aa7, B:577:0x0aaf, B:578:0x0ab2, B:579:0x0ab6, B:581:0x0abc, B:583:0x0ac5, B:585:0x0acf, B:587:0x0ad5, B:589:0x0adb, B:596:0x0afd, B:598:0x0b03, B:602:0x0b0d, B:613:0x0b26, B:610:0x0b1f, B:612:0x0b23, B:590:0x0ae2, B:593:0x0af0, B:594:0x0af8, B:595:0x0af9, B:520:0x0997, B:522:0x099e, B:524:0x09a2, B:549:0x0a3c, B:551:0x0a48, B:527:0x09ac, B:529:0x09b0, B:531:0x09c2, B:533:0x09cd, B:535:0x09d7, B:539:0x09e0, B:541:0x09ea, B:547:0x09f5, B:552:0x0a55, B:554:0x0a5c, B:556:0x0a60, B:560:0x0a69, B:562:0x0a79, B:564:0x0a7f, B:566:0x0a89, B:567:0x0a8e, B:568:0x0a93, B:569:0x0a98, B:505:0x095a, B:421:0x0800, B:423:0x0804, B:425:0x080a, B:427:0x0810, B:429:0x081a, B:433:0x0821, B:435:0x0825, B:437:0x082d, B:439:0x083f, B:441:0x0848, B:443:0x0850, B:448:0x085c, B:450:0x0879, B:452:0x088b, B:454:0x0891, B:456:0x0896, B:457:0x089e, B:459:0x08a4, B:460:0x08a7, B:461:0x08b0, B:463:0x08b4, B:465:0x08ba, B:466:0x08bf, B:471:0x08ce, B:301:0x0617, B:311:0x0633, B:316:0x0644, B:320:0x0656, B:325:0x066c, B:330:0x06ab, B:332:0x06b2, B:334:0x06b6, B:338:0x06c6, B:340:0x06ca, B:344:0x06d1, B:346:0x06d7, B:348:0x06f4, B:351:0x06fd, B:353:0x0702, B:355:0x0709, B:356:0x0711, B:358:0x0717, B:336:0x06bc, B:360:0x0725, B:376:0x0755, B:378:0x075b, B:380:0x075f, B:383:0x0764, B:386:0x076d, B:388:0x0773, B:392:0x0781, B:394:0x0788), top: B:704:0x05a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08b4 A[Catch: IOException -> 0x04d6, zzwn -> 0x04db, zzhs -> 0x04e0, zzat -> 0x04e5, zzui -> 0x04ea, RuntimeException -> 0x05a7, zzjm -> 0x05ac, TryCatch #9 {RuntimeException -> 0x05a7, blocks: (B:277:0x05a3, B:288:0x05c8, B:289:0x05d2, B:291:0x05e4, B:293:0x05f2, B:298:0x060c, B:396:0x078e, B:398:0x0794, B:400:0x079a, B:403:0x079f, B:404:0x07aa, B:406:0x07ae, B:410:0x07d3, B:412:0x07d9, B:414:0x07e1, B:415:0x07e9, B:416:0x07ec, B:418:0x07f5, B:472:0x08cf, B:477:0x08dc, B:479:0x08e4, B:482:0x08ee, B:484:0x08fc, B:485:0x0916, B:487:0x091a, B:489:0x0922, B:503:0x094f, B:490:0x0928, B:492:0x0933, B:496:0x093c, B:502:0x094c, B:506:0x0963, B:508:0x0969, B:512:0x0971, B:514:0x0979, B:516:0x097d, B:517:0x0988, B:519:0x098e, B:570:0x0a9b, B:573:0x0aa3, B:575:0x0aa7, B:577:0x0aaf, B:578:0x0ab2, B:579:0x0ab6, B:581:0x0abc, B:583:0x0ac5, B:585:0x0acf, B:587:0x0ad5, B:589:0x0adb, B:596:0x0afd, B:598:0x0b03, B:602:0x0b0d, B:613:0x0b26, B:610:0x0b1f, B:612:0x0b23, B:590:0x0ae2, B:593:0x0af0, B:594:0x0af8, B:595:0x0af9, B:520:0x0997, B:522:0x099e, B:524:0x09a2, B:549:0x0a3c, B:551:0x0a48, B:527:0x09ac, B:529:0x09b0, B:531:0x09c2, B:533:0x09cd, B:535:0x09d7, B:539:0x09e0, B:541:0x09ea, B:547:0x09f5, B:552:0x0a55, B:554:0x0a5c, B:556:0x0a60, B:560:0x0a69, B:562:0x0a79, B:564:0x0a7f, B:566:0x0a89, B:567:0x0a8e, B:568:0x0a93, B:569:0x0a98, B:505:0x095a, B:421:0x0800, B:423:0x0804, B:425:0x080a, B:427:0x0810, B:429:0x081a, B:433:0x0821, B:435:0x0825, B:437:0x082d, B:439:0x083f, B:441:0x0848, B:443:0x0850, B:448:0x085c, B:450:0x0879, B:452:0x088b, B:454:0x0891, B:456:0x0896, B:457:0x089e, B:459:0x08a4, B:460:0x08a7, B:461:0x08b0, B:463:0x08b4, B:465:0x08ba, B:466:0x08bf, B:471:0x08ce, B:301:0x0617, B:311:0x0633, B:316:0x0644, B:320:0x0656, B:325:0x066c, B:330:0x06ab, B:332:0x06b2, B:334:0x06b6, B:338:0x06c6, B:340:0x06ca, B:344:0x06d1, B:346:0x06d7, B:348:0x06f4, B:351:0x06fd, B:353:0x0702, B:355:0x0709, B:356:0x0711, B:358:0x0717, B:336:0x06bc, B:360:0x0725, B:376:0x0755, B:378:0x075b, B:380:0x075f, B:383:0x0764, B:386:0x076d, B:388:0x0773, B:392:0x0781, B:394:0x0788), top: B:704:0x05a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:743:0x07ce A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r41) {
        /*
            Method dump skipped, instructions count: 3320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f10) {
        this.zzh.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i5) {
        this.zzh.zze(33, i5, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzc(zzav zzavVar) {
        this.zzh.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzcS(long j8, long j10, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzh.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzh.zzc(29).zza();
    }

    public final void zze(boolean z2, int i5, int i10) {
        this.zzh.zze(1, z2 ? 1 : 0, (i10 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i5, long j8) {
        this.zzh.zzd(3, new zzlv(zzbfVar, i5, j8)).zza();
    }

    public final void zzg(zznj zznjVar) {
        this.zzh.zzd(38, zznjVar).zza();
    }

    public final void zzh() {
        this.zzh.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z2) {
        this.zzh.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f10) {
        this.zzh.zzd(32, Float.valueOf(f10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzk(zzmy zzmyVar) {
        if (!this.zzI && this.zzj.getThread().isAlive()) {
            this.zzh.zzd(14, zzmyVar).zza();
        } else {
            zzeh.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmyVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j8) {
        if (this.zzI || !this.zzj.getThread().isAlive()) {
            return true;
        }
        zzdt zzdtVar = new zzdt(this.zzp);
        this.zzh.zzd(30, new Pair(obj, zzdtVar)).zza();
        if (j8 != -9223372036854775807L) {
            return zzdtVar.zze(j8);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzj.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdt zzdtVar = new zzdt(this.zzp);
        this.zzh.zzd(7, zzdtVar).zza();
        return zzdtVar.zze(this.zzt);
    }

    public final Looper zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzo() {
        zzea zzeaVar = this.zzh;
        zzeaVar.zzk(2);
        zzeaVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        this.zzh.zzd(8, zzxjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq() {
        this.zzh.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        this.zzh.zzd(9, (zzxj) zzzfVar).zza();
    }

    public final /* synthetic */ zzme zzt(zzmf zzmfVar, long j8) {
        zzabm zzabmVarZze = this.zzg.zze(this.zzu);
        long j10 = this.zzZ.zzb;
        zzabj zzabjVar = this.zzf;
        zzmt zzmtVar = this.zzs;
        return new zzme(this.zzc, j8, this.zze, zzabmVarZze, zzmtVar, zzmfVar, zzabjVar, -9223372036854775807L);
    }

    public final /* synthetic */ void zzu(int i5, boolean z2) {
        this.zzw.zzB(i5, this.zzb[i5].zze(), z2);
    }

    public final /* synthetic */ void zzv(int i5) {
        this.zzw.zzW(i5);
    }

    public final /* synthetic */ zzea zzx() {
        return this.zzh;
    }

    public final void zzy(List list, int i5, long j8, zzzg zzzgVar) {
        this.zzh.zzd(17, new zzlq(list, zzzgVar, i5, j8, null)).zza();
    }
}
