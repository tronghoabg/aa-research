package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcse implements zzcsa {
    private final G6.N zza;

    public zzcse(G6.N n10) {
        this.zza = n10;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        boolean z2 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
        G6.O o7 = (G6.O) this.zza;
        o7.l();
        synchronized (o7.f4531a) {
            try {
                if (o7.f4551v == z2) {
                    return;
                }
                o7.f4551v = z2;
                SharedPreferences.Editor editor = o7.f4537g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z2);
                    o7.f4537g.apply();
                }
                o7.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
