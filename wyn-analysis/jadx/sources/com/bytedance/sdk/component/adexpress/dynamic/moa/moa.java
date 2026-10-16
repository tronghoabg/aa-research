package com.bytedance.sdk.component.adexpress.dynamic.moa;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa {
    public String moa;

    /* renamed from: oa, reason: collision with root package name */
    public String f24863oa;
    public List<uef> uef;
    public String yo;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public JSONObject f24864oa;
        public int uef;
    }

    public static moa uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        moa moaVar = new moa();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    uef uefVar = new uef();
                    uefVar.uef = jSONObjectOptJSONObject.optInt("id");
                    uefVar.f24864oa = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(uefVar);
                }
            }
        } catch (JSONException unused) {
        }
        moaVar.uef = arrayList;
        moaVar.f24863oa = jSONObject.optString("diff_data");
        moaVar.yo = jSONObject.optString("style_diff");
        moaVar.moa = jSONObject.optString("tag_diff");
        return moaVar;
    }
}
