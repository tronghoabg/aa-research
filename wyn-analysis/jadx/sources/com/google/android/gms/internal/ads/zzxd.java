package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzxd implements zzxj, zzxi {
    public final zzxl zza;
    private final long zzb;
    private final zzabm zzc;
    private zzxn zzd;
    private zzxj zze;
    private zzxi zzf;
    private long zzg = -9223372036854775807L;

    public zzxd(zzxl zzxlVar, zzabm zzabmVar, long j8) {
        this.zza = zzxlVar;
        this.zzc = zzabmVar;
        this.zzb = j8;
    }

    private final long zzv(long j8) {
        long j10 = this.zzg;
        return j10 != -9223372036854775807L ? j10 : j8;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        zzxj zzxjVar = this.zze;
        return zzxjVar != null && zzxjVar.zzd(zzmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        zzxj zzxjVar = this.zze;
        return zzxjVar != null && zzxjVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j8) {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        zzxjVar.zzf(j8);
    }

    public final void zzg(long j8) {
        this.zzg = j8;
    }

    public final long zzh() {
        return this.zzg;
    }

    public final void zzi(zzxn zzxnVar) {
        zzgtr.zzi(this.zzd == null);
        this.zzd = zzxnVar;
    }

    public final void zzj(zzxl zzxlVar) {
        long jZzv = zzv(this.zzb);
        zzxn zzxnVar = this.zzd;
        zzxnVar.getClass();
        zzxj zzxjVarZzH = zzxnVar.zzH(zzxlVar, this.zzc, jZzv);
        this.zze = zzxjVarZzH;
        if (this.zzf != null) {
            zzxjVarZzH.zzl(this, jZzv);
        }
    }

    public final void zzk() {
        zzxj zzxjVar = this.zze;
        if (zzxjVar != null) {
            zzxn zzxnVar = this.zzd;
            zzxnVar.getClass();
            zzxnVar.zzE(zzxjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j8) {
        this.zzf = zzxiVar;
        zzxj zzxjVar = this.zze;
        if (zzxjVar != null) {
            zzxjVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        zzxj zzxjVar = this.zze;
        if (zzxjVar != null) {
            zzxjVar.zzm();
            return;
        }
        zzxn zzxnVar = this.zzd;
        if (zzxnVar != null) {
            zzxnVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j8) {
        long j10 = this.zzg;
        long j11 = (j10 == -9223372036854775807L || j8 != this.zzb) ? j8 : j10;
        this.zzg = -9223372036854775807L;
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzo(zzabbVarArr, zArr, zzzdVarArr, zArr2, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        zzxi zzxiVar = this.zzf;
        String str = zzfm.zza;
        zzxiVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j8, boolean z2) {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        zzxjVar.zzq(j8, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        zzxi zzxiVar = this.zzf;
        String str = zzfm.zza;
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzt(long j8) {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzt(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzu(long j8, zznk zznkVar) {
        zzxj zzxjVar = this.zze;
        String str = zzfm.zza;
        return zzxjVar.zzu(j8, zznkVar);
    }
}
