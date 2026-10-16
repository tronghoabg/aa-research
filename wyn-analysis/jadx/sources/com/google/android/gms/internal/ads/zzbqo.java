package com.google.android.gms.internal.ads;

import G6.U;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbqo implements zzbpx {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbqn zzbqnVar = (zzbqn) this.zzb.remove(str);
                if (zzbqnVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                    sb2.append("Received result for unexpected method invocation: ");
                    sb2.append(str);
                    String string = sb2.toString();
                    int i5 = G6.L.f4523b;
                    H6.l.f(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb3.append(str3);
                    sb3.append(strConcat);
                    zzbqnVar.zzb(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    zzbqnVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (G6.L.m()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(string2);
                        G6.L.k(sb4.toString());
                    }
                    zzbqnVar.zza(jSONObject);
                } catch (JSONException e7) {
                    zzbqnVar.zzb(e7.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(String str, zzbqn zzbqnVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqnVar);
        }
    }

    public final p8.p zzc(zzbtf zzbtfVar, String str, JSONObject jSONObject) throws JSONException {
        zzcgd zzcgdVar = new zzcgd();
        U u10 = C6.n.f1857D.f1863c;
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbqm(this, zzcgdVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbtfVar.zzb(str, jSONObject2);
            return zzcgdVar;
        } catch (Exception e7) {
            zzcgdVar.zzd(e7);
            return zzcgdVar;
        }
    }
}
