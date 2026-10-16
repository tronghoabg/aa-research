package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbqf implements zzbpx {
    private final zzeaw zza;

    public zzbqf(zzeaw zzeawVar) {
        this.zza = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            G6.L.k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            long j8 = Long.parseLong((String) map.get("id"));
            int i5 = Integer.parseInt((String) map.get("event_type"));
            C6.n.f1857D.k.getClass();
            this.zza.zza(j8, i5, System.currentTimeMillis());
        } catch (NumberFormatException e7) {
            G6.L.l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e7);
        }
    }
}
