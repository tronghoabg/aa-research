package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzaay extends zzaar {
    private final boolean zze;
    private final zzaan zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzaay(int r5, com.google.android.gms.internal.ads.zzbg r6, int r7, com.google.android.gms.internal.ads.zzaan r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaay.<init>(int, com.google.android.gms.internal.ads.zzbg, int, com.google.android.gms.internal.ads.zzaan, int, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaay zzaayVar, zzaay zzaayVar2) {
        zzgwg zzgwgVarZza = zzgwg.zzg().zzd(zzaayVar.zzh, zzaayVar2.zzh).zza(Integer.valueOf(zzaayVar.zzm), Integer.valueOf(zzaayVar2.zzm), zzgyn.zzb().zza()).zzb(zzaayVar.zzn, zzaayVar2.zzn).zzb(zzaayVar.zzo, zzaayVar2.zzo).zza(Integer.valueOf(zzaayVar.zzp), Integer.valueOf(zzaayVar2.zzp), zzgyn.zzb().zza()).zzd(zzaayVar.zzq, zzaayVar2.zzq).zzb(zzaayVar.zzr, zzaayVar2.zzr).zzd(zzaayVar.zzi, zzaayVar2.zzi).zzd(zzaayVar.zze, zzaayVar2.zze).zzd(zzaayVar.zzg, zzaayVar2.zzg).zza(Integer.valueOf(zzaayVar.zzl), Integer.valueOf(zzaayVar2.zzl), zzgyn.zzb().zza());
        boolean z2 = zzaayVar.zzt;
        zzgwg zzgwgVarZzd = zzgwgVarZza.zzd(z2, zzaayVar2.zzt);
        boolean z10 = zzaayVar.zzu;
        zzgwg zzgwgVarZzd2 = zzgwgVarZzd.zzd(z10, zzaayVar2.zzu);
        if (z2 && z10) {
            zzgwgVarZzd2 = zzgwgVarZzd2.zzb(zzaayVar.zzv, zzaayVar2.zzv);
        }
        return zzgwgVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaay zzaayVar, zzaay zzaayVar2) {
        zzgyn zzgynVarZza = (zzaayVar.zze && zzaayVar.zzh) ? zzaaz.zzc : zzaaz.zzc.zza();
        zzgwg zzgwgVarZzg = zzgwg.zzg();
        boolean z2 = zzaayVar.zzf.zzF;
        return zzgwgVarZzg.zza(Integer.valueOf(zzaayVar.zzk), Integer.valueOf(zzaayVar2.zzk), zzgynVarZza).zza(Integer.valueOf(zzaayVar.zzj), Integer.valueOf(zzaayVar2.zzj), zzgynVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        zzaay zzaayVar = (zzaay) zzaarVar;
        if (!Objects.equals(this.zzd.zzp, zzaayVar.zzd.zzp)) {
            return false;
        }
        boolean z2 = this.zzf.zzN;
        return this.zzt == zzaayVar.zzt && this.zzu == zzaayVar.zzu;
    }
}
