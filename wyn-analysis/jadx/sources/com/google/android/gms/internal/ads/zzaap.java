package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaap extends zzaar implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaap(int i5, zzbg zzbgVar, int i10, zzaan zzaanVar, int i11, String str, String str2) {
        int iZzj;
        super(i5, zzbgVar, i10);
        int i12 = 0;
        this.zzf = I.c(i11, false);
        int i13 = this.zzd.zze;
        int i14 = zzaanVar.zzC;
        this.zzg = 1 == (i13 & 1);
        this.zzh = (i13 & 2) != 0;
        zzgwt zzgwtVarZzj = str2 != null ? zzgwt.zzj(str2) : zzaanVar.zzy.isEmpty() ? zzgwt.zzj("") : zzaanVar.zzy;
        int i15 = 0;
        while (true) {
            if (i15 >= zzgwtVarZzj.size()) {
                iZzj = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaz.zzj(this.zzd, (String) zzgwtVarZzj.get(i15), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzi = i15;
        this.zzj = iZzj;
        int iZzm = zzaaz.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzaaz.zzn(zzvVar, zzaanVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaaz.zzj(this.zzd, str, zzaaz.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z2 = iZzj > 0 || (zzaanVar.zzy.isEmpty() && iZzm > 0) || ((zzaanVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (I.c(i11, zzaanVar.zzV) && z2) {
            i12 = 1;
        }
        this.zze = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaap zzaapVar) {
        zzgwg zzgwgVarZza = zzgwg.zzg().zzd(this.zzf, zzaapVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaapVar.zzi), zzgyn.zzb().zza());
        int i5 = this.zzj;
        zzgwg zzgwgVarZzb = zzgwgVarZza.zzb(i5, zzaapVar.zzj);
        int i10 = this.zzk;
        zzgwg zzgwgVarZzb2 = zzgwgVarZzb.zzb(i10, zzaapVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaapVar.zzl), zzgyn.zzb().zza()).zzd(this.zzg, zzaapVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaapVar.zzh), i5 == 0 ? zzgyn.zzb() : zzgyn.zzb().zza()).zzb(this.zzm, zzaapVar.zzm);
        if (i10 == 0) {
            zzgwgVarZzb2 = zzgwgVarZzb2.zzc(this.zzn, zzaapVar.zzn);
        }
        return zzgwgVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        return false;
    }
}
