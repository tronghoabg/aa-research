package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcsq implements zzcsa {
    private final Context zza;
    private final G6.N zzb = C6.n.f1857D.f1868h.zzp();

    public zzcsq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        G6.N n10 = this.zzb;
        boolean z2 = Boolean.parseBoolean(str);
        ((G6.O) n10).C(z2);
        if (z2) {
            Fe.c.J(this.zza);
        }
    }
}
