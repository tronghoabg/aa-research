package com.bytedance.adsdk.uef;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm implements zjm {
    @Override // com.bytedance.adsdk.uef.zjm
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public String uef(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objUef = com.bytedance.adsdk.uef.oa.uef.uef(strValueOf2).uef(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objUef))) {
                return String.valueOf(objUef);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
