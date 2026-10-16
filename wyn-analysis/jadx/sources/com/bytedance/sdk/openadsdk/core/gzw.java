package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.gsd;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface gzw<T> {

    public interface oa {
        void uef(int i5, String str);

        void uef(gsd.oa oaVar);
    }

    public interface uef {
        void uef(int i5, String str);

        void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar);
    }

    com.bytedance.sdk.openadsdk.moa.lw oa(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.uef.yo.uef uef();

    com.bytedance.sdk.openadsdk.moa.lw uef(JSONObject jSONObject, String str, List<String> list);

    JSONObject uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar, int i5) throws JSONException;

    JSONObject uef(JSONObject jSONObject);

    void uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ue ueVar, int i5, tpx tpxVar);

    void uef(String str);

    void uef(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void uef(JSONObject jSONObject, oa oaVar);

    void uef(JSONObject jSONObject, String str);
}
