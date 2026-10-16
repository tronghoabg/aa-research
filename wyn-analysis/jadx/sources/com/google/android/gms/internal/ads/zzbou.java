package com.google.android.gms.internal.ads;

import A7.RunnableC0299w0;
import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbou implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        F6.r rVar = C6.n.f1857D.f1878s;
        Context context = zzclbVar.getContext();
        synchronized (rVar) {
            rVar.f4014e = zzclbVar;
            if (!rVar.h(context)) {
                rVar.j("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(HandleInvocationsFromAdViewer.KEY_ACTION, "fetch_completed");
            zzcfy.zzf.execute(new RunnableC0299w0(11, rVar, "on_play_store_bind", map2, false));
        }
    }
}
