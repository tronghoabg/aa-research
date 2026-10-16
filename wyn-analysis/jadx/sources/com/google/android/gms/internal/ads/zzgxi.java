package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgxi extends zzgur {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgts zzb;

    public zzgxi(Iterator it, zzgts zzgtsVar) {
        this.zza = it;
        this.zzb = zzgtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    public final Object zza() {
        zzgts zzgtsVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgtsVar = this.zzb;
            next = it.next();
        } while (!zzgtsVar.zza(next));
        return next;
    }
}
