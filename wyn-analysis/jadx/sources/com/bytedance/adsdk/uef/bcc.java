package com.bytedance.adsdk.uef;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bcc implements zjm {
    @Override // com.bytedance.adsdk.uef.zjm
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public Boolean uef(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(((String) obj).contains(String.valueOf(obj2)));
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0) {
                    return Boolean.valueOf(uef(jSONArray, obj2));
                }
            }
        }
        return Boolean.FALSE;
    }

    private boolean uef(JSONArray jSONArray, Object obj) {
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                if (jSONArray.get(i5).equals(obj)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
