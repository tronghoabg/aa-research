package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zziz implements zznc, zzne {
    private final int zzb;
    private zznf zzd;
    private int zze;
    private zzqh zzf;
    private zzdp zzg;
    private int zzh;
    private zzzd zzi;
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzxl zzq;
    private zznd zzs;
    private final Object zza = new Object();
    private final zzly zzc = new zzly();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;
    private long zzr = -9223372036854775807L;

    public zziz(int i5) {
        this.zzb = i5;
    }

    private final void zzaf(long j8, boolean z2, boolean z10) throws zzjm {
        this.zzn = false;
        this.zzl = j8;
        this.zzm = j8;
        if (!z10) {
            z10 = zzS(j8) != 0;
        }
        zzA(j8, z2, z10);
    }

    private final void zzag() {
        zzxl zzxlVar;
        int iZze;
        if (this.zzp.zzg() || (zzxlVar = this.zzq) == null || (iZze = this.zzp.zze(zzxlVar.zza)) == -1) {
            this.zzr = -9223372036854775807L;
        } else {
            this.zzr = this.zzp.zzd(iZze, new zzbd(), false).zzd;
        }
    }

    public void zzA(long j8, boolean z2, boolean z10) throws zzjm {
        throw null;
    }

    public void zzB() throws zzjm {
    }

    public void zzC() {
    }

    public void zzD() {
        throw null;
    }

    public void zzE() {
    }

    public void zzF() {
    }

    public void zzG(zzbf zzbfVar) {
    }

    public final long zzH() {
        return this.zzl;
    }

    public final zzly zzI() {
        zzly zzlyVar = this.zzc;
        zzlyVar.zza = null;
        zzlyVar.zzb = null;
        return zzlyVar;
    }

    public final zzv[] zzJ() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    public final zznf zzK() {
        zznf zznfVar = this.zzd;
        zznfVar.getClass();
        return zznfVar;
    }

    public final zzqh zzL() {
        zzqh zzqhVar = this.zzf;
        zzqhVar.getClass();
        return zzqhVar;
    }

    public final zzdp zzM() {
        zzdp zzdpVar = this.zzg;
        zzdpVar.getClass();
        return zzdpVar;
    }

    public final zzbf zzN() {
        return this.zzp;
    }

    public final zzxl zzO() {
        return this.zzq;
    }

    public final long zzP() {
        return this.zzr;
    }

    public final zzjm zzQ(Throwable th, zzv zzvVar, boolean z2, int i5) {
        int iZzae = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzae = zzae(zzvVar) & 7;
            } catch (zzjm unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzjm.zzb(th, zzV(), this.zze, zzvVar, iZzae, this.zzq, z2, i5);
    }

    public final int zzR(zzly zzlyVar, zzix zzixVar, int i5) {
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        int iZzc = zzzdVar.zzc(zzlyVar, zzixVar, i5);
        if (iZzc == -4) {
            int i10 = i5 & 1;
            if (zzixVar.zzb()) {
                if (i10 == 0) {
                    this.zzm = Long.MIN_VALUE;
                }
                return this.zzn ? -4 : -3;
            }
            long j8 = zzixVar.zzd + this.zzk;
            zzixVar.zzd = j8;
            if (i10 == 0) {
                this.zzm = Math.max(this.zzm, j8);
                return -4;
            }
        } else if (iZzc == -5) {
            zzv zzvVar = zzlyVar.zzb;
            zzvVar.getClass();
            long j10 = zzvVar.zzu;
            if (j10 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(j10 + this.zzk);
                zzlyVar.zzb = zztVarZza.zzP();
                return -5;
            }
        }
        return iZzc;
    }

    public final int zzS(long j8) {
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        return zzzdVar.zzd(j8 - this.zzk);
    }

    public final boolean zzT() {
        if (zzcW()) {
            return this.zzn;
        }
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        return zzzdVar.zza();
    }

    public final void zzU() {
        zznd zzndVar;
        synchronized (this.zza) {
            zzndVar = this.zzs;
        }
        if (zzndVar != null) {
            zzndVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public /* synthetic */ long zzW(long j8, long j10) {
        return H.a(this, j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public /* synthetic */ boolean zzX(long j8) {
        return H.b(this, j8);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public /* synthetic */ void zzY(float f10, float f11) {
        H.c(this, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public /* synthetic */ void zzZ() {
        H.d(this);
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final zzne zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzc(int i5, zzqh zzqhVar, zzdp zzdpVar) {
        this.zze = i5;
        this.zzf = zzqhVar;
        this.zzg = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzcT() throws zzjm {
        zzgtr.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzcU(zzv[] zzvVarArr, zzzd zzzdVar, long j8, long j10, zzxl zzxlVar) throws zzjm {
        zzgtr.zzi(!this.zzn);
        this.zzi = zzzdVar;
        this.zzq = zzxlVar;
        zzag();
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j8;
        }
        this.zzj = zzvVarArr;
        this.zzk = j10;
        zzz(zzvVarArr, j8, j10, zzxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final zzzd zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public zzmd zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzf(zznf zznfVar, zzv[] zzvVarArr, zzzd zzzdVar, long j8, boolean z2, boolean z10, long j10, long j11, zzxl zzxlVar) throws zzjm {
        zzgtr.zzi(this.zzh == 0);
        this.zzd = zznfVar;
        this.zzq = zzxlVar;
        this.zzh = 1;
        zzy(z2, z10);
        zzcU(zzvVarArr, zzzdVar, j10, j11, zzxlVar);
        zzaf(j10, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzn() throws IOException {
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        zzzdVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
        zzag();
        zzG(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzp(long j8, boolean z2) throws zzjm {
        zzaf(j8, false, z2);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzq() {
        zzgtr.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzr() {
        zzgtr.zzi(this.zzh == 1);
        zzly zzlyVar = this.zzc;
        zzlyVar.zza = null;
        zzlyVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
        this.zzr = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzs() {
        zzgtr.zzi(this.zzh == 0);
        zzly zzlyVar = this.zzc;
        zzlyVar.zza = null;
        zzlyVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzt() {
        zzgtr.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public int zzu() throws zzjm {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzv(zznd zzndVar) {
        synchronized (this.zza) {
            this.zzs = zzndVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzw() {
        synchronized (this.zza) {
            this.zzs = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public void zzx(int i5, Object obj) throws zzjm {
    }

    public void zzy(boolean z2, boolean z10) throws zzjm {
    }

    public void zzz(zzv[] zzvVarArr, long j8, long j10, zzxl zzxlVar) throws zzjm {
    }
}
