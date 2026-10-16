package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzbbq extends zzazo {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzbbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzazo
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzbbq(String str) {
        HashMap mapZzb = zzazo.zzb(str);
        if (mapZzb != null) {
            this.zza = (Long) mapZzb.get(0);
            this.zzb = (Boolean) mapZzb.get(1);
            this.zzc = (Boolean) mapZzb.get(2);
        }
    }
}
