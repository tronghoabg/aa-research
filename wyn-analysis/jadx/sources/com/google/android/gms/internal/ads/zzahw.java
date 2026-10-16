package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzahw implements zzahs {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzahw(int i5, int i10, int i11, int i12) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
    }

    public static zzahw zzb(zzeu zzeuVar) {
        int iZzC = zzeuVar.zzC();
        zzeuVar.zzk(8);
        int iZzC2 = zzeuVar.zzC();
        int iZzC3 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        int iZzC4 = zzeuVar.zzC();
        zzeuVar.zzk(12);
        return new zzahw(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return 1751742049;
    }
}
