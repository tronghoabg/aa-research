package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzzy extends zzaar implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzaan zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzzy(int r14, com.google.android.gms.internal.ads.zzbg r15, int r16, com.google.android.gms.internal.ads.zzaan r17, int r18, boolean r19, com.google.android.gms.internal.ads.zzgts r20, int r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzy.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzaan, int, boolean, com.google.android.gms.internal.ads.zzgts, int):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzy zzzyVar) {
        boolean z2 = this.zzf;
        zzgyn zzgynVarZza = (z2 && this.zzi) ? zzaaz.zzc : zzaaz.zzc.zza();
        zzgwg zzgwgVarZza = zzgwg.zzg().zzd(this.zzi, zzzyVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzzyVar.zzk), zzgyn.zzb().zza()).zzb(this.zzj, zzzyVar.zzj).zzb(this.zzl, zzzyVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzzyVar.zzm), zzgyn.zzb().zza()).zzd(this.zzq, zzzyVar.zzq).zzd(this.zzn, zzzyVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzzyVar.zzo), zzgyn.zzb().zza()).zzb(this.zzp, zzzyVar.zzp).zzd(z2, zzzyVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzzyVar.zzu), zzgyn.zzb().zza());
        boolean z10 = this.zzh.zzF;
        zzgwg zzgwgVarZza2 = zzgwgVarZza.zzd(this.zzv, zzzyVar.zzv).zzd(this.zzw, zzzyVar.zzw).zzd(this.zzx, zzzyVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzzyVar.zzr), zzgynVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzzyVar.zzs), zzgynVarZza);
        if (Objects.equals(this.zzg, zzzyVar.zzg)) {
            zzgwgVarZza2 = zzgwgVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzzyVar.zzt), zzgynVarZza);
        }
        return zzgwgVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        String str;
        int i5;
        zzzy zzzyVar = (zzzy) zzaarVar;
        boolean z2 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i10 = zzvVar.zzH;
        if (i10 == -1) {
            return false;
        }
        zzv zzvVar2 = zzzyVar.zzd;
        return i10 == zzvVar2.zzH && (str = zzvVar.zzp) != null && TextUtils.equals(str, zzvVar2.zzp) && (i5 = zzvVar.zzJ) != -1 && i5 == zzvVar2.zzJ && this.zzv == zzzyVar.zzv && this.zzw == zzzyVar.zzw;
    }
}
