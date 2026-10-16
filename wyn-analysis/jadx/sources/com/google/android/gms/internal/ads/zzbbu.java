package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzbbu extends zzazo {
    public Long zza;
    public Long zzb;

    public zzbbu() {
    }

    @Override // com.google.android.gms.internal.ads.zzazo
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        return map;
    }

    public zzbbu(String str) {
        HashMap mapZzb = zzazo.zzb(str);
        if (mapZzb != null) {
            this.zza = (Long) mapZzb.get(0);
            this.zzb = (Long) mapZzb.get(1);
        }
    }
}
