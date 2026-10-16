package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzjg implements zzabm {
    final /* synthetic */ zzji zza;
    private final HashMap zzb;
    private final zzqh zzc;

    public zzjg(zzji zzjiVar, zzqh zzqhVar) {
        Objects.requireNonNull(zzjiVar);
        this.zza = zzjiVar;
        this.zzb = new HashMap();
        this.zzc = zzqhVar;
    }

    private final void zze(zzabk zzabkVar) {
        zzqh zzqhVar = (zzqh) this.zzb.remove(zzabkVar);
        zzqhVar.getClass();
        zzjh zzjhVar = (zzjh) this.zza.zzl().get(zzqhVar);
        if (zzjhVar != null) {
            zzjhVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized zzabk zza() {
        zzabk zzabkVarZza;
        zzji zzjiVar = this.zza;
        zzabs zzabsVarZzk = zzjiVar.zzk();
        HashMap map = this.zzb;
        zzabkVarZza = zzabsVarZzk.zza();
        zzqh zzqhVar = this.zzc;
        map.put(zzabkVarZza, zzqhVar);
        zzjh zzjhVar = (zzjh) zzjiVar.zzl().get(zzqhVar);
        if (zzjhVar != null) {
            zzjhVar.zza();
        }
        return zzabkVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzb(zzabk zzabkVar) {
        this.zza.zzk().zzb(zzabkVar);
        zze(zzabkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzc(zzabl zzablVar) {
        this.zza.zzk().zzc(zzablVar);
        while (zzablVar != null) {
            zze(zzablVar.zzd());
            zzablVar = zzablVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}
