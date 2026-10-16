package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhbc extends zzhbe {
    public zzhbc(p8.p pVar, zzhbn zzhbnVar) {
        super(pVar, zzhbnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ void zze(Object obj) {
        zzk((p8.p) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhbn zzhbnVar = (zzhbn) obj;
        p8.p pVarZza = zzhbnVar.zza(obj2);
        zzgtr.zzl(pVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbnVar);
        return pVarZza;
    }
}
