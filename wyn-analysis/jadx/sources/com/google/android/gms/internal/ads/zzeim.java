package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzeim implements zzbui {
    @Override // com.google.android.gms.internal.ads.zzbui
    public final JSONObject zzb(Object obj) throws JSONException {
        zzein zzeinVar = (zzein) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkO)).booleanValue()) {
            zzcbm zzcbmVar = zzeinVar.zzc;
            jSONObject2.put("ad_request_url", zzcbmVar.zze());
            jSONObject2.put("ad_request_post_body", zzcbmVar.zzd());
        }
        zzcbm zzcbmVar2 = zzeinVar.zzc;
        jSONObject2.put("base_url", zzcbmVar2.zzc());
        jSONObject2.put("signals", zzeinVar.zzb);
        zzeit zzeitVar = zzeinVar.zza;
        jSONObject3.put("body", zzeitVar.zzc);
        jSONObject3.put("headers", C0392q.f2477g.f2478a.l(zzeitVar.zzb));
        jSONObject3.put("response_code", zzeitVar.zza);
        jSONObject3.put("latency", zzeitVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcbmVar2.zzh());
        return jSONObject;
    }
}
