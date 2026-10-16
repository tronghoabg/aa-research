package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfbb implements zzfcq {
    private final Map zza;

    public zzfbb(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) throws JSONException {
        Bundle bundle = (Bundle) obj;
        Map map = this.zza;
        if (map.isEmpty()) {
            return;
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziT)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                if (!arrayDeque.isEmpty()) {
                    zzeaz zzeazVar = (zzeaz) entry.getKey();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", zzeazVar.zza());
                        jSONObject.put("event_type", zzeazVar.zzb());
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            jSONArray2.put((Long) it.next());
                        }
                        jSONObject.put("timestamps", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e7) {
                        G6.L.l("Failed putting the on-device storage record.", e7);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                bundle.putString("on_device_storage_records", jSONArray.toString());
                return;
            }
            return;
        }
        Map map2 = this.zza;
        zzhdn zzhdnVarZzb = zzhdq.zzb();
        for (Map.Entry entry2 : map2.entrySet()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
            if (!arrayDeque2.isEmpty()) {
                zzeaz zzeazVar2 = (zzeaz) entry2.getKey();
                int iZza = zzhdk.zza(zzeazVar2.zzb());
                if (iZza != 0) {
                    zzhdl zzhdlVarZza = zzhdm.zza();
                    zzhdlVarZza.zza(zzeazVar2.zza());
                    zzhdlVarZza.zzb(iZza);
                    zzhdm zzhdmVar = (zzhdm) zzhdlVarZza.zzbu();
                    zzhdo zzhdoVarZza = zzhdp.zza();
                    zzhdoVarZza.zza(zzhdmVar);
                    zzhdoVarZza.zzb(arrayDeque2);
                    zzhdnVarZzb.zza(zzhdoVarZza);
                }
            }
        }
        zzhdq zzhdqVar = (zzhdq) zzhdnVarZzb.zzbu();
        if (zzhdqVar.zza() > 0) {
            bundle.putString("ods", Base64.encodeToString(zzhdqVar.zzaN(), 11));
        }
    }
}
