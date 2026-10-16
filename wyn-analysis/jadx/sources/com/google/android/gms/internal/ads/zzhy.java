package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhy implements zzhq {
    private zzip zzb;
    private String zzc;
    private boolean zzf;
    private final zzij zza = new zzij();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhy zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzhy zzc(int i5) {
        this.zzd = i5;
        return this;
    }

    public final zzhy zzd(int i5) {
        this.zze = i5;
        return this;
    }

    public final zzhy zze(boolean z2) {
        this.zzf = true;
        return this;
    }

    public final zzhy zzf(zzip zzipVar) {
        this.zzb = zzipVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzic zza() {
        zzic zzicVar = new zzic(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzip zzipVar = this.zzb;
        if (zzipVar != null) {
            zzicVar.zze(zzipVar);
        }
        return zzicVar;
    }
}
