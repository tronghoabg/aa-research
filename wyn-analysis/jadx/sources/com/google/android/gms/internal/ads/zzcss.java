package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcss implements zzcsa {
    private final G6.N zza;

    public zzcss(G6.N n10) {
        this.zza = n10;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        int iIntValue;
        String str = (String) map.get("default_queue_capacity");
        if (str == null || (iIntValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        G6.O o7 = (G6.O) this.zza;
        o7.l();
        synchronized (o7.f4531a) {
            try {
                if (o7.f4530G == iIntValue) {
                    return;
                }
                o7.f4530G = iIntValue;
                SharedPreferences.Editor editor = o7.f4537g;
                if (editor != null) {
                    editor.putInt("default_queue_capacity", iIntValue);
                    o7.f4537g.apply();
                }
                o7.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
