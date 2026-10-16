package com.bytedance.sdk.component.adexpress.dynamic.lw;

import N0.a;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cz {
    public static String oa(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.moa.oa()) {
            return uef.uef(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return a.g(str2, "static/images/", str);
    }

    public static void uef(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectSw = com.bytedance.sdk.component.adexpress.oa.sw(str);
        if (jSONObjectSw == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectSw.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        uef(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject uef(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectSw = com.bytedance.sdk.component.adexpress.oa.sw(str);
        if (jSONObjectSw == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return uef(jSONObject2, jSONObjectSw.optJSONObject("themeValues"), jSONObject);
    }

    private static void uef(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject uef(JSONObject... jSONObjectArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String uef(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectSw = com.bytedance.sdk.component.adexpress.oa.sw(str);
        if (jSONObjectSw == null || (jSONObjectOptJSONObject = jSONObjectSw.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(JsonStorageKeyNames.DATA_KEY);
    }

    public static String uef(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectSw = com.bytedance.sdk.component.adexpress.oa.sw(str);
        if (jSONObjectSw == null || (jSONObjectOptJSONObject = jSONObjectSw.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject uef(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
