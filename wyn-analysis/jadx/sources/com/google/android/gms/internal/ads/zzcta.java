package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcta implements zzcsa {
    private final G6.N zza;

    public zzcta(G6.N n10) {
        this.zza = n10;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        int iIntValue;
        String str = (String) map.get("total_inflight_ad_limit");
        if (str == null || (iIntValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        G6.O o7 = (G6.O) this.zza;
        o7.l();
        synchronized (o7.f4531a) {
            try {
                if (o7.f4529F == iIntValue) {
                    return;
                }
                o7.f4529F = iIntValue;
                SharedPreferences.Editor editor = o7.f4537g;
                if (editor != null) {
                    editor.putInt("total_inflight_ad_limit", iIntValue);
                    o7.f4537g.apply();
                }
                o7.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
