package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinEventParameters;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbvc {
    public final List zza;
    public final String zzb;
    public final String zzc;

    public zzbvc(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            arrayList.add(jSONArray.getString(i5));
        }
        this.zza = DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        C6.n nVar = C6.n.f1857D;
        zzbve zzbveVar = nVar.f1882w;
        zzbve.zza(jSONObject, "clickurl");
        zzbve zzbveVar2 = nVar.f1882w;
        zzbve.zza(jSONObject, "imp_urls");
        zzbve zzbveVar3 = nVar.f1882w;
        zzbve.zza(jSONObject, "downloaded_imp_urls");
        zzbve zzbveVar4 = nVar.f1882w;
        zzbve.zza(jSONObject, "fill_urls");
        zzbve zzbveVar5 = nVar.f1882w;
        zzbve.zza(jSONObject, "video_start_urls");
        zzbve zzbveVar6 = nVar.f1882w;
        zzbve.zza(jSONObject, "video_complete_urls");
        zzbve zzbveVar7 = nVar.f1882w;
        zzbve.zza(jSONObject, "video_reward_urls");
        jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzbve zzbveVar8 = nVar.f1882w;
            zzbve.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY);
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzbve zzbveVar9 = nVar.f1882w;
        zzbve.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
