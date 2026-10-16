package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcsn implements zzcsa {
    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzma)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((G6.O) C6.n.f1857D.f1868h.zzp()).E(Boolean.parseBoolean(str));
    }
}
