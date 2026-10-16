package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbpl implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (map.containsKey("start")) {
            zzclbVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzclbVar.zzas(false);
        }
    }
}
