package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbvd {
    public final List zza;

    public zzbvd(JSONObject jSONObject) throws JSONException {
        if (H6.l.j(2)) {
            G6.L.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i5 = -1;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                zzbvc zzbvcVar = new zzbvc(jSONArray.getJSONObject(i10));
                "banner".equalsIgnoreCase(zzbvcVar.zzc);
                arrayList.add(zzbvcVar);
                if (i5 < 0) {
                    Iterator it = zzbvcVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i5 = i10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            C6.n nVar = C6.n.f1857D;
            zzbve zzbveVar = nVar.f1882w;
            zzbve.zza(jSONObjectOptJSONObject, "click_urls");
            zzbve zzbveVar2 = nVar.f1882w;
            zzbve.zza(jSONObjectOptJSONObject, "imp_urls");
            zzbve zzbveVar3 = nVar.f1882w;
            zzbve.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            zzbve zzbveVar4 = nVar.f1882w;
            zzbve.zza(jSONObjectOptJSONObject, "nofill_urls");
            zzbve zzbveVar5 = nVar.f1882w;
            zzbve.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            zzcci.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
