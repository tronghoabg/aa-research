package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzabj {
    public final int zza;
    public final zznf[] zzb;
    public final zzabb[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzabj(zznf[] zznfVarArr, zzabb[] zzabbVarArr, zzbn zzbnVar, Object obj) {
        int length = zznfVarArr.length;
        zzgtr.zza(length == zzabbVarArr.length);
        this.zzb = zznfVarArr;
        this.zzc = (zzabb[]) zzabbVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i5) {
        return this.zzb[i5] != null;
    }

    public final boolean zzb(zzabj zzabjVar, int i5) {
        return zzabjVar != null && Objects.equals(this.zzb[i5], zzabjVar.zzb[i5]) && Objects.equals(this.zzc[i5], zzabjVar.zzc[i5]);
    }
}
