package com.google.android.gms.internal.ads;

import A7.RunnableC0299w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbox implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzgrg zzgrgVar;
        F6.r rVar = C6.n.f1857D.f1878s;
        if (!rVar.f4011b || (zzgrgVar = (zzgrg) rVar.f4015f) == null) {
            G6.L.k("LastMileDelivery not connected");
            return;
        }
        zzgrgVar.zzc(rVar.k(), (S3.l) rVar.f4016g);
        zzcfy.zzf.execute(new RunnableC0299w0(11, rVar, "onLMDOverlayCollapse", new HashMap(), false));
    }
}
