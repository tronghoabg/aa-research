package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzzl implements zzxj, zzxi {
    private final zzxj zza;
    private final long zzb;
    private zzxi zzc;

    public zzzl(zzxj zzxjVar, long j8) {
        this.zza = zzxjVar;
        this.zzb = j8;
    }

    public final zzxj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        long j8 = zzmcVar.zza;
        long j10 = this.zzb;
        zzmb zzmbVarZza = zzmcVar.zza();
        zzmbVarZza.zza(j8 - j10);
        return this.zza.zzd(zzmbVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j8) {
        this.zza.zzf(j8 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j8) {
        this.zzc = zzxiVar;
        this.zza.zzl(this, j8 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j8) {
        zzzd[] zzzdVarArr2 = new zzzd[zzzdVarArr.length];
        int i5 = 0;
        while (true) {
            zzzd zzzdVarZze = null;
            if (i5 >= zzzdVarArr.length) {
                break;
            }
            zzzk zzzkVar = (zzzk) zzzdVarArr[i5];
            if (zzzkVar != null) {
                zzzdVarZze = zzzkVar.zze();
            }
            zzzdVarArr2[i5] = zzzdVarZze;
            i5++;
        }
        zzxj zzxjVar = this.zza;
        long j10 = this.zzb;
        long jZzo = zzxjVar.zzo(zzabbVarArr, zArr, zzzdVarArr2, zArr2, j8 - j10);
        for (int i10 = 0; i10 < zzzdVarArr.length; i10++) {
            zzzd zzzdVar = zzzdVarArr2[i10];
            if (zzzdVar == null) {
                zzzdVarArr[i10] = null;
            } else {
                zzzd zzzdVar2 = zzzdVarArr[i10];
                if (zzzdVar2 == null || ((zzzk) zzzdVar2).zze() != zzzdVar) {
                    zzzdVarArr[i10] = new zzzk(zzzdVar, j10);
                }
            }
        }
        return jZzo + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        zzxi zzxiVar = this.zzc;
        zzxiVar.getClass();
        zzxiVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j8, boolean z2) {
        this.zza.zzq(j8 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        long jZzr = this.zza.zzr();
        if (jZzr == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzr + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        zzxi zzxiVar = this.zzc;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzt(long j8) {
        long j10 = this.zzb;
        return this.zza.zzt(j8 - j10) + j10;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzu(long j8, zznk zznkVar) {
        long j10 = this.zzb;
        return this.zza.zzu(j8 - j10, zznkVar) + j10;
    }
}
