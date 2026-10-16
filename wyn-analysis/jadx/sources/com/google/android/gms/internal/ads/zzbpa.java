package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbpa implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            String str = (String) map.get("enabled");
            zzbpx zzbpxVar = zzbpw.zza;
            if (!zzgsz.zze("true", str) && !zzgsz.zze("false", str)) {
                return;
            }
            zzgcs.zza(zzclbVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e7) {
            C6.n.f1857D.f1868h.zzh(e7, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
