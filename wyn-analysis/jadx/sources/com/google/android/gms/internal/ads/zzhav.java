package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhav extends zzhax {
    public zzhav(p8.p pVar, Class cls, zzhbn zzhbnVar) {
        super(pVar, cls, zzhbnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    public final /* synthetic */ void zze(Object obj) {
        zzk((p8.p) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzhbn zzhbnVar = (zzhbn) obj;
        p8.p pVarZza = zzhbnVar.zza(th);
        zzgtr.zzl(pVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbnVar);
        return pVarZza;
    }
}
