package com.google.android.gms.internal.ads;

import x.C4429v;

/* loaded from: classes3.dex */
public final class zzdqk {
    zzbnj zza;
    zzbng zzb;
    zzbnw zzc;
    zzbnt zzd;
    zzbsr zze;
    final C4429v zzf = new C4429v(0);
    final C4429v zzg = new C4429v(0);

    public final zzdqk zza(zzbnj zzbnjVar) {
        this.zza = zzbnjVar;
        return this;
    }

    public final zzdqk zzb(zzbng zzbngVar) {
        this.zzb = zzbngVar;
        return this;
    }

    public final zzdqk zzc(zzbnw zzbnwVar) {
        this.zzc = zzbnwVar;
        return this;
    }

    public final zzdqk zzd(zzbnt zzbntVar) {
        this.zzd = zzbntVar;
        return this;
    }

    public final zzdqk zze(zzbsr zzbsrVar) {
        this.zze = zzbsrVar;
        return this;
    }

    public final zzdqk zzf(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) {
        this.zzf.put(str, zzbnpVar);
        if (zzbnmVar != null) {
            this.zzg.put(str, zzbnmVar);
        }
        return this;
    }

    public final zzdql zzg() {
        return new zzdql(this, null);
    }
}
