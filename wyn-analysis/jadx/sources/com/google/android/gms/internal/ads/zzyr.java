package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzyr implements zzxj, zzagd, zzabx, zzacc, zzzb {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyq zzB;
    private zzahd zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhr zze;
    private final zzuq zzf;
    private final zzxv zzg;
    private final zzul zzh;
    private final zzyj zzi;
    private final zzabm zzj;
    private final long zzk;
    private final long zzl;
    private final zzye zzn;
    private zzxi zzs;
    private zzajh zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzacf zzm = new zzacf("ProgressiveMediaPeriod");
    private final zzdt zzo = new zzdt(zzdp.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfm.zzd(null);
    private zzyp[] zzw = new zzyp[0];
    private zzzc[] zzv = new zzzc[0];
    private zzyh[] zzu = new zzyh[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zzb = DesugarCollections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzP();
    }

    public zzyr(Uri uri, zzhr zzhrVar, zzye zzyeVar, zzuq zzuqVar, zzul zzulVar, zzabw zzabwVar, zzxv zzxvVar, zzyj zzyjVar, zzabm zzabmVar, String str, int i5, boolean z2, int i10, zzv zzvVar, long j8, zzacl zzaclVar) {
        this.zzd = uri;
        this.zze = zzhrVar;
        this.zzf = zzuqVar;
        this.zzh = zzulVar;
        this.zzg = zzxvVar;
        this.zzi = zzyjVar;
        this.zzj = zzabmVar;
        this.zzk = i5;
        this.zzn = zzyeVar;
        this.zzl = j8;
    }

    private final void zzR(int i5) {
        zzaa();
        zzyq zzyqVar = this.zzB;
        boolean[] zArr = zzyqVar.zzd;
        if (zArr[i5]) {
            return;
        }
        zzv zzvVarZza = zzyqVar.zza.zza(i5).zza(0);
        this.zzg.zzh(new zzxh(1, zzas.zzf(zzvVarZza.zzp), zzvVarZza, 0, null, zzfm.zzs(this.zzL), -9223372036854775807L));
        zArr[i5] = true;
    }

    private final void zzS(int i5) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i5]) && !this.zzv[i5].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzzc zzzcVar : this.zzv) {
                    zzzcVar.zzg(false);
                }
                zzxi zzxiVar = this.zzs;
                zzxiVar.getClass();
                zzxiVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzahm zzU(zzyp zzypVar) {
        int length = this.zzv.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (zzypVar.equals(this.zzw[i5])) {
                return this.zzv[i5];
            }
        }
        if (this.zzx) {
            int i10 = zzypVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i10);
            sb2.append(") after finishing tracks.");
            zzeh.zzc("ProgressiveMediaPeriod", sb2.toString());
            return new zzafx();
        }
        zzzc zzzcVar = new zzzc(this.zzj, this.zzf, this.zzh);
        zzyh zzyhVar = new zzyh(zzzcVar);
        zzzcVar.zzz(this);
        int i11 = length + 1;
        zzyp[] zzypVarArr = (zzyp[]) Arrays.copyOf(this.zzw, i11);
        zzypVarArr[length] = zzypVar;
        String str = zzfm.zza;
        this.zzw = zzypVarArr;
        zzzc[] zzzcVarArr = (zzzc[]) Arrays.copyOf(this.zzv, i11);
        zzzcVarArr[length] = zzzcVar;
        this.zzv = zzzcVarArr;
        zzyh[] zzyhVarArr = (zzyh[]) Arrays.copyOf(this.zzu, i11);
        zzyhVarArr[length] = zzyhVar;
        this.zzu = zzyhVarArr;
        return zzyhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i5;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzzc zzzcVar : this.zzv) {
            if (zzzcVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            zzv zzvVarZzo = this.zzv[i12].zzo();
            zzvVarZzo.getClass();
            int iZzf = zzas.zzf(zzvVarZzo.zzp);
            int iZzab = zzab(iZzf);
            int iZzab2 = zzab(i11);
            if (iZzab > iZzab2) {
                i11 = iZzf;
            }
            if (iZzab > iZzab2) {
                i10 = i12;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i13 = 0; i13 < length; i13++) {
            zzv zzvVarZzo2 = this.zzv[i13].zzo();
            zzvVarZzo2.getClass();
            String str = zzvVarZzo2.zzp;
            boolean zZza = zzas.zza(str);
            boolean z2 = zZza || zzas.zzb(str);
            zArr[i13] = z2;
            this.zzz = z2 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzajh zzajhVar = this.zzt;
            if (zzajhVar != null) {
                if (zZza || this.zzw[i13].zzb) {
                    zzap zzapVar = zzvVarZzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzajhVar) : zzapVar.zzg(zzajhVar);
                    zzt zztVarZza = zzvVarZzo2.zza();
                    zztVarZza.zzl(zzapVar2);
                    zzvVarZzo2 = zztVarZza.zzP();
                }
                if (zZza && zzvVarZzo2.zzh == -1 && zzvVarZzo2.zzi == -1 && (i5 = zzajhVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzo2.zza();
                    zztVarZza2.zzi(i5);
                    zzvVarZzo2 = zztVarZza2.zzP();
                }
            }
            zzv zzvVarZzb = zzvVarZzo2.zzb(this.zzf.zzb(zzvVarZzo2));
            if (i13 != i10) {
                zzt zztVarZza3 = zzvVarZzb.zza();
                zztVarZza3.zzm(Integer.toString(i10));
                zzvVarZzb = zztVarZza3.zzP();
            }
            zzbgVarArr[i13] = new zzbg(Integer.toString(i13), zzvVarZzb);
            this.zzI = zzvVarZzb.zzv | this.zzI;
            this.zzv[i13].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyq(new zzzo(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzyf(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzxi zzxiVar = this.zzs;
        zzxiVar.getClass();
        zzxiVar.zzp(this);
    }

    private final void zzW() {
        zzyi zzyiVar = new zzyi(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgtr.zzi(zzZ());
            long j8 = this.zzD;
            if (j8 != -9223372036854775807L && this.zzM > j8) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzahd zzahdVar = this.zzC;
            zzahdVar.getClass();
            zzyiVar.zzd(zzahdVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzzc zzzcVar : this.zzv) {
                zzzcVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzyiVar, this, zzabw.zza(this.zzF));
    }

    private final int zzX() {
        int iZzj = 0;
        for (zzzc zzzcVar : this.zzv) {
            iZzj += zzzcVar.zzj();
        }
        return iZzj;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzY(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzzc[] r3 = r5.zzv
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzyq r4 = r5.zzB
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzp()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyr.zzY(boolean):long");
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    private final void zzaa() {
        zzgtr.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i5) {
        if (i5 == 1) {
            return 3;
        }
        if (i5 == 2) {
            return 4;
        }
        if (i5 != 3) {
            return i5 != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ void zzA(zzacb zzacbVar, long j8, long j10, boolean z2) {
        zzyi zzyiVar = (zzyi) zzacbVar;
        zzio zzioVarZzf = zzyiVar.zzf();
        zzxc zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j8, j10, zzioVarZzf.zzf());
        zzyiVar.zze();
        this.zzg.zzf(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)));
        if (z2) {
            return;
        }
        for (zzzc zzzcVar : this.zzv) {
            zzzcVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzxi zzxiVar = this.zzs;
            zzxiVar.getClass();
            zzxiVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ void zzB(zzacb zzacbVar, long j8, long j10) {
        zzyi zzyiVar = (zzyi) zzacbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j11 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j11;
            this.zzi.zzb(j11, this.zzC, this.zzE);
        }
        zzio zzioVarZzf = zzyiVar.zzf();
        zzxc zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j8, j10, zzioVarZzf.zzf());
        zzyiVar.zze();
        this.zzg.zze(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)));
        this.zzP = true;
        zzxi zzxiVar = this.zzs;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ void zzC(zzacb zzacbVar, long j8, long j10, int i5) {
        zzxc zzxcVar;
        zzyi zzyiVar = (zzyi) zzacbVar;
        zzio zzioVarZzf = zzyiVar.zzf();
        if (i5 == 0) {
            long jZze = zzyiVar.zze();
            zzhv zzhvVarZzh = zzyiVar.zzh();
            zzxcVar = new zzxc(jZze, zzhvVarZzh, zzhvVarZzh.zza, Collections.EMPTY_MAP, j8, 0L, 0L);
        } else {
            zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j8, j10, zzioVarZzf.zzf());
        }
        this.zzg.zzd(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)), i5);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzxi zzxiVar = this.zzs;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    public final /* synthetic */ void zzF(zzahd zzahdVar) {
        this.zzC = this.zzt == null ? zzahdVar : new zzahc(-9223372036854775807L, 0L);
        this.zzD = zzahdVar.zza();
        boolean z2 = false;
        if (!this.zzK && zzahdVar.zza() == -9223372036854775807L) {
            z2 = true;
        }
        this.zzE = z2;
        this.zzF = true == z2 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzahdVar, z2);
        } else {
            zzD();
        }
    }

    public final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    public final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzym
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    public final /* synthetic */ long zzI(boolean z2) {
        return zzY(true);
    }

    public final /* synthetic */ long zzL() {
        return this.zzk;
    }

    public final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    public final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    public final /* synthetic */ zzajh zzO() {
        return this.zzt;
    }

    public final /* synthetic */ void zzP(zzajh zzajhVar) {
        this.zzt = zzajhVar;
    }

    public final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzzc zzzcVar : this.zzv) {
                zzzcVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i5 = 0; i5 < length; i5++) {
                zzyq zzyqVar = this.zzB;
                if (zzyqVar.zzb[i5] && zzyqVar.zzc[i5] && !this.zzv[i5].zzq()) {
                    jZzY = Math.min(jZzY, this.zzv[i5].zzp());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzL : jZzY;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        if (this.zzP) {
            return false;
        }
        zzacf zzacfVar = this.zzm;
        if (zzacfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzacfVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void zzg() {
        for (zzzc zzzcVar : this.zzv) {
            zzzcVar.zzf();
        }
        this.zzn.zzb();
    }

    public final boolean zzh(int i5) {
        return !zzT() && this.zzv[i5].zzr(this.zzP);
    }

    public final void zzi(int i5) throws IOException {
        this.zzv[i5].zzl();
        zzj();
    }

    public final void zzj() throws IOException {
        this.zzm.zzh(zzabw.zza(this.zzF));
    }

    public final int zzk(int i5, zzly zzlyVar, zzix zzixVar, int i10) {
        if (zzT()) {
            return -3;
        }
        zzR(i5);
        int iZzs = this.zzv[i5].zzs(zzlyVar, zzixVar, i10, this.zzP);
        if (iZzs == -3) {
            zzS(i5);
        }
        return iZzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j8) {
        this.zzs = zzxiVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        zzj();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j8) {
        zzabb zzabbVar;
        zzaa();
        zzyq zzyqVar = this.zzB;
        zzzo zzzoVar = zzyqVar.zza;
        boolean[] zArr3 = zzyqVar.zzc;
        int i5 = this.zzJ;
        int i10 = 0;
        for (int i11 = 0; i11 < zzabbVarArr.length; i11++) {
            zzzd zzzdVar = zzzdVarArr[i11];
            if (zzzdVar != null && (zzabbVarArr[i11] == null || !zArr[i11])) {
                int iZze = ((zzyo) zzzdVar).zze();
                zzgtr.zzi(zArr3[iZze]);
                this.zzJ--;
                zArr3[iZze] = false;
                zzzdVarArr[i11] = null;
            }
        }
        boolean z2 = !this.zzG ? j8 == 0 || this.zzA : i5 != 0;
        for (int i12 = 0; i12 < zzabbVarArr.length; i12++) {
            if (zzzdVarArr[i12] == null && (zzabbVar = zzabbVarArr[i12]) != null) {
                zzgtr.zzi(zzabbVar.zze() == 1);
                zzgtr.zzi(zzabbVar.zzf(0) == 0);
                int iZzb = zzzoVar.zzb(zzabbVar.zza());
                zzgtr.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzabbVar.zzc().zzv | this.zzI;
                zzzdVarArr[i12] = new zzyo(this, iZzb);
                zArr2[i12] = true;
                if (!z2) {
                    zzzc zzzcVar = this.zzv[iZzb];
                    z2 = (zzzcVar.zzn() == 0 || zzzcVar.zzu(j8, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzacf zzacfVar = this.zzm;
            if (zzacfVar.zze()) {
                zzzc[] zzzcVarArr = this.zzv;
                int length = zzzcVarArr.length;
                while (i10 < length) {
                    zzzcVarArr[i10].zzy();
                    i10++;
                }
                zzacfVar.zzf();
            } else {
                this.zzP = false;
                for (zzzc zzzcVar2 : this.zzv) {
                    zzzcVar2.zzg(false);
                }
            }
        } else if (z2) {
            j8 = zzt(j8);
            while (i10 < zzzdVarArr.length) {
                if (zzzdVarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.zzG = true;
        return j8;
    }

    public final int zzp(int i5, long j8) {
        if (zzT()) {
            return 0;
        }
        zzR(i5);
        zzzc zzzcVar = this.zzv[i5];
        int iZzv = zzzcVar.zzv(j8, this.zzP);
        zzzcVar.zzw(iZzv);
        if (iZzv != 0) {
            return iZzv;
        }
        zzS(i5);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j8, boolean z2) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.zzv[i5].zzx(j8, false, zArr[i5]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final zzahm zzs(int i5, int i10) {
        return zzU(new zzyp(i5, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzt(long r9) {
        /*
            r8 = this;
            r8.zzaa()
            com.google.android.gms.internal.ads.zzyq r0 = r8.zzB
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzahd r1 = r8.zzC
            boolean r1 = r1.zzb()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.zzH = r1
            long r2 = r8.zzL
            r8.zzL = r9
            boolean r4 = r8.zzZ()
            if (r4 == 0) goto L22
            r8.zzM = r9
            return r9
        L22:
            int r4 = r8.zzF
            r5 = 7
            if (r4 == r5) goto L73
            boolean r4 = r8.zzP
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.zzacf r4 = r8.zzm
            boolean r4 = r4.zze()
            if (r4 == 0) goto L73
        L33:
            com.google.android.gms.internal.ads.zzzc[] r4 = r8.zzv
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto La5
            com.google.android.gms.internal.ads.zzzc[] r6 = r8.zzv
            r6 = r6[r5]
            com.google.android.gms.internal.ads.zzyh[] r7 = r8.zzu
            r7 = r7[r5]
            boolean r7 = r7.zzf()
            if (r7 != 0) goto L48
            goto L70
        L48:
            int r7 = r6.zzn()
            if (r7 != 0) goto L52
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L70
        L52:
            boolean r7 = r8.zzA
            if (r7 == 0) goto L5f
            int r7 = r6.zzm()
            boolean r6 = r6.zzt(r7)
            goto L65
        L5f:
            boolean r7 = r8.zzP
            boolean r6 = r6.zzu(r9, r7)
        L65:
            if (r6 != 0) goto L70
            boolean r6 = r0[r5]
            if (r6 != 0) goto L73
            boolean r6 = r8.zzz
            if (r6 != 0) goto L70
            goto L73
        L70:
            int r5 = r5 + 1
            goto L37
        L73:
            r8.zzN = r1
            r8.zzM = r9
            r8.zzP = r1
            r8.zzI = r1
            com.google.android.gms.internal.ads.zzacf r0 = r8.zzm
            boolean r2 = r0.zze()
            if (r2 == 0) goto L94
            com.google.android.gms.internal.ads.zzzc[] r2 = r8.zzv
            int r3 = r2.length
        L86:
            if (r1 >= r3) goto L90
            r4 = r2[r1]
            r4.zzy()
            int r1 = r1 + 1
            goto L86
        L90:
            r0.zzf()
            return r9
        L94:
            r0.zzc()
            com.google.android.gms.internal.ads.zzzc[] r0 = r8.zzv
            int r2 = r0.length
            r3 = r1
        L9b:
            if (r3 >= r2) goto La5
            r4 = r0[r3]
            r4.zzg(r1)
            int r3 = r3 + 1
            goto L9b
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyr.zzt(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzu(long r13, com.google.android.gms.internal.ads.zznk r15) {
        /*
            r12 = this;
            r12.zzaa()
            com.google.android.gms.internal.ads.zzahd r0 = r12.zzC
            boolean r0 = r0.zzb()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            com.google.android.gms.internal.ads.zzahd r0 = r12.zzC
            com.google.android.gms.internal.ads.zzahb r0 = r0.zzc(r13)
            com.google.android.gms.internal.ads.zzahe r3 = r0.zza
            com.google.android.gms.internal.ads.zzahe r0 = r0.zzb
            long r4 = r15.zzd
            int r15 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r15 != 0) goto L1f
            return r13
        L1f:
            java.lang.String r15 = com.google.android.gms.internal.ads.zzfm.zza
            long r6 = r13 - r4
            long r4 = r4 ^ r13
            long r8 = r13 ^ r6
            int r15 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r15 < 0) goto L2e
            r15 = r8
            goto L2f
        L2e:
            r15 = r9
        L2f:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L35
            r1 = r8
            goto L36
        L35:
            r1 = r9
        L36:
            r15 = r15 | r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r15 == 0) goto L40
            r4 = r6
            goto L48
        L40:
            r15 = 63
            long r4 = r6 >>> r15
            r10 = 1
            long r4 = r4 ^ r10
            long r4 = r4 + r1
        L48:
            r10 = -9223372036854775808
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 != 0) goto L56
            int r15 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r15 != 0) goto L54
            r6 = r10
            goto L56
        L54:
            r4 = r10
            goto L60
        L56:
            int r15 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r15 != 0) goto L60
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 == 0) goto L5f
            goto L54
        L5f:
            r4 = r1
        L60:
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 != 0) goto L67
            if (r15 != 0) goto L70
            goto L68
        L67:
            r10 = r13
        L68:
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 != 0) goto L6f
            int r15 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            goto L70
        L6f:
            r1 = r13
        L70:
            long r6 = r3.zzb
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 > 0) goto L7c
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 > 0) goto L7c
            r15 = r8
            goto L7d
        L7c:
            r15 = r9
        L7d:
            long r10 = r0.zzb
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L88
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L88
            goto L89
        L88:
            r8 = r9
        L89:
            if (r15 == 0) goto L9e
            if (r8 == 0) goto L9e
            long r0 = r6 - r13
            long r13 = r10 - r13
            long r0 = java.lang.Math.abs(r0)
            long r13 = java.lang.Math.abs(r13)
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 > 0) goto La3
            goto La0
        L9e:
            if (r15 == 0) goto La1
        La0:
            return r6
        La1:
            if (r8 == 0) goto La4
        La3:
            return r10
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyr.zzu(long, com.google.android.gms.internal.ads.zznk):long");
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzw(final zzahd zzahdVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzahdVar);
            }
        });
    }

    public final zzahm zzx() {
        return zzU(new zzyp(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ zzabz zzz(zzacb zzacbVar, long j8, long j10, IOException iOException, int i5) {
        long jMin;
        zzabz zzabzVarZza;
        zzahd zzahdVar;
        zzyi zzyiVar = (zzyi) zzacbVar;
        zzio zzioVarZzf = zzyiVar.zzf();
        zzxc zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j8, j10, zzioVarZzf.zzf());
        zzyiVar.zzg();
        String str = zzfm.zza;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzif) || (cause instanceof zzace) || ((cause instanceof zzhs) && ((zzhs) cause).zza == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i5 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzabzVarZza = zzacf.zzb;
        } else {
            int iZzX = zzX();
            boolean z2 = iZzX > this.zzO;
            if (this.zzK || !((zzahdVar = this.zzC) == null || zzahdVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z10 = this.zzy;
                if (!z10 || zzT()) {
                    this.zzH = z10;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzzc zzzcVar : this.zzv) {
                        zzzcVar.zzg(false);
                    }
                    zzyiVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzabzVarZza = zzacf.zza;
                }
            }
            zzabzVarZza = zzacf.zza(z2, jMin);
        }
        boolean zZza = zzabzVarZza.zza();
        this.zzg.zzg(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)), iOException, true ^ zZza);
        if (!zZza) {
            zzyiVar.zze();
        }
        return zzabzVarZza;
    }
}
