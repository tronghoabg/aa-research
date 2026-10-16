package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;

/* loaded from: classes3.dex */
final class zzfmy {
    private final zzfmx zza = new zzfmx();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfmx zzf() {
        zzfmx zzfmxVar = this.zza;
        zzfmx zzfmxVarClone = zzfmxVar.clone();
        zzfmxVar.zza = false;
        zzfmxVar.zzb = false;
        return zzfmxVarClone;
    }

    public final String zzg() {
        StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
        sb2.append(this.zzd);
        sb2.append("\n\tNew pools created: ");
        sb2.append(this.zzb);
        sb2.append("\n\tPools removed: ");
        sb2.append(this.zzc);
        sb2.append("\n\tEntries added: ");
        sb2.append(this.zzf);
        sb2.append("\n\tNo entries retrieved: ");
        return AbstractC0279p0.j(this.zze, "\n", sb2);
    }
}
