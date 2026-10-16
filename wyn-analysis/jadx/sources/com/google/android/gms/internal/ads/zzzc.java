package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzzc implements zzahm {
    private zzv zzC;
    private boolean zzE;
    private final zzyx zza;
    private final zzuq zzd;
    private final zzul zze;
    private zzzb zzf;
    private zzv zzg;
    private zzuj zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzz;
    private final zzyy zzb = new zzyy();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzahl[] zzo = new zzahl[1000];
    private final zzzj zzc = new zzzj(zzyz.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private long zzw = Long.MIN_VALUE;
    private boolean zzB = true;
    private boolean zzA = true;
    private boolean zzD = true;
    private long zzu = Long.MIN_VALUE;
    private int zzx = -1;
    private int zzy = -1;

    public zzzc(zzabm zzabmVar, zzuq zzuqVar, zzul zzulVar) {
        this.zzd = zzuqVar;
        this.zze = zzulVar;
        this.zza = new zzyx(zzabmVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzC(zzly zzlyVar, zzix zzixVar, boolean z2, boolean z10, zzyy zzyyVar) {
        try {
            int i5 = this.zzq + this.zzs;
            int i10 = this.zzx;
            boolean z11 = false;
            if (i10 != -1 && i5 >= i10) {
                z11 = true;
            }
            if (!zzI() || zzJ() || z11) {
                if (!z10 && !this.zzz && !z11) {
                    zzv zzvVar = this.zzC;
                    if (zzvVar != null && (z2 || zzvVar != this.zzg)) {
                        zzK(zzvVar, zzlyVar);
                        return -5;
                    }
                }
                zzixVar.zzg(4);
                zzixVar.zzd = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzza) this.zzc.zza(i5)).zza;
            if (!z2 && zzvVar2 == this.zzg) {
                int iZzO = zzO(this.zzs);
                if (zzL(iZzO)) {
                    zzixVar.zzg(this.zzm[iZzO]);
                    if (this.zzs == this.zzp - 1 && (z10 || this.zzz)) {
                        zzixVar.zzh(536870912);
                    }
                    zzixVar.zzd = this.zzn[iZzO];
                    zzyyVar.zza = this.zzl[iZzO];
                    zzyyVar.zzb = this.zzk[iZzO];
                    zzyyVar.zzc = this.zzo[iZzO];
                    return -4;
                }
            }
            zzK(zzvVar2, zzlyVar);
            return -5;
            return -3;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzD(zzv zzvVar) {
        try {
            this.zzB = false;
            if (Objects.equals(zzvVar, this.zzC)) {
                return false;
            }
            zzzj zzzjVar = this.zzc;
            if (zzzjVar.zzf() || !((zzza) zzzjVar.zzc()).zza.equals(zzvVar)) {
                this.zzC = zzvVar;
            } else {
                this.zzC = ((zzza) zzzjVar.zzc()).zza;
            }
            boolean z2 = this.zzD;
            zzv zzvVar2 = this.zzC;
            String str = zzvVar2.zzp;
            this.zzD = z2 & (zzas.zzf(str) == 1 && zzas.zzd(str, zzvVar2.zzk));
            this.zzE = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized long zzE(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzp     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzn     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzr     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzs     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzM(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzN(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzc.zzE(long, boolean, boolean):long");
    }

    private final synchronized long zzF() {
        int i5 = this.zzp;
        if (i5 == 0) {
            return -1L;
        }
        return zzN(i5);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j8, int i5, long j10, int i10, zzahl zzahlVar) {
        int i11;
        try {
            int i12 = this.zzp;
            if (i12 > 0) {
                int iZzO = zzO(i12 - 1);
                zzgtr.zza(this.zzk[iZzO] + ((long) this.zzl[iZzO]) <= j10);
            }
            int i13 = 536870912 & i5;
            this.zzz = i13 != 0;
            this.zzw = Math.max(this.zzw, j8);
            int i14 = this.zzq;
            int i15 = this.zzp;
            int i16 = i14 + i15;
            long j11 = this.zzu;
            if (j11 != Long.MIN_VALUE && this.zzx == -1) {
                if (j8 >= j11) {
                    int i17 = this.zzy;
                    if (i17 == -1) {
                        this.zzy = i16;
                        i17 = i16;
                    }
                    int i18 = (i16 - i17) + 1;
                    int i19 = i5 & 1;
                    zzv zzvVar = this.zzC;
                    int i20 = 16;
                    if (zzvVar != null && (i11 = zzvVar.zzr) != -1) {
                        i20 = i11;
                    }
                    if (i18 >= i20 + 1 || i19 != 0 || i13 != 0) {
                        this.zzx = i17;
                        this.zzy = -1;
                    }
                } else {
                    this.zzy = -1;
                }
            }
            int iZzO2 = zzO(i15);
            this.zzn[iZzO2] = j8;
            this.zzk[iZzO2] = j10;
            this.zzl[iZzO2] = i10;
            this.zzm[iZzO2] = i5;
            this.zzo[iZzO2] = zzahlVar;
            this.zzj[iZzO2] = 0;
            zzzj zzzjVar = this.zzc;
            if (zzzjVar.zzf() || !((zzza) zzzjVar.zzc()).zza.equals(this.zzC)) {
                zzv zzvVar2 = this.zzC;
                if (zzvVar2 == null) {
                    throw null;
                }
                zzzjVar.zzb(this.zzq + this.zzp, new zzza(zzvVar2, zzup.zzb, null));
            }
            int i21 = this.zzp + 1;
            this.zzp = i21;
            int i22 = this.zzi;
            if (i21 == i22) {
                int i23 = i22 + 1000;
                long[] jArr = new long[i23];
                long[] jArr2 = new long[i23];
                long[] jArr3 = new long[i23];
                int[] iArr = new int[i23];
                int[] iArr2 = new int[i23];
                zzahl[] zzahlVarArr = new zzahl[i23];
                int i24 = this.zzr;
                int i25 = i22 - i24;
                System.arraycopy(this.zzk, i24, jArr2, 0, i25);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i25);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i25);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i25);
                System.arraycopy(this.zzo, this.zzr, zzahlVarArr, 0, i25);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i25);
                int i26 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i25, i26);
                System.arraycopy(this.zzn, 0, jArr3, i25, i26);
                System.arraycopy(this.zzm, 0, iArr, i25, i26);
                System.arraycopy(this.zzl, 0, iArr2, i25, i26);
                System.arraycopy(this.zzo, 0, zzahlVarArr, i25, i26);
                System.arraycopy(this.zzj, 0, jArr, i25, i26);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzahlVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i23;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final boolean zzJ() {
        int i5;
        return this.zzx == -1 && (i5 = this.zzy) != -1 && this.zzq + this.zzs >= i5;
    }

    private final void zzK(zzv zzvVar, zzly zzlyVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzt;
        zzuq zzuqVar = this.zzd;
        zzlyVar.zzb = zzvVar.zzb(zzuqVar.zzb(zzvVar));
        zzlyVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzuj zzujVarZza = zzuqVar.zza(this.zze, zzvVar);
            this.zzh = zzujVarZza;
            zzlyVar.zza = zzujVarZza;
        }
    }

    private final boolean zzL(int i5) {
        if (this.zzh == null) {
            return true;
        }
        int i10 = this.zzm[i5];
        return false;
    }

    private final int zzM(int i5, int i10, long j8, boolean z2) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.zzn[i5];
            if (j10 > j8) {
                break;
            }
            if (!z2 || (this.zzm[i5] & 1) != 0) {
                if (j10 == j8) {
                    return i12;
                }
                i11 = i12;
            }
            i5++;
            if (i5 == this.zzi) {
                i5 = 0;
            }
        }
        return i11;
    }

    private final long zzN(int i5) {
        long j8 = this.zzv;
        long jMax = Long.MIN_VALUE;
        if (i5 != 0) {
            int iZzO = zzO(i5 - 1);
            for (int i10 = 0; i10 < i5; i10++) {
                jMax = Math.max(jMax, this.zzn[iZzO]);
                if ((this.zzm[iZzO] & 1) != 0) {
                    break;
                }
                iZzO--;
                if (iZzO == -1) {
                    iZzO = this.zzi - 1;
                }
            }
        }
        this.zzv = Math.max(j8, jMax);
        this.zzp -= i5;
        int i11 = this.zzq + i5;
        this.zzq = i11;
        int i12 = this.zzr + i5;
        this.zzr = i12;
        int i13 = this.zzi;
        if (i12 >= i13) {
            this.zzr = i12 - i13;
        }
        int i14 = this.zzs - i5;
        this.zzs = i14;
        if (i14 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i11);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i15 = this.zzr;
        if (i15 == 0) {
            i15 = this.zzi;
        }
        return this.zzk[i15 - 1] + this.zzl[r12];
    }

    private final int zzO(int i5) {
        int i10 = this.zzr + i5;
        int i11 = this.zzi;
        return i10 < i11 ? i10 : i10 - i11;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzA(zzv zzvVar) {
        boolean zZzD = zzD(zzvVar);
        zzzb zzzbVar = this.zzf;
        if (zzzbVar == null || !zZzD) {
            return;
        }
        zzzbVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ void zzP(long j8) {
        AbstractC1745i.a(this, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ int zza(zzj zzjVar, int i5, boolean z2) {
        return AbstractC1745i.b(this, zzjVar, i5, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i5, boolean z2, int i10) throws IOException {
        return this.zza.zzg(zzjVar, i5, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ void zzc(zzeu zzeuVar, int i5) {
        AbstractC1745i.c(this, zzeuVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i5, int i10) {
        this.zza.zzh(zzeuVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zze(long j8, int i5, int i10, int i11, zzahl zzahlVar) {
        if (this.zzA) {
            if ((i5 & 1) == 0) {
                return;
            } else {
                this.zzA = false;
            }
        }
        if (this.zzD) {
            if (j8 < this.zzt) {
                return;
            }
            if ((i5 & 1) == 0) {
                if (!this.zzE) {
                    zzeh.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzC)));
                    this.zzE = true;
                }
                i5 |= 1;
            }
        }
        zzH(j8, i5, (this.zza.zzf() - i10) - i11, i10, zzahlVar);
    }

    public final void zzf() {
        zzg(true);
        zzG();
    }

    public final void zzg(boolean z2) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = -1;
        this.zzy = -1;
        this.zzA = true;
        this.zzt = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = Long.MIN_VALUE;
        this.zzz = false;
        this.zzc.zze();
        if (z2) {
            this.zzC = null;
            this.zzB = true;
            this.zzD = true;
        }
    }

    public final void zzh(long j8) {
        this.zzt = j8;
    }

    public final synchronized void zzi(long j8) {
        if (this.zzu == Long.MIN_VALUE) {
            return;
        }
        this.zzu = Long.MIN_VALUE;
        this.zzx = -1;
        this.zzy = -1;
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzy();
        zzG();
    }

    public final void zzl() throws IOException {
        zzuj zzujVar = this.zzh;
        if (zzujVar != null) {
            throw zzujVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzo() {
        if (this.zzB) {
            return null;
        }
        return this.zzC;
    }

    public final synchronized long zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq() {
        return this.zzz;
    }

    public final synchronized boolean zzr(boolean z2) {
        int i5 = this.zzq + this.zzs;
        int i10 = this.zzx;
        boolean z10 = true;
        if (i10 != -1 && i5 >= i10) {
            return true;
        }
        if (zzI() && !zzJ()) {
            if (((zzza) this.zzc.zza(i5)).zza != this.zzg) {
                return true;
            }
            return zzL(zzO(this.zzs));
        }
        if (!z2 && !this.zzz) {
            zzv zzvVar = this.zzC;
            if (zzvVar == null) {
                z10 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z10;
    }

    public final int zzs(zzly zzlyVar, zzix zzixVar, int i5, boolean z2) {
        boolean z10 = (i5 & 2) != 0;
        zzyy zzyyVar = this.zzb;
        int iZzC = zzC(zzlyVar, zzixVar, z10, z2, zzyyVar);
        if (iZzC != -4) {
            return iZzC;
        }
        if (!zzixVar.zzb()) {
            int i10 = i5 & 1;
            if ((i5 & 4) == 0) {
                if (i10 != 0) {
                    this.zza.zzd(zzixVar, zzyyVar);
                    return -4;
                }
                this.zza.zzc(zzixVar, zzyyVar);
            } else if (i10 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzt(int i5) {
        int i10;
        int i11;
        zzB();
        int i12 = this.zzq;
        if (i5 >= i12 && i5 <= this.zzp + i12 && (((i10 = this.zzx) == -1 || i5 < i10) && ((i11 = this.zzy) == -1 || i5 < i11))) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i5 - i12;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzu(long j8, boolean z2) throws Throwable {
        Throwable th;
        long jMin;
        zzzc zzzcVar;
        long j10;
        int iZzM;
        try {
            try {
                zzB();
                int iZzO = zzO(this.zzs);
                long j11 = this.zzu;
                if (j11 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(this.zzw, j11);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    jMin = this.zzw;
                }
                if (zzI() && j8 >= this.zzn[iZzO]) {
                    if (j8 > jMin) {
                        if (z2) {
                            z2 = true;
                        }
                    }
                    if (this.zzD) {
                        iZzM = this.zzp - this.zzs;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iZzM) {
                                zzzcVar = this;
                                j10 = j8;
                                if (!z2) {
                                    iZzM = -1;
                                }
                            } else {
                                if (this.zzn[iZzO] >= j8) {
                                    j10 = j8;
                                    iZzM = i5;
                                    zzzcVar = this;
                                    break;
                                }
                                iZzO++;
                                if (iZzO == this.zzi) {
                                    iZzO = 0;
                                }
                                i5++;
                            }
                        }
                    } else {
                        zzzcVar = this;
                        j10 = j8;
                        iZzM = zzzcVar.zzM(iZzO, this.zzp - this.zzs, j10, true);
                    }
                    if (iZzM != -1) {
                        zzzcVar.zzt = j10;
                        zzzcVar.zzs += iZzM;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int zzv(long j8, boolean z2) {
        Throwable th;
        try {
            try {
                int i5 = this.zzs;
                int iZzO = zzO(i5);
                if (!zzI() || j8 < this.zzn[iZzO]) {
                    return 0;
                }
                if (j8 <= this.zzw || !z2) {
                    int iZzM = zzM(iZzO, this.zzp - i5, j8, true);
                    if (iZzM == -1) {
                        return 0;
                    }
                    return iZzM;
                }
                try {
                    return this.zzp - i5;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void zzw(int i5) {
        boolean z2 = false;
        if (i5 >= 0) {
            try {
                if (this.zzs + i5 <= this.zzp) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgtr.zza(z2);
        this.zzs += i5;
    }

    public final void zzx(long j8, boolean z2, boolean z10) {
        this.zza.zze(zzE(j8, false, z10));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(zzzb zzzbVar) {
        this.zzf = zzzbVar;
    }
}
