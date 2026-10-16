package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzark implements zzaga {
    private final int zza;
    private final List zzb;
    private final zzeu zzc;
    private final SparseIntArray zzd;
    private final zzarn zze;
    private final zzanq zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzarg zzj;
    private zzarf zzk;
    private zzagd zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzark() {
        this(1, 1, zzanq.zza, new zzfj(0L), new zzapx(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzagb r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzeu r0 = r6.zzc
            byte[] r0 = r0.zzi()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzi(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.zzf(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzark.zza(com.google.android.gms.internal.ads.zzagb):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return AbstractC1742f.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        if (this.zza == 0) {
            zzagdVar = new zzant(zzagdVar, this.zzf);
        }
        this.zzl = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        long j8;
        long j10;
        long jZzo = zzagbVar.zzo();
        if (this.zzn) {
            if (jZzo != -1) {
                zzarg zzargVar = this.zzj;
                if (!zzargVar.zza()) {
                    return zzargVar.zzb(zzagbVar, zzahaVar, this.zzr);
                }
            }
            if (this.zzo) {
                j8 = -1;
                j10 = 0;
            } else {
                this.zzo = true;
                zzarg zzargVar2 = this.zzj;
                if (zzargVar2.zzc() != -9223372036854775807L) {
                    j8 = -1;
                    j10 = 0;
                    zzarf zzarfVar = new zzarf(zzargVar2.zzd(), zzargVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzarfVar;
                    this.zzl.zzw(zzarfVar.zza());
                } else {
                    j8 = -1;
                    j10 = 0;
                    this.zzl.zzw(new zzahc(zzargVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j10, j10);
                if (zzagbVar.zzn() != j10) {
                    zzahaVar.zza = j10;
                    return 1;
                }
            }
            zzarf zzarfVar2 = this.zzk;
            if (zzarfVar2 != null && zzarfVar2.zzc()) {
                return zzarfVar2.zzd(zzagbVar, zzahaVar);
            }
        } else {
            j8 = -1;
        }
        zzeu zzeuVar = this.zzc;
        byte[] bArrZzi = zzeuVar.zzi();
        if (9400 - zzeuVar.zzg() < 188) {
            int iZzd = zzeuVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzeuVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzeuVar.zzb(bArrZzi, iZzd);
        }
        while (zzeuVar.zzd() < 188) {
            int iZze = zzeuVar.zze();
            int iZza = zzagbVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i5 >= sparseArray.size()) {
                        return -1;
                    }
                    zzarp zzarpVar = (zzarp) sparseArray.valueAt(i5);
                    if (zzarpVar instanceof zzaqt) {
                        zzaqt zzaqtVar = (zzaqt) zzarpVar;
                        if (zzaqtVar.zzd(false)) {
                            zzaqtVar.zzc(new zzeu(), 1);
                        }
                    }
                    i5++;
                }
            } else {
                zzeuVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzeuVar.zzg();
        int iZze2 = zzeuVar.zze();
        int iZza2 = zzarq.zza(zzeuVar.zzi(), iZzg, iZze2);
        zzeuVar.zzh(iZza2);
        int i10 = iZza2 + 188;
        if (i10 > iZze2) {
            this.zzq = (iZza2 - iZzg) + this.zzq;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzeuVar.zze();
        if (i10 > iZze3) {
            return 0;
        }
        int iZzB = zzeuVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzeuVar.zzh(i10);
            return 0;
        }
        int i11 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i12 = iZzB & 32;
        int i13 = (iZzB >> 8) & 8191;
        zzarp zzarpVar2 = (iZzB & 16) != 0 ? (zzarp) this.zzg.get(i13) : null;
        if (zzarpVar2 == null) {
            zzeuVar.zzh(i10);
            return 0;
        }
        int i14 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i15 = sparseIntArray.get(i13, i14 - 1);
        sparseIntArray.put(i13, i14);
        if (i15 == i14) {
            zzeuVar.zzh(i10);
            return 0;
        }
        if (i14 != ((i15 + 1) & 15)) {
            zzarpVar2.zzb();
        }
        if (i12 != 0) {
            int iZzs = zzeuVar.zzs();
            i11 |= (zzeuVar.zzs() & 64) != 0 ? 2 : 0;
            zzeuVar.zzk(iZzs - 1);
        }
        boolean z2 = this.zzn;
        if (z2 || !this.zzi.get(i13, false)) {
            zzeuVar.zzf(i10);
            zzarpVar2.zzc(zzeuVar, i11);
            zzeuVar.zzf(iZze3);
        }
        if (!z2 && this.zzn && jZzo != j8) {
            this.zzp = true;
        }
        zzeuVar.zzh(i10);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.zzb
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L35
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.zzfj r4 = (com.google.android.gms.internal.ads.zzfj) r4
            long r5 = r4.zzc()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.zza()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.zzd(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L40
            com.google.android.gms.internal.ads.zzarf r10 = r9.zzk
            if (r10 == 0) goto L40
            r10.zzb(r12)
        L40:
            com.google.android.gms.internal.ads.zzeu r10 = r9.zzc
            r10.zza(r0)
            android.util.SparseIntArray r10 = r9.zzd
            r10.clear()
            r10 = r0
        L4b:
            android.util.SparseArray r11 = r9.zzg
            int r12 = r11.size()
            if (r10 >= r12) goto L5f
            java.lang.Object r11 = r11.valueAt(r10)
            com.google.android.gms.internal.ads.zzarp r11 = (com.google.android.gms.internal.ads.zzarp) r11
            r11.zzb()
            int r10 = r10 + 1
            goto L4b
        L5f:
            r9.zzq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzark.zze(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public final /* synthetic */ List zzh() {
        return this.zzb;
    }

    public final /* synthetic */ zzarn zzi() {
        return this.zze;
    }

    public final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    public final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    public final /* synthetic */ zzagd zzm() {
        return this.zzl;
    }

    public final /* synthetic */ int zzn() {
        return this.zzm;
    }

    public final /* synthetic */ void zzo(int i5) {
        this.zzm = i5;
    }

    public final /* synthetic */ void zzp(boolean z2) {
        this.zzn = true;
    }

    public final /* synthetic */ void zzq(int i5) {
        this.zzr = i5;
    }

    public zzark(int i5, int i10, zzanq zzanqVar, zzfj zzfjVar, zzarn zzarnVar, int i11) {
        this.zze = zzarnVar;
        this.zza = i10;
        this.zzf = zzanqVar;
        this.zzb = Collections.singletonList(zzfjVar);
        this.zzc = new zzeu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzarg(112800);
        this.zzl = zzagd.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzarnVar.zza();
        int size = sparseArrayZza.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.zzg.put(sparseArrayZza.keyAt(i12), (zzarp) sparseArrayZza.valueAt(i12));
        }
        this.zzg.put(0, new zzarb(new zzarh(this)));
    }
}
