package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzami implements zzaga {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private zzagd zzE;
    private zzamh[] zzF;
    private long[][] zzG;
    private int zzH;
    private final zzanq zzb;
    private final int zzc;
    private final zzeu zzd;
    private final zzeu zze;
    private final zzeu zzf;
    private final zzeu zzg;
    private final ArrayDeque zzh;
    private final zzamm zzi;
    private final List zzj;
    private final List zzk;
    private final List zzl;
    private zzgwt zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private zzeu zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private long zzz;

    @Deprecated
    public zzami() {
        this(zzanq.zza, 16);
    }

    public static /* synthetic */ long zzh(zzams zzamsVar, long j8, long j10) {
        int iZzl = zzl(zzamsVar, j8);
        return iZzl == -1 ? j10 : Math.min(zzamsVar.zzc[iZzl], j10);
    }

    private final void zzj() {
        this.zzn = 0;
        this.zzq = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(long r46) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzami.zzk(long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzams zzamsVar, long j8) {
        int iZza = zzamsVar.zza(j8);
        return iZza == -1 ? zzamsVar.zzb(j8) : iZza;
    }

    private static int zzm(int i5) {
        return i5 != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzahh zzahhVarZzb = zzamn.zzb(zzagbVar);
        this.zzm = zzahhVarZzb != null ? zzgwt.zzj(zzahhVarZzb) : zzgwt.zzi();
        return zzahhVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        if ((this.zzc & 16) == 0) {
            zzagdVar = new zzant(zzagdVar, this.zzb);
        }
        this.zzE = zzagdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x043d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagb r43, com.google.android.gms.internal.ads.zzaha r44) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzami.zzd(com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzaha):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        this.zzh.clear();
        this.zzq = 0;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzk.clear();
        this.zzl.clear();
        if (j8 == 0) {
            if (this.zzn != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzamh zzamhVar : this.zzF) {
            zzams zzamsVar = zzamhVar.zzb;
            int iZza = zzamsVar.zza(j10);
            if (iZza == -1) {
                iZza = zzamsVar.zzb(j10);
            }
            zzamhVar.zze = iZza;
            zzahn zzahnVar = zzamhVar.zzd;
            if (zzahnVar != null) {
                zzahnVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public zzami(zzanq zzanqVar, int i5) {
        this.zzb = zzanqVar;
        this.zzc = i5;
        this.zzm = zzgwt.zzi();
        this.zzn = (i5 & 4) != 0 ? 3 : 0;
        this.zzi = new zzamm();
        this.zzj = new ArrayList();
        this.zzg = new zzeu(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzeu(zzgr.zza);
        this.zze = new zzeu(6);
        this.zzf = new zzeu();
        this.zzs = -1;
        this.zzE = zzagd.zza;
        this.zzF = new zzamh[0];
        this.zzk = new ArrayList();
        this.zzl = new ArrayList();
    }
}
