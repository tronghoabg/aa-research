package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeqf implements zzemc {
    private final Map zza = new HashMap();
    private final zzdxk zzb;

    public zzeqf(zzdxk zzdxkVar) {
        this.zzb = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    public final zzemd zza(String str, JSONObject jSONObject) throws zzfln {
        zzemd zzemdVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzemdVar = (zzemd) map.get(str);
                if (zzemdVar == null) {
                    zzemdVar = new zzemd(this.zzb.zza(str, jSONObject), new zzenq(), str);
                    map.put(str, zzemdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzemdVar;
    }
}
