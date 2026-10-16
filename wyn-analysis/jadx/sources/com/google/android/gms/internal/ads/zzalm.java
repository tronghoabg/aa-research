package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzalm implements zzali {
    private final zzeu zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzalm(zzga zzgaVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zza = zzeuVar;
        zzeuVar.zzh(12);
        this.zzc = zzeuVar.zzH() & 255;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzc() {
        int i5 = this.zzc;
        if (i5 == 8) {
            return this.zza.zzs();
        }
        if (i5 == 16) {
            return this.zza.zzt();
        }
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        if (i10 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & 240) >> 4;
    }
}
