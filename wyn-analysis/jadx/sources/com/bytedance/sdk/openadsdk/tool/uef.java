package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class uef {
    public static String uef(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectUef = uef(it.next());
            if (jSONObjectUef != null) {
                jSONArray.put(jSONObjectUef);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> uef(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                FilterWord filterWordUef = uef(jSONArray.optJSONObject(i5));
                if (filterWordUef != null && filterWordUef.isValid()) {
                    arrayList.add(filterWordUef);
                }
            }
        } catch (JSONException e7) {
            dhk.yo("MaterialMetaTools", e7.getMessage());
        }
        return arrayList;
    }

    private static FilterWord uef(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString(MediationMetaData.KEY_NAME));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    FilterWord filterWordUef = uef(jSONArrayOptJSONArray.optJSONObject(i5));
                    if (filterWordUef != null && filterWordUef.isValid()) {
                        filterWord.addOption(filterWordUef);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject uef(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put(MediationMetaData.KEY_NAME, filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(uef(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
