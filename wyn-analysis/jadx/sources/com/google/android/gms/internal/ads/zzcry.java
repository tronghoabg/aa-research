package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcry {
    private final Map zza;
    private final Map zzb;

    public zzcry(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfky zzfkyVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfkw zzfkwVar : zzfkyVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfkwVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfkwVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfkwVar.zzb) != null) {
                    zzcsa zzcsaVar = (zzcsa) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcsaVar.zza(map3);
                }
            } else {
                ((zzcsb) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
